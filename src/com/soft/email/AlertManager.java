package com.soft.email;

import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.TextIt_WebServices.OutboundMessage;
import org.datacontract.schemas._2004._07.TextIt_WebServices.OutboundMessageResponse;
import org.datacontract.schemas._2004._07.TextIt_WebServices.TokenRequest;
import org.tempuri.*;

import java.util.Properties;
import com.soft.email.core.Enviornment;
import com.soft.email.db.EmailDBManager;

/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Comcerto (pvt) Ltd.</p>
 *
 * @author Badar
 *
 * @version 1.0
 **/
public class AlertManager{
  private static final Logger log = Logger.getLogger(AlertManager.class);
  public AlertManager() {
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
    
  	
EmailSender eSender = new EmailSender(sysProperties, env.getEMAIL_SERVER(), env.getServerUserName(), env.getServerPassword());
    new AlertManagerThread("myThread",eSender,  Long.parseLong(env.getROUNDS()), Long.parseLong(env.getROUND_INTERVAL()), null, env).start();
    //System.out.println("Program has been stopped .........");
 
  
                             }

}
