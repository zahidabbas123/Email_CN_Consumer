package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE SC_TBLSYSTEMAPPLICATIONS
(
  SA_APPID       		NUMBER(5)                   PRIMARY KEY,
  SAT_TYPEID     		NUMBER(3)                	default(0)          not null,
  SA_APPNAME     		VARCHAR2(100 BYTE)          NOT NULL,
  SA_APPDESC     		VARCHAR2(200 BYTE),
  SA_APPCODE     		VARCHAR2(64 BYTE)								NOT NULL,
  SA_ISDISABLED			number(1)               	default(0)          not null,
  SU_SysUserID          number(5)               	default(0)          not null,
  SU_SysUserIP          varchar2(32)            	default('0')        not null,
  SU_InsertDate         date                    	default(sysdate)    not null,
  SU_SysUserIDM         number(5)               	default(0)          not null,
  SU_SysUserIPM         varchar2(32)            	default('0')        not null,
  SU_ModifyDate         date                    	default(sysdate)    not null 
)
/


 */

public class SystemApplication {
	
	    int APPID;
	    int TypeID;
	    String APPNAME;
	    String AppDesc;
	    String SA_APPCODE;
	    int isDisabled;
	    
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    SysAppType sysapptype;
	   
	    public SystemApplication() {
	    	APPID=0;
	    	TypeID=0;
	    	APPNAME="";
	    	AppDesc="";
	    	SA_APPCODE="";
	    	isDisabled=0;
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		    
		    sysapptype = new SysAppType();
		    
	    }
	    
	    public SystemApplication(int APPID,int TypeID, String APPNAME, String Desc, String SA_APPCODE,int Active, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate )
	    {
	    	this.APPID = APPID;
	    	this.TypeID = TypeID;
	    	if(APPNAME == null)APPNAME="";
	    	this.APPNAME = APPNAME;	
	    	if(Desc == null)Desc="";
	    	this.AppDesc=Desc;
	    	if(SA_APPCODE == null)SA_APPCODE="";
	    	this.SA_APPCODE = SA_APPCODE;
	    	this.isDisabled=Active;
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
	    	
	    	  sysapptype = new SysAppType();
	    	
	    }
	    
	    public int getAPPID(){
	    	return APPID;
	    }
	    public void setAPPID(int APPID){
	        this.APPID = APPID;
	    }
	    
	    public int getTypeID(){
	    	return TypeID;
	    }
	    public void setTypeID(int TypeID){
	        this.TypeID = TypeID;
	    }
	    
	    public String getAPPNAME(){
	    	return APPNAME;
	    }
	    public void setAPPNAME(String APPNAME){
	    	if (APPNAME == null) APPNAME="";
	        this.APPNAME = APPNAME;
	    }
	    
	    public int getisDisabled(){
	    	return isDisabled;
	    }
	    public void setisDisabled(int active){
	        this.isDisabled = active;
	    }
	    
	    public String getAppDesc(){
	    	return AppDesc;
	    }
	    public void setAppDesc(String AppDesc){
	    	if (AppDesc == null) AppDesc="";
	        this.AppDesc = AppDesc;
	    }
	    public String getSA_APPCODE(){
	    	return this.SA_APPCODE;
	    }
	    public void setSA_APPCODE(String SA_APPCODE){
	        this.SA_APPCODE = SA_APPCODE;
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
	    
	    
	    public SysAppType getSysAppType() {
	        return this.sysapptype;
	    }
	    public void setSysAppType(SysAppType sysapptype) {
	    	
	    	this.sysapptype=sysapptype;
	    }
}



