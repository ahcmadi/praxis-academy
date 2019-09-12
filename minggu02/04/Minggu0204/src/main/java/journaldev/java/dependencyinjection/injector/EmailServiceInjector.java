/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journaldev.java.dependencyinjection.injector;

import journaldev.java.dependencyinjection.consumer.Consumer;
import journaldev.java.dependencyinjection.consumer.MyDIApplication;
import journaldev.java.dependencyinjection.service.EmailServiceImpl;

/**
 *
 * @author achmadi
 */
public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}
