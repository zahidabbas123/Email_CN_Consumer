package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE TEM_TBLEMAILTYPES
(
  EMT_TYPEID         	NUMBER(5)                  	NOT NULL				PRIMARY KEY,
  EMT_TYPENAME       	VARCHAR2(255 BYTE)         	NOT NULL,
  ECT_CONTENTTYPEID  	NUMBER(2)                  	DEFAULT (0)          NOT NULL,
  EMT_PRIORITY       	NUMBER(1)                  	DEFAULT (0)          NOT NULL,
  EMT_STYLESHEET     	VARCHAR2(128 BYTE)          ,
  EMT_SUBJECT        	VARCHAR2(128 BYTE)          ,
  EMT_FROMADDRESS    	VARCHAR2(128 BYTE)          ,
  EMT_TOLIST         	VARCHAR2(500 BYTE)         	,
  EMT_CCLIST         	VARCHAR2(500 BYTE)         	,
  EMT_BCCLIST        	VARCHAR2(500 BYTE)         	,
  EMT_ISDISABLED		number(1)					default (0)			Not Null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
 */

public class EmailType {
	
	    int TypeID;
	    String TypeName;
	    int ContentTypeID;
	    int Priority;
	    String StyleSheet;
	    String Subject;
	    String FromAddress;
	    String ToList;
	    String CCList;
	    String BCCList;
	    int IsDisabled;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    String EmailMessage1;
	    String EmailMessage2;
	    String EmailMessage3;
	    String SmsMessage1;
	    String SmsMessage2;
	    String SmsMessage3;
	    String AfterDays;
	    EmailContentType emailcontenttype;
	   
	    public EmailType() {
	    	TypeID=0;
	    	TypeName="";
	    	ContentTypeID=0;
	    	Priority=0;
	    	StyleSheet="";
		    Subject="";
		    FromAddress="";
		    ToList="";
		    CCList="";
		    BCCList="";
	    	IsDisabled=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		    
		    emailcontenttype = new EmailContentType();
		   
	    }
	    
	    public EmailType(int id, String name,int contenttypeid, int priority,String StyleSheet,String Subject, String FromAddress, String ToList, String CCList, String BCCList, int disabled, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.TypeID = id;
	    	if(name == null)name="";
	    	this.TypeName = name;	
	    	this.ContentTypeID = contenttypeid;
	    	this.Priority = priority;
	    	if(StyleSheet == null)StyleSheet="";
	    	this.StyleSheet=StyleSheet;
	    	if(Subject == null)Subject="";
	    	this.Subject=Subject;
	    	if(FromAddress == null)FromAddress="";
	    	this.FromAddress=FromAddress;
	    	if(ToList == null)ToList="";
	    	this.ToList=ToList;
	    	if(CCList == null)CCList="";
	    	this.CCList=CCList;
	    	if(BCCList == null)BCCList="";
	    	this.BCCList=BCCList;
	    	this.IsDisabled=disabled;
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
	    	
	    	emailcontenttype = new EmailContentType();
	    	
	    }
	    
	    
	    /*
	     * int TypeID;
	    String TypeName;
	    int ContentTypeID;
	    int Priority;
	    String StyleSheet;
	    String Subject;
	    String FromAddress;
	    String ToList;
	    String CCList;
	    String BCCList;
	    int IsDisabled;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	     */
	    public int getTypeID(){
	    	return TypeID;
	    }
	    public void setTypeID(int TypeID){
	        this.TypeID = TypeID;
	    }
	    
	    public String getTypeName(){
	    	return TypeName;
	    }
	    public void setTypeName(String TypeName){
	    	if (TypeName == null) TypeName="";
	        this.TypeName = TypeName;
	    }
	    
	    public int getContentTypeID(){
	    	return ContentTypeID;
	    }
	    public void setContentTypeID(int ContentTypeID){
	        this.ContentTypeID = ContentTypeID;
	    }
	    
	    public int getPriority(){
	    	return Priority;
	    }
	    public void setPriority(int Priority){
	        this.Priority = Priority;
	    }
	    
	    public String getStyleSheet(){
	    	return StyleSheet;
	    }
	    public void setStyleSheet(String StyleSheet){
	    	if (StyleSheet == null) StyleSheet="";
	        this.StyleSheet = StyleSheet;
	    }
	    
	    public String getSubject(){
	    	return Subject;
	    }
	    public void setSubject(String Subject){
	    	if (Subject == null) Subject="";
	        this.Subject = Subject;
	    }
	    
	    public String getFromAddress(){
	    	return FromAddress;
	    }
	    public void setFromAddress(String FromAddress){
	    	if (FromAddress == null) FromAddress="";
	        this.FromAddress = FromAddress;
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
	    
	    public int getIsDisabled(){
	    	return IsDisabled;
	    }
	    public void setIsDisabled(int IsDisabled){
	        this.IsDisabled = IsDisabled;
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
	    
	   
	    
	    public EmailContentType getEmailContentType() {
	        return this.emailcontenttype;
	    }
	    public void setEmailContentType(EmailContentType emailcontenttype) {
	    	
	    	this.emailcontenttype=emailcontenttype;
	    }
	    public String getEmailMessage1() {
			return EmailMessage1;
		}

		public void setEmailMessage1(String emailMessage1) {
			this.EmailMessage1 = emailMessage1;
			if(emailMessage1==null)
				this.EmailMessage1 ="";
		}

		public String getEmailMessage2() {
			return EmailMessage2;
		}

		public void setEmailMessage2(String emailMessage2) {
			this.EmailMessage2 = emailMessage2;
			if(EmailMessage2==null)
				this.EmailMessage2 = "";	
		}

		public String getEmailMessage3() {
			return EmailMessage3;
		}

		public void setEmailMessage3(String emailMessage3) {
			this.EmailMessage3 = emailMessage3;
			if(emailMessage3==null)
				this.EmailMessage3 = "";	
		}

		public String getSmsMessage1() {
			return SmsMessage1;
		}

		public void setSmsMessage1(String smsMessage1) {
			this.SmsMessage1 = smsMessage1;
			if(smsMessage1==null)
				this.SmsMessage1 = "";	
		}

		public String getSmsMessage2() {
			return SmsMessage2;
		}

		public void setSmsMessage2(String smsMessage2) {
			this.SmsMessage2 = smsMessage2;
			if(smsMessage2==null)
				this.SmsMessage2 = "";
		}

		public String getSmsMessage3() {
			return SmsMessage3;
		}

		public void setSmsMessage3(String smsMessage3) {
			this.SmsMessage3 = smsMessage3;
			if(smsMessage3==null)
				this.SmsMessage3 = "";
		}

		public String getAfterDays() {
			return AfterDays;
		}

		public void setAfterDays(String afterDays) {
			this.AfterDays = afterDays;
			if(afterDays==null)
				this.AfterDays = "";
		}
}



