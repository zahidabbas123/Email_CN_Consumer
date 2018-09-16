package com.soft.email.beans;
import com.soft.email.beans.*;
import com.soft.email.beans.*;
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
 *DROP TABLE SM_TBLACCOUNTS CASCADE CONSTRAINTS
/
CREATE TABLE SM_TBLACCOUNTS(
  AC_ACCOUNTNO             NUMBER(19)           NOT NULL					  PRIMARY KEY,
  CUS_CUSTOMERID           NUMBER(19)           DEFAULT (0)                   NOT NULL,
  AC_ISPREPAID             NUMBER(1)            DEFAULT (0)                   NOT NULL,
  AC_ISCUSTOMERBILL		   NUMBER(1)            DEFAULT (0)                   NOT NULL,
  ST_TYPEID                NUMBER(3)            DEFAULT (0)                   NOT NULL,
  AC_ACCTHOLDERNAME        VARCHAR2(150 BYTE)   DEFAULT ''						,
  PR_PRODUCTID             NUMBER(7)            DEFAULT (0)                   NOT NULL,
  AC_CREDITLIMIT           NUMBER(18,5)         DEFAULT (0)                   NOT NULL,
  AC_CURRENTBALANCE        NUMBER(18,5)         DEFAULT (0)                   NOT NULL,
  AC_SECURITYDEPOSIT       NUMBER(18,5)         DEFAULT (0)                   NOT NULL,
  AC_ACTIVATIONDATE        DATE                 								,
  AC_EXPIRYDATE            DATE													,
  AC_NOOFSUBSCRIBERS       NUMBER(5)            DEFAULT (0)                   NOT NULL,
  AS_ACCTSTATEID           NUMBER(3)            DEFAULT (0)                   NOT NULL,
  FBP_FIXEDPERIODID        NUMBER(5)            DEFAULT (0)                   NOT NULL,
  FR_FRANCHISEEID          NUMBER(7)            DEFAULT (0)                   NOT NULL,
  SBP_POLICYID             NUMBER(5)           DEFAULT (0)                   NOT NULL,
  CR_REGIONID              NUMBER(5)            DEFAULT (0)                   NOT NULL,
  CI_CITYID                NUMBER(7)            DEFAULT (0)                   NOT NULL,
  ST_STATEID               NUMBER(5)            DEFAULT (0)                   NOT NULL,
  CL_LOCATIONID            NUMBER(7)            DEFAULT (0)                   NOT NULL,
  AC_BRANCHCODE            NUMBER(3)            DEFAULT (0)                   NOT NULL,
  AC_ONLINEACCESS		   NUMBER(1)            DEFAULT (0)					  NOT NULL,
  AC_InvoiceRemarks              VARCHAR2(100 BYTE)    								,
  AC_PASSWORD              VARCHAR2(50 BYTE)    								,
  AC_Email				   VARCHAR2(200 BYTE)    	,
  SU_SYSUSERID             NUMBER(5)            DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIP             VARCHAR2(32 BYTE)    DEFAULT ('0')                 NOT NULL,
  SU_INSERTDATE            DATE                 DEFAULT (sysdate)             NOT NULL,
  SU_SYSUSERIDM            NUMBER(5)            DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIPM            VARCHAR2(32 BYTE)    DEFAULT ('0')                 NOT NULL,
  SU_MODIFYDATE            DATE                 DEFAULT (sysdate)             NOT NULL
)/*/

public class Account {
	
	
	long AccountNo;
    long CustomerID;
    int isPrepaid;
    int isCustomerBill;
    int SalutationTypeID;
    String Name;
    String Email;
    int ProductID;
    
    double CreditLimit;
    double CurrentBalance;
    double EQPSalesBalance;
    double SecurityDeposit;
    String ActivationDate;
    String ExpiryDate;
    int NoOfsubscribers;
    int AccountStateID;
    int FixedPeriodID;
 	long FranchiseeID;
 	int BlockingPolicyID;
 	int RegionID;
	int CityID;
	int StateID;
	int LocationID;
	String TownName;
	String BranchCode;
	int OnlineAccess;
    String Password;
    String InvoiceRemarks;
    int PrintDiscount;
    int  DisableASIAmnt; 
    int CurrencyID;
    //double CurrencyRate;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    
    String LastBillDate;
    String NextBillDate; 
    int PRINTCUSTOMERNAME=0;
    
    SalutationType salutationType;
    Product product;
    CityRegion region ;
    City city;
    State state;
    CityLocation location; 
    FixedBillingPeriod fixedbillingPeriod;
    AccountState accountstate;
    Franchisee franchisee;
    AcctBlkPolicy BlockingPolicy; 
    SMAddress InvoiceAddress;
    Currency currency;
    
   
    public Account() {
    	this.AccountNo=0;
    	this.CustomerID=0;
    	this.isPrepaid=0;
    	this.isCustomerBill=0;
    	this.SalutationTypeID=0;
    	this.Name="";
    	this.Email="";
    	this.ProductID=0;
    	this.CreditLimit=0;
    	this.CurrentBalance=0;
    	this.EQPSalesBalance=0;
    	this.SecurityDeposit=0;
    	this.ActivationDate="";
    	this.ExpiryDate="";
    	this.NoOfsubscribers=0;
    	this.AccountStateID=0;
        this.FixedPeriodID=0;
        this.FranchiseeID=0;
        this.BlockingPolicyID=0;
     	this.RegionID=0;
    	this.CityID=0;
    	this.StateID=0;
    	this.LocationID=0;
    	this.TownName="";
    	this.BranchCode="";
    	this.OnlineAccess=0;
    	this.Password="";
    	this.InvoiceRemarks="";
    	this.PrintDiscount=0;
    	this.DisableASIAmnt=0;
    	this.CurrencyID=0;
    	//this.CurrencyRate=0;
    	this.SU_SysUserID=0;
    	this.SU_SysUserIP="";
    	this.SU_InsertDate="";
    	this.SU_SysUserIDM=0;      
    	this.SU_SysUserIPM="";
    	this.SU_ModifyDate="";
    	
    	this.LastBillDate = "";
    	this.NextBillDate="";
    	this.PRINTCUSTOMERNAME=0;
    	
    	location = new CityLocation();
        product= new Product();
        salutationType= new SalutationType();
        region = new CityRegion();
        city= new City();
        state= new State();
        fixedbillingPeriod= new FixedBillingPeriod();
        accountstate= new AccountState();
        franchisee= new Franchisee();
        BlockingPolicy = new AcctBlkPolicy();
        InvoiceAddress = new SMAddress();
        //AcctBlkPolicy BlockingPolicy; 
        currency = new Currency();
    }
    
    
    
    public Account(long id, long customerid, int isprepaid, int iscustbill, int saltypeid, String name, String email, int productid,
    		double creditlimit, double currentbalance, double EQPSalesBalance,
    		double securitydeposit, String activationdate, String expirydate, int noofsubscribers, int accountstateid, int fixedperiodid, 
    		long franchiseeid, int blockingpolicy, int regionid, int cityid, int stateid, int locationid, String townname, String branchcode, 
    		int onlineaccess,  String password,String InvoiceRemarks, int PrintDiscount, int DisableASIAmnt, int currencyid, 
    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate,int printCustName){
    
    
    	this.AccountNo=id;
    	this.CustomerID=customerid;
    	this.isPrepaid=isprepaid;
    	this.isCustomerBill = iscustbill;
    	this.SalutationTypeID=saltypeid;
    	if (name == null) name="";
    	this.Name=name;
    	if (email == null) email="";
    	this.Email=email;
    	this.ProductID=productid;
    	this.CreditLimit=creditlimit;
    	this.CurrentBalance=currentbalance;
    	this.EQPSalesBalance = EQPSalesBalance;
    	this.SecurityDeposit=securitydeposit;
    	this.ActivationDate=activationdate;
    	this.ExpiryDate=expirydate;
    	this.NoOfsubscribers=noofsubscribers;
    	this.AccountStateID=accountstateid;
        this.FixedPeriodID=fixedperiodid;
        this.FranchiseeID=franchiseeid;
        this.BlockingPolicyID=blockingpolicy;
     	this.RegionID=regionid;
    	this.CityID=cityid;
    	this.StateID=stateid;
    	this.LocationID=locationid;
    	if (townname == null) townname="";
    	this.TownName=townname;
    	this.BranchCode=branchcode;
        this.OnlineAccess=onlineaccess;
    	if (password == null) password="";
    	this.Password=password;
    	if (InvoiceRemarks == null) InvoiceRemarks="";
    	this.InvoiceRemarks=InvoiceRemarks;
    	this.PrintDiscount = PrintDiscount;
    	this.DisableASIAmnt = DisableASIAmnt; 
    	this.CurrencyID = currencyid;
    	//this.CurrencyRate = crate;
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
    	this.PRINTCUSTOMERNAME=printCustName;
    	
    	this.LastBillDate = "";
    	this.NextBillDate="";
    	
    	location = new CityLocation();
        product= new Product();
        salutationType= new SalutationType();
        region = new CityRegion();
        city= new City();
        state= new State();
        fixedbillingPeriod= new FixedBillingPeriod();
        accountstate= new AccountState();
        franchisee= new Franchisee();
        BlockingPolicy = new AcctBlkPolicy();
        InvoiceAddress = new SMAddress();
        currency = new Currency();
    }
    
    
    public long getAccountNo(){
    	return AccountNo;
    }
    public void setAccountNo(long AccountNo){
        this.AccountNo = AccountNo;
    }
    public long getCustomerID(){
    	return CustomerID;
    }
    public void setCustomerID(long CustomerID){
        this.CustomerID = CustomerID;
    }
   
    public int getisPrepaid(){
    	return isPrepaid;
    }
    public void setisPrepaid(int isPrepaid){
        this.isPrepaid = isPrepaid;
    }
    
    public int getisCustomerBill(){
    	return isCustomerBill;
    }
    public void setisCustomerBill(int isCustomerBill){
        this.isCustomerBill = isCustomerBill;
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
    
    public int getProductID(){
    	return ProductID;
    }
    public void setProductID(int ProductID){
        this.ProductID = ProductID;
    }
    
    public double getCreditLimit(){
    	return CreditLimit;
    }
    public void setCreditLimit(double CreditLimit){
        this.CreditLimit = CreditLimit;
    }
    
    public double getCurrentBalance(){
    	return CurrentBalance;
    }
    public void setCurrentBalance(double CurrentBalance){
        this.CurrentBalance = CurrentBalance;
    }
    public double getEQPSalesBalance(){
    	return EQPSalesBalance;
    }
    public void setEQPSalesBalance(double EQPSalesBalance){
        this.EQPSalesBalance = EQPSalesBalance;
    }
     
    
    public double getSecurityDeposit(){
    	return SecurityDeposit;
    }
    public void setSecurityDeposit(double SecurityDeposit){
        this.SecurityDeposit = SecurityDeposit;
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
   
    public int getNoOfsubscribers(){
    	return NoOfsubscribers;
    }
    public void setNoOfsubscribers(int NoOfsubscribers){
        this.NoOfsubscribers = NoOfsubscribers;
    }
    public int getAccountStateID(){
    	return AccountStateID;
    }
    public void setAccountStateID(int AccountStateID){
        this.AccountStateID = AccountStateID;
    }
    public int getFixedPeriodID(){
    	return FixedPeriodID;
    }
    public void setFixedPeriodID(int FixedPeriodID){
        this.FixedPeriodID = FixedPeriodID;
    }
    public long getFranchiseeID(){
    	return FranchiseeID;
    }
    public void setFranchiseeID(long FranchiseeID){
        this.FranchiseeID = FranchiseeID;
    }
    public int getBlockingPolicyID(){
    	return BlockingPolicyID;
    }
    public void setBlockingPolicyID(int BlockingPolicyID){
        this.BlockingPolicyID = BlockingPolicyID;
    }
    
    public int getRegionID(){
    	return RegionID;
    }
    public void setRegionID(int RegionID){
        this.RegionID = RegionID;
    }
    
    public int getCityID(){
    	return CityID;
    }
    public void setCityID(int CityID){
        this.CityID = CityID;
    }
    
    public int getStateID(){
    	return StateID;
    }
    public void setStateID(int StateID){
        this.StateID = StateID;
    }
    public int getLocationID(){
    	return LocationID;
    }
    public void setLocationID(int LocationID){
        this.LocationID = LocationID;
    }
    
    public String getTownName(){
    	return TownName;
    }
    public void setTownName(String TownName){
    	if (TownName == null) TownName="";
        this.TownName = TownName;
    }
    //TownName="";
    
    public String getBranchCode(){
    	return BranchCode;
    }
    public void setBranchCode(String BranchCode){
    	if (BranchCode == null) BranchCode="";
        this.BranchCode = BranchCode;
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
    
    public int getPrintDiscount(){
    	return PrintDiscount;
    }
    public void setPrintDiscount(int PrintDiscount){
        this.PrintDiscount = PrintDiscount;
    }
    //DisableASIAmnt
    public int getDisableASIAmnt(){
    	return DisableASIAmnt;
    }
    public void setDisableASIAmnt(int DisableASIAmnt){
        this.DisableASIAmnt = DisableASIAmnt;
    }
    
    public int getCurrencyID(){
    	return CurrencyID;
    }
    public void setCurrencyID(int CurrencyID){
        this.CurrencyID = CurrencyID;
    }
    
    /*
     * 
     public double getCurrencyRate(){
    	return CurrencyRate;
    }
    public void setCurrencyRate(double CurrencyRate){
        this.CurrencyRate = CurrencyRate;
    }
    */
    
    //CurrencyID
    public String getInvoiceRemarks(){
    	return InvoiceRemarks;
    }
    public void setInvoiceRemarks(String InvoiceRemarks){
    	if (InvoiceRemarks == null) InvoiceRemarks="";
        this.InvoiceRemarks = InvoiceRemarks;
    }
    //EQPSalesBalance , PrintDiscount ,
    
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
    
    public String getLastBillDate() {
        return this.LastBillDate;
    }
    public void setLastBillDate(String LastBillDate) {
    	if (LastBillDate == null ) LastBillDate="";
         this.LastBillDate=LastBillDate;
    }
    
    public String getNextBillDate() {
        return this.NextBillDate;
    }
    public void setNextBillDate(String NextBillDate) {
    	if (NextBillDate == null ) NextBillDate="";
         this.NextBillDate=NextBillDate;
    }
    
	
    public Product getProduct() {
        return this.product;
    }
    public void setProduct(Product product) {
         this.product=product;
    }
    
    public CityLocation getCityLocation() {
        return this.location;
    }
    public void setCityLocation(CityLocation location) {
         this.location=location;
    }
    
    public SalutationType getSalutationType() {
        return this.salutationType;
    }
    public void setSalutationType(SalutationType salutationType) {
         this.salutationType=salutationType;
    }
    
    public CityRegion getCityRegion() {
        return this.region;
    }
    public void setCityRegion(CityRegion region) {
         this.region=region;
    }
    
    public City getCity() {
        return this.city;
    }
    public void setCity(City city) {
         this.city=city;
    }
    
    public State getState() {
        return this.state;
    }
    public void setState(State state) {
         this.state=state;
    }
    
    public FixedBillingPeriod getFixedBillingPeriod() {
        return this.fixedbillingPeriod;
    }
    public void setFixedBillingPeriod(FixedBillingPeriod fixedbillingPeriod) {
         this.fixedbillingPeriod=fixedbillingPeriod;
    }
    
   
    public AccountState getAccountState() {
        return this.accountstate;
    }
    public void setAccountState(AccountState accountstate) {
         this.accountstate=accountstate;
    }
    
    public Franchisee getFranchisee() {
        return this.franchisee;
    }
    public void setFranchisee(Franchisee franchisee) {
    	 this.franchisee=franchisee;
    }
    
    public AcctBlkPolicy getBlockingPolicy() {
        return this.BlockingPolicy;
    }
    public void setBlockingPolicy(AcctBlkPolicy BlockingPolicy) {
    	 this.BlockingPolicy=BlockingPolicy;
    }
    
    public SMAddress getInvoiceAddress() {
        return this.InvoiceAddress;
    }
    public void setInvoiceAddress(SMAddress InvoiceAddress) {
    	 this.InvoiceAddress=InvoiceAddress;
    }
    public Currency getCurrency() {
        return this.currency;
    }
    public void setCurrency(Currency currency) {
    	 this.currency=currency;
    }
    public int getPRINTCUSTOMERNAME() {
        return this.PRINTCUSTOMERNAME;
    }
    public void setPRINTCUSTOMERNAME(int PRINTCUSTOMERNAME) {
        this.PRINTCUSTOMERNAME=PRINTCUSTOMERNAME;
    }
    
}
