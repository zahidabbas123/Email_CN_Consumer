package com.soft.email.beans;

/*
 * 
 * 		CREATE TABLE SC_TBLSYSAPPTYPES
(
  SAT_TYPEID     		NUMBER(2)                     PRIMARY KEY,
  SAT_TYPENAME   		VARCHAR2(100 CHAR)            NOT NULL,
  SAT_TYPEDESC   		VARCHAR2(256 CHAR)            ,
  SAT_ISDISABLED		number(1)               	default(0)          not null
)
/


 */

public class SysAppType {
	
	    int TypeID;
	    String TypeName;
	    String TypeDesc;
	    int isDisabled;
	    
	    
	   
	    public SysAppType() {
	    	TypeID=0;
	    	TypeName="";
	    	TypeDesc="";
	    	isDisabled=0;
	    	
	    }
	    
	    public SysAppType(int TypeID, String TypeName, String Desc, int Active)
	    {
	    	this.TypeID = TypeID;
	    	if(TypeName == null)TypeName="";
	    	this.TypeName = TypeName;	
	    	if(Desc == null)Desc="";
	    	this.TypeDesc=Desc;
	    	this.isDisabled=Active;
	    	
	    	
	    	
	    }
	    
	     
	    public int getTypeID(){
	    	return TypeID;
	    }
	    public void setTypeID(int TypeID){
	        this.TypeID = TypeID;
	    }
	    
	    public String getTypeName(){
	    	return TypeName;
	    }
	    public void setTypeName(String TypeName){
	    	if (TypeName == null) TypeName="";
	        this.TypeName = TypeName;
	    }
	    
	    public int getisDisabled(){
	    	return isDisabled;
	    }
	    public void setisDisabled(int active){
	        this.isDisabled = active;
	    }
	    
	    public String getTypeDesc(){
	    	return TypeDesc;
	    }
	    public void setTypeDesc(String TypeDesc){
	    	if (TypeDesc == null) TypeDesc="";
	        this.TypeDesc = TypeDesc;
	    }
	    
	   
}



