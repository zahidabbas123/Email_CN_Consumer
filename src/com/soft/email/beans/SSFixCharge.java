package com.soft.email.beans;

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
CREATE TABLE SM_TBLSSFIXCHARGES
(
  SSFC_CHARGEID        		NUMBER(19)            								PRIMARY KEY,                  
  SS_SUBSRVID        		NUMBER(19)            	DEFAULT (0)         NOT NULL,
  SSFC_SUBAMOUNT			NUMBER(18,5)          DEFAULT (0)                   NOT NULL,
  SSFC_RECAMOUNT      		NUMBER(18,5)          DEFAULT (0)                   NOT NULL,
  CPT_PERIODTYPEID			NUMBER(2)             DEFAULT (0)                   NOT NULL,
  SSFC_NOOFPERIODS     		NUMBER(2)             DEFAULT (0)                   NOT NULL,
  SFC_ISPRORATE             NUMBER(1)             DEFAULT (0)                   NOT NULL
  SSFC_ISAUTODETECT        	NUMBER(1)             DEFAULT (0)                   NOT NULL,
  SSFC_ISADVCHARGING    	NUMBER(1)             DEFAULT (0)                   NOT NULL,
  SSFC_FREEMIN				NUMBER(10)             DEFAULT (0)                   NOT NULL,
  SSFC_FREEMB				NUMBER(10)             DEFAULT (0)                   NOT NULL,
  SSFC_FREEHR				NUMBER(10)             DEFAULT (0)                   NOT NULL,
  SSFC_FREEUNIT				NUMBER(10)             DEFAULT (0)                   NOT NULL,
  SSFC_TAXPERCENT			NUMBER(12,5)          DEFAULT (0)                   NOT NULL,
  SSFC_ACTIVATIONDATE		DATE,
  SSFC_ISDISABLED			NUMBER(1)             		DEFAULT (0)         NOT NULL,
  SU_SysUserID          	number(5)               	default(0)          not null,
  SU_SysUserIP          	varchar2(32)            	default('0')        not null,
  SU_InsertDate         	date                    	default(sysdate)    not null,
  SU_SysUserIDM         	number(5)               	default(0)          not null,
  SU_SysUserIPM        	 	varchar2(32)            	default('0')        not null,
  SU_ModifyDate         	date                    	default(sysdate)    not null 
)
*/

public class SSFixCharge{
	
	long ChargeID;
    long SubscriberServiceID;
	int CurrencyID;
	double SubAmount;
	double RecAmount;
	double Discount;
	int MFactor =0;
	int PeriodTypeID;
	int NoOfPeriods;
	int isProRata;
	int isAutoDetect;
	int isAdvCharging;
	long FreeMin;
	long FreeMB;
	long FreeHr;
	long FreeUnit;
	
    String ActivationDate;
    int isDisabled;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    
    ChargingPeriodType PeriodType ;
    Service service;
    Subscriber subscriber;  
    Currency currency;
    
    public SSFixCharge() {
    	this.ChargeID=0;
    	this.SubscriberServiceID=0;
    	this.CurrencyID=0;
    	this.SubAmount=0;
    	this.RecAmount=0;
    	this.Discount=0;
    	this.MFactor=0;
    	this.PeriodTypeID=0;
    	this.NoOfPeriods=0;
    	this.isProRata=0;
    	this.isAutoDetect=0;
    	this.isAdvCharging=0;
    	this.FreeMin = 0;
    	this.FreeMB = 0;
    	this.FreeHr = 0;
    	this.FreeUnit = 0;
    	this.ActivationDate="" ;
    	this.isDisabled=0;
    	this.SU_SysUserID=0;
    	this.SU_SysUserIP="";
    	this.SU_InsertDate="";
    	this.SU_SysUserIDM=0;      
    	this.SU_SysUserIPM="";
    	this.SU_ModifyDate="";
    	this.service =new  Service() ;
        this.subscriber =new  Subscriber() ;
        PeriodType = new ChargingPeriodType() ;
        currency = new Currency();
    }
    
    public SSFixCharge(long chargeid, long subsveID, int currencyid, double submnt, double recamnt, double discount, int MFactor,
			int periodtypeid, int periodlength, int isProRata, int isautodetect, int isadvcharging, long freemin, long freemb,
			long freehr, long freeunit, String actdate, int disable, 
    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate){
    	
    	this.ChargeID=chargeid;
    	this.SubscriberServiceID=subsveID;
    	this.CurrencyID = currencyid;
    	this.SubAmount=submnt;
    	this.RecAmount=recamnt;
    	this.Discount=discount;
    	this.MFactor = MFactor;
    	this.PeriodTypeID=periodtypeid;
    	this.NoOfPeriods = periodlength;
    	this.isProRata=isProRata;
    	this.isAutoDetect=isautodetect;
    	this.isAdvCharging=isadvcharging;
    	this.FreeMin = freemin;
    	this.FreeMB = freemb;
    	this.FreeHr = freehr;
    	this.FreeUnit = freeunit;
    	this.ActivationDate=actdate ;
        this.isDisabled=disable;
       
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
    	
    	this.service =new  Service() ;
        this.subscriber =new  Subscriber() ;
        PeriodType = new ChargingPeriodType() ;
        currency = new Currency();
    }
    
    public long getChargeID(){
    	return ChargeID;
    }
    public void setChargeID(long ChargeID){
        this.ChargeID = ChargeID;
    }
    public long getSubscriberServiceID(){
    	return SubscriberServiceID;
    }
    public void setSubscriberServiceID(long SubscriberServiceID){
        this.SubscriberServiceID = SubscriberServiceID;
    }
    
    
    
    public int getCurrencyID() {
        return CurrencyID;
    }
    public void setCurrencyID(int CurrencyID) {
    	this.CurrencyID = CurrencyID;
    }
    
    public int getPeriodTypeID() {
        return PeriodTypeID;
    }
    public void setPeriodTypeID(int PeriodTypeID) {
    	this.PeriodTypeID = PeriodTypeID;
    }
    
    public int getNoOfPeriods() {
        return NoOfPeriods;
    }
    public void setNoOfPeriods(int NoOfPeriods) {
    	this.NoOfPeriods = NoOfPeriods;
    }
    
    public double getSubAmount() {
        return SubAmount;
    }
    public void setSubAmount(double SubAmount) {
    	this.SubAmount = SubAmount;
    }
    
    
    public double getRecAmount() {
        return RecAmount;
    }
    public void setRecAmount(double RecAmount) {
    	this.RecAmount = RecAmount;
    }
    //Discount
    public double getDiscount() {
        return Discount;
    }
    public void setDiscount(double Discount) {
    	this.Discount = Discount;
    }
    
    public int getMFactor() {
        return MFactor;
    }
    public void setMFactor(int MFactor) {
    	this.MFactor = MFactor;
    }
    
    public String getActivationDate() {
        return ActivationDate;
    }
    public void setActivationDate(String ActivationDate) {
    	if (ActivationDate == null) ActivationDate=" "; 
        this.ActivationDate = ActivationDate;
    }
    
    public int getisProRata() {
        return isProRata;
    }
    public void setisProRata(int isProRata) {
    	this.isProRata = isProRata;
    }
    
    public int getisAutoDetect() {
        return isAutoDetect;
    }
    public void setisAutoDetect(int isAutoDetect) {
    	this.isAutoDetect = isAutoDetect;
    }
    
    public int getisAdvCharging() {
        return isAdvCharging;
    }
    public void setisAdvCharging(int isAdvCharging) {
    	this.isAdvCharging = isAdvCharging;
    }
    
    public long getFreeMin() {
        return FreeMin;
    }
    public void setFreeMin(long FreeMin) {
    	this.FreeMin = FreeMin;
    }
    
    public long getFreeMB() {
        return this.FreeMB;
    }
    public void setFreeMB(long FreeMB) {
    	this.FreeMB = FreeMB;
    }
    
    public long getFreeHr() {
        return FreeHr;
    }
    public void setFreeHr(long FreeHr) {
    	this.FreeHr = FreeHr;
    }
    
    public long getFreeUnit() {
        return this.FreeUnit;
    }
    public void setFreeUnit(long FreeUnit) {
    	this.FreeUnit = FreeUnit;
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
    
    
    
    public Service getService() {
        return this.service;
    }
    public void setService(Service service) {
         this.service=service;
    }
    
    public Subscriber getSubscriber() {
        return this.subscriber;
    }
    public void setSubscriber(Subscriber subscriber) {
         this.subscriber=subscriber;
    }
    
    public ChargingPeriodType getPeriodType() {
        return PeriodType;
    }
    public void setPeriodType(ChargingPeriodType PeriodType) {
    	this.PeriodType = PeriodType;
    }
    
    public Currency getCurrency() {
        return this.currency;
    }
    public void setCurrency(Currency currency) {
    	 this.currency=currency;
    }
}
