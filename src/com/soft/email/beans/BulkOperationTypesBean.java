package com.soft.email.beans;

public class BulkOperationTypesBean {
	
	long BO_OPERATIONTYPEID;
	String BO_OPERATIONTYPENAME;
	long BO_STATUS;
	long SU_SYSUSERID;
	String SU_SYSUSERIP;
	String SU_INSERTDATE;
	long SU_SYSUSERIDM;
	String SU_SYSUSERIPM;
	String SU_MODIFYDATE;
	int emailSent;
	
	public BulkOperationTypesBean()
	{
		this.BO_OPERATIONTYPEID=0;
		this.BO_OPERATIONTYPENAME="";
		this.BO_STATUS=0;
		this.SU_SYSUSERID=0;
		this.SU_SYSUSERIP="";
		this.SU_INSERTDATE="";
		this.SU_SYSUSERIDM=0;
		this.SU_SYSUSERIPM="";
		this.SU_MODIFYDATE="";
		this.emailSent=0;
		
	}
	public BulkOperationTypesBean(long BO_OPERATIONTYPEID,String BO_OPERATIONTYPENAME,long BO_STATUS,long SU_SYSUSERID,
	String SU_SYSUSERIP,
	String SU_INSERTDATE,
	long SU_SYSUSERIDM,
	String SU_SYSUSERIPM,
	String SU_MODIFYDATE,int emailSent)
	{
		this.BO_OPERATIONTYPEID=BO_OPERATIONTYPEID;
		this.BO_OPERATIONTYPENAME=BO_OPERATIONTYPENAME;
		this.BO_STATUS=BO_STATUS;
		this.SU_SYSUSERID=SU_SYSUSERID;
		this.SU_SYSUSERIP=SU_SYSUSERIP;
		this.SU_INSERTDATE=SU_INSERTDATE;
		this.SU_SYSUSERIDM=SU_SYSUSERIDM;
		this.SU_SYSUSERIPM=SU_SYSUSERIPM;
		this.SU_MODIFYDATE=SU_MODIFYDATE;
		this.emailSent=emailSent;
	}
	
	 public int getEmailSent() {
		return emailSent;
	}
	public void setEmailSent(int emailSent) {
		this.emailSent = emailSent;
	}
	public long getBO_OPERATIONTYPEID() {
	        return this.BO_OPERATIONTYPEID;
	    }
	    public void setBO_OPERATIONTYPEID(long BO_OPERATIONTYPEID) {
	        this.BO_OPERATIONTYPEID=BO_OPERATIONTYPEID;
	    }
	    public String getBO_OPERATIONTYPENAME() {
	        return this.BO_OPERATIONTYPENAME;
	    }
	    public void setBO_OPERATIONTYPENAME(String BO_OPERATIONTYPENAME) {  	
	        this.BO_OPERATIONTYPENAME=BO_OPERATIONTYPENAME;
	    }
	    public long getBO_STATUS() {
	        return this.BO_STATUS;
	    }
	    public void setBO_STATUS(long BO_STATUS) {
	        this.BO_STATUS=BO_STATUS;
	    }
	    public long getSU_SYSUSERID() {
	        return this.SU_SYSUSERID;
	    }
	    public void setSU_SYSUSERID(long SU_SYSUSERID) {
	        this.SU_SYSUSERID=SU_SYSUSERID;
	    }
	    public String getSU_SYSUSERIP() {
	        return this.SU_SYSUSERIP;
	    }
	    public void setSU_SYSUSERIP(String SU_SYSUSERIP) {  	
	        this.SU_SYSUSERIP=SU_SYSUSERIP;
	    }
	    public String getSU_INSERTDATE() {
	        return this.SU_INSERTDATE;
	    }
	    public void setSU_INSERTDATE(String SU_INSERTDATE) {  	
	        this.SU_INSERTDATE=SU_INSERTDATE;
	    }
	    public long getSU_SYSUSERIDM() {
	        return this.SU_SYSUSERIDM;
	    }
	    public void setSU_SYSUSERIDM(long SU_SYSUSERIDM) {
	        this.SU_SYSUSERIDM=SU_SYSUSERIDM;
	    }
	    public String getSU_SYSUSERIPM() {
	        return this.SU_SYSUSERIPM;
	    }
	    public void setSU_SYSUSERIPM(String SU_SYSUSERIPM) {  	
	        this.SU_SYSUSERIPM=SU_SYSUSERIPM;
	    }
	    public String getSU_MODIFYDATE() {
	        return this.SU_MODIFYDATE;
	    }
	    public void setSU_MODIFYDATE(String SU_MODIFYDATE) {  	
	        this.SU_MODIFYDATE=SU_MODIFYDATE;
	    }
}
