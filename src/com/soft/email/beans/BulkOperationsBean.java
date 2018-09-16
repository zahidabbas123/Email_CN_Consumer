package com.soft.email.beans;


public class BulkOperationsBean {
	long BO_OPERATIONID;
	String BO_FILENAME;
	long BO_STATUS;
	String BO_STARTTIME;
	String BO_ENDTIME;
	int BO_TOTALREC;
	double BO_PROCREC;
	int BO_ERRORREC;
	double BO_DUPREC;
	String BO_ERRORFILE;
	long SU_SYSUSERID;
	String SU_SYSUSERIP;
	String SU_INSERTDATE;
	long SU_SYSUSERIDM;
	String SU_SYSUSERIPM;
	String SU_MODIFYDATE;
	long BO_OPERATIONTYPEID;
	String BO_REMARKS;
	String BO_OperationType;
	String UserName;
	String MUserName;
	int isEmailSent;

	public BulkOperationsBean()
	{
		this.BO_OPERATIONID=0;
		this.BO_FILENAME="";
		this.BO_STATUS=0;
		this.BO_STARTTIME="";
		this.BO_ENDTIME="";
		this.BO_TOTALREC=0;
		this.BO_PROCREC=0;
		this.BO_ERRORREC=0;
		this.BO_DUPREC=0;
		this.BO_ERRORFILE="";
		this.SU_SYSUSERID=0;
		this.SU_SYSUSERIP="";
		this.SU_INSERTDATE="";
		this.SU_SYSUSERIDM=0;
		this.SU_SYSUSERIPM="";
		this.SU_MODIFYDATE="";
		this.BO_OPERATIONTYPEID=0;
		this.BO_REMARKS="";
	this. isEmailSent=0;
	}
	public BulkOperationsBean(long BO_OPERATIONID,String BO_FILENAME,long BO_STATUS,String BO_STARTTIME,String BO_ENDTIME,
	int BO_TOTALREC,
	double BO_PROCREC,
	int BO_ERRORREC,
	double BO_DUPREC,
	String BO_ERRORFILE,
	long SU_SYSUSERID,
	String SU_SYSUSERIP,
	String SU_INSERTDATE,
	long SU_SYSUSERIDM,
	String SU_SYSUSERIPM,
	String SU_MODIFYDATE,
	long BO_OPERATIONTYPEID,
	String BO_REMARKS,int  isEmailSent
	
)
	{
		this.BO_OPERATIONID=BO_OPERATIONID;
		this.BO_FILENAME=BO_FILENAME;
		this.BO_STATUS=BO_STATUS;
		this.BO_STARTTIME=BO_STARTTIME;
		this.BO_ENDTIME=BO_ENDTIME;
		this.BO_TOTALREC=BO_TOTALREC;
		this.BO_PROCREC=BO_PROCREC;
		this.BO_ERRORREC=BO_ERRORREC;
		this.BO_DUPREC=BO_DUPREC;
		this.BO_ERRORFILE=BO_ERRORFILE;
		this.SU_SYSUSERID=SU_SYSUSERID;
		this.SU_SYSUSERIP=SU_SYSUSERIP;
		this.SU_INSERTDATE=SU_INSERTDATE;
		this.SU_SYSUSERIDM=SU_SYSUSERIDM;
		this.SU_SYSUSERIPM=SU_SYSUSERIPM;
		this.SU_MODIFYDATE=SU_MODIFYDATE;
		this.BO_OPERATIONTYPEID=BO_OPERATIONTYPEID;
		this.BO_REMARKS=BO_REMARKS;
		this. isEmailSent= isEmailSent;
	}
	
	 public int getIsEmailSent() {
		return isEmailSent;
	}
	public void setIsEmailSent(int isEmailSent) {
		this.isEmailSent = isEmailSent;
	}
	public long getBO_OPERATIONID() {
	        return this.BO_OPERATIONID;
	    }
	    public void setBO_OPERATIONID(long BO_OPERATIONID) {
	        this.BO_OPERATIONID=BO_OPERATIONID;
	    }
	    public String getBO_FILENAME() {
	        return this.BO_FILENAME;
	    }
	    public void setBO_FILENAME(String BO_FILENAME) {  	
	        this.BO_FILENAME=BO_FILENAME;
	    }
	    
	    public long getBO_STATUS() {
	        return this.BO_STATUS;
	    }
	    public void setBO_STATUS(long BO_STATUS) {
	        this.BO_STATUS=BO_STATUS;
	    }
	    public String getBO_STARTTIME() {
	        return this.BO_STARTTIME;
	    }
	    public void setBO_STARTTIME(String BO_STARTTIME) {  	
	        this.BO_STARTTIME=BO_STARTTIME;
	    }
	    public String getBO_ENDTIME() {
	        return this.BO_ENDTIME;
	    }
	    public void setBO_ENDTIME(String BO_ENDTIME) {  	
	        this.BO_ENDTIME=BO_ENDTIME;
	    }
	    
	    public int getBO_TOTALREC() {
	        return this.BO_TOTALREC;
	    }
	    public void setBO_TOTALREC(int BO_TOTALREC) {
	        this.BO_TOTALREC=BO_TOTALREC;
	    }
	    
	    public double getBO_PROCREC() {
	        return this.BO_PROCREC;
	    }
	    public void setBO_PROCREC(double BO_PROCREC) {
	        this.BO_PROCREC=BO_PROCREC;
	    }
	    public int getBO_ERRORREC() {
	        return this.BO_ERRORREC;
	    }
	    public void setBO_ERRORREC(int BO_ERRORREC) {
	        this.BO_ERRORREC=BO_ERRORREC;
	    }
	    
	    public double getBO_DUPREC() {
	        return this.BO_DUPREC;
	    }
	    public void setBO_DUPREC(double BO_DUPREC) {
	        this.BO_DUPREC=BO_DUPREC;
	    }
	     
	    public String getBO_ERRORFILE() {
	        return this.BO_ERRORFILE;
	    }
	    public void setBO_ERRORFILE(String BO_ERRORFILE) {  	
	        this.BO_ERRORFILE=BO_ERRORFILE;
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
	    
	    public long getBO_OPERATIONTYPEID() {
	        return this.BO_OPERATIONTYPEID;
	    }
	    public void setBO_OPERATIONTYPEID(long BO_OPERATIONTYPEID) {
	        this.BO_OPERATIONTYPEID=BO_OPERATIONTYPEID;
	    }
	    
	    public String getBO_REMARKS() {
	        return this.BO_REMARKS;
	    }
	    public void setBO_REMARKS(String BO_REMARKS) {  	
	        this.BO_REMARKS=BO_REMARKS;
	    }
	    public String getBO_OperationType() {
	        return this.BO_OperationType;
	    }
	    public void setBO_OperationType(String BO_OperationType) {  	
	        this.BO_OperationType=BO_OperationType;
	    }
	    public String getUserName() {
	        return this.UserName;
	    }
	    public void setUserName(String UserName) {  	
	        this.UserName=UserName;
	    }
	    public String getMUserName() {
	        return this.MUserName;
	    }
	    public void setMUserName(String MUserName) {  	
	        this.MUserName=MUserName;
	    }
}

