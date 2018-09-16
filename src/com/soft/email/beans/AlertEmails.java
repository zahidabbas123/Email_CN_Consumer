package com.soft.email.beans;

public class AlertEmails {
	
	    int AlertID;
		int EmailTypeID;
		String AlertCode;
		int EMT_DAYSBEFORE;
		int EMT_DAYSAFTER;
		
	    
	    EmailType emailtype;
	    
	   
	    public AlertEmails() {
	    	AlertID=0;
	    	EmailTypeID=0;
	    	AlertCode="";
	    	
	    	EMT_DAYSBEFORE = 0;
	    	EMT_DAYSAFTER=0;
		    
		   
	    }
	    
	    public AlertEmails(int AlertID, int typeid, String code,  int EMT_DAYSBEFORE,int EMT_DAYSAFTER)
	    {
	    	this.AlertID = AlertID;
	    	this.EmailTypeID = typeid;
	    	if (code == null) code ="";
	    	this.AlertCode = code;
	    	this.EMT_DAYSAFTER=EMT_DAYSAFTER;
	    	this.EMT_DAYSBEFORE=EMT_DAYSBEFORE;
	    	
	    }
	    
	    
	    /*
	     * int AlertID;
	     * int EmailTypeID;
	    String Email;
	    
	     */
	    public int getAlertID(){
	    	return AlertID;
	    }
	    public void setAlertID(int AlertID){
	        this.AlertID = AlertID;
	    }
	    public int getEmailTypeID(){
	    	return EmailTypeID;
	    }
	    public void setEmailTypeID(int EmailTypeID){
	        this.EmailTypeID = EmailTypeID;
	    }
	    //AlertCode
	    
	    public String getAlertCode(){
	    	return AlertCode;
	    }
	    public void setAlertCode(String AlertCode){
	    	if (AlertCode == null) AlertCode="";
	        this.AlertCode = AlertCode;
	    }
	    
	   
	    
	    public int getDaysBefore(){
	    	return EMT_DAYSBEFORE;
	    }
	    public void setDaysBefore(int EMT_DAYSBEFORE){
	        this.EMT_DAYSBEFORE = EMT_DAYSBEFORE;
	    }
	    
	    public int getDaysAfter(){
	    	return EMT_DAYSAFTER;
	    }
	    public void setDaysAfter(int EMT_DAYSAFTER){
	        this.EMT_DAYSAFTER = EMT_DAYSAFTER;
	    }
	    
	   
	    
	    
	   
}



