package com.soft.email;

import com.soft.email.beans.*;
import javax.mail.Session;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import java.util.StringTokenizer;
import javax.mail.*;
import org.apache.log4j.Logger;

/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Comcerto (pvt) Ltd.</p>
 *
 * @author Naveed Alyas
 *
 * @version 1.0
 **/
public class EmailSender
    implements EmailSenderInterface {

  private static final Logger log = Logger.getLogger(EmailSender.class);
  Properties mailProperties;
  String server;
  String userName;
  String password;
  public EmailSender(Properties mailProperties, String server, String username, String password) {
    this.mailProperties = mailProperties;
    this.server = server;
    this.userName = username;
    this.password = password;
  }

  public boolean sendEmail(String fromApplication, Email email)
      throws MessagingException, NullPointerException {
	  boolean sent = false;
      Session session = Session.getDefaultInstance(mailProperties, null);
      session.setDebug(false);
      Message eMessage = new MimeMessage(session);
      eMessage.setFrom(new InternetAddress(email.getFrom()));
      this.addAddressess(eMessage, Message.RecipientType.TO, email.getToList());
      this.addAddressess(eMessage, Message.RecipientType.CC, email.getCCList());
      this.addAddressess(eMessage, Message.RecipientType.BCC, email.getBCCList());
      eMessage.setSubject(email.getSubject());
      //eMessage.set
      String ContentType = "text/html";
      if (email.getEmailContentType() != null )
    	  ContentType =  email.getEmailContentType().getContentTypeDesc();
      if(ContentType.length()==0)
    	  ContentType = "text/html";
      log.info("ContentType="+ContentType);
      eMessage.setContent(email.getMessage(),ContentType );
      
      try{
    	  Transport t = session.getTransport("smtp");
    	  t.connect(server, userName, password);
    	  
    	  eMessage.saveChanges();
    	  t.sendMessage(eMessage, eMessage.getAllRecipients());
    	  log.info("Email Sent Successfully, requested by "+fromApplication+".");
    	  sent = true;
      }catch(Exception e){
    	  //e.setStackTrace();
    	 // throw e;
    	  e.printStackTrace();
    	  //log.debug("Error in sending email "+email.getEmailID()+" :"+e.getMessage());
      }
      
      return sent;
  }
  
  private void addAddressess(Message msg, Message.RecipientType type,
                             String addressList) throws MessagingException{
    if (addressList != null && addressList.length() > 0) {
      StringTokenizer tokens = new StringTokenizer(addressList, ";");
      InternetAddress address = new InternetAddress(tokens.nextToken());
      msg.setRecipient(type, address);
      while (tokens.hasMoreTokens()) {
        address = new InternetAddress(tokens.nextToken());
        msg.addRecipient(type, address);
      }
    }
  }
}
