package com.soft.email.beans;

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
CREATE TABLE SC_TBLCURRENCYRATES
(
  CR_RATEID				NUMBER(10)                   NOT NULL 		Primary Key,
  C_CURRENCYID     		NUMBER(5)                   default (0)			Not Null,
  CR_RATE		   		NUMBER(12,5)		        default (0)			Not Null,
  CR_ACTIVATIONDATE		DATE ,
  C_isDisabled			number(1)					default (0)			Not Null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
*/
public class CurrencyRate {
      
    long RateID;
	int CurrencyID;
	double Rate;
	String ActivationDate;
    int isDisabled;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;   
    
    
    public CurrencyRate() {
    	RateID=0;
    	CurrencyID=0;
    	Rate=0;
    	ActivationDate="";
    	isDisabled=0;
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate="";   
    }

    public CurrencyRate(long id,int curid, double rate, String actdate, int disable, long suid, String suip, String insdate,long suidm, String suipm, String modfdate  ){
    	RateID=id;
    	CurrencyID=curid;
    	Rate = rate;
    	ActivationDate=actdate;
    	isDisabled=disable;
        SU_SysUserID=suid;
        SU_SysUserIP=suip;
        SU_InsertDate=insdate; 
        SU_SysUserIDM=suidm;        
        SU_SysUserIPM=suipm;  
        SU_ModifyDate=modfdate; 
        
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
     
   public long getRateID() {
        return RateID;
    }
	
    public int getCurrencyID() {
        return CurrencyID;
    }
    
    public double getRate() {
        return Rate;
    }
    
    public String getActivationDate() {
        return ActivationDate;
    }
    
    public int getisDisabled() {
        return isDisabled;
    }
    
    public void setRateID(long RateID) {
    	this.RateID = RateID;
    }
    
    public void setCurrencyID(int CurrencyID) {
    	this.CurrencyID = CurrencyID;
    }
    
    public void setRate(double Rate) {
    	this.Rate = Rate;
    }
    
    public void setActivationDate(String ActivationDate) {
    	if (ActivationDate == null) ActivationDate=" "; 
        this.ActivationDate = ActivationDate;
    }
    public void setisDisabled(int isDisabled) {
    	this.isDisabled = isDisabled;
    }
    
    
}
