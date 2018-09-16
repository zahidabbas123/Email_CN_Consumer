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
public class Country {

    int countryPrefix;
    String countryName;
    String countryBAC;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;
    
    public Country() {
        countryPrefix=0;
        countryName="00";
        countryBAC="0";
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate="";
    }

    public Country(int pre,String name, String bac, long suid, String suip, String insdate,long suidm, String suipm, String modfdate ){
        countryPrefix=pre;
        countryName=name;
        countryBAC = bac;
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
    
    
    
    public String getCountryName() {
        return countryName;
    }

    public String getCountryBAC() {
        return countryBAC;
    }
    
    public int getCountryPrefix() {
        return countryPrefix;
    }

    public void setCountryName(String countryName) {
    	if (countryName == null) countryName="0"; 
        this.countryName = countryName;
    }

    public void setCountryBAC(String countryBAC) {
    	if (countryBAC == null) countryBAC="0"; 
        this.countryBAC = countryBAC;
    }
    
    public void setCountryPrefix(int countryPrefix) {
    	this.countryPrefix = countryPrefix;
    }
}
