package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE TEM_TBLLISTEMAILS
(
  ELA_EMAILID        	NUMBER(5)                  PRIMARY KEY,
  EL_LISTID        		NUMBER(5) 					default (0)			Not Null,
  ELA_EMAIL        		VARCHAR2(200 BYTE) 			NOT NULL,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
/

 */

public class ListEmail {
	
	    int EmailID;
		int ListID;
	    String Email;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    EmailList emaillist;
	    
	   
	    public ListEmail() {
	    	EmailID=0;
	    	ListID=0;
	    	Email="";
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		    
		    emaillist = new EmailList();
		   
	    }
	    
	    public ListEmail(int emailid, int id, String email,long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.EmailID = emailid;
	    	this.ListID = id;
	    	if(email == null)email="";
	    	this.Email = email;	
	    	this.SU_SysUserID=SU_SysUserID;
	    	if(SU_SysUserIP == null)SU_SysUserIP="";
	    	this.SU_SysUserIP=SU_SysUserIP;
	    	if(SU_InsertDate == null)SU_InsertDate="";
	    	this.SU_InsertDate=SU_InsertDate;
	    	this.SU_SysUserIDM=SU_SysUserIDM; 
	    	if(SU_SysUserIPM == null)SU_SysUserIPM="";
	    	this.SU_SysUserIPM=SU_SysUserIPM;
	    	if(SU_ModifyDate == null)SU_ModifyDate="";
	    	this.SU_ModifyDate=SU_ModifyDate;
	    	
	    	emaillist = new EmailList();
	    	
	    }
	    
	    
	    /*
	     * int EmailID;
	     * int ListID;
	    String Email;
	    
	     */
	    public int getEmailID(){
	    	return EmailID;
	    }
	    public void setEmailID(int EmailID){
	        this.EmailID = EmailID;
	    }
	    public int getListID(){
	    	return ListID;
	    }
	    public void setListID(int ListID){
	        this.ListID = ListID;
	    }
	    
	    public String getEmail(){
	    	return Email;
	    }
	    public void setEmail(String Email){
	    	if (Email == null) Email="";
	        this.Email = Email;
	    }
	    
	    
	    	   	    
	    public long getSU_SysUserID() {
	        return this.SU_SysUserID;
	    }
	    public void setSU_SysUserID(long uid) {
	        this.SU_SysUserID=uid;
	    }
	    public String getSU_SysUserIP() {
	        return this.SU_SysUserIP;
	    }
	    public void setSU_SysUserIP(String ip) {
	    	if (ip == null || ip.length()==0) ip="0";
	        this.SU_SysUserIP=ip;
	    }
	    public String getSU_InsertDate() {
	        return this.SU_InsertDate;
	    }
	    public void setSU_InsertDate(String date) {
	    	if (date == null ) date="";
	         this.SU_InsertDate=date;
	    }
	    public long getSU_SysUserIDM() {
	        return this.SU_SysUserIDM;
	    }
	    public void setSU_SysUserIDM(long uid) {
	        this.SU_SysUserIDM=uid;
	    }
	    public String getSU_SysUserIPM() {
	        return this.SU_SysUserIPM;
	    }
	    public void setSU_SysUserIPM(String ip) {
	    	if (ip == null || ip.length()==0) ip="0";
	        this.SU_SysUserIPM=ip;
	    }
	    public String getSU_ModifyDate() {
	        return this.SU_ModifyDate;
	    }
	    public void setSU_ModifyDate(String date) {
	    	if (date == null ) date="";
	         this.SU_ModifyDate=date;
	    }
	    
	    
	    
	    public EmailList getEmailList() {
	        return this.emaillist;
	    }
	    public void setEmailList(EmailList emaillist) {
	    	
	         this.emaillist=emaillist;
	    }

	   
}



