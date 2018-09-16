package com.soft.email;

import org.apache.log4j.Logger;
import java.util.Properties;
import com.soft.email.core.Enviornment;
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
public class EmailManager{
  private static final Logger log = Logger.getLogger(EmailManager.class);
  public EmailManager() {
  }

  public static void main(String a[]) throws Exception {

	  try{
			if (a[0] == null || a[0].length() == 0) {
				a[0] = "./";
			}
		}catch(Exception et){
			a = new String[1];
			a[0] = "./";
		}  	
    Properties sysProperties = System.getProperties();
    
    Enviornment env = Enviornment.getEnviornment(a[0]);
    sysProperties.put("mail.smtp.host", env.getEMAIL_SERVER());
    sysProperties.put("mail.smtp.auth", "true");
    
    //DataInconsistencyEmails die = new DataInconsistencyEmails(Enviornment.getEnviornment(a[0]));	
   	//System.out.println("Inconsistant CDR Data: "+die.InconsistentCDRDataEmail(2, 3, false));
   	
    EmailSender eSender = new EmailSender(sysProperties, env.getEMAIL_SERVER(), env.getServerUserName(), env.getServerPassword());
    new EmailManagerThread("myThread", eSender, Long.parseLong(env.getROUNDS()), Long.parseLong(env.getROUND_INTERVAL()), null, env).start();
    //System.out.println("Program has been stopped .........");
  }

}
