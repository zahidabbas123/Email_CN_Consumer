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
 * CREATE TABLE SC_TBLSYSPROPERTIES
(
  SP_NAME         	VARCHAR2(50 BYTE)            PRIMARY KEY,
  SP_VALUE        	VARCHAR2(500 BYTE),
  AC_APPCONFIGID  	NUMBER(5)                    DEFAULT (0)                     NOT NULL,
  SP_ISDISABLED     NUMBER(1)                    DEFAULT (0)                     NOT NULL
)
/


 */

public class SystemProperty {
    String Name;
    String Value;
    int AppConfigID;
    int isDisabled;
    
    
    ApplicationConfig appconfiguration;

    public SystemProperty(){
    	Name = "";
    	Value="";
    	AppConfigID=0;
    	isDisabled=0;
    	
        
        appconfiguration = new ApplicationConfig();
    }
    
    
    public SystemProperty(String name, String Value, int AppConfigID, int isDisabled ) {

    	if (name == null ) name ="";
    	this.Name = name;
        if (Value == null ) Value ="";
        this.Value=Value;
        this.AppConfigID=AppConfigID;
        this.isDisabled=isDisabled;
        
    	appconfiguration = new ApplicationConfig();
    }
    /*String Name;
    String Value;
    int AppConfigID;
    int isDisabled;
    * 
     */
    
    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getValue() {
        return Value;
    }
    public void setValue(String Value) {
    	if (Value == null) Value=" "; 
        this.Value = Value;
    }
    
    public void setAppConfigID(int AppConfigID) {
        this.AppConfigID = AppConfigID;
    }
    public int getAppConfigID() {
        return AppConfigID;
    }
    
    
    public int getisDisabled() {
        return isDisabled;
    }
    public void setFileName(int isDisabled) {
    	this.isDisabled = isDisabled;
    }
    
    
    
    public void setAppConfiguration(ApplicationConfig appconfiguration) {
        this.appconfiguration = appconfiguration;
    }
    public ApplicationConfig getAppConfiguration() {
        return appconfiguration;
    }
    
}
