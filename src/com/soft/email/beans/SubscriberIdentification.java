package com.soft.email.beans;



/*
 * CREATE TABLE SM_TBLSUBSIDENTIFICATIONS
(
  SI_IDENTIFICATIONID  		NUMBER(10)            								PRIMARY KEY,                  
  SUB_SUBSCRIBERID     		NUMBER(19)            DEFAULT (0)         			NOT NULL,
  STIT_TYPEID				NUMBER(3)             DEFAULT (0)                   NOT NULL,
  SI_IDENTIFICATION			VARCHAR2(64) ,
  SI_PASSWD					VARCHAR2(64) ,
  SI_ACTIVATIONDATE			DATE,
  SI_ISDISABLED				NUMBER(1)             		DEFAULT (0)         NOT NULL,
  SU_SysUserID          	number(5)               	default(0)          not null,
  SU_SysUserIP          	varchar2(32)            	default('0')        not null,
  SU_InsertDate         	date                    	default(sysdate)    not null,
  SU_SysUserIDM         	number(5)               	default(0)          not null,
  SU_SysUserIPM        	 	varchar2(32)            	default('0')        not null,
  SU_ModifyDate         	date                    	default(sysdate)    not null 
)
 */

public class SubscriberIdentification {
	 private long IdentificationID;
    private long SubscriberServiceID;
    private int NetElementID;
    private int SubsIdentTypeID;
    private String Identification;
    private String Passwd;
    private String ActivationDate;
    private String DeactivationDate;
    private int isDisabled;
    private long SU_SysUserID;
    private String SU_SysUserIP;
    private String SU_InsertDate; 
    private long SU_SysUserIDM;        
    private String SU_SysUserIPM;  
    private String SU_ModifyDate; 
    
   // SubsTechIdentType identType;
   
   public SubscriberIdentification() {
		this.IdentificationID=0;
   	this.SubscriberServiceID = 0;
   	this.NetElementID=0;
   	this.SubsIdentTypeID = 0;
   	this.Identification = "";
		this.Passwd = "";
		this.ActivationDate = "";
		this.DeactivationDate="";
		this.isDisabled = 0;
		this.SU_SysUserID=0;
		this.SU_SysUserIP="";
		this.SU_InsertDate="";
		this.SU_SysUserIDM=0;      
		this.SU_SysUserIPM="";
		this.SU_ModifyDate="";
		//this.identType = new SubsTechIdentType();
	}
   
   public SubscriberIdentification(long identificationid, long SubscriberServiceID, int NetElementID, int subsIdentTypeID, String subsIdentification, String passwd,
                                   String assignmentDate, String releaseDate,int isDisabled, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, 
                                   long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate) {
   	this.IdentificationID=identificationid;
   	this.SubscriberServiceID = SubscriberServiceID;
   	this.NetElementID=NetElementID;
   	this.SubsIdentTypeID = subsIdentTypeID;
   	if (subsIdentification == null) subsIdentification="";
   	this.Identification = subsIdentification;
   	if (passwd == null) passwd="";
   	this.Passwd = passwd;
   	if (assignmentDate == null) assignmentDate="";
       this.ActivationDate = assignmentDate;
       if (releaseDate == null) releaseDate="";
       this.DeactivationDate = releaseDate;
       this.isDisabled = isDisabled;
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
  // 	this.identType = new SubsTechIdentType();
   }

   public long getIdentificationID() {
       return IdentificationID;
   }
   public void setIdentificationID(long IdentificationID) {
       this.IdentificationID = IdentificationID;
   }
   public long getSubscriberServiceID() {
       return SubscriberServiceID;
   }
   public void setSubscriberServiceID(long SubscriberServiceID) {
       this.SubscriberServiceID = SubscriberServiceID;
   }
   //NetElementID  NetElementID
   public int getNetElementID() {
       return NetElementID;
   }
   public void setNetElementID(int NetElementID) {
       this.NetElementID = NetElementID;
   }
   
   public String getPasswd() {
       return Passwd;
   }
   public void setPasswd(String passwd) {
       this.Passwd = passwd;
   }
   public String getIdentification() {
       return Identification;
   }
   public void setIdentification(String subsIdentification) {
       this.Identification = subsIdentification;
   }
   
   public int getSubsIdentTypeID() {
       return SubsIdentTypeID;
   }
   public void setSubsIdentTypeID(int subsIdentTypeID) {
       this.SubsIdentTypeID = subsIdentTypeID;
   }

   public String getActivationDate() {
       return ActivationDate;
   }
   public void setActivationDate(String ActivationDate) {
       this.ActivationDate = ActivationDate;
   }
   public String getDeactivationDate() {
       return DeactivationDate;
   }
   public void setDeactivationDate(String DeactivationDate) {
   	if (DeactivationDate == null) DeactivationDate="";
       this.DeactivationDate = DeactivationDate;
   }
   //DeactivationDate
   
   public int getIsDisabled() {
       return isDisabled;
   }
   public void setIsDisabled(int isDisabled) {
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
   
   
   
  
   
}
