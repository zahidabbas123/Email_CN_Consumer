package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE TERMINUSBILL.SM_TBLINDUSTRYTYPES
(
  IT_TYPEID      NUMBER(5)                      NOT NULL,
  IT_TYPENAME    VARCHAR2(100 BYTE)             DEFAULT '',
  IT_TYPEDESC    VARCHAR2(200 BYTE)             DEFAULT '',
  IT_ISDISABLED  NUMBER(1)                      DEFAULT (0)                   NOT NULL,
  SU_SYSUSERID   NUMBER(5)                      DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIP   VARCHAR2(32 BYTE)              DEFAULT ('0')                 NOT NULL,
  SU_INSERTDATE  DATE                           DEFAULT (sysdate)             NOT NULL,
  SU_SYSUSERIDM  NUMBER(5)                      DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIPM  VARCHAR2(32 BYTE)              DEFAULT ('0')                 NOT NULL,
  SU_MODIFYDATE  DATE                           DEFAULT (sysdate)             NOT NULL
)

 */

public class IndustryType {
	
	    int TypeID;
	    String TypeName;
	    String TypeDesc;
	    int isDisable;
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    
	   
	    public IndustryType() {
	    	TypeID=0;
	    	TypeName="";
	    	TypeDesc="";
	    	isDisable=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		   
	    }
	    
	    public IndustryType(int id, String name, String desc, int disable, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.TypeID = id;
	    	if(name == null)name="";
	    	this.TypeName = name;	
	    	if(desc == null)desc="";
	    	this.TypeDesc=desc;
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
	    	
	    	
	    	
	    }
	    
	    
	    /*
	     * TypeID=0;
	    	TypeName="";
	    	TypeDesc="";
	    	isDisable=0;
	     */
	    public int getTypeID(){
	    	return TypeID;
	    }
	    public void setTypeID(int TypeID){
	        this.TypeID = TypeID;
	    }
	    
	    public String getTypeName(){
	    	return TypeName;
	    }
	    public void setTypeID(String TypeName){
	    	if (TypeName == null) TypeName="";
	        this.TypeName = TypeName;
	    }
	    public String getTypeDesc(){
	    	return TypeDesc;
	    }
	    public void setTypeDesc(String TypeDesc){
	    	if (TypeDesc == null) TypeDesc="";
	        this.TypeDesc = TypeDesc;
	    }
	    
	    public int getisDisable(){
	    	return isDisable;
	    }
	    public void setisDisable(int isDisable){
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
	    

	   
}



