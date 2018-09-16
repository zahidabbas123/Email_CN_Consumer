package com.soft.email.beans;

public class HolidayConfig {


	//	  HD_HOLIDAYID       NUMBER                     DEFAULT 0                     NOT NULL,
	//	  HD_HOLIDAYNAME     VARCHAR2(32 BYTE)          NOT NULL,
	//	  HD_HOLIDAYDES      VARCHAR2(32 BYTE),
	//	  HD_DATE            DATE                       NOT NULL,
	//	  HDT_TYPEID         NUMBER,
	//	  HD_ISREPEATED      NUMBER,
	//	  HD_HOURS           NUMBER,
	//	  CI_CITYID          NUMBER,
	//	  HD_ISDISABLED      NUMBER,
	//	  HD_ACTIVATIONDATE  DATE                       DEFAULT SYSDATE               NOT NULL,
	//	  SU_SYSUSERID       NUMBER,
	//	  SU_SYSUSERIP       VARCHAR2(32 BYTE),
	//	  SU_INSERTDATE      DATE                       DEFAULT SYSDATE               NOT NULL,
	//	  SU_SYSUSERIDM      NUMBER,
	//	  SU_SYSUSERIPM      VARCHAR2(32 BYTE),
	//	  SU_MODIFYDATE
	int holidayId;
	String holiydayName;
	String holiydayDes;
	String holidayDate;
	String EndDate;
	int holidayTypeId;
	int isRepeated;
	int hours;
	
	int isDisabled;
	String activationDate;
	long sysUserId;
	String sysUserIp;
	String insertDate;
	long sysUserModifyId;
	String sysUSerModifyIp;
	String modifyDate;

	public HolidayConfig(){
		this. holidayId=0;
		this. holiydayName="";
		this. holiydayDes=" ";
		this. holidayDate="sysdate";
		this.EndDate="";
		this. holidayTypeId=0;
		this. isRepeated=0;
		this. hours=0;
		
		this. isDisabled=0;
		this. activationDate="sysdate";
		long sysUserId=0;
		this. sysUserIp="0";
		this. insertDate="sysdate";
		long sysUserModifyId=0;
		this. sysUSerModifyIp="0";
		this. modifyDate="sysdate";



	}
	public HolidayConfig(	int holidayId,
			String holiydayName,
			String holiydayDes,
			String holidayDate,
			String EndDate,
			int holidayTypeId,
			int isRepeated,
			int hours,
			
			int isDisabled,
			String activationDate,
			long sysUserId,
			String sysUserIp,
			String insertDate,
			long sysUserModifyId,
			String sysUSerModifyIp,
			String modifyDate){
		this. holidayId=holidayId;
		if(holiydayName!=null){
			this. holiydayName=holiydayName;
		}else{
			this. holiydayName="";
		}
		if(holiydayDes!=null){
			this. holiydayDes=holiydayDes;
		}
		else{

			this. holiydayDes="";

		}
		this. holidayDate=holidayDate;
		this.EndDate=EndDate;
		this. holidayTypeId=holidayTypeId;
		this. isRepeated=isRepeated;
		this. hours=hours;
		
		this. isDisabled=isDisabled;
		this. activationDate=activationDate;
		this. sysUserId=sysUserId;
		this. sysUserIp=sysUserIp;
		this. insertDate=insertDate;
		this. sysUserModifyId=sysUserModifyId;
		this. sysUSerModifyIp=sysUSerModifyIp;
		this. modifyDate=modifyDate;

	}
	public int getHolidayId() {
		return holidayId;
	}
	public void setHolidayId(int holidayId) {
		this.holidayId = holidayId;
	}
	public String getHoliydayName() {
		return holiydayName;
	}
	public void setHoliydayName(String holiydayName) {
		this.holiydayName = holiydayName;
	}
	public String getHoliydayDes() {
		return holiydayDes;
	}
	public void setHoliydayDes(String holiydayDes) {
		this.holiydayDes = holiydayDes;
	}
	public String getHolidayDate() {
		return holidayDate;
	}
	
	public void setEndDate(String EndDate) {
		this.EndDate = EndDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	
	public void setHolidayDate(String holidayDate) {
		this.holidayDate = holidayDate;
	}
	public int getHolidayTypeId() {
		return holidayTypeId;
	}
	public void setHolidayTypeId(int holidayTypeId) {
		this.holidayTypeId = holidayTypeId;
	}
	public int getIsRepeated() {
		return isRepeated;
	}
	public void setIsRepeated(int isRepeated) {
		this.isRepeated = isRepeated;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(int isDisabled) {
		this.isDisabled = isDisabled;
	}
	public String getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}
	public long getSysUserId() {
		return sysUserId;
	}
	public void setSysUserId(long sysUserId) {
		this.sysUserId = sysUserId;
	}
	public String getSysUserIp() {
		return sysUserIp;
	}
	public void setSysUserIp(String sysUserIp) {
		this.sysUserIp = sysUserIp;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
	public long getSysUserModifyId() {
		return sysUserModifyId;
	}
	public void setSysUserModifyId(long sysUserModifyId) {
		this.sysUserModifyId = sysUserModifyId;
	}
	public String getSysUSerModifyIp() {
		return sysUSerModifyIp;
	}
	public void setSysUSerModifyIp(String sysUSerModifyIp) {
		this.sysUSerModifyIp = sysUSerModifyIp;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}







}
