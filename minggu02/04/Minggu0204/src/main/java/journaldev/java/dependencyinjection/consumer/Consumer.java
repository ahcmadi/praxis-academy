/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journaldev.java.dependencyinjection.consumer;

/**
 *
 * @author achmadi
 */
public interface Consumer {

	void processMessages(String msg, String rec);
}
