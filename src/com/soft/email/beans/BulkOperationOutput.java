package com.soft.email.beans;


//CREATE TABLE WITRIBE.SM_TBLBULKOPERATIONOUTPUT
//(
//  BOO_OUPPUTID         NUMBER,
//  BOO_OPERATIONTYPEID  NUMBER,
//  ACCOUNTNO            NUMBER,
//  BOO_REMARKS          VARCHAR2(32 BYTE),
//  BOO_STATUS           NUMBER,
//  SU_SYSUSERID         NUMBER,
//  SU_SYSUSERIP         VARCHAR2(32 BYTE),
//  SU_INSERTDATE        DATE,
//  SU_SYSUSERIDM        NUMBER,
//  SU_SYSUSERIPM        VARCHAR2(32 BYTE),
//  SU_MODIFYDATE        DATE
//)



public class BulkOperationOutput {
	int outPutId; 
	long ownerID;
	int ownerTypeID;
	String ownerName;
	long bulkOperationID;
	String remarks;
	int status;
	long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    BulkOperationsBean BulkOperationsBean=null;
Account Account=null;
    
    public BulkOperationOutput(){
    	this. outPutId=0; 
    	this. ownerTypeID=0;
    	this. ownerID=0;
    	this.ownerName="";
    	bulkOperationID=0;
    	this. remarks="";
    	this. status=0;
    	this. SU_SysUserID=0;
    	this. SU_SysUserIP="0";
    	this. SU_InsertDate="sysdate"; 
    	this. SU_SysUserIDM=0;        
    	this. SU_SysUserIPM="0";  
    	this. SU_ModifyDate="sysdate"; 
    	BulkOperationsBean=new BulkOperationsBean();
    	Account=new Account();
    	}
    
  public  BulkOperationOutput (
    		int outPutId, 
    		long ownerID,
    		int ownerTypeID,
    		String ownerName,
    		long bulkOperationID,
    		String remarks,
    		int status,
    		long SU_SysUserID,
    	    String SU_SysUserIP,
    	    String SU_InsertDate, 
    	    long SU_SysUserIDM,        
    	    String SU_SysUserIPM,  
    	    String SU_ModifyDate){
	  this. outPutId=outPutId; 
	  this. ownerID=ownerID;
		this. ownerTypeID=ownerTypeID;
		if(ownerName==null){
			 ownerName="";
		}
		this. ownerName=ownerName;
		this. bulkOperationID=bulkOperationID;
		if(remarks==null){
			remarks="";
		}
	this. remarks=remarks;
  	this. status=status;
  	this. SU_SysUserID=SU_SysUserID;
  	this. SU_SysUserIP=SU_SysUserIP;
  	this. SU_InsertDate=SU_InsertDate; 
  	this. SU_SysUserIDM=SU_SysUserIDM;        
  	this. SU_SysUserIPM=SU_SysUserIPM;  
  	this. SU_ModifyDate=SU_ModifyDate;
	  
  	BulkOperationsBean=new BulkOperationsBean();
  	Account=new Account();
  }

public long getBulkOperationID() {
	return bulkOperationID;
}

public void setBulkOperationID(long bulkOperationID) {
	this.bulkOperationID = bulkOperationID;
}

public long getOwnerID() {
	return ownerID;
}

public void setOwnerID(long ownerID) {
	this.ownerID = ownerID;
}

public int getOwnerTypeID() {
	return ownerTypeID;
}

public void setOwnerTypeID(int ownerTypeID) {
	this.ownerTypeID = ownerTypeID;
}

public String getOwnerName() {
	return ownerName;
}

public void setOwnerName(String ownerName) {
	if(ownerName==null){
		 ownerName="";
	}
	this.ownerName = ownerName;
}

public Account getAccount() {
	return Account;
}

public void setAccount(Account account) {
	Account = account;
}

public BulkOperationsBean getBulkOperationsBean() {
	return BulkOperationsBean;
}

public void setBulkOperationsBean(BulkOperationsBean bulkOperationsBean) {
	BulkOperationsBean = bulkOperationsBean;
}

public int getOutPutId() {
	return outPutId;
}

public void setOutPutId(int outPutId) {
	this.outPutId = outPutId;
}


public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	if(remarks==null){
		remarks="";
	}
	this.remarks = remarks;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

public long getSU_SysUserID() {
	return SU_SysUserID;
}

public void setSU_SysUserID(long sU_SysUserID) {
	SU_SysUserID = sU_SysUserID;
}

public String getSU_SysUserIP() {
	return SU_SysUserIP;
}

public void setSU_SysUserIP(String sU_SysUserIP) {
	SU_SysUserIP = sU_SysUserIP;
}

public String getSU_InsertDate() {
	return SU_InsertDate;
}

public void setSU_InsertDate(String sU_InsertDate) {
	SU_InsertDate = sU_InsertDate;
}

public long getSU_SysUserIDM() {
	return SU_SysUserIDM;
}

public void setSU_SysUserIDM(long sU_SysUserIDM) {
	SU_SysUserIDM = sU_SysUserIDM;
}

public String getSU_SysUserIPM() {
	return SU_SysUserIPM;
}

public void setSU_SysUserIPM(String sU_SysUserIPM) {
	SU_SysUserIPM = sU_SysUserIPM;
}

public String getSU_ModifyDate() {
	return SU_ModifyDate;
}

public void setSU_ModifyDate(String sU_ModifyDate) {
	SU_ModifyDate = sU_ModifyDate;
}
    
    
}
