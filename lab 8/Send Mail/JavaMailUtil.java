package testMail;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailUtil {
	
	public static void sendMail(String recepient) throws Exception{
		System.out.println("Preparing to send Mail");
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		final String myAccountEmail ="youremail@gmail.com";
		final String password = "app.password";
		
		Session session = Session.getInstance(properties, new Authenticator() {
			//@override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myAccountEmail, password);
			}

		});
		
		Message message = prepareMessage(session, myAccountEmail, recepient);
		Transport.send(message);
		System.out.println("Message Sent Successfully");
	}
	
	private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("My first email");
			message.setText("Here is my email");
			//You can also send html codes in email
			//message.setContent("<h1>hello</h1>","text/html");
			return message;
		} catch (Exception ex) {
			Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
		}	
		return null;
	}
	
}
