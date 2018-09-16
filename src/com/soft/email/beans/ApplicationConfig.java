package com.soft.email.beans;

import java.util.ArrayList;


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
 * CREATE TABLE SC_TBLAPPCONFIGURATION
(
  AC_APPCONFIGID    NUMBER(5)                  PRIMARY KEY,
  SA_APPID          NUMBER(5)                  DEFAULT (0)                   NOT NULL,
  AC_APPCONFIGNAME  VARCHAR2(100 BYTE)           NOT NULL,
  AC_APPCONFIGDESC  VARCHAR2(200 BYTE)          DEFAULT '',
  AC_APPCONFIGCODE  VARCHAR2(64 BYTE)           							  NOT NULL,
  NE_ElEMENTID 		number(1) 					DEFAULT(0)					  NOT NULL,   
  SU_SYSUSERID      NUMBER(5)                   DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIP      VARCHAR2(32 BYTE)           DEFAULT ('0')                 NOT NULL,
  SU_INSERTDATE     DATE                        DEFAULT (sysdate)             NOT NULL,
  SU_SYSUSERIDM     NUMBER(5)                   DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIPM     VARCHAR2(32 BYTE)           DEFAULT ('0')                 NOT NULL,
  SU_MODIFYDATE     DATE                        DEFAULT (sysdate)             NOT NULL
)
/
/


 */

public class ApplicationConfig {
    int AppConfigID;
    int AppID;
    String AppConfigName;
    String AppConfigDesc;
    String AppConfigCode;
    int ElementID;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    
    
    SystemApplication systemapplication;
    
    ArrayList SystemProperties;
    
    public ApplicationConfig(){
    	AppConfigID=0;
    	AppID=0;
    	AppConfigName = "";
    	AppConfigDesc="";
    	AppConfigCode="";
    	ElementID=0;
    	SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate=""; 
        
        systemapplication = new SystemApplication();
        
        this.SystemProperties = new ArrayList();
        
    }
    
    
    public ApplicationConfig(int AppConfigID,int AppID, String AppConfigName, String AppConfigDesc,String AppConfigCode,int ElementID, long suid, String suip, String insdate,long suidm, String suipm, String modfdate ) {

    	this.AppConfigID = AppConfigID;
    	this.AppID = AppID;
    	if (AppConfigName == null ) AppConfigName ="";
    	this.AppConfigName = AppConfigName;
        if (AppConfigDesc == null ) AppConfigDesc ="";
        this.AppConfigDesc=AppConfigDesc;
        if (AppConfigCode == null ) AppConfigCode ="";
        this.AppConfigCode=AppConfigCode;
        this.ElementID = ElementID;
        this.SU_SysUserID=suid;
    	this.SU_SysUserIP=suip;
    	this.SU_InsertDate=insdate; 
    	this.SU_SysUserIDM=suidm;        
    	this.SU_SysUserIPM=suipm;  
    	this.SU_ModifyDate=modfdate;
    	systemapplication = new SystemApplication();
    	
    	this.SystemProperties = new ArrayList();
    }
    /*int AppConfigID;
    int AppID;
    String AppConfigName;
    String AppConfigDesc;
    String AppConfigCode;
    int ElementID;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
     * 
     */
    public int getAppConfigID() {
        return this.AppConfigID;
    }
    public void setAppConfigID(int AppConfigID) {
        this.AppConfigID = AppConfigID;
    }
    
    public int getAppID() {
        return this.AppID;
    }
    public void setAppID(int AppID) {
        this.AppID = AppID;
    }
    
    public String getAppConfigName() {
        return this.AppConfigName;
    }
    public void setAppConfigName(String AppConfigName) {
        this.AppConfigName = AppConfigName;
    }
    
    public String getAppConfigDesc() {
        return AppConfigDesc;
    }
    public void setAppConfigDesc(String AppConfigDesc) {
    	if (AppConfigDesc == null) AppConfigDesc=" "; 
        this.AppConfigDesc = AppConfigDesc;
    }
    
    public String getAppConfigCode() {
        return AppConfigCode;
    }
    public void setAppConfigCode(String AppConfigCode) {
    	if (AppConfigCode == null) AppConfigCode=" "; 
        this.AppConfigCode = AppConfigCode;
    }
    
    public int getElementID() {
        return this.ElementID;
    }
    public void setElementID(int ElementID) {
        this.ElementID = ElementID;
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
    
   
    public void setSystemApplication(SystemApplication systemapplication) {
        this.systemapplication = systemapplication;
    }
    public SystemApplication getSystemApplication() {
        return systemapplication;
    }
   
    
    public ArrayList getSystemProperties(){
    	return this.SystemProperties;
    }
    
    public void setSystemProperties(ArrayList Prop){
    	this.SystemProperties = Prop;
    }
    
    public String getPropertyValue(String PropName){
    	String PropValue =getPropertyValue(PropName, 0);
    	return PropValue;
    }
    
    public String getPropertyValue(String PropName, int AppConfigID){
    	String PropValue ="";
    	boolean found = false;
        for(int i=0;i<this.SystemProperties.size();i++){
        	SystemProperty sp=(SystemProperty)SystemProperties.get(i);
        	//log.debug("Prop Name :"+prop.getPropName().trim());
        	//log.debug("Prop value :"+prop.getPropValue().trim());
        	
            if (sp.getName().trim().equalsIgnoreCase(PropName.trim())){
            	if (sp.getAppConfigID() == AppConfigID ){
            		PropValue = sp.getValue();
            		found=true;
            	}else if (sp.getAppConfigID() == 0 && ! found){
            		PropValue = sp.getValue();
            	}
             }
        }
        return PropValue;
    }
    
    
}
