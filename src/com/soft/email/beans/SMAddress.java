package com.soft.email.beans;

/*
 * 
CREATE TABLE SM_TBLSMADDRESSES
(
  SMA_ID					NUMBER(10)                  NOT NULL 			Primary Key,
  SMOT_TYPEID				NUMBER(2)                   DEFAULT(0)			NOT NULL, 
  SMA_OWNERID     			NUMBER(10)                  DEFAULT(0)			NOT NULL, 
  AT_TYPEID					NUMBER(3)                   DEFAULT(0)			NOT NULL, 
  SMA_ADDRESS				VARCHAR2(200 BYTE)    		DEFAULT (''),
  CI_CITYID        			NUMBER(7)                   DEFAULT(0)			NOT NULL,        
  SMA_ISDELETED				NUMBER(1)					DEFAULT(0)			NOT NULL,
  SU_SysUserID          	number(5)               	default(0)          not null,
  SU_SysUserIP          	varchar2(32)            	default('0')        not null,
  SU_InsertDate         	date                    	default(sysdate)    not null,
  SU_SysUserIDM         	number(5)               	default(0)          not null,
  SU_SysUserIPM        	 	varchar2(32)            	default('0')        not null,
  SU_ModifyDate         	date                    	default(sysdate)    not null 
)
 */

public class SMAddress {
	
	    long SMAID;
	    int OwnerTypeID;
	    long OwnerID;
	    int AddressTypeID;
	    String Address;
	    int CityID;
	    int isDeleted;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    AddressType addressType;
	    City city;
	   
	    public SMAddress() {
	    	this.SMAID=0;
	    	this.OwnerTypeID=0;
	    	this.OwnerID=0;
	    	this.AddressTypeID=0;
	    	this.Address="";
	    	this.CityID=0;
	    	this.isDeleted=0;
	    	this.SU_SysUserID=0;
	    	this.SU_SysUserIP="";
	    	this.SU_InsertDate="";
	    	this.SU_SysUserIDM=0;      
	    	this.SU_SysUserIPM="";
	    	this.SU_ModifyDate="";
	    	this.addressType = new AddressType();
	    	this.city = new City();
		   
	    }
	    
	    public SMAddress(long id, int ownertypeid, long ownerid,  int AddressTypeID, String Address, int cityid, int isDeleted, 
	    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate){
	    
	    	this.SMAID=id;
	    	this.OwnerTypeID=ownertypeid;
	    	this.OwnerID=ownerid;
	    	this.AddressTypeID=AddressTypeID;
	    	if (Address == null) Address="";
	    	this.Address=Address;
	    	this.CityID=cityid;
	    	this.isDeleted=isDeleted;
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
	    	this.addressType = new AddressType();
	    	this.city = new City();
	    	
	    }
	    
	    
	    /*
	     * this.SMAID=0;
	    	this.OwnerTypeID=0;
	    	this.OwnerID=0;
	    	this.MiddleName="";
	    	
	     */
	    public long getSMAID(){
	    	return SMAID;
	    }
	    public void setSMAID(long SMAID){
	        this.SMAID = SMAID;
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
	    public int getAddressTypeID(){
	    	return AddressTypeID;
	    }
	    public void setAddressTypeID(int AddressTypeID){
	        this.AddressTypeID = AddressTypeID;
	    }
	    
	    public String getAddress(){
	    	return Address;
	    }
	    public void setAddress(String Address){
	    	if (Address == null) Address="";
	        this.Address = Address;
	    }
	    
	    public int getCityID(){
	    	return CityID;
	    }
	    public void setCityID(int CityID){
	        this.CityID = CityID;
	    }
	    
	    public int getisDeleted(){
	    	return isDeleted;
	    }
	    public void setisDeleted(int isDeleted){
	        this.isDeleted = isDeleted;
	    }
	   
	    public AddressType getAddressType(){
	    	return addressType;
	    }
	    public void setAddressType(AddressType addressType){
	        this.addressType = addressType;
	    }
	    public City getCity(){
	    	return city;
	    }
	    public void setCity(City city){
	        this.city = city;
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



