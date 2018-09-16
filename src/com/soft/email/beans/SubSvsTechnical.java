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
CREATE TABLE SM_TBLSSTECHNICALS
(
  SST_TECHID        		NUMBER(19)            								PRIMARY KEY, 
  SS_SUBSRVID        		NUMBER(19)            	DEFAULT (0)         NOT NULL,
  SST_DSLNUMBER				VARCHAR2(64)				,
  SST_DSLSIPPORTNO			varchar2(64)            	,
  SST_FIXIPADDRESS			varchar2(64)            	,
  SST_USERNAME              VARCHAR2(64 BYTE)     		,
  SST_PASSWORD              VARCHAR2(64 BYTE)     		,
  SST_CHECKITEMS			VARCHAR2(200)				,
  SST_REPLYITEMS			VARCHAR2(200)				,
  LINK_TYPEID     			NUMBER(3)            		DEFAULT (0)         NOT NULL,               
  CIRT_TYPEID     			NUMBER(3)             		DEFAULT (0)         NOT NULL,
  SST_EQPINFO				VARCHAR2(150),
  SST_ISDISABLED			NUMBER(1)             		DEFAULT (0)         NOT NULL,
  SU_SysUserID          	number(5)               	default(0)          not null,
  SU_SysUserIP          	varchar2(32)            	default('0')        not null,
  SU_InsertDate         	date                    	default(sysdate)    not null,
  SU_SysUserIDM         	number(5)               	default(0)          not null,
  SU_SysUserIPM        	 	varchar2(32)            	default('0')        not null,
  SU_ModifyDate         	date                    	default(sysdate)    not null 
)
*/

public class SubSvsTechnical{
	
	long TechnicalID;
    long SubscriberServiceID;
	String DSLNumber;
    String DSLPortNo;
    String FixedIPAddress;
    String UserName;
    String Passwd;
    String CheckItems;
    String ReplyItems;
    int LinkTypeID;
    int CircuitTypeID;
    String EQPInfo;
    String ActivationDate;
    int isDisabled;
    long SU_SysUserID;
    String SU_SysUserIP;
    String SU_InsertDate; 
    long SU_SysUserIDM;        
    String SU_SysUserIPM;  
    String SU_ModifyDate; 
    CircuitType circuitType;
    LinkType linkType;
    SubscriberService subservice;  
    
    public SubSvsTechnical() {
    	this.TechnicalID=0;
    	this.SubscriberServiceID=0;
    	this.DSLNumber="";
    	this.DSLPortNo="";
    	this.FixedIPAddress="";
    	this.UserName="";
    	this.Passwd= "";
    	this.CheckItems = "";
    	this.ReplyItems="";
    	this.LinkTypeID=0;
    	this.CircuitTypeID=0;
    	this.EQPInfo="";
    	this.ActivationDate="";
    	this.isDisabled=0;
    	this.SU_SysUserID=0;
    	this.SU_SysUserIP="";
    	this.SU_InsertDate="";
    	this.SU_SysUserIDM=0;      
    	this.SU_SysUserIPM="";
    	this.SU_ModifyDate="";
    	this.circuitType=new CircuitType();
        this.linkType = new LinkType();
        this.subservice =new  SubscriberService() ;
    }
    
    public SubSvsTechnical(long techid, long subsveid, String dslnumber , String dslport, String ipaddress, String username,
    		String passwd, String checkItem, String replyItem, int linkTypeID, int curcuitTypeID, String eqpinfo, String actdate, int disable, 
    		long SU_SysUserID, String SU_SysUserIP, String SU_InsertDate, long SU_SysUserIDM, String SU_SysUserIPM, String SU_ModifyDate){
    	
    	this.TechnicalID=techid;
    	this.SubscriberServiceID=subsveid;
    	if (dslnumber == null) dslnumber="";
    	this.DSLNumber=dslnumber;
    	if (dslport == null) dslport="";
    	this.DSLPortNo=dslport;
    	if (ipaddress == null) ipaddress="";
    	this.FixedIPAddress=ipaddress;
    	if (username == null) username="";
    	this.UserName=username;
    	if (passwd == null) passwd="";
    	this.Passwd=passwd;
    	if (checkItem == null) checkItem="";
    	this.CheckItems=checkItem;
    	if (replyItem == null) replyItem="";
    	this.ReplyItems=replyItem;
    	this.LinkTypeID=linkTypeID;
    	this.CircuitTypeID=curcuitTypeID;
    	this.EQPInfo = eqpinfo;
    	if (actdate == null) actdate="";
    	this.ActivationDate=actdate;
        this.isDisabled=disable;
       
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
    	
    	this.circuitType=new CircuitType();
        this.linkType = new LinkType();
        this.subservice =new  SubscriberService() ;
    }
    
    public long getTechnicalID(){
    	return TechnicalID;
    }
    public void setTechnicalID(long TechnicalID){
        this.TechnicalID = TechnicalID;
    }
    public long getSubscriberServiceID(){
    	return SubscriberServiceID;
    }
    public void setSubscriberServiceID(long SubscriberServiceID){
        this.SubscriberServiceID = SubscriberServiceID;
    }
    
    public String getDSLNumber(){
    	return DSLNumber;
    }
    public void setDSLNumber(String DSLNumber){
    	if (DSLNumber == null) DSLNumber="";
        this.DSLNumber = DSLNumber;
    }
    
    public String getDSLPortNo(){
    	return DSLPortNo;
    }
    public void setDSLPortNo(String DSLPortNo){
    	if (DSLPortNo == null) DSLPortNo="";
        this.DSLPortNo = DSLPortNo;
    }
    
    public String getFixedIPAddress(){
    	return FixedIPAddress;
    }
    public void setFixedIPAddress(String FixedIPAddress){
    	if (FixedIPAddress == null) FixedIPAddress="";
        this.FixedIPAddress = FixedIPAddress;
    }
    public String getUserName(){
    	return UserName;
    }
    public void setUserName(String UserName){
    	if (UserName == null) UserName="";
        this.UserName = UserName;
    }
    public String getPasswd(){
    	return Passwd;
    }
    public void setPasswd(String Passwd){
    	if (Passwd == null) Passwd="";
        this.Passwd = Passwd;
    }
        
    public String getCheckItems(){
    	return CheckItems;
    }
    public void setCheckItems(String CheckItems){
    	if (CheckItems == null) CheckItems="";
        this.CheckItems = CheckItems;
    }
    
    public String getReplyItems(){
    	return ReplyItems;
    }
    public void setReplyItems(String ReplyItems){
    	if (ReplyItems == null) ReplyItems="";
        this.ReplyItems = ReplyItems;
    }
        
    public int getLinkTypeID(){
    	return LinkTypeID;
    }
    public void setLinkTypeID(int LinkTypeID){
        this.LinkTypeID = LinkTypeID;
    }
    
    public int getCircuitTypeID(){
    	return CircuitTypeID;
    }
    public void setCircuitTypeID(int CircuitTypeID){
        this.CircuitTypeID = CircuitTypeID;
    }
    
    public String getEQPInfo(){
    	return EQPInfo;
    }
    public void setEQPInfo(String EQPInfo){
    	if (EQPInfo == null) EQPInfo="";
        this.EQPInfo = EQPInfo;
    }
    
    public String getActivationDate() {
        return ActivationDate;
    }
    public void setActivationDate(String ActivationDate) {
    	if (ActivationDate == null) ActivationDate=" "; 
        this.ActivationDate = ActivationDate;
    }
    
    public int getisDisabled(){
    	return isDisabled;
    }
    public void setisDisabled(int isDisabled){
        this.isDisabled = isDisabled;
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
    
    public CircuitType getCircuitType() {
        return this.circuitType;
    }
    public void setCircuitType(CircuitType circuitType) {
         this.circuitType=circuitType;
    }
    
    public LinkType getLinkType() {
        return this.linkType;
    }
    public void setLinkType(LinkType linkType) {
         this.linkType=linkType;
    }
    
    public SubscriberService getSubscriberService() {
        return this.subservice;
    }
    public void setSubscriberService(SubscriberService subservice) {
         this.subservice=subservice;
    }
       
}
