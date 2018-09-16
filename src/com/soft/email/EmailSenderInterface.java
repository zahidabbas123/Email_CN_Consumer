package com.soft.email;

import com.soft.email.beans.*;
import javax.mail.MessagingException;
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
public interface EmailSenderInterface {
  public boolean sendEmail(String fromApplication, Email config)throws MessagingException, NullPointerException;
}
