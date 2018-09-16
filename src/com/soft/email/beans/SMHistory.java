package com.soft.email.beans;

/*
 * 
CREATE TABLE SM_TBLSMHISTORY
(
  SMH_ID					NUMBER(10)                  NOT NULL 			Primary Key,
  SMOT_TYPEID				NUMBER(2)                   DEFAULT(0)			NOT NULL, 
  SMH_OWNERID     			NUMBER(10)                  DEFAULT(0)			NOT NULL, 
  SMH_STATEID				NUMBER(3)                   DEFAULT(0)			NOT NULL, 
  SMH_BALANCE
  SMH_CREDITLIMIT
  SMH_REMARKS				VARCHAR2(200 BYTE)    		DEFAULT (''),
  SU_SysUserID          	number(5)               	default(0)          not null,
  SU_SysUserIP          	varchar2(32)            	default('0')        not null,
  SU_InsertDate         	date                    	default(sysdate)    not null
 )
 */

public class SMHistory {
	
	    long SMHID;
	    int OwnerTypeID;
	    long OwnerID;
	    int StateID;
	    double RemBalance;
	    double CreditLimit;
	    int isPrepaid;
	    String Remarks;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    
	    String StateDesc="";
	    String OwnerName="";
	    
	   
	    public SMHistory() {
	    	this.SMHID=0;
	    	this.OwnerTypeID=0;
	    	this.OwnerID=0;
	    	this.StateID=0;
	    	this.RemBalance=0;
	    	this.CreditLimit=0;
	    	this.isPrepaid=0;
	    	this.Remarks="";
	    	this.SU_SysUserID=0;
	    	this.SU_SysUserIP="";
	    	this.SU_InsertDate="";
	    	this.StateDesc="";
	    	this.OwnerName="";
	    	
	    }
	    
	    public SMHistory(long id, int ownertypeid, long ownerid,  int StateID, double balance, double crlimit, int prepaid, String Remarks, 
	    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate){
	    
	    	this.SMHID=id;
	    	this.OwnerTypeID=ownertypeid;
	    	this.OwnerID=ownerid;
	    	this.StateID=StateID;
	    	this.RemBalance=balance;
	    	this.CreditLimit=crlimit;
	    	this.isPrepaid=prepaid;
	    	if (Remarks == null) Remarks="";
	    	this.Remarks=Remarks;
	    	this.SU_SysUserID=SU_SysUserID;
	    	if(SU_SysUserIP == null)SU_SysUserIP="";
	    	this.SU_SysUserIP=SU_SysUserIP;
	    	if(SU_InsertDate == null)SU_InsertDate="";
	    	this.SU_InsertDate=SU_InsertDate;
	    	this.StateDesc="";
	    	this.OwnerName="";
	    }
	    
	    
	    /*
	     * this.SMHID=0;
	    	this.OwnerTypeID=0;
	    	this.OwnerID=0;
	    	this.MiddleName="";
	    	
	     */
	    public long getSMHID(){
	    	return SMHID;
	    }
	    public void setSMHID(long SMHID){
	        this.SMHID = SMHID;
	    }
	    public int getOwnerTypeID(){
	    	return OwnerTypeID;
	    }
	    public void setOwnerTypeID(int OwnerTypeID){
	        this.OwnerTypeID = OwnerTypeID;
	    }
	    
	    public long getOwnerID(){
	    	return OwnerID;
	    }
	    public void setOwnerID(long OwnerID){
	        this.OwnerID = OwnerID;
	    }
	    public int getStateID(){
	    	return StateID;
	    }
	    public void setStateID(int StateID){
	        this.StateID = StateID;
	    }
	    
	    public double getRemBalance(){
	    	return RemBalance;
	    }
	    public void setRemBalance(double RemBalance){
	        this.RemBalance = RemBalance;
	    }
	 	public double getCreditLimit(){
	    	return CreditLimit;
	    }
	    public void setCreditLimit(double CreditLimit){
	        this.CreditLimit = CreditLimit;
	    }
	    
	    public int getisPrepaid(){
	    	return isPrepaid;
	    }
	    public void setisPrepaid(int isPrepaid){
	        this.isPrepaid = isPrepaid;
	    }
	    
    	
	    public String getRemarks(){
	    	return Remarks;
	    }
	    public void setRemarks(String Remarks){
	    	if (Remarks == null) Remarks="";
	        this.Remarks = Remarks;
	    }
	    
	    public String getStateDesc(){
	    	return StateDesc;
	    }
	    public void setStateDesc(String StateDesc){
	    	if (StateDesc == null) StateDesc="";
	        this.StateDesc = StateDesc;
	    }
	    
    	public String getOwnerName(){
	    	return OwnerName;
	    }
	    public void setOwnerName(String OwnerName){
	    	if (OwnerName == null) OwnerName="";
	        this.OwnerName = OwnerName;
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
		   
}



