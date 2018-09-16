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
public class City {
      /*
	  CI_CITYID        NUMBER(7)                   NOT NULL	Primary Key,
	  CI_CITYNAME      VARCHAR2(100 BYTE)            DEFAULT ('')                  NOT NULL,
	  CI_CITYDIALCODE  VARCHAR2(30 BYTE)            DEFAULT ('')                  NOT NULL,
	  CI_CITYBAC       VARCHAR2(10 BYTE)           DEFAULT ('0')                NOT NULL,
	  ST_STATEID       NUMBER(5)                    DEFAULT (0)                   NOT NULL,
	  CR_RegionID      NUMBER(5)                   DEFAULT (0)                   NOT NULL
	  */
	  
    int CI_CITYID;
    String CI_CITYNAME;
    String CI_CITYDIALCODE;
    String CI_CITYBAC;
    int ST_STATEID;
    int CR_RegionID;
    CityRegion region;
    State state;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate;   
    
    
    public City() {
    	CI_CITYID=0;
        CI_CITYNAME="";
        CI_CITYDIALCODE="";
        CI_CITYBAC="";
        ST_STATEID=0;
        CR_RegionID=0;
        region = new CityRegion();
        state = new State();
        
        SU_SysUserID=0;
        SU_SysUserIP="0";
        SU_InsertDate=""; 
        SU_SysUserIDM=0;        
        SU_SysUserIPM="0";  
        SU_ModifyDate="";   
    }

    public City(int id,String name, String dcode, String bac, int sid,int rid, long suid, String suip, String insdate,long suidm, String suipm, String modfdate  ){
    	CI_CITYID=id;
        CI_CITYNAME=name;
        CI_CITYDIALCODE=dcode;
        CI_CITYBAC=bac;
        ST_STATEID=sid;
        CR_RegionID=rid;
        region = new CityRegion();
        state = new State();
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
    
    
    
    public CityRegion getCityRegion(){
    	return this.region;
    }
    
    public void setCityRegion(CityRegion region){
    	this.region=region;
    }
    
    public State getState(){
    	return this.state;
    }
    
    public void setState(State state){
    	this.state=state;
    }
    
    public int getCityID() {
        return CI_CITYID;
    }
    
    public String getCityName() {
        return CI_CITYNAME;
    }
    public String getCityDialedCode() {
        return CI_CITYDIALCODE;
    }
    public String getCityBAC() {
        return CI_CITYBAC;
    }
    
    public int getStateID() {
        return ST_STATEID;
    }

    public int getRegionID() {
        return CR_RegionID;
    }
    
    public void setCityName(String CI_CITYNAME) {
    	if (CI_CITYNAME == null) CI_CITYNAME="0"; 
        this.CI_CITYNAME = CI_CITYNAME;
    }

    public void setCityBAC(String CI_CITYBAC) {
    	if (CI_CITYBAC == null) CI_CITYBAC="0"; 
        this.CI_CITYBAC = CI_CITYBAC;
    }
    
    public void setCityDialCode(String CI_CITYDIALCODE) {
    	if (CI_CITYDIALCODE == null) CI_CITYDIALCODE="0"; 
        this.CI_CITYDIALCODE = CI_CITYDIALCODE;
    }
    
    public void setCityID(int CI_CITYID) {
    	this.CI_CITYID = CI_CITYID;
    }
    public void setStateID(int ST_STATEID) {
    	this.ST_STATEID = ST_STATEID;
    }
    public void setRegionID(int CR_RegionID) {
    	this.CR_RegionID = CR_RegionID;
    }
}
