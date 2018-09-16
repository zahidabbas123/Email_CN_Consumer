package com.soft.email.beans;


/*
 * 
 * 			CREATE TABLE PP_TBLPACKAGES
(
  PG_PACKAGEID            NUMBER(5)             NOT NULL,
  PR_PRODUCTID            NUMBER(5)             DEFAULT (0)                   NOT NULL,
  PG_PACKAGENAME          VARCHAR2(64 BYTE)     DEFAULT ('')                  NOT NULL,
  PG_ACTIVATIONDATE       DATE                  DEFAULT ('')                  NOT NULL,
  PG_DESCRIPTION          VARCHAR2(300 BYTE)    DEFAULT ('')                  NOT NULL,
  PG_SECURITYDEPOSIT      NUMBER(18,5)          DEFAULT (0)                   NOT NULL,
  PG_MONTHLYLINERENT      NUMBER(18,5)          DEFAULT (0)                   NOT NULL,
  PG_REGISTRATIONCHARGES  NUMBER(18,5)          DEFAULT (0)                   NOT NULL,
  CU_CURRENCYID           NUMBER(10)            DEFAULT (0)                   NOT NULL,
  PG_ISOPEN               NUMBER(1)             DEFAULT (0)                   NOT NULL,
  PG_PERIODBASE           NUMBER(1)             DEFAULT (0)                   NOT NULL,
  PG_ISADVANCE            NUMBER(1)             DEFAULT (0)                   NOT NULL,
  PG_ISDISABLED           NUMBER(1)             DEFAULT (0)                   NOT NULL,
  SU_SysUserID            number(5)             default(0)          not null,
  SU_SysUserIP            varchar2(32)          default('0')        not null,
  SU_InsertDate           date                  default(sysdate)    not null,
  SU_SysUserIDM           number(5)             default(0)          not null,
  SU_SysUserIPM           varchar2(32)          default('0')        not null,
  SU_ModifyDate           date                  default(sysdate)    not null 
)

/

 */

public class Package {
		
		int PackageID;
	    int ProductID;
	    String PackageName;
	    String ActivationDate;
	    String PackageDesc;
	    int SecurityDeposit;
	    int MonthlyLineRent;
	    int RegistrationCharges;
	    int CurrencyID;
	    int IsOpen;
	    int PeriodBase;
	    int IsAdvance;
	    int isDisable;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    Product product;

	    
	   
	    public Package() {
	    	PackageID=0;
	    	ProductID=0;
	    	PackageName="";
	    	ActivationDate="";
	    	PackageDesc="";
	    	SecurityDeposit=0;
	    	MonthlyLineRent=0;
	    	RegistrationCharges=0;
	    	CurrencyID=0;
	    	IsOpen=0;
	    	PeriodBase=0;
	    	IsAdvance=0;
	    	isDisable=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		    product= new Product();
	    }
	    
	    public Package(int PackageID,int ProductID, String name, String activationdate, String desc, int securitydeposit, int monthelylinerent, int registrationcharges, int currencyid, int isopen, int periodbase, int isadvance, int disable, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.PackageID = PackageID;
	    	this.ProductID=ProductID;
	    	if(name == null)name="";
	    	this.PackageName = name;
	    	if(activationdate==null)activationdate="";
	    	this.ActivationDate=activationdate;
	    	if(desc == null)desc="";
	    	this.PackageDesc=desc;
	    	this.SecurityDeposit=securitydeposit;
	    	this.MonthlyLineRent=monthelylinerent;
	    	this.RegistrationCharges=registrationcharges;
	    	this.CurrencyID=currencyid;
	    	this.IsOpen=isopen;
	    	this.PeriodBase=periodbase;
	    	this.IsAdvance=isadvance;
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
	    	 product= new Product();
	    	
	    	
	    }
	    
	   /* 
	    int PackageID;
	    int ProductID;
	    String PackageName;
	    String ActivationDate;
	    String PackageDesc;
	    int SecurityDeposit;
	    int MonthlyLineRent;
	    int RegistrationCharges;
	    int CurrencyID;
	    int IsOpen;
	    int PeriodBase;
	    int IsAdvance;
	    int isDisable;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    */
	    public int getPackageID(){
	    	return PackageID;
	    }
	    public void setPackageID(int PackageID){
	        this.PackageID = PackageID;
	    }
	    public int getProductID(){
	    	return ProductID;
	    }
	    public void setProductID(int ProductID){
	        this.ProductID = ProductID;
	    }
	    public String getPackageName(){
	    	return PackageName;
	    }
	    public void setPackageName(String Name){
	    	if (Name == null) Name="";
	        this.PackageName = Name;
	    }
	    public String getActivationDate(){
	    	return ActivationDate;
	    }
	    public void setActivationDate(String activationdate){
	    	if (activationdate == null) activationdate="";
	        this.ActivationDate = activationdate;
	    }
	    public String getPackageDesc(){
	    	return PackageDesc;
	    }
	    public void setPackageDesc(String Desc){
	    	if (Desc == null) Desc="";
	        this.PackageDesc = Desc;
	    }
	    public int getSecurityDeposit(){
	    	return SecurityDeposit;
	    }
	    public void setSecurityDeposit(int SecurityDeposit){
	        this.SecurityDeposit = SecurityDeposit;
	    }
	    public int getMonthlyLineRent(){
	    	return MonthlyLineRent;
	    }
	    public void setMonthlyLineRent(int MonthlyLineRent){
	        this.MonthlyLineRent = MonthlyLineRent;
	    }
	    public int getRegistrationCharges(){
	    	return RegistrationCharges;
	    }
	    public void setRegistrationCharges(int RegistrationCharges){
	        this.RegistrationCharges = RegistrationCharges;
	    }
	    public int getCurrencyID(){
	    	return CurrencyID;
	    }
	    public void setCurrencyID(int CurrencyID){
	        this.CurrencyID = CurrencyID;
	    }
	    public int getIsOpen(){
	    	return IsOpen;
	    }
	    public void setIsOpen(int IsOpen){
	        this.IsOpen = IsOpen;
	    }
		public int getPeriodBase(){
			return PeriodBase;
		}
		public void setPeriodBase(int PeriodBase){
		    this.PeriodBase = PeriodBase;
		}
		public int getIsAdvance(){
			return IsAdvance;
		}
		public void setIsAdvance(int IsAdvance){
		    this.IsAdvance = IsAdvance;
		}
	    public int getisDisable(){
	    	return isDisable;
	    }
	    public void setIsActive(int isDisable){
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
	    
	    public Product getProduct() {
	        return this.product;
	    }
	    public void setProduct(Product product) {
	    	 this.product=product;
	    }
	    

	   
}



