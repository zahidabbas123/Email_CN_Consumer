package com.soft.email.beans;

import com.soft.email.beans.Currency;

import com.soft.email.beans.*;
import com.soft.email.beans.*;


/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Comcerto (pvt) Ltd.</p>
 *
 * @author Naveed
 *
 * @version 1.0
 **/

/*
CREATE TABLE SM_TBLSUBSSERVICES   
(
  SS_SUBSRVID        NUMBER(19)					PRIMARY KEY	,
  SUB_SUBSCRIBERID   NUMBER(19)                 DEFAULT (0)                   NOT NULL,
  SVE_SERVICEID      NUMBER(5)                  DEFAULT (0)                   NOT NULL,
  SS_IDENTIFIER      VARCHAR2(100 BYTE),
  SS_CAMREFNO        VARCHAR2(100 BYTE),
  SVE_PRSERVICEID    NUMBER(5)                  DEFAULT (0)                   NOT NULL,
  SFT_TYPEID         NUMBER(3)                  DEFAULT (0)                   NOT NULL,
  SS_ACTIVATIONDATE  DATE,
  SS_EXPIRYDATE      DATE,
  SS_BILLSTARTDATE	 DATE,
  SS_SUBSSVSTATEID   NUMBER(2)                  DEFAULT (0)                   NOT NULL,
  SBP_POLICYID		 NUMBER(5)                  DEFAULT (0)                   NOT NULL, 
  NE_ELEMENTID		 NUMBER(5)                  DEFAULT (0)                   NOT NULL, 
  SS_SERVICEBALANCE  NUMBER(18,5)               DEFAULT (0)                   NOT NULL,
  SS_CREDITLIMIT     NUMBER(18,5)               DEFAULT (0)                   NOT NULL,
  SS_USEDLIMIT       NUMBER(18,5)               DEFAULT (0)                   NOT NULL,
  SS_VSECONDUSED     NUMBER(19)                 DEFAULT (0)                   NOT NULL,
  SS_DSECONDUSED     NUMBER(19)                 DEFAULT (0)                   NOT NULL,
  SS_VOLUMEUSED      NUMBER(19)                 DEFAULT (0)                   NOT NULL,
  SS_UNITUSED        NUMBER(19)                 DEFAULT (0)                   NOT NULL,
  SS_SUBINVOICETEXT		VARCHAR2(100),
  SS_ISSVSBALANCE    NUMBER(1)                  DEFAULT (0)                   NOT NULL,
  SS_ISDELETED       NUMBER(1)                  DEFAULT (0)                   NOT NULL,
  SU_SYSUSERID       NUMBER(5)                  DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIP       VARCHAR2(32 BYTE)          DEFAULT ('0')                 NOT NULL,
  SU_INSERTDATE      DATE                       DEFAULT (sysdate)             NOT NULL,
  SU_SYSUSERIDM      NUMBER(5)                  DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIPM      VARCHAR2(32 BYTE)          DEFAULT ('0')                 NOT NULL,
  SU_MODIFYDATE      DATE                       DEFAULT (sysdate)             NOT NULL
)
/
*/

public class SubscriberService{
	
	long SubscriberServiceID;
    long SubscriberID;
	int ServiceID;
    String ServiceIdentifier;
    String CAMRefNo;
    long PRSubscriberServiceID;
    int ServiceFinTypeID;
    String ActivationDate;
    String BillStartDate;
    String ExpiryDate;
    int SubServiceStateID;
    int BlockingPolicyID;
    int NetElementID;
    double ServiceBalance;
    double CreditLimit;
    double UsedLimit;
    long VSecondUsed;
    long DSecondUsed;
    long VolumeUsed;
    long UnitUsed;
    String SubInvoiceText;
    int printServiceGroup;
    int ServicePrintingGroupID;
    
    int isServiceBalance;
    long ExchageID ;
    int CurrencyID;
    int isDeleted;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    
    SveFinType sveFinType;
    SubSveState subSveState;
    Service service;
    Service prservice;  
    SvsBlkPolicy blkpolicy;
    
    String LastChargingDate; 
    String NextChargingDate;
    int SS_PRINTONINVOICE;
    String EPCFNo;
    
    Currency currency ;
    
    
    public SubscriberService() {
    	this.SubscriberServiceID=0;
    	this.SubscriberID=0;
    	this.ServiceID=0;
    	this.ServiceIdentifier="";
    	this.CAMRefNo="";
    	this.PRSubscriberServiceID=0;
    	this.ServiceFinTypeID=0;
    	this.ActivationDate="";
    	this.BillStartDate="";
    	this.ExpiryDate="";
    	this.SubServiceStateID=0;
    	this.BlockingPolicyID=0;
    	this.NetElementID=0;
    	this.ServiceBalance=0;
    	this.CreditLimit=0;
    	this.UsedLimit=0;
    	this.VSecondUsed=0;
    	this.DSecondUsed=0;
    	this.VolumeUsed=0;
    	this.UnitUsed=0;
    	this.SubInvoiceText="";
    	this.printServiceGroup = 0;
    	this.ServicePrintingGroupID = 0;
    	
    	this.isServiceBalance=0;
    	this.ExchageID=0;
    	this.CurrencyID=0;
    	this.isDeleted=0;
        this.SU_SysUserID=0;
    	this.SU_SysUserIP="";
    	this.SU_InsertDate="";
    	this.SU_SysUserIDM=0;      
    	this.SU_SysUserIPM="";
    	this.SU_ModifyDate="";
    	this.sveFinType=new SveFinType();
        this.subSveState = new SubSveState();
        this.service =new  Service() ;
        this.prservice =new  Service() ;
        
        this.blkpolicy = new SvsBlkPolicy();
       
        this.LastChargingDate="";
    	this.NextChargingDate="";
    	this.currency = new Currency();
    	
    	this.SS_PRINTONINVOICE=0;
    	this.EPCFNo="";
    }
    
    public SubscriberService(long subserviceid, long SubscriberID, int serviceid, String svsidentifier , String camrefno, long prserviceid, 
    		int svsfintypeid, String activationdate, String billstartdate, String expirydate, int svsstateid, int blkpolicyid, int elementid, double svsbalance, double creditlimit, double usedlimit, 
    		long vsecused, long dsecused, long volumeused, long unitused, String subtext, int spgid, int printdefg, int svsbal, long exchangeid, int curid, int isdel,
    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate,int SS_PRINTONINVOICE,String EPCFNo){
    	
    	this.SubscriberServiceID=subserviceid;
    	this.SubscriberID=SubscriberID;
    	this.ServiceID=serviceid;
    	if (svsidentifier == null) svsidentifier="";
    	this.ServiceIdentifier=svsidentifier;
    	if (camrefno == null) camrefno="";
    	this.CAMRefNo=camrefno;
    	this.PRSubscriberServiceID=prserviceid;
        this.ServiceFinTypeID=svsfintypeid;
        this.ActivationDate=activationdate;
        if (billstartdate == null) billstartdate ="";
        this.BillStartDate = billstartdate;
        if (expirydate == null) expirydate=""; 
    	this.ExpiryDate=expirydate;
    	this.SubServiceStateID=svsstateid;
    	this.BlockingPolicyID = blkpolicyid;
    	this.NetElementID = elementid;
    	this.ServiceBalance = svsbalance;
        this.CreditLimit=creditlimit;
    	this.UsedLimit=usedlimit;
    	
    	this.VSecondUsed=vsecused;
    	this.DSecondUsed=dsecused;
    	this.VolumeUsed=volumeused;
    	this.UnitUsed=unitused;
    	if (subtext == null) subtext="";
    	this.SubInvoiceText=subtext;
    	this.ServicePrintingGroupID = spgid;
    	this.printServiceGroup = printdefg;
    	
    	this.isServiceBalance=svsbal;
    	this.ExchageID = exchangeid; 
    	this.CurrencyID=curid;
    	this.isDeleted=isdel;
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
    	
    	this.sveFinType=new SveFinType();
        this.subSveState = new SubSveState();
        this.service =new  Service() ;
        this.prservice =new  Service() ;
        this.blkpolicy = new SvsBlkPolicy();
        
        
        this.LastChargingDate="";
    	this.NextChargingDate="";
    	this.currency = new Currency();
    	
    	this.SS_PRINTONINVOICE=SS_PRINTONINVOICE;
    	this.EPCFNo=EPCFNo;
    }
    
    public long getSubscriberServiceID(){
    	return SubscriberServiceID;
    }
    public void setSubscriberServiceID(long SubscriberServiceID){
        this.SubscriberServiceID = SubscriberServiceID;
    }
    public long getSubscriberID(){
    	return SubscriberID;
    }
    public void setSubscriberID(long SubscriberID){
        this.SubscriberID = SubscriberID;
    }
    
    public int getServiceID(){
    	return ServiceID;
    }
    public void setServiceID(int ServiceID){
        this.ServiceID = ServiceID;
    }
    
    public String getCAMRefNo(){
    	return CAMRefNo;
    }
    public void setCAMRefNo(String CAMRefNo){
    	if (CAMRefNo == null) CAMRefNo="";
        this.CAMRefNo = CAMRefNo;
    }
    
    public String getServiceIdentifier(){
    	return ServiceIdentifier;
    }
    public void setServiceIdentifier(String ServiceIdentifier){
    	if (ServiceIdentifier == null) ServiceIdentifier="";
        this.ServiceIdentifier = ServiceIdentifier;
    }
    
    public long getPRSubscriberServiceID(){
    	return PRSubscriberServiceID;
    }
    public void setPRSubscriberServiceID(long PRSubscriberServiceID){
        this.PRSubscriberServiceID = PRSubscriberServiceID;
    }
    
    public int getServiceFinTypeID(){
    	return ServiceFinTypeID;
    }
    public void setServiceFinTypeID(int ServiceFinTypeID){
        this.ServiceFinTypeID = ServiceFinTypeID;
    }
    
    public String getActivationDate(){
    	return ActivationDate;
    }
    public void setActivationDate(String ActivationDate){
    	if (ActivationDate == null) ActivationDate="";
        this.ActivationDate = ActivationDate;
    }
    public String getExpiryDate(){
    	return ExpiryDate;
    }
    public void setExpiryDate(String ExpiryDate){
    	if (ExpiryDate == null) ExpiryDate="";
        this.ExpiryDate = ExpiryDate;
    }
    
    public String getBillStartDate(){
    	return BillStartDate;
    }
    public void setBillStartDate(String BillStartDate){
    	if (BillStartDate == null) BillStartDate="";
        this.BillStartDate = BillStartDate;
    }
    
    
    public int getSubServiceStateID(){
    	return SubServiceStateID;
    }
    public void setSubServiceStateID(int SubServiceStateID){
        this.SubServiceStateID = SubServiceStateID;
    }
    
    public int getBlockingPolicyID(){
    	return BlockingPolicyID;
    }
    public void setBlockingPolicyID(int BlockingPolicyID){
        this.BlockingPolicyID = BlockingPolicyID;
    }
    public int getNetElementID(){
    	return NetElementID;
    }
    public void setNetElementID(int NetElementID){
        this.NetElementID = NetElementID;
    }
    
    
    public double getServiceBalance(){
    	return ServiceBalance;
    }
    public void setServiceBalance(double ServiceBalance){
        this.ServiceBalance = ServiceBalance;
    }
    public double getCreditLimit(){
    	return CreditLimit;
    }
    public void setCreditLimit(double CreditLimit){
        this.CreditLimit = CreditLimit;
    }
    
    public double getUsedLimit(){
    	return UsedLimit;
    }
    public void setUsedLimit(double UsedLimit){
        this.UsedLimit = UsedLimit;
    }
      
    public long getVSecondUsed(){
    	return VSecondUsed;
    }
    public void setVSecondUsed(long VSecondUsed){
        this.VSecondUsed = VSecondUsed;
    }
       
    public long getDSecondUsed(){
    	return this.DSecondUsed;
    }
    public void setDSecondUsed(long DSecondUsed){
        this.DSecondUsed = DSecondUsed;
    }
       
    public long getVolumeUsed(){
    	return this.VolumeUsed;
    }
    public void setVolumeUsed(long VolumeUsed){
        this.VolumeUsed = VolumeUsed;
    }
    
    public long getUnitUsed(){
    	return this.UnitUsed;
    }
    public void setUnitUsed(long UnitUsed){
        this.UnitUsed = UnitUsed;
    }
    
    public String getSubInvoiceText() {
        return SubInvoiceText;
    }
    public void setSubInvoiceText(String SubInvoiceText) {
    	if (SubInvoiceText == null) SubInvoiceText="";
    	this.SubInvoiceText = SubInvoiceText;
    }
    public int getprintServiceGroup() {
        return printServiceGroup;
    }
    public void setprintServiceGroup(int printServiceGroup) {
    	this.printServiceGroup = printServiceGroup;
    }
    public int getServicePrintingGroupID() {
        return ServicePrintingGroupID;
    }
    public void setServicePrintingGroupID(int ServicePrintingGroupID) {
    	this.ServicePrintingGroupID = ServicePrintingGroupID;
    }
    
    public int getisServiceBalance(){
    	return this.isServiceBalance;
    }
    public void setisServiceBalance(int isServiceBalance){
        this.isServiceBalance = isServiceBalance;
    }
    //ExchageID
    public long getExchageID(){
    	return this.ExchageID;
    }
    public void setExchageID(long ExchageID){
        this.ExchageID = ExchageID;
    }
    
    public int getCurrencyID() {
        return CurrencyID;
    }
    public void setCurrencyID(int CurrencyID) {
    	this.CurrencyID = CurrencyID;
    }
    
    public int getisDeleted(){
    	return this.isDeleted;
    }
    public void setisDeleted(int isDeleted){
        this.isDeleted = isDeleted;
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
    
    public SveFinType getSveFinType() {
        return this.sveFinType;
    }
    public void setSveFinType(SveFinType sveFinType) {
         this.sveFinType=sveFinType;
    }
    
    public SubSveState getSubSveState() {
        return this.subSveState;
    }
    public void setSubSveState(SubSveState subSveState) {
         this.subSveState=subSveState;
    }
    
    public Service getService() {
        return this.service;
    }
    public void setService(Service service) {
         this.service=service;
    }
    
    public Service getPrService() {
        return this.prservice;
    }
    public void setPrService(Service prservice) {
         this.prservice=prservice;
    }
    
    public SvsBlkPolicy getSvsBlkPolicy() {
        return this.blkpolicy;
    }
    public void setSvsBlkPolicy(SvsBlkPolicy blkpolicy) {
         this.blkpolicy=blkpolicy;
    }
    
   
    
	public String getLastChargingDate() {
        return this.LastChargingDate;
    }
    public void setLastChargingDate(String LastChargingDate) {
    	if (LastChargingDate == null ) LastChargingDate="";
         this.LastChargingDate=LastChargingDate;
    }
    
    public String getNextChargingDate() {
        return this.NextChargingDate;
    }
    public void setNextChargingDate(String NextChargingDate) {
    	if (NextChargingDate == null ) NextChargingDate="";
         this.NextChargingDate=NextChargingDate;
    }
    
    public Currency getCurrency() {
        return this.currency;
    }
    public void setCurrency(Currency currency) {
    	 this.currency=currency;
    }
    
   
    public int getSS_PRINTONINVOICE() {
        return SS_PRINTONINVOICE;
    }
    public void setSS_PRINTONINVOICE(int SS_PRINTONINVOICE) {
    	this.SS_PRINTONINVOICE = SS_PRINTONINVOICE;
    }
    
    public String getEPCFNo() {
        return this.EPCFNo;
    }
    public void setEPCFNo(String EPCFNo) {
    	if (EPCFNo == null ) EPCFNo="";
         this.EPCFNo=EPCFNo;
    }
    
       
}
