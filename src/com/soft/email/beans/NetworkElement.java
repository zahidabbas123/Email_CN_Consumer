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
 CREATE TABLE NC_TBLNETWORKELEMENTS
(
  NE_ELEMENTID         	NUMBER(5)                NOT NULL			Primary Key,
  NE_ELEMENTNAME       	VARCHAR2(50 BYTE)        DEFAULT ('0')          NOT NULL,
  NE_ELEMENTDESC       	VARCHAR2(100 BYTE)       DEFAULT ('0')          NOT NULL,
  NEG_GROUPID    		NUMBER(5)                Default(0)				NOT NULL, 	
  NE_DBTABLENAME  		VARCHAR2(30 BYTE)        DEFAULT '00'           NOT NULL,
  NE_ElementCode		number(5)					default (0)			Not Null,
  NE_isDisabled			number(1)					default (0)			Not Null,
  EQT_TYPEID    		NUMBER(5)                	default(0)			NOT NULL,
  EQM_MODELID    		NUMBER(5)                	default(0)			NOT NULL,
  EQV_VENDORID     		NUMBER(5)                   default(0)			NOT NULL, 
  ESV_VERSIONID     	NUMBER(5)                   default(0)			NOT NULL, 
  
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
/
 */
public class NetworkElement {
      
    int ElementID;
    String ElementName;
    String ElementDesc;
    int GroupID;
    String DBTableName;
    String ElementCode;
    int IsDisabled;
    int EQPTypeID;
    int EQPModelID;
    int EQPVendorID;
    int ESWVersionID;
    
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;   
    
    
    public NetworkElement() {
    	ElementID=0;
    	ElementName="";
    	ElementDesc="";
    	GroupID=0;
    	DBTableName="0";
    	ElementCode="0";
    	EQPTypeID=0;
    	EQPModelID=0;
    	EQPVendorID=0;
    	ESWVersionID=0;
    	IsDisabled=0;
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate="";  
    }

    public NetworkElement(int id,String name, String desc, int gid, String tablename, String elcode, int typeid, int modelid, int vendorid, int swversionid, 
    		int disable, long suid, String suip, String insdate,long suidm, String suipm, String modfdate  ){
    	
    	ElementID=id;
    	ElementName=name;
    	ElementDesc=desc;
    	GroupID=gid;
    	DBTableName=tablename;
    	ElementCode=elcode;
    	EQPTypeID=typeid;
    	EQPModelID=modelid;
    	EQPVendorID=vendorid;
    	ESWVersionID = swversionid;
    	IsDisabled=disable;
    	SU_SysUserID=suid;
        SU_SysUserIP=suip;
        SU_InsertDate=insdate; 
        SU_SysUserIDM=suidm;        
        SU_SysUserIPM=suipm;  
        SU_ModifyDate=modfdate; 
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
    
    public int getElementID() {
        return ElementID;
    }
    public String getElementName() {
        return ElementName;
    }
    public String getElementDesc() {
        return ElementDesc;
    }
    public int getGroupID() {
        return GroupID;
    }
    public String getDBTableName() {
        return DBTableName;
    }
    public String getElementCode() {
        return ElementCode;
    }
    public int getEQPTypeID() {
        return EQPTypeID;
    }
    public int getEQPModelID() {
        return EQPModelID;
    }
    public int getEQPVendorID() {
        return EQPVendorID;
    }
    
    public int getESWVersionID() {
        return ESWVersionID;
    }
    
    public int getIsDisabled() {
        return IsDisabled;
    }
    
    public void setElementID(int ElementID) {
    	this.ElementID = ElementID;
    }
    public void setElementName(String ElementName) {
    	if (ElementName == null) ElementName="0"; 
        this.ElementName = ElementName;
    }
    public void setElementDesc(String ElementDesc) {
    	if (ElementDesc == null) ElementDesc="0"; 
        this.ElementDesc = ElementDesc;
    }
    public void setDBTableName(String DBTableName) {
    	if (DBTableName == null) DBTableName="0"; 
        this.DBTableName = DBTableName;
    }
    public void setElementCode(String ElementCode) {
    	if (ElementCode == null) ElementCode="0"; 
        this.ElementCode = ElementCode;
    }
    public void setGroupID(int GroupID) {
    	this.GroupID = GroupID;
    }
	public void setEQPTypeID(int EQPTypeID) {
    	this.EQPTypeID = EQPTypeID;
    }
	public void setEQPModelID(int EQPModelID) {
    	this.EQPModelID = EQPModelID;
    }
	public void setEQPVendorID(int EQPVendorID) {
    	this.EQPVendorID = EQPVendorID;
    }
	
	public void setESWVersionID(int ESWVersionID) {
    	this.ESWVersionID = ESWVersionID;
    }
	public void setIsDisabled(int IsDisabled) {
    	this.IsDisabled = IsDisabled;
    }
	
}
