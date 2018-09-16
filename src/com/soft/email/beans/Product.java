package com.soft.email.beans;


/*
 * 
 * 			CREATE TABLE PP_TBLPRODUCTS
(
  PR_PRODUCTID            	NUMBER(10)              NOT NULL			Primary Key,
  PR_PRODUCTNAME          	VARCHAR2(64 BYTE)       DEFAULT ('')        NOT NULL,
  PR_DESCRIPTION      	  	VARCHAR2(300 BYTE)      DEFAULT (''),
  PR_ACTIVATIONDATE       	DATE                    DEFAULT ('') ,
  FBP_FIXEDPERIODID  		NUMBER(5)               DEFAULT (0)         NOT NULL,
  AC_APPCONFIGID      	  	NUMBER(4)               DEFAULT (0)         NOT NULL,
  PR_ISDISPLAYABLE    		NUMBER(1)               DEFAULT (1)         NOT NULL,
  PR_ISPREPAID        		NUMBER(1)               DEFAULT (0)         NOT NULL,
  PR_ALLOWEDDIDS     	 	NUMBER(5)               DEFAULT (0)         NOT NULL,
  DPP_PLANID 				NUMBER(5) 				DEFAULT (0) 		NOT NULL,
  PR_ALLOWEDCUG       		NUMBER(4)               DEFAULT (0)         NOT NULL,
  PR_ALLOWEDFAXLINES  		NUMBER(5)               DEFAULT (0)         NOT NULL,
  PR_ALLOWEDTOLLFREE  		NUMBER(5)               DEFAULT (0)         NOT NULL,
  PR_ISDISABLED           	NUMBER(1)             	DEFAULT (0)         NOT NULL,
  PR_ALLOWEDTRUNKS    		NUMBER(5)               DEFAULT (0)         NOT NULL,
  SU_SysUserID            	number(5)             	default(0)          not null,
  SU_SysUserIP            	varchar2(32)          	default('0')        not null,
  SU_InsertDate           	date                  	default(sysdate)    not null,
  SU_SysUserIDM           	number(5)             	default(0)          not null,
  SU_SysUserIPM           	varchar2(32)          	default('0')        not null,
  SU_ModifyDate           	date                  	default(sysdate)    not null 
)
/

 */

public class Product {
	
	    int ProductID;
	    String ProductName;
	    String ProductDesc;
	    String ActivationDate;
	    int FixedPeriodID;
	    int AppConfigID;
	    int isDisplayable;
	    int isPrepaid;
	    int Alloweddids;
	    int DIDPricePlanID;
	    int Alowedcug;
	    int AllowedFaxlines;
	    int AllowedTollFree;
	    int isDisable;
	    int AllowedTrunks;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    FixedBillingPeriod fixedbillingperiod;
	    
	    
	   
	    public Product() {
	    	ProductID=0;
	    	ProductName="";
	    	ProductDesc="";
	    	ActivationDate="";
	    	FixedPeriodID=0;
	    	AppConfigID=0;
	    	isDisplayable=0;
		    isPrepaid=0;
		    Alloweddids=0;
		    DIDPricePlanID=0;
		    Alowedcug=0;
		    AllowedFaxlines=0;
		    AllowedTollFree=0;
	    	isDisable=0;
	    	AllowedTrunks=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		    
		    fixedbillingperiod = new FixedBillingPeriod();
		    
	    }
	    
	    public Product(int id, String name, String desc, String activationdate,int FixedPeriodID, int appconfig,int  isDisplayable, int isPrepaid,
	    		int Alloweddids, int priceplan, int Alowedcug, int AllowedFaxlines, int AllowedTollFree,  int disable,int AllowedTrunks, 
	    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.ProductID = id;
	    	if(name == null)name="";
	    	this.ProductName = name;	
	    	if(desc == null)desc="";
	    	this.ProductDesc=desc;
	    	if(activationdate==null)activationdate="";
	    	this.ActivationDate=activationdate;
	    	this.FixedPeriodID=FixedPeriodID;//new
	    	this.AppConfigID=appconfig;
	    	/////new/////////
	    	
	    	this.isDisplayable=isDisplayable;
	    	this.isPrepaid=isPrepaid;
	    	this.Alloweddids=Alloweddids;
	    	this.DIDPricePlanID=priceplan;
	    	this.Alowedcug=Alowedcug;
	    	this.AllowedFaxlines=AllowedFaxlines;
	    	this.AllowedTollFree=AllowedTollFree;
	    	
	    	////////////////////////
	    	this.isDisable=disable;
	    	this.AllowedTrunks=AllowedTrunks;///new
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
	    	
	    	fixedbillingperiod = new FixedBillingPeriod();
	    	
	    	
	    }
	    
	   /* 
	    int ProductID;
	    String ProductName;
	    String ProductDesc;
	    String ActivationDate;
	    int FixedPeriodID;
	    int AppConfigID;
	    int isDisplayable;
	    int isPrepaid;
	    int Alloweddids;
	    int Alowedcug;
	    int AllowedFaxlines;
	    int AllowedTollFree;
	    int isDisable;
	    int AllowedTrunks;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; */
	    
	    public int getProductID(){
	    	return ProductID;
	    }
	    public void setProductID(int ID){
	        this.ProductID = ID;
	    }
	    
	    public String getProductName(){
	    	return ProductName;
	    }
	    public void setProductName(String Name){
	    	if (ProductName == null) ProductName="";
	        this.ProductName = Name;
	    }
	    public String getProductDesc(){
	    	return ProductDesc;
	    }
	    public void setProductDesc(String Desc){
	    	if (Desc == null) Desc="";
	        this.ProductDesc = Desc;
	    }
	    public String getActivationDate(){
	    	return ActivationDate;
	    }
	    public void setActivationDate(String activationdate){
	    	if (activationdate == null) activationdate="";
	        this.ActivationDate = activationdate;
	    }
	    //////new//////
	    public int getFixedPeriodID(){
	    	return FixedPeriodID;
	    }
	    public void setFixedPeriodID(int FixedPeriodID){
	        this.FixedPeriodID = FixedPeriodID;
	    }
	    ///////////end///////////
	    
	    public int getAppConfigID(){
	    	return AppConfigID;
	    }
	    public void setAppConfigID(int appconfigid){
	        this.AppConfigID = appconfigid;
	    }
	    //////////////////new///////////
	    public int getisDisplayable(){
	    	return isDisplayable;
	    }
	    public void setisDisplayable(int isDisplayable){
	        this.isDisplayable = isDisplayable;
	    }
	    
	    public int getisPrepaid(){
	    	return isPrepaid;
	    }
	    public void setisPrepaid(int isPrepaid){
	        this.isPrepaid = isPrepaid;
	    }
	    public int getAlloweddids(){
	    	return Alloweddids;
	    }
	    public void setAlloweddids(int Alloweddids){
	        this.Alloweddids = Alloweddids;
	    }
	    
	    public int getDIDPricePlanID(){
	    	return DIDPricePlanID;
	    }
	    public void setDIDPricePlanID(int DIDPricePlanID){
	        this.DIDPricePlanID = DIDPricePlanID;
	    }
	    
	    public int getAlowedcug(){
	    	return Alowedcug;
	    }
	    public void setAlowedcug(int Alowedcug){
	        this.Alowedcug = Alowedcug;
	    }
	    public int getAllowedFaxlines(){
	    	return AllowedFaxlines;
	    }
	    public void setAllowedFaxlines(int AllowedFaxlines){
	        this.AllowedFaxlines = AllowedFaxlines;
	    }
	    public int getAllowedTollFree(){
	    	return AllowedTollFree;
	    }
	    public void setAllowedTollFree(int AllowedTollFree){
	        this.AllowedTollFree = AllowedTollFree;
	    }
	    
	    
	     ///////////////end/////////////////
	    
	    public int getisDisable(){
	    	return isDisable;
	    }
	    public void setisDisable(int isDisable){
	        this.isDisable = isDisable;
	    }
	    /////////////new/////////
	    public int getAllowedTrunks(){
	    	return AllowedTrunks;
	    }
	    public void setAllowedTrunks(int AllowedTrunks){
	        this.AllowedTrunks = AllowedTrunks;
	    }
	    
	    ////////////////////////
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
	    
	    
	    public FixedBillingPeriod getFixedBillingPeriod() {
	        return this.fixedbillingperiod;
	    }
	    public void setFixedBillingPeriod(FixedBillingPeriod fixedbillingperiod) {
	    	 this.fixedbillingperiod=fixedbillingperiod;
	    }
	    
	    

	   
}



