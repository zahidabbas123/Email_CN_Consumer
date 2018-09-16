package com.soft.email.beans;

import com.soft.email.beans.*;
/*
 * 
 * 			CREATE TABLE TERMINUSBILL.SM_TBLSUBSVESTATES
(
  SSS_STATEID    NUMBER(3)                      NOT NULL,
  SSS_STATEDESC  VARCHAR2(50 BYTE)              DEFAULT (''),
  SSS_ISVISIBLE  NUMBER(1)                      DEFAULT (0)                   NOT NULL,
  SSS_ISCHARGEABLE     	NUMBER(1)                   DEFAULT (0)			NOT NULL,
  SSS_ISREMOVEABLE     	NUMBER(1)                   DEFAULT (0)			NOT NULL,
  SU_SYSUSERID   NUMBER(5)                      DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIP   VARCHAR2(32 BYTE)              DEFAULT ('0')                 NOT NULL,
  SU_INSERTDATE  DATE                           DEFAULT (sysdate)             NOT NULL,
  SU_SYSUSERIDM  NUMBER(5)                      DEFAULT (0)                   NOT NULL,
  SU_SYSUSERIPM  VARCHAR2(32 BYTE)              DEFAULT ('0')                 NOT NULL,
  SU_MODIFYDATE  DATE                           DEFAULT (sysdate)             NOT NULL
)

 */

public class SubSveState {
	
	    int StateID;
	    String StateDesc;
	    int isVisible;
	    int isChargeable;
	    int doReverse;
	    int isRemoveable;
	    int NetCommandID;///newe
	    long SU_SysUserID;
	    String SU_SysUserIP;
	    String SU_InsertDate; 
	    long SU_SysUserIDM;        
	    String SU_SysUserIPM;  
	    String SU_ModifyDate; 
	    
	    
	   
	    
	   
	    public SubSveState() {
	    	StateID=0;
	    	StateDesc="";
	    	isVisible=0;
	    	isChargeable=0;
	    	doReverse=0;
	    	isRemoveable=0;
	    	NetCommandID=0;//new
	    	SU_SysUserID=0;
		    SU_SysUserIP="";
		    SU_InsertDate="";
		    SU_SysUserIDM=0;      
		    SU_SysUserIPM="";
		    SU_ModifyDate="";
		    
		    
		   
	    }
	    
	    public SubSveState(int id,  String desc, int isVisible, int chargeable, int doReverse, int removeable,int NetCommandID, long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate)
	    {
	    	this.StateID = id;
	    	if(desc == null)desc="";
	    	this.StateDesc=desc;
	    	this.isVisible=isVisible;
	    	this.isChargeable=chargeable;
	    	this.doReverse= doReverse;
	    	this.isRemoveable=removeable;
	    	this.NetCommandID=NetCommandID;//new
	    	
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
	    	
	    	
	    	
	    }
	    
	    
	    /*
	     * int StateID;
	    String StateDesc;
	    int isVisible;
	       int NetCommandID;///newe
	     */
	    public int getStateID(){
	    	return StateID;
	    }
	    public void setStateID(int StateID){
	        this.StateID = StateID;
	    }
	    public String getStateDesc(){
	    	return StateDesc;
	    }
	    public void setStateDesc(String StateDesc){
	    	if (StateDesc == null) StateDesc="";
	        this.StateDesc = StateDesc;
	    }
	    
	    public int getisVisible(){
	    	return isVisible;
	    }
	    public void setisisVisible(int isVisible){
	        this.isVisible = isVisible;
	    }
	    
	    public int getisChargeable(){
	    	return isChargeable;
	    }
	    public void setisChargeable(int isChargeable){
	        this.isChargeable = isChargeable;
	    }
	    //doReverse
	    public int getdoReverse(){
	    	return doReverse;
	    }
	    public void setdoReverse(int doReverse){
	        this.doReverse = doReverse;
	    }
	    
	    public int getisRemoveable(){
	    	return isRemoveable;
	    }
	    public void setisRemoveable(int isRemoveable){
	        this.isRemoveable = isRemoveable;
	    }
	    
	    public int getNetCommandID(){
	    	return NetCommandID;
	    }
	    public void setNetCommandID(int NetCommandID){
	        this.NetCommandID = NetCommandID;
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
	    
	    
	   

	   
}



