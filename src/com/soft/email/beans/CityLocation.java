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
public class CityLocation {
      /*
   CL_LOCATIONID        	NUMBER(7)                   NOT NULL			Primary Key,
  CL_LOCATIONNAME      	VARCHAR2(100 BYTE)         	DEFAULT ('')        NOT NULL,
  CL_LOCATIONLONGNAME  	VARCHAR2(200 BYTE)          DEFAULT ('')        NOT NULL,
  CL_LOCATIONBAC       	VARCHAR2(10 BYTE)           DEFAULT ('0')       NOT NULL,
  CI_CityID      		NUMBER(5)                   DEFAULT (0)         NOT NULL
	  */
	  
    int CL_LOCATIONID;
    String CL_LOCATIONNAME;
    String CL_LOCATIONBAC;
    String CL_LOCATIONLONGNAME;
    int CI_CityID;
    City city;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;   
    
    public CityLocation() {
    	CL_LOCATIONID=0;
        CL_LOCATIONNAME="";
        CL_LOCATIONBAC="";
        CL_LOCATIONLONGNAME="";
        CI_CityID=0;
        city = new City();
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate=""; 
    }

    public CityLocation(int id,String name, String lname,  String bac, int cprefix, long suid, String suip, String insdate,long suidm, String suipm, String modfdate ){
    	CL_LOCATIONID=id;
        CL_LOCATIONNAME=name;
        CL_LOCATIONLONGNAME=lname;
        CL_LOCATIONBAC=bac;
        CI_CityID=cprefix;
        city = new City();
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
    
    
    public City getCity() {
        return this.city;
    }
    
    public void setCity( City city) {
        this.city = city;
    }
    
    public int getCityLocationID() {
        return CL_LOCATIONID;
    }
    
    public String getCityLocationName() {
        return CL_LOCATIONNAME;
    }
    public String getCityLocationLongName() {
        return CL_LOCATIONLONGNAME;
    }
    public String getCityLocationBAC() {
        return CL_LOCATIONBAC;
    }
    
    public int getCityID() {
        return CI_CityID;
    }
    
    public void setCityLocationName(String CL_LOCATIONNAME) {
    	if (CL_LOCATIONNAME == null) CL_LOCATIONNAME="0"; 
        this.CL_LOCATIONNAME = CL_LOCATIONNAME;
    }
    public void setCityLocationLongName(String CL_LOCATIONLONGNAME) {
    	if (CL_LOCATIONLONGNAME == null) CL_LOCATIONLONGNAME="0"; 
        this.CL_LOCATIONLONGNAME = CL_LOCATIONLONGNAME;
    }
    
    
    public void setCityLocationBAC(String CL_LOCATIONBAC) {
    	if (CL_LOCATIONBAC == null) CL_LOCATIONBAC="0"; 
        this.CL_LOCATIONBAC = CL_LOCATIONBAC;
    }
        
    public void setCityLocationID(int CL_LOCATIONID) {
    	this.CL_LOCATIONID = CL_LOCATIONID;
    }
    public void setCityID(int CI_CityID) {
    	this.CI_CityID = CI_CityID;
    }
}
