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
CREATE TABLE SER_TBLSERVICEGROUPS
(
  SG_GROUPID     		NUMBER(5)                   NOT NULL 		Primary Key,
  SG_GROUPNAME   		VARCHAR2(100 BYTE)          DEFAULT '' ,
  SG_GROUPDESC   		VARCHAR2(200 BYTE)          DEFAULT '' ,
  ST_TYPEID          	NUMBER(10)             		default (0)			NOT NULL,
  SG_isDisabled			number(1)					default (0)			Not Null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
*/
public class ServiceGroup {
      
    int GroupID;
    String GroupName;
    String GroupDesc;
    int ServiceTypeID;
    int isDisabled;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;   
    
    ServiceType serviceType;
    
    public ServiceGroup() {
    	
    	GroupID=0;
    	GroupName="";
    	GroupDesc="";
    	ServiceTypeID=0;
    	isDisabled=0;
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate=""; 
        serviceType = new ServiceType();
    }

    public ServiceGroup(int id, String name, String desc, int ServiceTypeID, int disable, long suid, String suip, String insdate,long suidm, String suipm, String modfdate  ){
    	this.GroupID=id;
    	this.GroupName = name;
    	this.GroupDesc=desc;
    	this.ServiceTypeID=ServiceTypeID;
    	this.isDisabled=disable;
    	this.SU_SysUserID=suid;
    	this.SU_SysUserIP=suip;
    	this.SU_InsertDate=insdate; 
    	this.SU_SysUserIDM=suidm;        
    	this.SU_SysUserIPM=suipm;  
    	this.SU_ModifyDate=modfdate; 
    	serviceType = new ServiceType();
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
     
   
    public int getGroupID() {
        return GroupID;
    }
    
    public String getGroupName() {
        return GroupName;
    }
    public String getGroupDesc() {
        return GroupDesc;
    }
    public int getisDisabled() {
        return isDisabled;
    }
    public int getServiceTypeID() {
        return ServiceTypeID;
    }
    public void setGroupID(int GroupID) {
    	this.GroupID = GroupID;
    }
    public void setGroupName(String GroupName) {
    	if (GroupName == null) GroupName=" "; 
        this.GroupName = GroupName;
    }
    public void setGroupDesc(String GroupDesc) {
    	if (GroupDesc == null) GroupDesc=" "; 
        this.GroupDesc = GroupDesc;
    }
    public void setServiceTypeID(int ServiceTypeID) {
    	this.ServiceTypeID = ServiceTypeID;
    }
    
    public void setisDisabled(int isDisabled) {
    	this.isDisabled = isDisabled;
    }
    
    public ServiceType getServiceType() {
        return serviceType;
    }
    public void setServiceType(ServiceType serviceType) {
    	this.serviceType = serviceType;
    }
}
