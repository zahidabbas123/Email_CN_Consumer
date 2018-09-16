package com.soft.email.beans;


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



public class Franchisee {
    private int FranchiseeID;
    private String Login;
    private String Password;
    private String activationDate;
    private int isActive;
    private String Name;
    private String remoteIP;
    private String insertedBy;
    private String address;
    private int assignAM;
    private int isMaster;
    private String franchiseeCode;
    private int isPrepaid;
    private double CurrentBalance;
    private double CreditLimit;
    
    
    public Franchisee(){
    	FranchiseeID=0;
    	Login="";
    	Password="";
    	activationDate="";
    	isActive=0;
    	Name="";
    	remoteIP="";
    	insertedBy="0";
    	address="";
    	assignAM=0;
    	isMaster=0;
    	franchiseeCode="";
    	isPrepaid=0;
    	CurrentBalance=0;
    	CreditLimit=0;
    }
    
    public Franchisee(int FranchiseeID,
                   String Login,
                   String Password,
                   String activationDate,
                   int isActive,
                   String Name,
                   String remoteIP,
                   String insertedBy,
                   String Address,
                   int assignam,
                   int ismaster,
                   String franchiseecode,
                   int isprepaid,
                   double currentbal,
                   double creditlimit
            ) {

        this.FranchiseeID = FranchiseeID;
        this.Login = Login;
        this.Password = Password;
        this.activationDate = activationDate;
        this.isActive = isActive;
        this.Name = Name;
        this.remoteIP = remoteIP;
        this.insertedBy = insertedBy;
        this.address = Address;
        this.assignAM=assignam;
        this.isMaster=ismaster;
        this.franchiseeCode=franchiseecode;
        this.isPrepaid=isprepaid;
        this.CurrentBalance=currentbal;
        this.CreditLimit=creditlimit;

    }


    public void setFranchiseeID(int FranchiseeID) {

        this.FranchiseeID = FranchiseeID;
    }

    public void setLogin(String Login) {

        this.Login = Login;
    }

    public void setPassword(String Password) {

        this.Password = Password;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public void setName(String Name) {

        this.Name = Name;
    }

    public void setRemoteIP(String remoteIP) {
        this.remoteIP = remoteIP;
    }

    public void setInsertedBy(String insertedBy) {
        this.insertedBy = insertedBy;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAssignAM(int assignAM) {
        this.assignAM = assignAM;
    }

    public void setIsMaster(int isMaster) {
        this.isMaster = isMaster;
    }

    public void setFranchiseeCode(String franchiseeCode) {
        this.franchiseeCode = franchiseeCode;
    }

    public int getFranchiseeID() {

        return FranchiseeID;
    }

    public String getLogin() {

        return Login;
    }

    public String getPassword() {

        return Password;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public int getIsActive() {
        return isActive;
    }

    public String getName() {

        return Name;
    }

    public String getRemoteIP() {
        return remoteIP;
    }

    public String getInsertedBy() {
        return insertedBy;
    }

    public String getAddress() {
        return address;
    }

    public int getAssignAM() {
        return assignAM;
    }

    public int getIsMaster() {
        return isMaster;
    }

    public String getFranchiseeCode() {
        return franchiseeCode;
    }
    
    
	public int getisPrepaid() {
        return isPrepaid;
    }
	public void setisPrepaid(int isPrepaid) {
        this.isPrepaid = isPrepaid;
    }
	
	public double getCurrentBalance() {
        return CurrentBalance;
    }
	public void setCurrentBalance(double CurrentBalance) {
        this.CurrentBalance = CurrentBalance;
    }
	public double getCreditLimit() {
        return CreditLimit;
    }
	public void setCreditLimit(double CreditLimit) {
        this.CreditLimit = CreditLimit;
    }
}
