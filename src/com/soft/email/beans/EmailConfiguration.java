package com.soft.email.beans;

import org.apache.log4j.Logger;

import com.soft.email.db.EmailDBManager;

/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Comcerto (pvt) Ltd.</p>
 *
 * @author Naveed ALyas
 *
 * @version 1.0
 **/
public class EmailConfiguration {

  private String emailID;
  private String from;
  private String toList;
  private String CCList;
  private String BCCList;
  private String subject;
  private String message;
  private String styleSheet;
  private String contentType;
  
  private static final Logger log = Logger.getLogger(EmailDBManager.class);

  public EmailConfiguration() {
	this.emailID = "0";
	this.from = "";
	this.toList = "";
	this.CCList = "";
	this.BCCList = "";
	this.subject = "";
	this.message = "";
	this.styleSheet = "";
	this.contentType="";
  }
  
  public EmailConfiguration(String emailID,
                            String from,
                            String toList,
                            String CCList,
                            String BCCList,
                            String subject,
                            String message,
                            String StyleSheet) {
    this.emailID = emailID;
    this.from = from;
    this.toList = toList;
    this.CCList = CCList;
    this.BCCList = BCCList;
    this.subject = subject;
    this.message = message;
    this.styleSheet = StyleSheet;
    this.contentType="text/plain";
   }

  public EmailConfiguration(String emailID,
	          String from,
	          String toList,
	          String CCList,
	          String BCCList,
	          String subject,
	          String message,
	          String StyleSheet,
	          String contentType) {
	this.emailID = emailID;
	this.from = from;
	this.toList = toList;
	this.CCList = CCList;
	this.BCCList = BCCList;
	this.subject = subject;
	this.message = message;
	this.styleSheet = StyleSheet;
	this.contentType=contentType;
  }
  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }

  public void setToList(String toList) {
    this.toList = toList;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public void setStyleSheet(String styleSheet) {
    this.styleSheet = styleSheet;
  }

  public void setBCCList(String BCCList) {
    this.BCCList = BCCList;
  }

  public void setCCList(String CCList) {
    this.CCList = CCList;
  }
  
  public void setContentType(String contentType) {
	    this.contentType = contentType;
  }

  public String getEmailID() {
    return emailID;
  }

  public String getToList() {
    return toList;
  }

  public String getSubject() {
    return subject;
  }

  public String getMessage() {
    return message;
  }

  public String getFrom() {
    return from;
  }

  public String getStyleSheet() {
    return styleSheet;
  }

  public String getBCCList() {
    return BCCList;
  }

  public String getCCList() {
    return CCList;
  }
  
  public String getContentType() {
	    return contentType;
  }
  
  
}
