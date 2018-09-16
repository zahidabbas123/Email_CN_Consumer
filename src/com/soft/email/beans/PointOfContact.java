package com.soft.email.beans;

import java.util.ArrayList;
/*
 * 
 CREATE TABLE SM_TBLPOINTOFCONTACTS
(
  POC_CONTACTID     		NUMBER(10)                  NOT NULL 			Primary Key,
  SMOT_TYPEID				NUMBER(2)                   DEFAULT(0)			NOT NULL, 
  POC_OWNERID				NUMBER(10)                  DEFAULT(0)			NOT NULL, 
  CONT_TYPEID     			NUMBER(3)                   DEFAULT(0)			NOT NULL, 
  POCS_TYPEID     			NUMBER(3)                   DEFAULT(0)			NOT NULL, 
  POC_FIRSTNAME				VARCHAR2(64 BYTE)    		DEFAULT (''),
  POC_MIDDLENAME			VARCHAR2(64 BYTE)    		DEFAULT (''),
  POC_LASTNAME				VARCHAR2(64 BYTE)    		DEFAULT (''),
  POC_JOBTITLE				VARCHAR2(64 BYTE)    		DEFAULT (''),
  POC_DEPARTMENT			VARCHAR2(64 BYTE)    		DEFAULT (''),
  POC_EMAIL					VARCHAR2(100 BYTE)    		DEFAULT (''),
  POC_isDisabled			number(1)					default (0)			Not Null,
  SU_SysUserID          	number(5)               	default(0)          not null,
  SU_SysUserIP          	varchar2(32)            	default('0')        not null,
  SU_InsertDate         	date                    	default(sysdate)    not null,
  SU_SysUserIDM         	number(5)               	default(0)          not null,
  SU_SysUserIPM        	 	varchar2(32)            	default('0')        not null,
  SU_ModifyDate         	date                    	default(sysdate)    not null 
)
 */

public class PointOfContact {
	
	    long ContactID;
	    int OwnerTypeID;
	    long OwnerID;
	    int POCTypeID;
	    int SalutationTypeID;
	    String FirstName;
	    String MiddleName;
	    String LastName;
	    String JobTitle;
	    String Department;
	    String Email;
	    int isDisabled;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    ContactType contactType;
	    SalutationType salutationType;
	    ArrayList NationalIDs;
	    ArrayList PhoneNumbers;
	   
	    public PointOfContact() {
	    	this.ContactID=0;
	    	this.OwnerTypeID=0;
	    	this.OwnerID=0;
	    	this.POCTypeID=0;
	    	this.SalutationTypeID=0;
	    	this.FirstName="";
	    	this.MiddleName="";
	    	this.LastName="";
	    	this.JobTitle="";
	    	this.Department="";
	    	this.Email="";
	    	this.isDisabled=0;
	    	this.SU_SysUserID=0;
	    	this.SU_SysUserIP="";
	    	this.SU_InsertDate="";
	    	this.SU_SysUserIDM=0;      
	    	this.SU_SysUserIPM="";
	    	this.SU_ModifyDate="";
	    	this.contactType = new ContactType();
	    	this.salutationType = new SalutationType();
		    this.NationalIDs = new ArrayList();
		    this.PhoneNumbers = new ArrayList();
		    
	    }
	    
	    public PointOfContact(long id, int ownertypeid, long ownerid,  int POCTypeID, int saltypeid,  String firstname, String middlename, 
	    		String lastname, String jobtitle, String department, String email, int isDisabled, 
	    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate){
	    
	    	this.ContactID=id;
	    	this.OwnerTypeID=ownertypeid;
	    	this.OwnerID=ownerid;
	    	this.POCTypeID=POCTypeID;
	    	this.SalutationTypeID=saltypeid;
	    	if (firstname == null) firstname="";
	    	this.FirstName=firstname;
	    	if (middlename == null) middlename="";
	    	this.MiddleName=middlename;
	    	if (lastname == null) lastname="";
	    	this.LastName=lastname;
	    	
	    	if (jobtitle == null) jobtitle="";
	    	this.JobTitle=jobtitle;
	    	if (department == null) department="";
	    	this.Department=department;
	    	if (email == null) email="";
	    	this.Email=email;
	    	
	    	this.isDisabled=isDisabled;
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
	    	
	    	this.contactType = new ContactType();
	    	this.salutationType = new SalutationType();
		    this.NationalIDs = new ArrayList();
		    this.PhoneNumbers = new ArrayList();
	    }
	    
	    public long getContactID(){
	    	return ContactID;
	    }
	    public void setContactID(long ContactID){
	        this.ContactID = ContactID;
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
	    public int getPOCTypeID(){
	    	return POCTypeID;
	    }
	    public void setPOCTypeID(int POCTypeID){
	        this.POCTypeID = POCTypeID;
	    }
	    
	    public int getSalutationTypeID(){
	    	return SalutationTypeID;
	    }
	    public void setSalutationTypeID(int SalutationTypeID){
	        this.SalutationTypeID = SalutationTypeID;
	    }
	    public String getFirstName(){
	    	return FirstName;
	    }
	    public void setFirstName(String FirstName){
	    	if (FirstName == null) FirstName="";
	        this.FirstName = FirstName;
	    }
	    public String getMiddleName(){
	    	return MiddleName;
	    }
	    public void setMiddleName(String MiddleName){
	    	if (MiddleName == null) MiddleName="";
	        this.MiddleName = MiddleName;
	    }
	    public String getLastName(){
	    	return LastName;
	    }
	    public void setLastName(String LastName){
	    	if (LastName == null) LastName="";
	        this.LastName = LastName;
	    }
	    
	    public String getJobTitle(){
	    	return JobTitle;
	    }
	    public void setJobTitle(String JobTitle){
	    	if (JobTitle == null) JobTitle="";
	        this.JobTitle = JobTitle;
	    }
	    
	    public String getDepartment(){
	    	return Department;
	    }
	    public void setDepartment(String Department){
	    	if (Department == null) Department="";
	        this.Department = Department;
	    }
	    
	    public String getEmail(){
	    	return Email;
	    }
	    public void setEmail(String Email){
	    	if (Email == null) Email="";
	        this.Email = Email;
	    }
	    
	    public int getisDisabled(){
	    	return isDisabled;
	    }
	    public void setisDisabled(int isDisabled){
	        this.isDisabled = isDisabled;
	    }
	    
	    public ContactType getContactType(){
	    	return contactType;
	    }
	    public void setContactType(ContactType contactType){
	        this.contactType = contactType;
	    }
	    
	    public SalutationType getSalutationType(){
	    	return salutationType;
	    }
	    public void setSalutationType(SalutationType salutationType){
	        this.salutationType = salutationType;
	    }
	    
	    public ArrayList getNationalIDs(){
	    	return NationalIDs;
	    }
	    public void setNationalIDs(ArrayList NationalIDs){
	        this.NationalIDs = NationalIDs;
	    }
	    
	    public ArrayList getPhoneNumbers(){
	    	return PhoneNumbers;
	    }
	    public void setPhoneNumbers(ArrayList PhoneNumbers){
	        this.PhoneNumbers = PhoneNumbers;
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



