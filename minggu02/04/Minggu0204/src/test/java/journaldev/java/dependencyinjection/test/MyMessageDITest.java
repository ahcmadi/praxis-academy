/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journaldev.java.dependencyinjection.test;

import journaldev.java.dependencyinjection.consumer.Consumer;
import journaldev.java.dependencyinjection.injector.EmailServiceInjector;
import journaldev.java.dependencyinjection.injector.MessageServiceInjector;
import journaldev.java.dependencyinjection.injector.SMSServiceInjector;

/**
 *
 * @author achmadi
 */
public class MyMessageDITest {
    	public static void main(String[] args) {
            System.out.println("MyMessageDITest");
		String msg = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}
}
