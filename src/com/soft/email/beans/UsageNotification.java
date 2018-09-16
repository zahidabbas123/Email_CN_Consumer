package com.soft.email.beans;

public class UsageNotification {

	
		
		long AC_ACCOUNTNO;
		String AC_ACCTHOLDERNAME;		
		String UsaerName;
		String Email;
		String Message;
		
		
	    public UsageNotification() {
	       	    
	    	this.AC_ACCOUNTNO=0;
			this.AC_ACCTHOLDERNAME="";		
			this.UsaerName="";
			this.Email="";
			this.Message="";
	    }


		public long getAC_ACCOUNTNO() {
			return AC_ACCOUNTNO;
		}


		public void setAC_ACCOUNTNO(long ac_accountno) {
			AC_ACCOUNTNO = ac_accountno;
		}


		public String getAC_ACCTHOLDERNAME() {
			return AC_ACCTHOLDERNAME;
		}


		public void setAC_ACCTHOLDERNAME(String ac_acctholdername) {
			AC_ACCTHOLDERNAME = ac_acctholdername;
		}


		public String getUsaerName() {
			return UsaerName;
		}


		public void setUsaerName(String usaerName) {
			UsaerName = usaerName;
		}


		public String getEmail() {
			return Email;
		}


		public void setEmail(String email) {
			Email = email;
		}


		public String getMessage() {
			return Message;
		}


		public void setMessage(String message) {
			Message = message;
		}
	    
	    
	   
	    	

	   	
	
	
}
