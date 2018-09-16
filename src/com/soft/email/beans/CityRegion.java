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
public class CityRegion {
      /*
 CR_RegionID        NUMBER(5)                  NOT NULL Primary Key,
  CR_RegionNAME      VARCHAR2(50 BYTE)           DEFAULT ('')                  NOT NULL,
  CR_RegionBAC       VARCHAR2(10 BYTE)           DEFAULT ('0')                NOT NULL,
  CO_COUNTRYPREFIX    NUMBER(5)                  DEFAULT (0)                   NOT NULL
	  */
	  
    int CR_RegionID;
    String CR_RegionNAME;
    String CR_RegionBAC;
    int CO_COUNTRYPREFIX;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;
    
    public CityRegion() {
    	CR_RegionID=0;
        CR_RegionNAME="";
        CR_RegionBAC="";
        CO_COUNTRYPREFIX=0;
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate="";
    }

    public CityRegion(int id,String name,  String bac, int cprefix, long suid, String suip, String insdate,long suidm, String suipm, String modfdate ){
    	CR_RegionID=id;
        CR_RegionNAME=name;
        CR_RegionBAC=bac;
        CO_COUNTRYPREFIX=cprefix;
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

    public int getRegionID() {
        return CR_RegionID;
    }
    
    public String getRegionName() {
        return CR_RegionNAME;
    }
    public String getRegionBAC() {
        return CR_RegionBAC;
    }
    
    public int getCountryPrefix() {
        return CO_COUNTRYPREFIX;
    }
    
    public void setRegionName(String CR_RegionNAME) {
    	if (CR_RegionNAME == null) CR_RegionNAME="0"; 
        this.CR_RegionNAME = CR_RegionNAME;
    }

    public void setRegionBAC(String CR_RegionBAC) {
    	if (CR_RegionBAC == null) CR_RegionBAC="0"; 
        this.CR_RegionBAC = CR_RegionBAC;
    }
        
    public void setRegionID(int CR_RegionID) {
    	this.CR_RegionID = CR_RegionID;
    }
    public void setCountryPrefix(int CO_COUNTRYPREFIX) {
    	this.CO_COUNTRYPREFIX = CO_COUNTRYPREFIX;
    }
}
