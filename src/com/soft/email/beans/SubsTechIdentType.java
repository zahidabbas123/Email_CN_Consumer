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

/*
 * CREATE TABLE SM_TBLSUBSTECHIDENTTYPES
(
  STIT_TYPEID     		NUMBER(3)                   NOT NULL 		Primary Key,
  STIT_TYPENAME   		VARCHAR2(100 BYTE)          DEFAULT '' ,
  STIT_TYPEDESC   		VARCHAR2(200 BYTE)          DEFAULT '' ,
  STIT_isDisabled		number(1)					default (0)			Not Null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
 */

public class SubsTechIdentType {

	int TypeID;
    String TypeName;
    String TypeDesc;
    String TypeCode;
    
    int isDisable;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    
    public SubsTechIdentType() {
    	TypeID=0;
    	TypeName="";
    	TypeDesc="";
    	TypeCode="";
    	isDisable=0;
    	SU_SysUserID=0;
	    SU_SysUserIP="";
	    SU_InsertDate="";
	    SU_SysUserIDM=0;      
	    SU_SysUserIPM="";
	    SU_ModifyDate="";
	}

    public SubsTechIdentType(int id, String name, String desc, String code, int disable, 
    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
    {
    	this.TypeID = id;
    	if(name == null)name="";
    	this.TypeName = name;	
    	if(desc == null)desc="";
    	this.TypeDesc=desc;
    	if(code == null)code="";
    	this.TypeCode=code;
    	
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
    public String getTypeCode(){
    	return TypeCode;
    }
    public void setTypeCode(String TypeCode){
    	if (TypeCode == null) TypeCode="";
        this.TypeCode = TypeCode;
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
