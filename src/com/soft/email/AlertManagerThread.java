package com.soft.email;

import com.soft.email.beans.AlertEmails;
import com.soft.email.beans.Email;
import com.soft.email.beans.EmailType;
import com.soft.email.core.Enviornment;
import com.soft.email.core.exceptions.ObjectNotFoundException;
import com.soft.email.db.EmailDBManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.TextIt_WebServices.*;
import org.tempuri.*;

public class AlertManagerThread extends Thread {
	private static final Logger log = Logger
			.getLogger(AlertManagerThread.class);
	EmailSenderInterface emailSender;
	String whereClause;
	Enviornment env;
	String threadID;
	private static long ROUNDS;
	private static long ROUND_INTERVAL;

	public AlertManagerThread(String threadID,
			EmailSenderInterface emailSender, long ROUNDS, long ROUND_INTERVAL,
			String whereClause, Enviornment env) {
		this.emailSender = emailSender;
		this.whereClause = whereClause;
		this.env = env;
		this.threadID = threadID;
		this.ROUNDS = ROUNDS;
		this.ROUND_INTERVAL = ROUND_INTERVAL;
	}

	public void run() {
		boolean keepRunning = false;
		long roundsCompleted = 0L;
		if ((ROUNDS == 0L) || ((ROUNDS > 0L) && (ROUNDS > roundsCompleted))) {
			keepRunning = true;
		}
		while (keepRunning) {
			EmailDBManager sdb = null;
			try {
				sdb = EmailDBManager.getDBManager(this.env);
				boolean mailExist = false;

				GregorianCalendar calendarDate = new GregorianCalendar();
				String Date = getStrDate(calendarDate);
				String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

				Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);

				ArrayList partnerlist = sdb.getAlertEmails("CARRIER-BAL");
				if (partnerlist.size() > 0) {
					for (int i = 0; i < partnerlist.size(); i++) {
						mailExist = true;
						AlertEmails alert = (AlertEmails) partnerlist.get(i);
						if (alert.getAlertCode().equals("CARRIER-BAL")) {
							String Message = sdb.getPartnerBalanceEmails(0);
							// log.debug("Message=" + Message);

							EmailType emt = sdb.getEmailType(alert
									.getEmailTypeID());
							Email email = new Email(0, emt.getTypeID(), 0,
									emt.getFromAddress(), emt.getToList(),
									emt.getCCList(), emt.getBCCList(),
									emt.getSubject() + Date, Message, 0, 0L,
									"", Date);
							try {
								boolean emailsent = this.emailSender.sendEmail(
										this.threadID, email);
								if (emailsent) {
									log.debug("Mail Sent");
								} else {
									log.debug("Fail to Sent mail");
								}
							} catch (Exception ex2) {
								log.error(ex2);
							}
						}
					}
				}
				ArrayList closelist = sdb.getAlertEmails("SERVICE-STCLOSE");
				if (closelist.size() > 0) {
					for (int i = 0; i < closelist.size(); i++) {
						mailExist = true;
						AlertEmails alert = (AlertEmails) closelist.get(i);
						if (alert.getAlertCode().equals("SERVICE-STCLOSE")) {
							String Message = sdb.addCloseServiceAlert();

							EmailType emt = sdb.getEmailType(alert
									.getEmailTypeID());
							Email email = new Email(0, emt.getTypeID(), 0,
									emt.getFromAddress(), emt.getToList(),
									emt.getCCList(), emt.getBCCList(),
									emt.getSubject(), Message, 0, 0L, "",
									"sysdate");
							try {
								boolean emailsent = this.emailSender.sendEmail(
										this.threadID, email);
								if (emailsent) {
									log.debug("Mail Sent");
								} else {
									log.debug("Fail to Sent mail");
								}
							} catch (Exception ex2) {
								log.error(ex2);
							}
						}
					}
				}
				ArrayList closeDSLlist = sdb
						.getAlertEmails("SERVICE-STCLOSEDSL");
				if (closeDSLlist.size() > 0) {
					for (int i = 0; i < closeDSLlist.size(); i++) {
						mailExist = true;
						AlertEmails alert = (AlertEmails) closeDSLlist.get(i);
						if (alert.getAlertCode().equals("SERVICE-STCLOSEDSL")) {
							String Message = sdb.addCloseDSLServiceAlert();

							EmailType emt = sdb.getEmailType(alert
									.getEmailTypeID());
							Email email = new Email(0, emt.getTypeID(), 0,
									emt.getFromAddress(), emt.getToList(),
									emt.getCCList(), emt.getBCCList(),
									emt.getSubject(), Message, 0, 0L, "",
									"sysdate");
							try {
								if ((!Message.equals("Failure"))
										&& (Message.length() > 100)) {
									boolean emailsent = true;
									// boolean emailsent =
									// this.emailSender.sendEmail(this.threadID,
									// email);
									if (emailsent) {
										log.debug("Mail Sent");
									} else {
										log.debug("Fail to Sent mail");
									}
								}
							} catch (Exception ex2) {
								log.error(ex2);
							}
						}
					}
				}
				int AfterDays1=0;
				int AfterDays2=0;
				int AfterDays3=0;
				String EmailText1="";String EmailText2="";String EmailText3="";
				String SmsText1="";String SmsText2="";String SmsText3="";
				
				String[] DaysAfter={""};
				EmailType Et=new EmailType();
				Et= sdb.getEmailTypeMessages(43);
				//AfterDays
				DaysAfter=Et.getAfterDays().split("-");
				try{
				AfterDays1=Integer.parseInt(DaysAfter[0]);
				AfterDays2=Integer.parseInt(DaysAfter[1]);
				AfterDays3=Integer.parseInt(DaysAfter[2]);
				}catch(Exception e){
					e.printStackTrace();
				}
				//EmailText
				EmailText1=Et.getEmailMessage1();
				if(EmailText1==null)
					EmailText1="Your invoice has been generated on [invoiceDate].Payable amount is PKR [DueAmnt].If you have already made the payment,please disregard this notice.We would appreciate if you kindly process the payment within due date i.e. [invoiceDueDate].";
				
				EmailText2=Et.getEmailMessage2();
				if(EmailText2==null){
					EmailText2="Your invoice has been generated on [invoiceDate]. Payable amount is PKR [DueAmnt].Please note that this is the final reminder and non clearance of pending dues will result in suspension of your account at 12 AM midnight."+
							"If you have already made the payment, please call StormFiber Customer Care to rectify your billing status."+
							"Please note that this reminder is NOT for new signups and/or undeployed accounts.";
				}
				EmailText3=Et.getEmailMessage3();
				if(EmailText3==null){
					EmailText3=" We regret to inform you that your account has been suspended due to non-payment."+
							   " To restore service kindly process the outstanding amount PKR [DueAmnt] and call StormFiber Customer Care to rectify your billing status."+
							   " Please note that this reminder is NOT for new signups and/or undeployed accounts.";
				}
				//SmsText
				SmsText1=Et.getSmsMessage1();
				if(SmsText1==null){
					SmsText1="Your payable amount PKR [DueAmnt] is generated on Dated [invoiceDate] Due Date is [invoiceDueDate].";
				System.out.println("Default SmsText1 is Loaded");
				}
				SmsText2=Et.getSmsMessage2();
				if(SmsText2==null){
					SmsText2="Your account will be suspended at 12 a.m midnight due to non-payment.If you have already made the payment please contact Storm Fiber Customer Care.";
					System.out.println("Default SmsText2 is Loaded");
				}
				SmsText3=Et.getSmsMessage3();
				if(SmsText3==null){
					SmsText3="We regret to inform you that your account has been suspended due to non-payment.If you have already made the payment please contact Storm Fiber Customer Care.";
					System.out.println("Default SmsText3 is Loaded");
				}
				 // String Message = sdb.sendSms(1);
				 String Message =""; 
				 if(AfterDays1 > 0) {
					 System.out.println(" Starting 1st Reminders");
					 
				     Message = sdb.getPaymentReminderEmails(AfterDays1,EmailText1,SmsText1);
				     
				     System.out.println("End of 1st Reminders");
				 }else{
					 System.out.println("1st Reminders are Turned Off ");
				 }
				 if(AfterDays2 > 0) {
					 System.out.println("Starting 2nd Reminders");
					 
                     Message = sdb.getPaymentReminderEmails(AfterDays2,EmailText2,SmsText2);
                 
                     System.out.println("End of 2nd Reminders");
				 }else{
					 System.out.println("2nd Reminders are Turned Off ");
				 }
				 if(AfterDays3 > 0) {
					 System.out.println("Starting 3rd Reminders");
					 
				     Message = sdb.getPaymentReminderEmails(AfterDays3,EmailText3,SmsText3);
				    
				     System.out.println("End of 3rd Reminders");
				 }else{
					 System.out.println("3rd Reminders are Turned Off ");
				 }
			} catch (ObjectNotFoundException ex2) {
				log.error(ex2);
				if (sdb != null) {
					try {
						sdb.disconnectDatabase();
					} catch (SQLException ex1) {
						log.error(ex1);
					}
				}
			} catch (ClassNotFoundException ex) {
				log.error(ex);
				if (sdb != null) {
					try {
						sdb.disconnectDatabase();
					} catch (SQLException ex1) {
						log.error(ex1);
					}
				}
			} catch (SQLException ex) {
				log.error(ex);
				if (sdb != null) {
					try {
						sdb.disconnectDatabase();
					} catch (SQLException ex1) {
						log.error(ex1);
					}
				}
			} finally {
				if (sdb != null) {
					try {
						sdb.disconnectDatabase();
					} catch (SQLException ex1) {
						log.error(ex1);
					}
				}
			}
			if (ROUNDS > 0L) {
				roundsCompleted += 1L;
			} else {
				roundsCompleted = 0L;
			}
			if ((ROUNDS == 0L) || ((ROUNDS > 0L) && (ROUNDS > roundsCompleted))) {
				keepRunning = true;
				try {
					Thread.sleep(ROUND_INTERVAL * 1000L * 60L);
				} catch (InterruptedException ex3) {
					log.error(ex3);
				}
			} else {
				keepRunning = false;
			}
		}
	}

	public static String getStrDate(java.util.GregorianCalendar cal) {
		String strdate = "";

		try {
			String YY = "0", MM = "0", DD = "0", HH = "0", MI = "0", SS = "0";
			YY = "" + cal.get(java.util.GregorianCalendar.YEAR);
			MM = "" + (cal.get(java.util.GregorianCalendar.MONTH) + 1);
			if (MM.length() < 2)
				MM = "0" + MM;
			DD = "" + cal.get(java.util.GregorianCalendar.DATE);
			if (DD.length() < 2)
				DD = "0" + DD;
			HH = "" + cal.get(java.util.GregorianCalendar.HOUR_OF_DAY);
			if (HH.length() < 2)
				HH = "0" + HH;
			MI = "" + cal.get(java.util.GregorianCalendar.MINUTE);
			if (MI.length() < 2)
				MI = "0" + MI;
			SS = "" + cal.get(java.util.GregorianCalendar.SECOND);
			if (SS.length() < 2)
				SS = "0" + SS;

			strdate = YY + "-" + MM + "-" + DD + " " + HH + ":" + MI + ":" + SS;

		} catch (Exception yy) {
			System.out
					.println("Enviornment > getCalendar : " + yy.getMessage());
		}
		return strdate;
	}
}
