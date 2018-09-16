package com.soft.email.beans;

import java.util.ArrayList;
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
CREATE TABLE SM_TBLSUBSCRIBERS
(
  SUB_SUBSCRIBERID        NUMBER(19)            NOT NULL					  PRIMARY KEY,
  AC_ACCOUNTNO            NUMBER(19)            DEFAULT (0)                   NOT NULL,
  ST_TYPEID               NUMBER(3)             DEFAULT (0)                   NOT NULL,
  SUB_SUBSCRIBERNAME      VARCHAR2(150 BYTE)    								,
  SUBS_SUBSCRIBERSTATEID  NUMBER(3)             DEFAULT (0)                   NOT NULL,
  PG_PACKAGEID            NUMBER(7)             DEFAULT (0)                   NOT NULL,
  SUB_CREDITLIMIT         NUMBER(18,5)          DEFAULT (0)                   NOT NULL,
  SUB_USEDLIMIT           NUMBER(18,5)          DEFAULT (0)                   NOT NULL,
  SUB_ACTIVATIONDATE      DATE                  								,
  SUB_EXPIRYDATE          DATE													,
  FR_FRANCHISEEID         NUMBER(10)            DEFAULT (0)                   NOT NULL,
  SUB_ONLINEACCESS		   NUMBER(1)            DEFAULT (0)					  NOT NULL,
  SUB_USERNAME              VARCHAR2(100 BYTE)    								,
  SUB_PASSWORD              VARCHAR2(50 BYTE)    								,
  SU_SYSUSERID            NUMBER(5)             DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIP            VARCHAR2(32 BYTE)     DEFAULT ('0')                 NOT NULL,
  SU_INSERTDATE           DATE                  DEFAULT (sysdate)             NOT NULL,
  SU_SYSUSERIDM           NUMBER(5)             DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIPM           VARCHAR2(32 BYTE)     DEFAULT ('0')                 NOT NULL,
  SU_MODIFYDATE           DATE                  DEFAULT (sysdate)             NOT NULL
)
*/

public class Subscriber {
	
	long SubscriberID;
	long AccountNo;
    int SalutationTypeID;
    String Name;
    String Email;
    int SubscriberStateID;
    int PackageID;
    double CreditLimit;
    double UsedLimit;
    String ActivationDate;
    String ExpiryDate;
    long FranchiseeID;
 	int OnlineAccess;
    String Password;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    
    SalutationType salutationType;
    Package subpackage;
    SubscriberState substate;
    Franchisee franchisee;
    SMAddress InvoiceAddress ;
    String ServiceNumber;
    
    //voice usage detail
    ArrayList vus;
    ArrayList vcd;
    // data usage detail
    ArrayList dus;
    ArrayList dud;
    
    long TotalVoiceCalls;
	double TotalVoiceCallCharges;
	long TotalVoiceDuration;
	
	
    
   
    public Subscriber() {
    	this.SubscriberID=0;
    	this.AccountNo=0;
    	this.SalutationTypeID=0;
    	this.Name="";
    	this.Email ="";
    	this.SubscriberStateID=0;
        this.PackageID=0;
    	this.CreditLimit=0;
    	this.UsedLimit=0;
    	this.ActivationDate="";
    	this.ExpiryDate="";
    	this.FranchiseeID=0;
        this.OnlineAccess=0;
    	this.Password="";
    	this.SU_SysUserID=0;
    	this.SU_SysUserIP="";
    	this.SU_InsertDate="";
    	this.SU_SysUserIDM=0;      
    	this.SU_SysUserIPM="";
    	this.SU_ModifyDate="";
    	
    	this.salutationType=new SalutationType();
        this.subpackage =new  Package() ;
        this.substate = new SubscriberState();
        this.franchisee = new Franchisee();
        this.InvoiceAddress = new SMAddress();
        
        this.ServiceNumber = "";
        this.vus= new ArrayList();
        this.vcd= new ArrayList();
        
        this.dus= new ArrayList();
        this.dud= new ArrayList();
        
        this.TotalVoiceCalls=0;
        this.TotalVoiceCallCharges=0;
        this.TotalVoiceDuration=0;
        
       
    }
    
    
    
    public Subscriber(long SubscriberID, long accountid,  int saltypeid, String name, String email, int substateid, int packageid, double creditlimit, double usedlimit, 
    		String activationdate, String expirydate, long franchiseeid, int onlineaccess, String password,
    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate){
    	
    	this.SubscriberID=SubscriberID;
    	this.AccountNo=accountid;
    	this.SalutationTypeID=saltypeid;
    	if (name == null) name="";
    	this.Name=name;
    	if (email == null) email="";
    	this.Email = email;
    	this.SubscriberStateID=substateid;
        this.PackageID=packageid;
    	this.CreditLimit=creditlimit;
    	this.UsedLimit=usedlimit;
    	this.ActivationDate=activationdate;
    	this.ExpiryDate=expirydate;
    	this.FranchiseeID=franchiseeid;
        this.OnlineAccess=onlineaccess;
    	if (password == null) password="";
    	this.Password=password;
    	
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
    	
    	this.salutationType=new SalutationType();
        this.subpackage =new  Package() ;
        this.substate = new SubscriberState();
        this.franchisee = new Franchisee();
        this.InvoiceAddress = new SMAddress();
        this.ServiceNumber = "";
        this.vus= new ArrayList();
        this.vcd= new ArrayList();
        this.dus= new ArrayList();
        this.dud= new ArrayList();
        
        this.TotalVoiceCalls=0;
        this.TotalVoiceCallCharges=0;
        this.TotalVoiceDuration=0;
    }
    
    public long getAccountNo(){
    	return AccountNo;
    }
    public void setAccountNo(long AccountNo){
        this.AccountNo = AccountNo;
    }
    public long getSubscriberID(){
    	return SubscriberID;
    }
    public void setSubscriberID(long SubscriberID){
        this.SubscriberID = SubscriberID;
    }
    
    
    
    public int getSalutationTypeID(){
    	return SalutationTypeID;
    }
    public void setSalutationTypeID(int SalutationTypeID){
        this.SalutationTypeID = SalutationTypeID;
    }
    
    public String getName(){
    	return Name;
    }
    public void setName(String Name){
    	if (Name == null) Name="";
        this.Name = Name;
    }
    
    public String getEmail(){
    	return Email;
    }
    public void setEmail(String Email){
    	if (Email == null) Email="";
        this.Email = Email;
    }
    
    public int getPackageID(){
    	return PackageID;
    }
    public void setPackageID(int PackageID){
        this.PackageID = PackageID;
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
    
   
    public int getSubscriberStateID(){
    	return SubscriberStateID;
    }
    public void setSubscriberStateID(int SubscriberStateID){
        this.SubscriberStateID = SubscriberStateID;
    }
    public long getFranchiseeID(){
    	return FranchiseeID;
    }
    public void setFranchiseeID(long FranchiseeID){
        this.FranchiseeID = FranchiseeID;
    }
   
    
    public int getOnlineAccess(){
    	return OnlineAccess;
    }
    public void setOnlineAccess(int OnlineAccess){
        this.OnlineAccess = OnlineAccess;
    }
    
	
    public String getPassword(){
    	return Password;
    }
    public void setPassword(String Password){
    	if (Password == null) Password="";
        this.Password = Password;
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
    
    public SalutationType getSalutationType() {
        return this.salutationType;
    }
    public void setSalutationType(SalutationType salutationType) {
         this.salutationType=salutationType;
    }
    
    public SubscriberState getSubscriberState() {
        return this.substate;
    }
    public void setSubscriberState(SubscriberState substate) {
         this.substate=substate;
    }
    
    public Package getPackage() {
        return this.subpackage;
    }
    public void setPackage(Package subpackage) {
         this.subpackage=subpackage;
    }
    
    public Franchisee getFranchisee() {
        return this.franchisee;
    }
    public void setFranchisee(Franchisee franchisee) {
    	 this.franchisee=franchisee;
    }
    
    public SMAddress getInvoiceAddress() {
        return this.InvoiceAddress;
    }
    public void setInvoiceAddress(SMAddress InvoiceAddress) {
    	 this.InvoiceAddress=InvoiceAddress;
    }
    
    public String getServiceNumber(){
    	return ServiceNumber;
    }
    public void setServiceNumber(String ServiceNumber){
    	if (ServiceNumber == null) ServiceNumber="";
        this.ServiceNumber = ServiceNumber;
    }
    
    public ArrayList getSubscriberVUS() {
        return this.vus;
    }
    public void setSubscriberVUS(ArrayList vus) {
    	 this.vus=vus;
    }
    
    public ArrayList getSubscriberVCD() {
        return this.vcd;
    }
    public void setSubscriberVCD(ArrayList vcd) {
    	 this.vcd=vcd;
    }
    
    public ArrayList getSubscriberDUS() {
        return this.dus;
    }
    public void setSubscriberDUS(ArrayList dus) {
    	 this.dus=dus;
    }
    public ArrayList getSubscriberDUD() {
        return this.dud;
    }
    public void setSubscriberDUD(ArrayList dud) {
    	 this.dud=dud;
    }
    
    public long  getTotalVoiceCalls() {
        return this.TotalVoiceCalls;
    }
    public void setTotalVoiceCalls(long TotalVoiceCalls) {
    	 this.TotalVoiceCalls=TotalVoiceCalls;
    }
    
        
    public double getTotalVoiceCallCharges() {
        return this.TotalVoiceCallCharges;
    }
    public void setTotalVoiceCallCharges(double TotalVoiceCallCharges) {
    	 this.TotalVoiceCallCharges=TotalVoiceCallCharges;
    }
        
    public long  getTotalVoiceDuration() {
        return this.TotalVoiceDuration;
    }
    public void setTotalVoiceDuration(long TotalVoiceDuration) {
    	 this.TotalVoiceDuration=TotalVoiceDuration;
    }
    
    
    
       
}
