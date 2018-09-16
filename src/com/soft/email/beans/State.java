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
public class State {
      /*
	  ST_STATEID        NUMBER(5)                  NOT NULL Primary Key,
  ST_STATENAME      VARCHAR2(50 BYTE)           DEFAULT ('')                 NOT NULL,
  ST_STATEBAC       VARCHAR2(10 BYTE)           DEFAULT ('0')                NOT NULL,
  CO_COUNTRYPREFIX  NUMBER(5)                  DEFAULT (0)                   NOT NULL
	  */
	  
    int ST_STATEID;
    String ST_STATENAME;
    String ST_STATEBAC;
    int CO_COUNTRYPREFIX;
    Country country;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;
    
    public State() {
    	ST_STATEID=0;
        ST_STATENAME="";
        ST_STATEBAC="";
        CO_COUNTRYPREFIX=0;
        country = new Country();
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate="";
    }

    public State(int id,String name,  String bac, int cprefix, long suid, String suip, String insdate,long suidm, String suipm, String modfdate ){
    	ST_STATEID=id;
        ST_STATENAME=name;
        ST_STATEBAC=bac;
        CO_COUNTRYPREFIX=cprefix;
        country = new Country();
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

    public Country getCountry(){
    	return this.country;
    }
    
    public void setCountry(Country country) {
    	this.country = country;
    }
    
    public int getStateID() {
        return ST_STATEID;
    }
    
    public String getStateName() {
        return ST_STATENAME;
    }
    public String getStateBAC() {
        return ST_STATEBAC;
    }
    
    public int getCountryPrefix() {
        return CO_COUNTRYPREFIX;
    }
    
    public void setStateName(String ST_STATENAME) {
    	if (ST_STATENAME == null) ST_STATENAME="0"; 
        this.ST_STATENAME = ST_STATENAME;
    }

    public void setStateBAC(String ST_STATEBAC) {
    	if (ST_STATEBAC == null) ST_STATEBAC="0"; 
        this.ST_STATEBAC = ST_STATEBAC;
    }
        
    public void setStateID(int ST_STATEID) {
    	this.ST_STATEID = ST_STATEID;
    }
    public void setCountryPrefix(int CO_COUNTRYPREFIX) {
    	this.CO_COUNTRYPREFIX = CO_COUNTRYPREFIX;
    }
}
