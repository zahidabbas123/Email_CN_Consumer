package com.soft.email.beans;

public class NextBillServiceAlert {

	
		String CUS_REFNO;		
		String CUS_NAME;
		String SVE_SERVICENAME;
		long AC_ACCOUNTNO;
		String AC_ACCTHOLDERNAME;		
		long SS_SUBSRVID;
		String SSS_STATEDESC;
		double SSFC_RECAMOUNT;
		String NextBillDate;
		
		
	    public NextBillServiceAlert() {
	       	    
	    	this.CUS_REFNO="";		
	    	this.CUS_NAME="";	
	    	this.SVE_SERVICENAME="";	
	    	this.AC_ACCOUNTNO=0;
	    	this.AC_ACCTHOLDERNAME="";		
	    	this.SS_SUBSRVID=0;
	    	this.SSS_STATEDESC="";	
	    	this.SSFC_RECAMOUNT=0;
	    	this.NextBillDate="";	
	    }
	    
	    
	   
	    
	    public String getCUS_REFNO() {
	        return CUS_REFNO;
	    }
	    public void setCUS_REFNO(String CUS_REFNO) {
	        this.CUS_REFNO = CUS_REFNO;
	    }
	    public long getAC_ACCOUNTNO() {
	        return AC_ACCOUNTNO;
	    }
	    public void setAC_ACCOUNTNO(long AC_ACCOUNTNO) {
	        this.AC_ACCOUNTNO = AC_ACCOUNTNO;
	    }
	    public String getCUS_NAME() {
	        return CUS_NAME;
	    }
	    public void setCUS_NAME(String CUS_NAME) {
	        this.CUS_NAME = CUS_NAME;
	    }
	    
	    public String getSVE_SERVICENAME() {
	        return SVE_SERVICENAME;
	    }
	    public void setSVE_SERVICENAME(String SVE_SERVICENAME) {
	        this.SVE_SERVICENAME = SVE_SERVICENAME;
	    }
	    
	    public String getAC_ACCTHOLDERNAME() {
	        return AC_ACCTHOLDERNAME;
	    }
	    public void setAC_ACCTHOLDERNAME(String AC_ACCTHOLDERNAME) {
	        this.AC_ACCTHOLDERNAME = AC_ACCTHOLDERNAME;
	    }
	    
	    public long getSS_SUBSRVID() {
	        return SS_SUBSRVID;
	    }
	    public void setSS_SUBSRVID(long SS_SUBSRVID) {
	        this.SS_SUBSRVID = SS_SUBSRVID;
	    }
	    
	    public String getSSS_STATEDESC() {
	        return SSS_STATEDESC;
	    }
	    public void setSSS_STATEDESC(String SSS_STATEDESC) {
	        this.SSS_STATEDESC = SSS_STATEDESC;
	    }
	    
	    public String getNextBillDate() {
	        return NextBillDate;
	    }
	    public void setNextBillDate(String NextBillDate) {
	        this.NextBillDate = NextBillDate;
	    }
	    
	    public double getSSFC_RECAMOUNT() {
	        return SSFC_RECAMOUNT;
	    }
	    public void setSSFC_RECAMOUNT(double SSFC_RECAMOUNT) {
	        this.SSFC_RECAMOUNT = SSFC_RECAMOUNT;
	    }
	

	   	
	
	
}
