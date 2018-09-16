package com.soft.email.beans;

import java.util.ArrayList;



/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Terminus (pvt) Ltd.</p>
 *
 * @author Badar
 *
 * @version 1.0
 **/


public class BulkOperation {
	
	
	long bo_OperationId ;
    int bo_operationtype;
    int bo_status;
    String bo_filename;
    String bo_starttime;
    String bo_endtime;
    int isEmailSent;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
 



	


	public BulkOperation() {
    	
    	this.bo_OperationId=0;
    	this.bo_operationtype=0;
    	this.bo_status=0;
    	this.bo_filename="";
    	this.bo_starttime="";
    	this.bo_endtime="";
    	this.isEmailSent=0;
    	this.SU_SysUserID=0;
    	this.SU_SysUserIP="";
    	this.SU_InsertDate="";
    	this.SU_SysUserIDM=0;      
    	this.SU_SysUserIPM="";
    	this.SU_ModifyDate="";
    }
    
    
    
    public BulkOperation(long bo_OperationId,int bo_operationtype, int bo_status,String bo_filename,String bo_starttime, String bo_endtime,int isEmailSent, long SU_SysUserID,String SU_SysUserIP,String SU_InsertDate,long SU_SysUserIDM,String SU_SysUserIPM,String SU_ModifyDate ){
    
    
    	this.bo_OperationId=bo_OperationId;
    	this.bo_operationtype=bo_operationtype;
    	this.bo_status=bo_status;
    	this.bo_filename=bo_filename;
    	this.bo_starttime=bo_starttime;
    	this.bo_endtime=bo_endtime;
    	this.isEmailSent=isEmailSent;
    	this.SU_SysUserID=SU_SysUserID;
    	this.SU_SysUserIP=SU_SysUserIP;
    	this.SU_InsertDate=SU_InsertDate;
    	this.SU_SysUserIDM=SU_SysUserIDM;      
    	this.SU_SysUserIPM=SU_SysUserIPM;
    	this.SU_ModifyDate=SU_ModifyDate;
    }
    public long getOperationId(){
    	return bo_OperationId;
    }
    
    
    
    public int getIsEmailSent() {
		return isEmailSent;
	}



	public void setIsEmailSent(int isEmailSent) {
		this.isEmailSent = isEmailSent;
	}



	public void setOperationId(long bo_OperationId){
        this.bo_OperationId = bo_OperationId;
    }
    
    public long getOperationType(){
    	return bo_operationtype;
    }
    public void setOperationType(int bo_operationtype){
        this.bo_operationtype = bo_operationtype;
    }
    
    
    public long getStatus(){
    	return bo_status;
    }
    public void setStatus(int bo_status){
        this.bo_status = bo_status;
    }
    public String getFileName() {
        return this.bo_filename;
    }
    
    public void setFileName(String bo_filename) {
    	if (bo_filename == null || bo_filename.length()==0) bo_filename="0";
        this.bo_filename=bo_filename;
    }
    
    
    public String getStartTime() {
        return this.bo_starttime;
    }
    public void setStartTime(String bo_starttime) {
    	if (bo_starttime == null ) bo_starttime="";
         this.bo_starttime=bo_starttime;
    }
    
    public String getEndTime() {
        return this.SU_InsertDate;
    }
    public void setEndTime(String bo_endtime) {
    	if (bo_endtime == null ) bo_endtime="";
         this.bo_endtime=bo_endtime;
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
