package com.soft.email.beans;

/*
 * 
 CREATE TABLE TEM_TBLEMAILALERTS(
  EA_ALERTID        	NUMBER(5)                  PRIMARY KEY,
  EA_ALERTNAME        	VARCHAR2(100 BYTE) 			NOT NULL,
  EA_ALERTDESC        	VARCHAR2(250 BYTE),
  EMT_TYPEID        	NUMBER(5) 					default (0)			Not Null,
  EA_ISDISABLED			NUMBER(1) 					default (0)			Not Null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)

 */

public class EmailAlert {
	
	    int AlertID;
		int EmailTypeID;
		String AlertCode;
		String AlertName;
		String AlertDesc;
    	
		int isDisabled;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    EmailType emailtype;
	    
	   
	    public EmailAlert() {
	    	AlertID=0;
	    	EmailTypeID=0;
	    	AlertCode="";
	    	AlertName="";
	    	AlertDesc ="";
	    	isDisabled = 0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		    
		    emailtype = new EmailType();
		   
	    }
	    
	    public EmailAlert(int AlertID, int typeid, String code, String name, String desc, int disabled, 
	    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.AlertID = AlertID;
	    	this.EmailTypeID = typeid;
	    	if (code == null) code ="";
	    	this.AlertCode = code;
	    	if(name == null)name="";
	    	this.AlertName = name;	
	    	if(desc == null)desc="";
	    	this.AlertDesc = desc;	
	    	this.isDisabled =  disabled;
	    	
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
	    	
	    	emailtype = new EmailType();
	    	
	    }
	    
	    
	    /*
	     * int AlertID;
	     * int EmailTypeID;
	    String Email;
	    
	     */
	    public int getAlertID(){
	    	return AlertID;
	    }
	    public void setAlertID(int AlertID){
	        this.AlertID = AlertID;
	    }
	    public int getEmailTypeID(){
	    	return EmailTypeID;
	    }
	    public void setEmailTypeID(int EmailTypeID){
	        this.EmailTypeID = EmailTypeID;
	    }
	    //AlertCode
	    
	    public String getAlertCode(){
	    	return AlertCode;
	    }
	    public void setAlertCode(String AlertCode){
	    	if (AlertCode == null) AlertCode="";
	        this.AlertCode = AlertCode;
	    }
	    
	    public String getAlertName(){
	    	return AlertName;
	    }
	    public void setAlertName(String AlertName){
	    	if (AlertName == null) AlertName="";
	        this.AlertName = AlertName;
	    }
	    
	    public String getAlertDesc(){
	    	return AlertDesc;
	    }
	    public void setAlertDesc(String AlertDesc){
	    	if (AlertDesc == null) AlertDesc="";
	        this.AlertDesc = AlertDesc;
	    }
	    
	    public int getisDisabled(){
	    	return isDisabled;
	    }
	    public void setisDisabled(int isDisabled){
	        this.isDisabled = isDisabled;
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
	    
	    
	    public EmailType getEmailType() {
	        return this.emailtype;
	    }
	    public void setEmailType(EmailType type) {
	    	 this.emailtype=type;
	    }
	    
	    
	    
	   
}



