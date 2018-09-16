package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE SM_TBLACCTBLKPOLICIES(
  ABP_POLICYID           NUMBER(10)                             NOT NULL                                 PRIMARY KEY,
  ABP_NAME                VARCHAR2(30 BYTE)                DEFAULT (''),
  ABP_ISPREPAID                    NUMBER(1)                              DEFAULT (0)                             NOT NULL,
  ABP_ISDISABLED                              NUMBER(1)                              DEFAULT (0)                             NOT NULL,
  SU_SysUserID          number(5)                       default(0)          not null,
  SU_SysUserIP          varchar2(32)                    default('0')        not null,
  SU_InsertDate         date                    default(sysdate)    not null,
  SU_SysUserIDM         number(5)                      default(0)          not null,
  SU_SysUserIPM         varchar2(32)                   default('0')        not null,
  SU_ModifyDate         date                               default(sysdate)    not null 
)
 */

public class AcctBlkPolicy {
	
	    int PolicyID;
	    String Name;
	    int isPrepaid;
	    int isDisable;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    
	   
	    public AcctBlkPolicy() {
	    	PolicyID=0;
	    	Name="";
	    	isPrepaid=0;
	    	isDisable=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		   
	    }
	    
	    public AcctBlkPolicy(int PolicyID, String Name, int isPrepaid, int disable, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.PolicyID = PolicyID;
	    	if(Name == null)Name="";
	    	this.Name = Name;
	    	this.isPrepaid=isPrepaid;
	    	this.isDisable=disable;
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
	    	
	    	
	    	
	    }
	    
	    
	    /*
	     * PolicyID=0;
	    	Name="";
	    	isPrepaid=0;
	    	isDisable=0;
	     */
	    public int getPolicyID(){
	    	return PolicyID;
	    }
	    public void setPolicyID(int PolicyID){
	        this.PolicyID = PolicyID;
	    }
	    
	    public String getName(){
	    	return Name;
	    }
	    public void setName(String Name){
	    	if (Name == null) Name="";
	        this.Name = Name;
	    }
	    public int getisPrepaid(){
	    	return isPrepaid;
	    }
	    public void setisPrepaid(int isPrepaid){
	        this.isPrepaid = isPrepaid;
	    }
	    
	    public int getisDisable(){
	    	return isDisable;
	    }
	    public void setisDisable(int isDisable){
	        this.isDisable = isDisable;
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



