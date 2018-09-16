package com.soft.email;
/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Comcerto (pvt) Ltd.</p>
 *
 * @author Afzaal
 *
 * @version 1.0
 **/
import org.apache.log4j.Logger;
import com.soft.email.core.Enviornment;
import java.sql.SQLException;
import java.util.ArrayList;
import com.soft.email.core.exceptions.*;
import com.soft.email.beans.*;
import com.soft.email.db.EmailDBManager;
import java.io.StringWriter;
import com.soft.email.parser.Xml2Text;
import java.io.PrintWriter;
import com.soft.email.parser.WhiteSpaceFilter;
import com.soft.email.parser.AsciiFilter;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileWriter;
import java.io.IOException;

public class EmailManagerThread extends Thread{

  private static final Logger log = Logger.getLogger(EmailManagerThread.class);
  EmailSenderInterface emailSender;
  String whereClause;
  Enviornment env;
  String threadID;
  private static long ROUNDS;
  private static long ROUND_INTERVAL;

  public EmailManagerThread(String threadID,
                            EmailSenderInterface emailSender,
                            long ROUNDS,
                            long ROUND_INTERVAL,
                            String whereClause,
                            Enviornment env) {
    this.emailSender = emailSender;
    this.whereClause = whereClause;
    this.env = env;
    this.threadID = threadID;
    this.ROUNDS = ROUNDS;
    this.ROUND_INTERVAL = ROUND_INTERVAL;
  }

  public void run(){

    boolean keepRunning = false;
    long roundsCompleted = 0;
    if(ROUNDS == 0 || (ROUNDS > 0 && ROUNDS > roundsCompleted)){
      keepRunning = true;
    }
    while(keepRunning){
      EmailDBManager sdb = null;
      Email email;
      try {
        sdb = EmailDBManager.getDBManager(env);
        boolean sendMail = true;
        ArrayList list = sdb.getEmails(0, false);
        if (list.size()>0){
	        for (int i = 0; i < list.size(); i++) {
	          sendMail = true;
	          email = (Email)list.get(i);
	          log.debug("------------------------------Email: "+(i+1)+" --------------------------");
	          EmailType emtype = email.getEmailType();
	          EmailContentType emcontent = email.getEmailContentType();
	          
	          if (email.getToList().length()==0)
	        	  sendMail = false;
	          
	          if (sendMail && emtype != null && emtype.getStyleSheet().length()> 0){
	        	  try {
	        		  email.setMessage(applyStyleSheet(email.getMessage(), emtype.getStyleSheet()));
		          }catch (Exception ex4) {
		              sendMail = false;
		              log.error(ex4);
		          }
	          }
	        
	          
	          try {
	        	  if(sendMail){
	        		  boolean emailsent = emailSender.sendEmail(threadID, email);
	        		  if (emailsent)
	        			  sdb.UpdateEmail(email.getEmailID(), 2);
	        		  else
	        			  sdb.UpdateEmail(email.getEmailID(), 3);
	        	  }
	          }
	          catch (Exception ex2) {
	            log.error(ex2);
	          }
	        }
        }else{
        	System.out.println("No Email Found ");
        }

      }
      catch (ObjectNotFoundException ex2) {
        log.error(ex2);
      }
      catch (ClassNotFoundException ex) {
        log.error(ex);
      }
      catch (SQLException ex) {
        log.error(ex);
      }
      finally {
        if (sdb != null) {
          try {
            sdb.disconnectDatabase();
          }
          catch (SQLException ex1) {
            log.error(ex1);
          }
        }
      }

      if(ROUNDS > 0)
        roundsCompleted++;
      else
        roundsCompleted = 0;

      if(ROUNDS == 0 || (ROUNDS > 0 && ROUNDS > roundsCompleted)){
        keepRunning = true;
        try {
          Thread.sleep(ROUND_INTERVAL * 1000 * 60);
        }
        catch (InterruptedException ex3) {
          log.error(ex3);
        }
      }else{
        keepRunning = false;
      }



    }
  }
  private String applyStyleSheet(String message, String stylesheet) throws
      TransformerConfigurationException, TransformerException, IOException {
	  
	  String Msg = message;
	  log.debug("Message before Style Sheet :"+Msg);
	  if (stylesheet.length() == 0){
		try{
		    StringWriter fw = new StringWriter();
		    Xml2Text xml2Text = new Xml2Text(new PrintWriter(fw));
		    WhiteSpaceFilter whitespaceFilter = new WhiteSpaceFilter();
		    whitespaceFilter.setContentHandler(xml2Text);
		    AsciiFilter asciiFilter = new AsciiFilter();
		    asciiFilter.setContentHandler(whitespaceFilter);
		    TransformerFactory factory = TransformerFactory.newInstance();
		    FileWriter fw1 = new FileWriter("tmp.txt");
		    fw1.write(message);
		    fw1.close();
		    Transformer transformer = factory.newTransformer(new StreamSource(new File("stylesheets/"+stylesheet)));
		    transformer.transform(new StreamSource(new File("tmp.txt")),new SAXResult(asciiFilter));
		    Msg= fw.toString();
		    log.debug("Message after Style Sheet :"+Msg);
		}catch(Exception e){
			log.debug("Error while applying style sheet :"+e.getMessage());
		}
	  }
	  return Msg;
  }
  
} // end of class

