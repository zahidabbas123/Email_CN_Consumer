package com.soft.email.beans;

import com.soft.email.beans.ServiceGroup;

/**
 *
 * <p>Title: Terminus</p>
 *
 * <p>Description: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Terminus</p>
 *
 * @author Muhammad Naveed ALyas
 * @version 1.0
 */
/*
CREATE TABLE SER_TBLSUBSCRIBERSERVICES
(
  SSV_SERVICEID           	NUMBER(6)             		NOT NULL			PRIMARY KEY,
  SSV_SERVICENAME         	VARCHAR2(100 BYTE)     		DEFAULT ('')        NOT NULL,
  SSV_SERVICEDESC  			VARCHAR2(150 BYTE)      	DEFAULT (''),
  SSV_SERVICECODE			VARCHAR2(100 BYTE)     		DEFAULT ('')        NOT NULL,
  
  SVE_SERVICESAPCODE		VARCHAR2(100 BYTE)     		DEFAULT (''),
  SVE_ISDAYSEXPIRY			NUMBER(1)             		DEFAULT (0)         NOT NULL,
  SVE_EXPIRYLENGTH			NUMBER(5)             		DEFAULT (0)         NOT NULL,
  SVE_RAFEEPERCENT			NUMBER(18,5)           		DEFAULT (0)         NOT NULL,
  
  SG_GROUPID   				NUMBER(5)             		DEFAULT (0)         NOT NULL,
  SSV_ACTIVATIONDATE       	DATE							,
  CU_CURRENCYID          	NUMBER(10)             		DEFAULT (0)         NOT NULL,
  SSV_ISCIR					NUMBER(1)              		DEFAULT (0)         NOT NULL,
  SSV_ISDATA				NUMBER(1)              		DEFAULT (0)         NOT NULL,
  SSV_NONAAA				NUMBER(1)              		DEFAULT (0)         NOT NULL,
  SSV_BANDWIDTHKB			NUMBER(5)              		DEFAULT (0)         NOT NULL,
  SSV_EMAILMB				NUMBER(6)              		DEFAULT (0)         NOT NULL,
  SSV_HOSTINGMB				NUMBER(6)              		DEFAULT (0)         NOT NULL,
  SSV_BKSERVICEID			NUMBER(6)              		DEFAULT (0)         NOT NULL,
  SSV_EQPSERVICEID			NUMBER(6)              		DEFAULT (0)         NOT NULL,
  SSV_CHECKATTR         	VARCHAR2(1000 BYTE)     	DEFAULT ('')        NOT NULL,
  SSV_REPLYATTR         	VARCHAR2(1000 BYTE)     	DEFAULT ('')        NOT NULL,
  SSV_DNREPLYATTR         	VARCHAR2(1000 BYTE)     	DEFAULT ('')        NOT NULL,
  SVE_ONLINECHARGING       	NUMBER(1)              		DEFAULT (0)         NOT NULL,
  SSV_ISDISABLED           	NUMBER(1)              		DEFAULT (0)         NOT NULL,
  SU_SysUserID          	number(5)               	default(0)          not null,
  SU_SysUserIP          	varchar2(32)            	default('0')        not null,
  SU_InsertDate         	date                    	default(sysdate)    not null,
  SU_SysUserIDM         	number(5)               	default(0)          not null,
  SU_SysUserIPM         	varchar2(32)            	default('0')        not null,
  SU_ModifyDate         	date                    	default(sysdate)    not null 
)
 */
public class Service {
      
    int ServiceID;
	String ServiceName;
    String ServiceDesc;
    String ServiceCode;
    String ServiceSAPCode;
    int isDaysExpiry;
    int ExpiryLength;
    int CalculateExpiry;
    double RAFeePercent;
    double TaxPercent;
    int GroupID;
    String ActivationDate ;
    int isCIR;
    int isData;
    int isNonAAA;
    long BandwidthKB;
    int isMFactor;
    long EmailMB;
    long HostingMB;
    int BKServiceID;
    int EQPServiceID;
    String CheckAttr;
    String ReplyAttr;
    String DNReplyAttr;
    int OnlineCharging;
    String SubInvoiceText;
    
    int isDisabled;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    
    ServiceGroup serviceGroup;
    String BKServiceName ;
    String EQPServiceName;
    
    public Service() {
    	
    	ServiceID=0;
    	ServiceName="";
    	ServiceDesc="";
    	ServiceCode="";
    	ServiceSAPCode="";
        isDaysExpiry=0;
        ExpiryLength=0;
        CalculateExpiry=0;
        RAFeePercent=0;
        TaxPercent=0;
        GroupID=0;
    	ActivationDate="" ;
        isCIR=0;
        isData=0;
        isNonAAA=0;
        BandwidthKB=0;
        isMFactor=0;
        EmailMB=0;
        HostingMB=0;
        BKServiceID=0;
        EQPServiceID=0;
        CheckAttr="";
        ReplyAttr="";
        DNReplyAttr="";
        OnlineCharging=0;
        SubInvoiceText="";
        isDisabled=0;
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate=""; 
        serviceGroup = new ServiceGroup();
        BKServiceName="";
        EQPServiceName="";
        
    }

    public Service(int id, String name, String desc, String code, String sapcode, int isdaysexpiry, int expirylength, int calexp, double rafeepercent, 
    						double taxpercent, int groupid, String actdate,  int cir, int data, 
    						int nonaaa, long bandwidth, int ismfactor, long emailmb, long hostingmb, int bkservice, int eqpservice, 
    						String checkattr, String replyattr, String dnreplyattr, int onlinecharging, String SubInvText, 
    						int disable, long suid, String suip, String insdate,long suidm, String suipm, String modfdate  ){
    	this.ServiceID=id;
    	this.ServiceName = name;
    	if (desc == null) desc="";
    	this.ServiceDesc=desc;
    	if (code == null) code="";
    	this.ServiceCode=code;
    	if (sapcode == null) sapcode="";
    	this.ServiceSAPCode=sapcode;
    	this.isDaysExpiry=isdaysexpiry;
    	this.ExpiryLength=expirylength;
    	this.CalculateExpiry = calexp;
    	this.RAFeePercent=rafeepercent;
    	this.TaxPercent = taxpercent;
    	this.GroupID=groupid;
    	this.ActivationDate=actdate ;
        this.isCIR=cir;
        this.isData=data;
        this.isNonAAA=nonaaa;
        this.BandwidthKB=bandwidth;
        this.isMFactor = ismfactor;
        this.EmailMB=emailmb;
        this.HostingMB=hostingmb;
        this.BKServiceID=bkservice;
        this.EQPServiceID=eqpservice;
        if (checkattr == null) checkattr="";
        this.CheckAttr=checkattr;
        if (replyattr == null) replyattr="";
        this.ReplyAttr=replyattr;
        if (dnreplyattr == null) dnreplyattr="";
        this.DNReplyAttr = dnreplyattr;
        this.OnlineCharging = onlinecharging;
        if (SubInvText == null) SubInvText="";
        this.SubInvoiceText=SubInvText;
        
        this.isDisabled=disable;
    	this.SU_SysUserID=suid;
    	this.SU_SysUserIP=suip;
    	this.SU_InsertDate=insdate; 
    	this.SU_SysUserIDM=suidm;        
    	this.SU_SysUserIPM=suipm;  
    	this.SU_ModifyDate=modfdate; 
    	serviceGroup = new ServiceGroup();
    	BKServiceName="";
        EQPServiceName="";
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
     
   
    public int getServiceID() {
        return ServiceID;
    }
    public void setServiceID(int ServiceID) {
    	this.ServiceID = ServiceID;
    }
    
    public int getGroupID() {
        return GroupID;
    }
    public void setGroupID(int GroupID) {
    	this.GroupID = GroupID;
    }
    
    public String getServiceName() {
        return ServiceName;
    }
    public void setServiceName(String ServiceName) {
    	if (ServiceName == null) ServiceName=" "; 
        this.ServiceName = ServiceName;
    }
    public String getServiceDesc() {
        return ServiceDesc;
    }
    public void setServiceDesc(String ServiceDesc) {
    	if (ServiceDesc == null) ServiceDesc=" "; 
        this.ServiceDesc = ServiceDesc;
    }
    public String getServiceCode() {
        return ServiceCode;
    }
    public void setServiceCode(String ServiceCode) {
    	if (ServiceCode == null) ServiceCode=" "; 
        this.ServiceCode = ServiceCode;
    }
    
   
    public String getServiceSAPCode() {
        return ServiceSAPCode;
    }
    public void setServiceSAPCode(String ServiceSAPCode) {
    	if (ServiceSAPCode == null) ServiceSAPCode=" "; 
        this.ServiceSAPCode = ServiceSAPCode;
    }
    
    public int getisDaysExpiry() {
        return isDaysExpiry;
    }
    public void setisDaysExpiry(int isDaysExpiry) {
    	this.isDaysExpiry = isDaysExpiry;
    }
    
    public int getExpiryLength() {
        return ExpiryLength;
    }
    public void setExpiryLength(int ExpiryLength) {
    	this.ExpiryLength = ExpiryLength;
    }
    
    public int getCalculateExpiry() {
        return CalculateExpiry;
    }
    public void setCalculateExpiry(int CalculateExpiry) {
    	this.CalculateExpiry = CalculateExpiry;
    }
    
    
    
    public double getRAFeePercent() {
        return RAFeePercent;
    }
    public void setRAFeePercent(double RAFeePercent) {
    	this.RAFeePercent = RAFeePercent;
    }
    
    public double getTaxPercent() {
        return TaxPercent;
    }
    public void setTaxPercent(double TaxPercent) {
    	this.TaxPercent = TaxPercent;
    } 
    
    public String getActivationDate() {
        return ActivationDate;
    }
    public void setActivationDate(String ActivationDate) {
    	if (ActivationDate == null) ActivationDate=" "; 
        this.ActivationDate = ActivationDate;
    }
    public int getisCIR() {
        return isCIR;
    }
    public void setisCIR(int isCIR) {
    	this.isCIR = isCIR;
    }
    public int getisData() {
        return isData;
    }
    public void setisData(int isData) {
    	this.isData = isData;
    }
    public int getisNonAAA() {
        return isNonAAA;
    }
    public void setisNonAAA(int isNonAAA) {
    	this.isNonAAA = isNonAAA;
    }
    public long getBandwidthKB() {
        return BandwidthKB;
    }
    public void setBandwidthKB(long BandwidthKB) {
    	this.BandwidthKB = BandwidthKB;
    }
    
    public int getisMFactor() {
        return isMFactor;
    }
    public void setisMFactor(int isMFactor) {
    	this.isMFactor = isMFactor;
    }
    
    public long getEmailMB() {
        return EmailMB;
    }
    public void setEmailMB(long EmailMB) {
    	this.EmailMB = EmailMB;
    }
    public long getHostingMB() {
        return HostingMB;
    }
    public void setHostingMB(long HostingMB) {
    	this.HostingMB = HostingMB;
    }
    public int getBKServiceID() {
        return BKServiceID;
    }
    public void setBKServiceID(int BKServiceID) {
    	this.BKServiceID = BKServiceID;
    }
    public int getEQPServiceID() {
        return EQPServiceID;
    }
    public void setEQPServiceID(int EQPServiceID) {
    	this.EQPServiceID = EQPServiceID;
    }
    public String getCheckAttr() {
        return CheckAttr;
    }
    public void setCheckAttr(String CheckAttr) {
    	if (CheckAttr == null) CheckAttr="";
    	this.CheckAttr = CheckAttr;
    }
    public String getReplyAttr() {
        return ReplyAttr;
    }
    public void setReplyAttr(String ReplyAttr) {
    	if (ReplyAttr == null) ReplyAttr="";
    	this.ReplyAttr = ReplyAttr;
    }
    public String getDNReplyAttr() {
        return DNReplyAttr;
    }
    public void setDNReplyAttr(String DNReplyAttr) {
    	if (DNReplyAttr == null) DNReplyAttr="";
    	this.DNReplyAttr = DNReplyAttr;
    }
    
    public int getOnlineCharging() {
        return OnlineCharging;
    }
    public void setOnlineCharging(int OnlineCharging) {
    	this.OnlineCharging = OnlineCharging;
    }
   
    public String getSubInvoiceText() {
        return SubInvoiceText;
    }
    public void setSubInvoiceText(String SubInvoiceText) {
    	if (SubInvoiceText == null) SubInvoiceText="";
    	this.SubInvoiceText = SubInvoiceText;
    }
    
    public int getisDisabled() {
        return isDisabled;
    }
    public void setisDisabled(int isDisabled) {
    	this.isDisabled = isDisabled;
    }
    
    public ServiceGroup getServiceGroup() {
        return serviceGroup;
    }
    public void setServiceGroup(ServiceGroup serviceGroup) {
    	this.serviceGroup = serviceGroup;
    }
    
    
    public String getBKServiceName() {
        return BKServiceName;
    }
    public void setBKServiceName(String BKServiceName) {
    	if (BKServiceName == null) BKServiceName=" "; 
        this.BKServiceName = BKServiceName;
    }
    public String getEQPServiceName() {
        return EQPServiceName;
    }
    public void setEQPServiceName(String EQPServiceName) {
    	if (EQPServiceName == null) EQPServiceName=" "; 
        this.EQPServiceName = EQPServiceName;
    }
    
    
}
