package com.soft.email.beans;

/*
 * 
 * 		CREATE TABLE TEM_TBLEMAILHISTORY
(
  EMH_HISTORYID        	NUMBER(10)                  PRIMARY KEY,
  EM_EMAILID        	NUMBER(10)                  DEFAULT(0)			NOT NULL,
  EMS_STATUSID      	NUMBER(3)                   DEFAULT(0)			NOT NULL,
  EMH_REMARKS			varchar2(128)            	,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null
)
/
 */

public class EmailHistory{
	
	    int HistoryID;
	    int EmailID;
	    int StatusID;
	    String Remarks;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    
	    Email email;
	    EmailStatus emailstatus;
	   
	    public EmailHistory() {
	    	HistoryID=0;
	    	EmailID=0;
	    	StatusID=0;
	    	Remarks="";
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    
		    email = new Email();
		    emailstatus = new EmailStatus();
		   
	    }
	    
	    public EmailHistory(int id, int EmailID, int statusid, String remarks, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate)
	    {
	    	this.HistoryID = id;
	    	this.EmailID = EmailID;	
	    	this.StatusID=statusid;
	    	if(remarks == null)remarks="";
	    	this.Remarks=remarks;
	    	this.SU_SysUserID=SU_SysUserID;
	    	if(SU_SysUserIP == null)SU_SysUserIP="";
	    	this.SU_SysUserIP=SU_SysUserIP;
	    	if(SU_InsertDate == null)SU_InsertDate="";
	    	this.SU_InsertDate=SU_InsertDate;
	    	
	    	email = new Email();
		    emailstatus = new EmailStatus();
	    	
	    }
	    
	    
	    /*
	     * int HistoryID;
	    int EmailID;
	    int StatusID;
	    String Remarks;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    
	    Email email;
	    EmailStatus emailstatus;
	     */
	    public int getHistoryID(){
	    	return HistoryID;
	    }
	    public void setHistoryID(int HistoryID){
	        this.HistoryID = HistoryID;
	    }
	    
	    public int getEmailID(){
	    	return EmailID;
	    }
	    public void setEmailID(int EmailID){
	    	this.EmailID = EmailID;
	    }
	    
	    public int getStatusID(){
	    	return StatusID;
	    }
	    public void setStatusID(int StatusID){
	        this.StatusID = StatusID;
	    }
	    
	    public String getRemarks(){
	    	return Remarks;
	    }
	    public void setRemarks(String Remarks){
	    	if (Remarks == null) Remarks="";
	        this.Remarks = Remarks;
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
	    
	    
	    
	    public Email getEmail() {
	        return this.email;
	    }
	    public void setEmail(Email email) {
	    	
	    	this.email=email;
	    }
	    
	    public EmailStatus getEmailStatus() {
	        return this.emailstatus;
	    }
	    public void setEmailStatus(EmailStatus emailstatus) {
	    	
	    	this.emailstatus=emailstatus;
	    }
	    
}



