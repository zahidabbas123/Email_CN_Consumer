package com.soft.email.beans;

/**
 *
 * <p>Title: Terminus</p>
 *
 * <p>Description: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Terminus</p>
 *
 * @author Muhammad Naveed ALyas
 * @version 1.0
 */
/*
CREATE TABLE SER_TBLCHARGINGPERIODTYPES
(
  CPT_TYPEID     		NUMBER(5)                   NOT NULL 		Primary Key,
  CPT_TYPENAME   		VARCHAR2(100 BYTE)          DEFAULT '' ,
  CPT_isDisabled		number(1)					default (0)			Not Null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)

*/
public class ChargingPeriodType {
      
    int TypeID;
    String TypeName;
    int isDisabled;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;   
    
    
    public ChargingPeriodType() {
    	
    	TypeID=0;
    	TypeName="";
    	isDisabled=0;
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate="";  
    }

    public ChargingPeriodType(int id, String name, int disable, long suid, String suip, String insdate,long suidm, String suipm, String modfdate  ){
    	this.TypeID=id;
    	this.TypeName = name;
    	this.isDisabled=disable;
    	this.SU_SysUserID=suid;
    	this.SU_SysUserIP=suip;
    	this.SU_InsertDate=insdate; 
    	this.SU_SysUserIDM=suidm;        
    	this.SU_SysUserIPM=suipm;  
    	this.SU_ModifyDate=modfdate; 
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
     
   
    public int getTypeID() {
        return TypeID;
    }
    
    public String getTypeName() {
        return TypeName;
    }
    
    public int getisDisabled() {
        return isDisabled;
    }
   
    public void setTypeID(int TypeID) {
    	this.TypeID = TypeID;
    }
    public void setTypeName(String TypeName) {
    	if (TypeName == null) TypeName=" "; 
        this.TypeName = TypeName;
    }
    
    public void setisDisabled(int isDisabled) {
    	this.isDisabled = isDisabled;
    }
    
    
}
