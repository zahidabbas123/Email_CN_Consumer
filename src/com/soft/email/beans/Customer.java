package com.soft.email.beans;
import com.soft.email.beans.*;
import com.soft.email.beans.*;
import com.soft.email.beans.*;
import com.soft.email.beans.*;
/*
 * 

CREATE TABLE SM_TBLCUSTOMERS
(
	CUS_CUSTOMERID   		NUMBER(19)                  NOT NULL 			Primary Key,
	CT_TYPEID     			NUMBER(5)                   DEFAULT(0)			NOT NULL,
	IT_TYPEID     			NUMBER(5)                   DEFAULT(0)			NOT NULL,
	CUS_REFNO				VARCHAR2(64)				DEFAULT(''),
	ST_TYPEID     			NUMBER(3)                   DEFAULT(0)			NOT NULL, 
	CUS_NAME				VARCHAR2(64)				DEFAULT(''),
	CUS_EMAIL				VARCHAR2(100)				DEFAULT(''),
	CUS_WEB					VARCHAR2(64)				DEFAULT(''),
	CR_RegionID        		NUMBER(5)                   DEFAULT(0)			NOT NULL,      
	CI_CITYID        		NUMBER(7)                   DEFAULT(0)			NOT NULL,        
	ST_STATEID        		NUMBER(5)                   DEFAULT(0)			NOT NULL,                   
	FBP_FIXEDPERIODID  		NUMBER(5)                  	DEFAULT(0)			NOT NULL,
	CUS_TERMINATEDATE		DATE,
	CUS_CONTRACTREFNO		VARCHAR2(64)				DEFAULT(''),
	CUS_NOOFACCOUNTS		NUMBER(5)                  	DEFAULT(0)			NOT NULL,
	CUS_ACCTMANAGERID		NUMBER(5)                  	DEFAULT(0)			NOT NULL,
	CS_STATEID    			NUMBER(3)					DEFAULT(0)			NOT NULL,
	FR_FRANCHISEEID         NUMBER(5)           		DEFAULT (0)         NOT NULL,
	CUS_ONLINEACCESS	    NUMBER(1)            		DEFAULT (0) 		NOT NULL,
	CUS_PASSWORD            VARCHAR2(50 BYTE)    								,
	CUS_InvoiceRemarks            VARCHAR2(100 BYTE)    								,
	SU_SysUserID          	number(5)               	default(0)          not null,
	SU_SysUserIP          	varchar2(32)            	default('0')        not null,
	SU_InsertDate         	date                    	default(sysdate)    not null,
	SU_SysUserIDM         	number(5)               	default(0)          not null,
	SU_SysUserIPM        	varchar2(32)            	default('0')        not null,
	SU_ModifyDate         	date                    	default(sysdate)    not null 
)
/
 */

public class Customer {
	
	    long CustomerID;
	    int CustomerTypeID;
	    int IndustryTypeID;
	    String CustomerRefNo;
	    int SalutationTypeID;
	    String Name;
	    String Email;
	    String Web;
	    int RegionID;
	    int CityID;
	    int StateID;
	    int FixedBillingPeriodID;
	    String TerminationDate;
	    String ContractRefNo;
	    int NoOfAccounts;
	    int AcctManagerID;
	    int CustomerStateID;
	    long FranchiseeID;
	    int CurrencyID;
	    int OnlineAccess;
	    String Password;
	    String InvoiceRemarks;
	    
	    
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    CustomerType customerType;
	    IndustryType industryType;
	    SalutationType salutationType;
	    CityRegion region ;
	    City city;
	    State state;
	    FixedBillingPeriod fixedbillingPeriod;
	    SysUser AccountManager;
	    CustomerState customerstate;
	    Franchisee franchisee;
	    Currency currency;
	    
	    
	   
	    public Customer() {
	    	this.CustomerID=0;
	    	this.CustomerTypeID=0;
	    	this.IndustryTypeID=0;
	    	this.CustomerRefNo="";
	    	this.SalutationTypeID=0;
	    	this.Name="";
	    	this.Email="";
	    	this.Web="";
	    	this.RegionID=0;
	    	this.CityID=0;
	    	this.StateID=0;
	    	this.FixedBillingPeriodID=0;
	    	this.TerminationDate="";
	    	this.ContractRefNo="";
	    	this.NoOfAccounts=0;
	    	this.AcctManagerID=0;
	    	this.CustomerStateID=0;
	    	this.FranchiseeID=0;
	    	this.CurrencyID=0;
	    	this.OnlineAccess=0;
	    	this.Password="";
	    	this.InvoiceRemarks="";
	    	this.SU_SysUserID=0;
	    	this.SU_SysUserIP="";
	    	this.SU_InsertDate="";
	    	this.SU_SysUserIDM=0;      
	    	this.SU_SysUserIPM="";
	    	this.SU_ModifyDate="";
	    	
	    	customerType = new CustomerType();
		    industryType= new IndustryType();
		    salutationType= new SalutationType();
		    region = new CityRegion();
		    city= new City();
		    state= new State();
		    fixedbillingPeriod= new FixedBillingPeriod();
		    AccountManager= new SysUser();
		    customerstate= new CustomerState();
		    franchisee= new Franchisee();
		    currency = new Currency();
	    }
	    
	    public Customer(long id, int custypeid, int industypeid, String custrefno, int saltypeid, String name, String email, String web, 
	    		int regionid, int cityid, int stateid, int fbperiodid, String terminationdate, String contractrefno, int noofaccounts, int acctmanagerid, 
	    		int customerstateid, long franchiseeid, int currencyid, int onlineaccess, String password, String InvoiceRemarks, 
	    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate){
	    
	    	this.CustomerID=id;
	    	this.CustomerTypeID=custypeid;
	    	this.IndustryTypeID=industypeid;
	    	if (custrefno == null) custrefno="";
	    	this.CustomerRefNo=custrefno;
	    	this.SalutationTypeID=saltypeid;
	    	if (name == null) name="";
	    	this.Name=name;
	    	if (email == null) email="";
	    	this.Email=email;
	    	if (web == null) web="";
	    	this.Web=web;
	    	this.RegionID=regionid;
	    	this.CityID=cityid;
	    	this.StateID=stateid;
	    	this.FixedBillingPeriodID=fbperiodid;
	    	if (terminationdate == null) terminationdate="";
	    	this.TerminationDate=terminationdate;
	    	if (contractrefno == null) contractrefno="";
	    	this.ContractRefNo=contractrefno;
	    	this.NoOfAccounts = noofaccounts;
	    	this.AcctManagerID=acctmanagerid;
	    	this.CustomerStateID=customerstateid;
	    	this.FranchiseeID=franchiseeid;
	    	this.CurrencyID = currencyid;
	    	this.OnlineAccess=onlineaccess;
	    	if (password == null) password="";
	    	this.Password=password;
	    	if (InvoiceRemarks == null) InvoiceRemarks="";
	    	this.InvoiceRemarks=InvoiceRemarks;
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
	    	
	    	customerType = new CustomerType();
		    industryType= new IndustryType();
		    salutationType= new SalutationType();
		    region = new CityRegion();
		    city= new City();
		    state= new State();
		    fixedbillingPeriod= new FixedBillingPeriod();
		    AccountManager= new SysUser();
		    customerstate= new CustomerState();
		    franchisee= new Franchisee();
		    currency = new Currency();
	    }
	    
	    
	    /*
	     * this.CustomerID=0;
	    	this.CustomerTypeID=0;
	    	this.IndustryTypeID=0;
	    	this.CustomerRefNo="";
	    	
	     */
	    public long getCustomerID(){
	    	return CustomerID;
	    }
	    public void setCustomerID(long CustomerID){
	        this.CustomerID = CustomerID;
	    }
	    public int getCustomerTypeID(){
	    	return CustomerTypeID;
	    }
	    public void setCustomerTypeID(int CustomerTypeID){
	        this.CustomerTypeID = CustomerTypeID;
	    }
	    
	    public int getIndustryTypeID(){
	    	return IndustryTypeID;
	    }
	    public void setIndustryTypeID(int IndustryTypeID){
	        this.IndustryTypeID = IndustryTypeID;
	    }
	    
	    public String getCustomerRefNo(){
	    	return CustomerRefNo;
	    }
	    public void setCustomerRefNo(String CustomerRefNo){
	    	if (CustomerRefNo == null) CustomerRefNo="";
	        this.CustomerRefNo = CustomerRefNo;
	    }
	    
	    /*
	     * this.SalutationTypeID=0;
	    	this.Name="";
	    	this.Email="";
	    	this.Web="";
	    	
	     */
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
	    public String getWeb(){
	    	return Web;
	    }
	    public void setWeb(String Web){
	    	if (Web == null) Web="";
	        this.Web = Web;
	    }
	    
	    /*
	     * this.RegionID=0;
	    	this.CityID=0;
	    	this.StateID=0;
	    	this.FixedBillingPeriodID=0;
	    	this.TerminationDate="";
	    	this.ContractRefNo="";
	    	
	     */
	    
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
	    
	    public int getFixedBillingPeriodID(){
	    	return FixedBillingPeriodID;
	    }
	    public void setFixedBillingPeriodID(int FixedBillingPeriodID){
	        this.FixedBillingPeriodID = FixedBillingPeriodID;
	    }
	    
	    public String getTerminationDate(){
	    	return TerminationDate;
	    }
	    public void setTerminationDate(String TerminationDate){
	    	if (TerminationDate == null) TerminationDate="";
	        this.TerminationDate = TerminationDate;
	    }
	    
	    public String getContractRefNo(){
	    	return ContractRefNo;
	    }
	    public void setContractRefNo(String ContractRefNo){
	    	if (ContractRefNo == null) ContractRefNo="";
	        this.ContractRefNo = ContractRefNo;
	    }
	    public int getNoOfAccounts(){
	    	return NoOfAccounts;
	    }
	    public void setNoOfAccounts(int NoOfAccounts){
	        this.NoOfAccounts = NoOfAccounts;
	    }
	    public int getAcctManagerID(){
	    	return AcctManagerID;
	    }
	    public void setAcctManagerID(int AcctManagerID){
	        this.AcctManagerID = AcctManagerID;
	    }
	    public int getCustomerStateID(){
	    	return CustomerStateID;
	    }
	    public void setCustomerStateID(int CustomerStateID){
	        this.CustomerStateID = CustomerStateID;
	    }
	    public long getFranchiseeID(){
	    	return FranchiseeID;
	    }
	    public void setFranchiseeID(long FranchiseeID){
	        this.FranchiseeID = FranchiseeID;
	    }
	    
	    //CurrencyID
	    public int getCurrencyID(){
	    	return CurrencyID;
	    }
	    public void setCurrencyID(int CurrencyID){
	        this.CurrencyID = CurrencyID;
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
	    
	    public String getInvoiceRemarks(){
	    	return InvoiceRemarks;
	    }
	    public void setInvoiceRemarks(String InvoiceRemarks){
	    	if (InvoiceRemarks == null) InvoiceRemarks="";
	        this.InvoiceRemarks = InvoiceRemarks;
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
	    
	    public CustomerType getCustomerType() {
	        return this.customerType;
	    }
	    public void setCustomerType(CustomerType customerType) {
	         this.customerType=customerType;
	    }
	    
	    public IndustryType getIndustryType() {
	        return this.industryType;
	    }
	    public void setIndustryType(IndustryType industryType) {
	         this.industryType=industryType;
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
	    
	    public SysUser getAccountManager() {
	        return this.AccountManager;
	    }
	    public void setAccountManager(SysUser AccountManager) {
	         this.AccountManager=AccountManager;
	    }
	    
	    public CustomerState getCustomerState() {
	        return this.customerstate;
	    }
	    public void setCustomerState(CustomerState customerstate) {
	         this.customerstate=customerstate;
	    }
	    
	    public Franchisee getFranchisee() {
	        return this.franchisee;
	    }
	    public void setFranchisee(Franchisee franchisee) {
	    	 this.franchisee=franchisee;
	    }
	    
	    public Currency getCurrency() {
	        return this.currency;
	    }
	    public void setCurrency(Currency currency) {
	    	 this.currency=currency;
	    }
	    
	   
}



