
import java.util.*;  
import javax.mail.*;  
 

public class MailReceive { 
public static void receiveEmail(String pop3Host, 
		String storeType, String user, String password){
	Properties props = new Properties();
	props.put("mail.pop3.host", pop3Host);
	props.put("mail.pop3.port", "995");
	props.put("mail.pop3.starttls.enable", "true");
	props.put("mail.store.protocol", "pop3");
 
Session session = Session.getInstance(props);	
try {  
	Store mailStore = session.getStore(storeType);
	mailStore.connect(pop3Host, user, password);
 
	Folder folder = mailStore.getFolder("INBOX");
	folder.open(Folder.READ_ONLY);
 
	Message[] emailMessages = folder.getMessages();
	System.out.println("Total Message - " 
			+ emailMessages.length);
 
   //Iterate the messages
  for (int i = 0; i < emailMessages.length; i++) {
   Message message = emailMessages[i];
   Address[] toAddress = 
   message.getRecipients(Message.RecipientType.TO);
   System.out.println();  
   System.out.println("Email " + (i+1) + "-");  
   System.out.println("Subject - " + message.getSubject());  
   System.out.println("From - " + message.getFrom()[0]); 
 
   System.out.println("To - "); 
   for(int j = 0; j < toAddress.length; j++){
	   System.out.println(toAddress[j].toString());
   }
   System.out.println("Text - " + 
		   message.getContent().toString());  
  }
 
   folder.close(false);
   mailStore.close();
} catch (Exception e) {
    e.printStackTrace();
    System.err.println("Error in receiving email.");
    }        
}
 
public static void main(String[] args) {
 String pop3Host = "pop.gmail.com";
 String mailStoreType = "pop3s";	
 
	final String userName ="youremail@gmail.com";
	final String password = "app.password";
 
 
 
 //call receiveEmail
 receiveEmail(pop3Host, mailStoreType, userName, password);
}
}

/**
 * This class is used to receive simple email.
 * @author w3spoint
 */
