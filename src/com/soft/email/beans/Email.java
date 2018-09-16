package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE TEM_TBLEMAILS
(
  EM_EMAILID        	NUMBER(10)                  PRIMARY KEY,
  EMT_TYPEID        	NUMBER(3)                   DEFAULT(0)			NOT NULL,
  EM_PRIORITY       	NUMBER(1)                  	DEFAULT (0)         NOT NULL,
  EM_FROM          	 	VARCHAR2(128 BYTE)          DEFAULT '',
  EM_TOLIST         	VARCHAR2(500 BYTE)          DEFAULT '',
  EM_CCLIST         	VARCHAR2(500 BYTE)          DEFAULT '',
  EM_BCCLIST        	VARCHAR2(500 BYTE)          DEFAULT '',
  EM_SUBJECT        	VARCHAR2(256 BYTE)          DEFAULT '',
  EM_MESSAGE        	VARCHAR2(4000 BYTE)         NOT NULL,
  EMS_STATUSID      	NUMBER(3)                   DEFAULT(0)			NOT NULL,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null
)
/
 */

public class Email{
	
	    int EmailID;
	    int TypeID;
	    int Priority;
	    String From;
	    String ToList;
	    String CCList;
	    String BCCList;
	    String Subject;
	    String Message;
	    int StatusID;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    
	    EmailType emailtype;
	    EmailStatus emailstatus;
	    EmailContentType contenttype;
	    
	    
	    public Email() {
	    	EmailID=0;
	    	TypeID=0;
	    	Priority=0;
	    	From="";
		    ToList="";
		    CCList="";
		    BCCList="";
		    Subject="";
		    Message="";
		    StatusID=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    
		    emailtype = new EmailType();
		    emailstatus = new EmailStatus();
		    contenttype = new EmailContentType();
		   
	    }
	    
	    public Email(int id, int typeid, int priority,String From, String ToList, String CCList, String BCCList, String Subject, String mesg,  int statusid, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate)
	    {
	    	this.EmailID = id;
	    	this.TypeID = typeid;	
	    	this.Priority = priority;
	    	if(From == null)From="";
	    	this.From=From;
	    	if(ToList == null)ToList="";
	    	this.ToList=ToList;
	    	if(CCList == null)CCList="";
	    	this.CCList=CCList;
	    	if(BCCList == null)BCCList="";
	    	this.BCCList=BCCList;
	    	if(Subject == null)Subject="";
	    	this.Subject=Subject;
	    	if(mesg == null)mesg="";
	    	this.Message=mesg;
	    	this.StatusID=statusid;
	    	this.SU_SysUserID=SU_SysUserID;
	    	if(SU_SysUserIP == null)SU_SysUserIP="";
	    	this.SU_SysUserIP=SU_SysUserIP;
	    	if(SU_InsertDate == null)SU_InsertDate="";
	    	this.SU_InsertDate=SU_InsertDate;
	    	
	    	emailtype = new EmailType();
		    emailstatus = new EmailStatus();
		    contenttype = new EmailContentType();
	    	
	    }
	    
	    
	    /*
	     * int EmailID;
	    int TypeID;
	    int Priority;
	    String From;
	    String ToList;
	    String CCList;
	    String BCCList;
	    String Subject;
	    String Message;
	    int StatusID;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    
	    EmailType emailtype;
	    EmailStatus emailstatus;
	     */
	    public int getEmailID(){
	    	return EmailID;
	    }
	    public void setEmailID(int EmailID){
	        this.EmailID = EmailID;
	    }
	    
	    public int getTypeID(){
	    	return TypeID;
	    }
	    public void setTypeID(int TypeID){
	    	this.TypeID = TypeID;
	    }
	    
	    public int getPriority(){
	    	return Priority;
	    }
	    public void setPriority(int Priority){
	        this.Priority = Priority;
	    }
	    
	    
	    public String getFrom(){
	    	return From;
	    }
	    public void setFrom(String From){
	    	if (From == null) From="";
	        this.From = From;
	    }
	    
	    public String getToList(){
	    	return ToList;
	    }
	    public void setToList(String ToList){
	    	if (ToList == null) ToList="";
	        this.ToList = ToList;
	    }
	    
	    public String getCCList(){
	    	return CCList;
	    }
	    public void setCCList(String CCList){
	    	if (CCList == null) CCList="";
	        this.CCList = CCList;
	    }
	    
	    public String getBCCList(){
	    	return BCCList;
	    }
	    public void setBCCList(String BCCList){
	    	if (BCCList == null) BCCList="";
	        this.BCCList = BCCList;
	    }
	    
	    public String getSubject(){
	    	return Subject;
	    }
	    public void setSubject(String Subject){
	    	if (Subject == null) Subject="";
	        this.Subject = Subject;
	    }
	    
	    public String getMessage(){
	    	return Message;
	    }
	    public void setMessage(String Message){
	    	if (Message == null) Message="";
	        this.Message = Message;
	    }
	    
	    public int getStatusID(){
	    	return StatusID;
	    }
	    public void setStatusID(int StatusID){
	        this.StatusID = StatusID;
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
	    
	    
	    
	    public EmailType getEmailType() {
	        return this.emailtype;
	    }
	    public void setEmailType(EmailType emailtype) {
	    	this.emailtype=emailtype;
	    }
	    
	    public EmailStatus getEmailStatus() {
	        return this.emailstatus;
	    }
	    public void setEmailStatus(EmailStatus emailstatus) {
	    	this.emailstatus=emailstatus;
	    }
	    
	    public EmailContentType getEmailContentType() {
	        return this.contenttype;
	    }
	    public void setEmailContentType(EmailContentType contenttype) {
	    	this.contenttype=contenttype;
	    }
	   
}



