package com.soft.email.beans;

/*
 * 
 * 			CREATE TABLE TERMINUSBILL.SM_TBLACCOUNTSTATE
(
  AS_ACCSTATEID    NUMBER(10)                   NOT NULL,
  AS_ACCSTATEDESC  VARCHAR2(50 BYTE)            DEFAULT ('')                  NOT NULL,
  AS_ISVISIBLE     NUMBER(1)                    DEFAULT 0
)

 */

public class AccountState {
	
	    int StateID;
	    String StateDesc;
	    int isVisible;
	    
	    
	   
	    public AccountState() {
	    	StateID=0;
	    	StateDesc="";
	    	isVisible=0;
	    	
	    }
	    
	    public AccountState(int id, String desc, int isVisible)
	    {
	    	this.StateID = id;
	    	if(desc == null)desc="";
	    	this.StateDesc=desc;
	    	this.isVisible=isVisible;
	    	
	    	
	    	
	    }
	    
	    
	    /*
	     * StateID=0;
	    	StateDesc="";
	    	isVisible=0;
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
	    public void setisVisible(int isVisible){
	        this.isVisible = isVisible;
	    }
	    
	    
	   
	   
}



