/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journaldev.java.dependencyinjection.test;

import journaldev.java.dependencyinjection.consumer.Consumer;
import journaldev.java.dependencyinjection.consumer.MyDIApplication;
import journaldev.java.dependencyinjection.injector.MessageServiceInjector;
import journaldev.java.dependencyinjection.service.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author achmadi
 */
public class MyDIApplicationJUnitTest {

	private MessageServiceInjector injector;
	@Before
	public void setUp(){
		//mock the injector with anonymous class
		injector = new MessageServiceInjector() {
			
			@Override
			public Consumer getConsumer() {
				//mock the message service
				return new MyDIApplication(new MessageService() {
					
					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
	}
	
	@After
	public void tear(){
		injector = null;
	}

}
