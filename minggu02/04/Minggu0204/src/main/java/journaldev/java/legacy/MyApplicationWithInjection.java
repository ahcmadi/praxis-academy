/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journaldev.java.legacy;

/**
 *
 * @author achmadi
 */
public class MyApplicationWithInjection {
    private EmailService email = null;
	
	public MyApplicationWithInjection(EmailService svc){
		this.email=svc;
	}
	
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
}
