package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE TEM_TBLEMAILSTATUS
(
  EMS_STATUSID    		NUMBER(3)                	NOT NULL			PRIMARY KEY,
  EMS_STATUSNAME  		VARCHAR2(100 BYTE)       	, 
  EMS_ISDISABLED		number(1)					default (0)			Not Null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
 */

public class EmailStatus {
	
	    int StatusID;
	    String StatusName;
	    int IsDisabled;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    
	   
	    public EmailStatus() {
	    	StatusID=0;
	    	StatusName="";
	    	IsDisabled=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		   
	    }
	    
	    public EmailStatus(int id, String name, int disabled, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.StatusID = id;
	    	if(name == null)name="";
	    	this.StatusName = name;	
	    	this.IsDisabled=disabled;
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
	     * int StatusID;
	    String StatusName;
	    int IsDisabled;
	     */
	    public int getStatusID(){
	    	return StatusID;
	    }
	    public void setStatusID(int StatusID){
	        this.StatusID = StatusID;
	    }
	    
	    public String getStatusName(){
	    	return StatusName;
	    }
	    public void setStatusName(String StatusName){
	    	if (StatusName == null) StatusName="";
	        this.StatusName = StatusName;
	    }
	    public int getIsDisabled(){
	    	return IsDisabled;
	    }
	    public void setIsDisabled(int IsDisabled){
	        this.IsDisabled = IsDisabled;
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



