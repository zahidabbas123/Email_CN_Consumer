package com.soft.email.beans;

//import com.soft.billing.config.beans.ApplicationConfig;
import java.util.ArrayList;

import com.soft.email.beans.*;
import com.soft.email.beans.*;


public class EmailMessage{
	
	    String Message="";
	   
	    public EmailMessage() {
	    	Message="";
	    }
	    
	    
	    public String    getServiceExpireStateMessage( ArrayList list,int daysBefore, int daysAfter, ApplicationConfig conf){
			   String Message ="";
			   String html="";
			  
			   Message = "<html><head><title> " +
	          " </title></head><body><table border='0' width='80%' align='center'> "+
	          " <tr><td colspan=10> Dear Sir,</td></tr> "+
	          " <tr><td colspan=10>&nbsp;</td></tr> ";
				   
	          if(daysBefore>0){
	        	  Message+= " <tr><td colspan=10> Follwing Services were exipred in last "+daysBefore+" days</td></tr> ";
	          }
	          else
	          {
	        	  Message+= " <tr><td colspan=10> Follwing Services will be exipred in next "+daysAfter+" days</td></tr> ";  
	          }
	          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
	          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
	          Message+= " <tr><td><b>#</b></td><td><b>Customer Name</b></td><td><b>SAP No</b></td><td><b>Account Name</b></td><td><b>Account No</b></td><td><b>Service Name</b></td><td><b>Service No</b></td><td><b>Rec Amount</b></td><td><b>Status</b></td><td><b>Date of Exipry</b></td></tr>" ;
	          if(list.size()>0){
	        	  for(int count=0;count<list.size();count++){
	        		  ExpireServiceAlert esa=(ExpireServiceAlert)list.get(count);
	        		  Message+= " <tr><td>"+count+"</td><td>"+esa.getCUS_NAME()+"</td><td>"+esa.getCUS_REFNO()+"</td><td>"+esa.getAC_ACCTHOLDERNAME()+"</td><td>"+esa.getAC_ACCOUNTNO()+"</td><td>"+esa.getSVE_SERVICENAME()+"</td><td>"+esa.getSS_SUBSRVID()+"</td><td>"+esa.getSSFC_RECAMOUNT()+"</td><td>"+esa.getSSS_STATEDESC()+"</td><td>"+esa.getSS_EXPIRYDATE()+"</td></tr>" ;
	        	  }
	          }
	          Message=Message+"</table></body></html>";	  
			   
			   return Message;
		   }
	    

	    
	    
	    
	    public String    getServiceNextBillMessage( ArrayList list,int daysBefore, int daysAfter, ApplicationConfig conf){
			   String Message ="";
			   String html="";
			  
			   Message = "<html><head><title> " +
	          " </title></head><body><table border='0' width='80%' align='center'> "+
	          " <tr><td colspan=10> Dear Sir,</td></tr> "+
	          " <tr><td colspan=10>&nbsp;</td></tr> ";
				   
	          if(daysBefore>0){
	        	  Message+= " <tr><td colspan=10> Follwing Services were billed in last "+daysBefore+" days</td></tr> ";
	          }
	          else
	          {
	        	  Message+= " <tr><td colspan=10> Follwing Services will be billed in next "+daysAfter+" days</td></tr> ";  
	          }
	          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
	          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
	          Message+= " <tr><td><b>#</b></td><td><b>Customer Name</b></td><td><b>SAP No</b></td><td><b>Account Name</b></td><td><b>Account No</b></td><td><b>Service Name</b></td><td><b>Service No</b></td><td><b>Rec Amount</b></td><td><b>Status</b></td><td><b>Date of Exipry</b></td></tr>" ;
	          if(list.size()>0){
	        	  for(int count=0;count<list.size();count++){
	        		  ExpireServiceAlert esa=(ExpireServiceAlert)list.get(count);
	        		  Message+= " <tr><td>"+count+"</td><td>"+esa.getCUS_NAME()+"</td><td>"+esa.getCUS_REFNO()+"</td><td>"+esa.getAC_ACCTHOLDERNAME()+"</td><td>"+esa.getAC_ACCOUNTNO()+"</td><td>"+esa.getSVE_SERVICENAME()+"</td><td>"+esa.getSS_SUBSRVID()+"</td><td>"+esa.getSSFC_RECAMOUNT()+"</td><td>"+esa.getSSS_STATEDESC()+"</td><td>"+esa.getSS_EXPIRYDATE()+"</td></tr>" ;
	        	  }
	          }
	          Message=Message+"</table></body></html>";	  
			   
			   return Message;
		   }
	   public String getCustomerRegisterationMessage(Customer cus, ApplicationConfig conf) throws Exception {
		   String Message ="";
		   
		   Message = "Dear "+cus.getName()+"\n" +
			"We would like to welcome you for using our Services, You detail is followings \n" +
			"Customer Number = "+cus.getCustomerID()+"" +
			//Account Type = "+AccountType+"" +
			"\n\n" +
			"Regards, \n" ;
			if (conf != null)
				Message +=	conf.getPropertyValue("COMPANY_NAME");
		   
		   return Message;
	   }
	   
	   public String    getServiceCloseStateMessage( ArrayList list, ApplicationConfig conf){
		   String Message ="";
		   String html="";
		  
		   Message = "<html><head><title> " +
          " </title></head><body><table border='0' width='80%' align='center'> "+
          " <tr><td colspan=10> </td></tr> "+
          " <tr><td colspan=10>&nbsp;</td></tr> ";
			   

        	  Message+= " <tr><td colspan=10> Follwing Services were terminated in last 24 hours</td></tr> ";
          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
          Message+= " <tr><td><b>#</b></td><td><b>Customer Name</b></td><td><b>SAP No</b></td><td><b>Account Name</b></td><td><b>Account No</b></td><td><b>Service Name</b></td><td><b>Service No</b></td><td><b>Rec Amount</b></td><td><b>Status</b></td></tr>" ;
          if(list.size()>0){
        	  for(int count=0;count<list.size();count++){
        		  ExpireServiceAlert esa=(ExpireServiceAlert)list.get(count);
        		  Message+= " <tr><td>"+(count+1)+"</td><td>"+esa.getCUS_NAME()+"</td><td>"+esa.getCUS_REFNO()+"</td><td>"+esa.getAC_ACCTHOLDERNAME()+"</td><td>"+esa.getAC_ACCOUNTNO()+"</td><td>"+esa.getSVE_SERVICENAME()+"</td><td>"+esa.getSS_SUBSRVID()+"</td><td>"+esa.getSSFC_RECAMOUNT()+"</td><td>"+esa.getSSS_STATEDESC()+"</td></tr>" ;
        	  }
          }
          Message=Message+"</table></body></html>";	  
		   
		   return Message;
	   }
    
	   
	   public String    getServiceCloseStateDSLMessage( ArrayList list, ApplicationConfig conf){
		   String Message ="";
		   String html="";
		  
		   Message = "<html><head><title> " +
          " </title></head><body><table border='0' width='80%' align='center'> "+
          " <tr><td colspan=10> </td></tr> "+
          " <tr><td colspan=10>&nbsp;</td></tr> ";
			   

        	  Message+= " <tr><td colspan=10> Follwing Services were terminated 30 days before</td></tr> ";
          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
          Message+= " <tr><td colspan=10>&nbsp;</td></tr> ";
          Message+= " <tr><td><b>#</b></td><td><b>Customer Name</b></td><td><b>SAP No</b></td><td><b>Account Name</b></td><td><b>Account No</b></td><td><b>Service Name</b></td><td><b>Service No</b></td><td><b>Rec Amount</b></td><td><b>DSL No</b></td></tr>" ;
          if(list.size()>0){
        	  for(int count=0;count<list.size();count++){
        		  ExpireServiceAlert esa=(ExpireServiceAlert)list.get(count);
        		  Message+= " <tr><td>"+(count+1)+"</td><td>"+esa.getCUS_NAME()+"</td><td>"+esa.getCUS_REFNO()+"</td><td>"+esa.getAC_ACCTHOLDERNAME()+"</td><td>"+esa.getAC_ACCOUNTNO()+"</td><td>"+esa.getSVE_SERVICENAME()+"</td><td>"+esa.getSS_SUBSRVID()+"</td><td>"+esa.getSSFC_RECAMOUNT()+"</td><td>"+esa.getDSLNO()+"</td></tr>" ;
        	  }
          }
          Message=Message+"</table></body></html>";	  
		   
		   return Message;
	   }
    

	   
	   public String getAccountRegisterationMessage(Account acct, ApplicationConfig conf) throws Exception {
		   String Message ="";
		   
		   String AccountType = "Postpaid";
			if (acct.getisPrepaid()==1)
				AccountType = "Prepaid";
			
			Message="Dear "+acct.getName()+"\n" +
					"We would like to welcome you for using our Services, You Account Detail is followings \n" +
					"Account Number = "+acct.getAccountNo()+"" +
					"Account Type = "+AccountType+"" +
					"\n\n" +
					"Regards, \n" ;
					if (conf != null)
						Message +=	conf.getPropertyValue("COMPANY_NAME");
			
		   return Message;
	   }
	   
	   public String getAccountStateChangeMessage(Account acct, AccountState state, SMHistory his, ApplicationConfig conf) throws Exception {
		   String Message ="";
		   
		   String AccountType = "Postpaid";
			if (acct.getisPrepaid()==1)
				AccountType = "Prepaid";
			
			Message="Dear "+acct.getName()+"\n" +
					"We would like to welcome your Account state is changed, You Account Detail is followings \n" +
					"Account Number = "+acct.getAccountNo()+"" +
					"Account State = "+state.getStateDesc()+"" +
					//"Date/Time = "+his.getSU_InsertDate()+"" +
					"Remarks = "+his.getRemarks()+"" +
					"\n\n" +
					"Regards, \n";
			if (conf != null)
				Message +=	conf.getPropertyValue("COMPANY_NAME");
			
		   return Message;
	   }
	   public String getServiceRegisterationMessage(Account acct, SubscriberService ss, Service ser, ApplicationConfig conf) throws Exception {
		   String Message ="";
		   
		   String AccountType = "Postpaid";
			if (acct.getisPrepaid()==1)
				AccountType = "Prepaid";
			Message="Dear "+acct.getName()+"\n" +
					"We would like to inform you that you has been subscribered for following new service, You Account & Service Detail is followings \n" +
					"Account Number = "+acct.getAccountNo()+" \n" +
					"Account Type = "+AccountType+"\n" +
					"Service Name= "+ser.getServiceName()+"\n" +
					"Service Description = "+ser.getServiceDesc()+"\n" +
					"\n\n" +
					"Regards, \n" ;
					if (conf != null)
						Message +=	conf.getPropertyValue("COMPANY_NAME");
		   return Message;
	   }
	   
	   public String getServiceStateChangeMessage(Account acct, SubscriberService ss, Service ser, SubSveState state, SMHistory his,
			   ApplicationConfig conf) throws Exception {
		   String Message ="";
		   
		   String AccountType = "Postpaid";
			if (acct.getisPrepaid()==1)
				AccountType = "Prepaid";
			Message="Dear "+acct.getName()+"\n" +
					"We would like to inform you that state of following service has been changed. \n" +
					"Account Number = "+acct.getAccountNo()+" \n" +
					"Service Name= "+ser.getServiceName()+"\n" +
					"Service State = "+state.getStateDesc()+"\n" +
					//"Date/Time = "+his.getSU_InsertDate()+"" +
					"Remarks = "+his.getRemarks()+"" +
					"\n\n" +
					"Regards, \n";
					if (conf != null)
						Message +=	conf.getPropertyValue("COMPANY_NAME");
		   return Message;
	   }
	   
	   public String  getPaymentReminderMessage( NextBillServiceAlert list, ApplicationConfig conf){
		   String Message ="";
		   String html="";
		   
		   Message = "<html><head><title> " +
	       " </title></head><body> ";

		  
		   Message = "Dear Customer,<br><br><br> This is to remind you that your payment date is near to reach. Please recharge your account before billing date to avoid any service interruption. <br><br> You can check your usage from the customer self care section (http://billing.cyber.net.pk) available on our website.<br><br> Please note that if your account is suspended due to non-payment for 30 days, it will be terminated without any further notification. <br><br> For further queries please feel free to call us at UAN 111-44-55-66.<br><br> For technical support call UAN 111-56-56-56 <br><br> Sincerely,<br> Department of Consumer Sales <br><br><br> Note If you are making payment through cheque, please make all cheques in favor of Cyber Internet Services (Pvt.) Ltd. and write the account number at the back of the Cheque. <br><br><br>  **** This Email has been automatically generated by the System **** ";
		   Message=Message+"</body></html>";	
		   return Message;
	   }
	  
	    
	   
	   public String getAccountPaymentMessage(Account acct, double Amount, ApplicationConfig conf) throws Exception {
		   String Message ="";
		   
		   String AccountType = "Postpaid";
			if (acct.getisPrepaid()==1)
				AccountType = "Prepaid";
			Message="Dear "+acct.getName()+"\n" +
					"New payment is received for \n" +
					"Account Number = "+acct.getAccountNo()+" \n" +
					"Gross Amount= "+Amount+"\n" +
					"\n\n" +
					"Regards, \n" ;
					if (conf != null)
						Message +=	conf.getPropertyValue("COMPANY_NAME");
		   return Message;
	   }
	    
	   
	   
	   public String get50persent(String userName,long accountNo,String fullName)
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume 50 %</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='900' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					 " <tr>"+
					 "   <td width='900' align='center'><img"+
					 " src='http://www.wi-tribe.pk/images/50-volume.jpg' ></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td><table width='903' border='0'>"+
					 "     <tr>"+
					 "       <td width='662' align='center' valign='top'></td>"+
					 "     </tr>"+
					 "   </table></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td valign='top'><table width='870' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					 "     <tr>"+
					 "       <td height='22'  width='200' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'><br>"+
					 "         <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Username:"+userName+"</span></span></td>"+
					 "       <td valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       <td width='235' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					 " src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					 "     </tr>"+
					 "     <tr>"+
					 "       <td  width='200' height='22' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Customer ID:"+accountNo+" </span></td>"+
					 "       <td width='489' valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       </tr>"+
					 "<tr>"+
					"			        <td height='70' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"			          Dear  "+fullName+",<br>"+
			
					"			          </span></p>          </td>"+
					"			        </tr>"+
					
					"			      <tr>"+
					"			        <td height='48' colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;FONT-FAMILY:  Arial;' ><p>It seems you are enjoying your wi-tribe experience. We just wanted to inform you that you have consumed <span  style='color:#C60651; font-weight: bold;'>50% </span> of your subscribed volume limit."+
					"			<br>"+
					"			            <br>"+
					"			            Why not take advantage of any of our <span  style='color:#C60651; font-weight: bold;'> exciting offers,</span> giving you an even more enhanced wi-tribe experience:"+ 
					"			<br>"+
					"			             "+
					"			        </p>"+
					"			                   </td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='center' valign='top'><br>"+
					"			          <a href='#' onClick='window.open('http://wi-tribe.pk/volume_notification/up-size-gbs.html','mywindow','width=800,height=450')' style='padding:5px; color:#666; font-weight:bold; border:0px solid white; background:white;' onMouseOver='this.style.color='#000'' onMouseOut='this.style.color='#666'' ><img src='http://www.wi-tribe.pk/images/vn_btn_upgb.jpg' width='262'/></a>"+
					"			          &nbsp;&nbsp;&nbsp;"+
					"			          <a href='#' onClick='window.open('http://wi-tribe.pk/volume_notification/happy-days.html','mywindow','width=800,height=450')' style='padding:5px; color:#666; font-weight:bold; border:0px solid white; background:white;' onMouseOver='this.style.color='#000'' onMouseOut='this.style.color='#666'' ><img src='http://www.wi-tribe.pk/images/vn_btn_happydays.jpg' width='262'/></a>"+
					"			          <br>"+
					"			          <br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' align='center' style='color:#BE1C32;"+
					"				font-size: 14px; font-weight: bold; '>VOLUME POLICY<br><br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' style='color:#000000;padding:0 0 0 20px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			                <ul style='list-style:disc;'> <li> Additional volume usage charges will apply, once your subscribed monthly volume is exhausted</li>"+
					"			         <li>  For additional volume usage and add-on purchases, you have been allotted a credit limit of <span  style='color:#BE1C32; font-weight: bold;'> PKR 300</span></li>"+
					"			           <li>  Once your subscribed monthly volume is exhausted, you will be charged <span  style='color:#BE1C32; font-weight: bold;'> Rs.0.10 </span> for every  <span  style='color:#BE1C32; font-weight: bold;'>1 MB </span> consumed till the  time you purchase a volume <br>add-on or the start of your next billing cycle (1st of every month)</li>"+
					"			            <li>  Additional volume consumption and/or add-on purchases, will reflect in your monthly invoice</li></ul>"+
					"			        </td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top'><p align='justify' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			    <br>     "+
					"			    For more information, you can contact our customer care <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>24 hours </span>a day, <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a> <br>"+
					"			          or calling <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>111 1tribe (111 187 423)</span>.<br>"+
					"			              <br>"+
					"			          </p></td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					"			            "+
					"			            <tr>"+
					"			              <td width='164' align='center'><a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"			            </tr>"+
					"			          </table></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' class='td'><table width='850' align='center'>"+
					"			          "+
					"			          <tr>"+
					"			            <td align='center'><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"			              <tr>"+
					"			                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"			                <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://itech.pk/newsletter/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			              </tr>"+
					"			            </table></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/account-update/images/payment-option-strip.png' hspace='3' vspace='3' border='0'></a><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><br>"+
					"			              "+
					"			            </a></td>"+
					"			          </tr>"+
					"			        </table>          </td>"+
					"			      </tr>"+
					"			      "+
					"			    </table></td>"+
					"			  </tr>"+
					"			  <tr>"+
					"			    <td align='center'><b"+
					"			  style='mso-bidi-font-weight:normal'><span style='font-size:9.0pt;font-family:"+
					"			  &quot;Verdana&quot;,&quot;sans-serif&quot;;mso-fareast-font-family:&quot;Times New Roman&quot;;color:black;"+
					"			  mso-no-proof:yes'><img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' '></span></b></td>"+
					"			  </tr>"+
					"			</table>"+
					"			"+
					"			</body>"+
					"			</html>";
		   
		   
		   
		return htmlStr;
		   
	   }
	   
	   
	   public String get75persent(String userName,long accountNo,String fullName)
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume 75 %</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='900' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					 " <tr>"+
					 "   <td width='900' align='center'><img"+
					 " src='http://www.wi-tribe.pk/images/75per-volume.jpg' ></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td><table width='903' border='0'>"+
					 "     <tr>"+
					 "       <td width='662' align='center' valign='top'></td>"+
					 "     </tr>"+
					 "   </table></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td valign='top'><table width='882' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					 "     <tr>"+
					 "       <td height='22'  width='200' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'><br>"+
					 "         <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Username:"+userName+"</span></span></td>"+
					 "       <td valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       <td width='235' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					 " src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					 "     </tr>"+
					 "     <tr>"+
					 "       <td  width='200' height='22' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Customer ID:"+accountNo+" </span></td>"+
					 "       <td width='489' valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       </tr>"+
					 "<tr>"+
					"			        <td height='70' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"			          Dear  "+fullName+",<br>"+
			
					"			          </span></p>          </td>"+
					"			        </tr>"+
					
					"			      <tr>"+
					"			        <td height='48' colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;FONT-FAMILY:  Arial;' ><p>It seems you are enjoying your wi-tribe experience. We just wanted to inform you that you have consumed <span  style='color:#C60651; font-weight: bold;'>75% </span> of your subscribed volume limit."+
					"			<br>"+
					"			            <br>"+
					"			            Why not take advantage of any of our <span  style='color:#BE1C32; font-weight: bold;'> exciting offers,</span> giving you an even more enhanced wi-tribe experience:"+ 
					"			<br>"+
					"			             "+
					"			        </p>"+
					"			                   </td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='center' valign='top'><br>"+
					"			          <a href='#' onClick='window.open('http://wi-tribe.pk/volume_notification/up-size-gbs.html','mywindow','width=800,height=450')' style='padding:5px; color:#666; font-weight:bold; border:0px solid white; background:white;' onMouseOver='this.style.color='#000'' onMouseOut='this.style.color='#666'' ><img src='http://www.wi-tribe.pk/images/vn_btn_upgb.jpg' width='262'/></a>"+
					"			          <br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' align='center' style='color:#BE1C32;"+
					"				font-size: 14px; font-weight: bold; '>VOLUME POLICY<br><br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' style='color:#000000;padding:0 0 0 20px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			                <ul style='list-style:disc;'> <li> Additional volume usage charges will apply, once your subscribed monthly volume is exhausted</li>"+
					"			         <li>  For additional volume usage and add-on purchases, you have been allotted a credit limit of <span  style='color:#C60651; font-weight: bold;'> PKR 300</span></li>"+
					"			           <li>  Once your subscribed monthly volume is exhausted, you will be charged <span  style='color:#C60651; font-weight: bold;'> Rs.0.10 </span> for every  <span  style='color:#C60651; font-weight: bold;'>1 MB </span> consumed till the  time you purchase a volume <br>add-on or the start of your next billing cycle (1st of every month)</li>"+
					"			            <li>  Additional volume consumption and/or add-on purchases, will reflect in your monthly invoice</li></ul>"+
					"			        </td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top'><p align='justify' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			    <br>     "+
					"			    For more information, you can contact our customer care <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>24 hours </span>a day, <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a> <br>"+
					"			          or calling <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>111 1tribe (111 187 423)</span>.<br>"+
					"			              <br>"+
					"			          </p></td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					"			            "+
					"			            <tr>"+
					"			              <td width='164' align='center'><a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"			            </tr>"+
					"			          </table></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' class='td'><table width='850' align='center'>"+
					"			          "+
					"			          <tr>"+
					"			            <td align='center'><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"			              <tr>"+
					"			                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"			                <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://itech.pk/newsletter/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			              </tr>"+
					"			            </table></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/account-update/images/payment-option-strip.png' hspace='3' vspace='3' border='0'></a><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><br>"+
					"			              "+
					"			            </a></td>"+
					"			          </tr>"+
					"			        </table>          </td>"+
					"			      </tr>"+
					"			      "+
					"			    </table></td>"+
					"			  </tr>"+
					"			  <tr>"+
					"			    <td align='center'><b"+
					"			  style='mso-bidi-font-weight:normal'><span style='font-size:9.0pt;font-family:"+
					"			  &quot;Verdana&quot;,&quot;sans-serif&quot;;mso-fareast-font-family:&quot;Times New Roman&quot;;color:black;"+
					"			  mso-no-proof:yes'><img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' '></span></b></td>"+
					"			  </tr>"+
					"			</table>"+
					"			"+
					"			</body>"+
					"			</html>";
		   
		   
		   
		return htmlStr;
	   }
	   
	   
	   public String get90persent(String userName,long accountNo,String fullName)
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume 90 %</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='900' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					 " <tr>"+
					 "   <td width='900' align='center'><img"+
					 " src='http://www.wi-tribe.pk/images/90per-volume.png' ></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td><table width='903' border='0'>"+
					 "     <tr>"+
					 "       <td width='662' align='center' valign='top'></td>"+
					 "     </tr>"+
					 "   </table></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td valign='top'><table width='882' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					 "     <tr>"+
					 "       <td  width='200' height='22' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'><br>"+
					 "         <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Username:"+userName+"</span></span></td>"+
					 "       <td valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       <td width='235' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					 " src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					 "     </tr>"+
					 "     <tr>"+
					 "       <td width='200' height='22' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Customer ID:"+accountNo+" </span></td>"+
					 "       <td width='489' valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       </tr>"+
					 "<tr>"+
					"			        <td height='70' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"			          Dear  "+fullName+",<br>"+
			
					"			          </span></p>          </td>"+
					"			        </tr>"+
					
					"			      <tr>"+
					"			        <td height='48' colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;FONT-FAMILY:  Arial;' ><p>It seems you are enjoying your wi-tribe experience. We just wanted to inform you that you have consumed <span  style='color:#C60651; font-weight: bold;'>90% </span> of your subscribed volume limit."+
					"			<br>"+
					"			            <br>"+
					"			            Why not take advantage of any of our <span  style='color:#BE1C32; font-weight: bold;'> exciting offers,</span> giving you an even more enhanced wi-tribe experience:"+ 
					"			<br>"+
					"			             "+
					"			        </p>"+
					"			                   </td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='center' valign='top'><br>"+
					"			          <a href='#' onClick='window.open('http://wi-tribe.pk/volume_notification/up-size-gbs.html','mywindow','width=800,height=450')' style='padding:5px; color:#666; font-weight:bold; border:0px solid white; background:white;' onMouseOver='this.style.color='#000'' onMouseOut='this.style.color='#666'' ><img src='http://www.wi-tribe.pk/images/vn_btn_upgb.jpg' width='262'/></a>"+
					"			          <br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' align='center' style='color:#BE1C32;"+
					"				font-size: 14px; font-weight: bold; '>VOLUME POLICY<br><br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' style='color:#000000;padding:0 0 0 20px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			                <ul style='list-style:disc;'> <li> Additional volume usage charges will apply, once your subscribed monthly volume is exhausted</li>"+
					"			         <li>  For additional volume usage and add-on purchases, you have been allotted a credit limit of <span  style='color:#C60651; font-weight: bold;'> PKR 300</span></li>"+
					"			           <li>  Once your subscribed monthly volume is exhausted, you will be charged <span  style='color:#C60651; font-weight: bold;'> Rs.0.10 </span> for every  <span  style='color:#C60651; font-weight: bold;'>1 MB </span> consumed till the  time you purchase a volume <br>add-on or the start of your next billing cycle (1st of every month)</li>"+
					"			            <li>  Additional volume consumption and/or add-on purchases, will reflect in your monthly invoice</li></ul>"+
					"			        </td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top'><p align='justify' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			    <br>     "+
					"			    For more information, you can contact our customer care <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>24 hours </span>a day, <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a> <br>"+
					"			          or calling <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>111 1tribe (111 187 423)</span>.<br>"+
					"			              <br>"+
					"			          </p></td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					"			            "+
					"			            <tr>"+
					"			              <td width='164' align='center'><a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"			            </tr>"+
					"			          </table></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' class='td'><table width='850' align='center'>"+
					"			          "+
					"			          <tr>"+
					"			            <td align='center'><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"			              <tr>"+
					"			                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"			                <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://itech.pk/newsletter/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			              </tr>"+
					"			            </table></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/account-update/images/payment-option-strip.png' hspace='3' vspace='3' border='0'></a><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><br>"+
					"			              "+
					"			            </a></td>"+
					"			          </tr>"+
					"			        </table>          </td>"+
					"			      </tr>"+
					"			      "+
					"			    </table></td>"+
					"			  </tr>"+
					"			  <tr>"+
					"			    <td align='center'><b"+
					"			  style='mso-bidi-font-weight:normal'><span style='font-size:9.0pt;font-family:"+
					"			  &quot;Verdana&quot;,&quot;sans-serif&quot;;mso-fareast-font-family:&quot;Times New Roman&quot;;color:black;"+
					"			  mso-no-proof:yes'><img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' '></span></b></td>"+
					"			  </tr>"+
					"			</table>"+
					"			"+
					"			</body>"+
					"			</html>";
		   
		   
		   
		return htmlStr;
	   }
	   
	   
	   
	   public String get100persent(String userName,long accountNo,String fullName)
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume 100 %</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='900' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					 " <tr>"+
					 "   <td width='900' align='center'><img"+
					 " src='http://www.wi-tribe.pk/images/100-volume.jpg' ></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td><table width='903' border='0'>"+
					 "     <tr>"+
					 "       <td width='662' align='center' valign='top'></td>"+
					 "     </tr>"+
					 "   </table></td>"+
					 " </tr>"+
					 " <tr>"+
					 "  <td valign='top'><table width='882' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					 "     <tr>"+
					 "       <td  width='200' height='22' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'><br>"+
					 "         <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Username:"+userName+"</span></span></td>"+
					 "       <td valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       <td width='235' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					 " src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					 "     </tr>"+
					 "     <tr>"+
					 "       <td width='200' height='22' valign='top' ><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 14px; padding:0px;font-weight:bold;'>Customer ID:"+accountNo+" </span></td>"+
					 "       <td width='489' valign='top' class='burgandy-bold'>&nbsp;</td>"+
					 "       </tr>"+
					 "<tr>"+
					"			        <td height='70' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"			          Dear  "+fullName+",<br>"+
			
					"			          </span></p>          </td>"+
					"			        </tr>"+
					
					"			      <tr>"+
					"			        <td height='48' colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;FONT-FAMILY:  Arial;' ><p>It seems you are enjoying your wi-tribe experience. We just wanted to inform you that you have consumed <span  style='color:#C60651; font-weight: bold;'>100% </span> of your subscribed volume limit."+
					"			<br>"+
					
					"	<br>"+
						
					"	Now, you will be charged at  <span  style='color:#C60651; font-weight: bold;'> PKR 0.10 </span> for every  <span  style='color:#C60651; font-weight: bold;'> 1MB </span> you consume from your monthly credit limit of PKR 300 till the time you purchase a volume add-on or the start of your next billing cycle.<br><br>"+
						
					"	 <span style='font-family:Arial; font-size:12px; color:#06F; text-align:center; font-weight:bold;'> "+
					"	If you do not wish to avail this credit facility, kindly email or call us. Please note, by doing so, your services will be suspended upon 100% volume consumption."+
					"	</span>"+
						
					"	            <br>"+
					
					
					
					
					"			            <br>"+
					"			            Why not take advantage of any of our <span  style='color:#BE1C32; font-weight: bold;'> exciting offers,</span> giving you an even more enhanced wi-tribe experience:"+ 
					"			<br>"+
					"			             "+
					"			        </p>"+
					"			                   </td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='center' valign='top'><br>"+
					"			          <a href='#' onClick='window.open('http://wi-tribe.pk/volume_notification/up-size-gbs.html','mywindow','width=800,height=450')' style='padding:5px; color:#666; font-weight:bold; border:0px solid white; background:white;' onMouseOver='this.style.color='#000'' onMouseOut='this.style.color='#666'' ><img src='http://www.wi-tribe.pk/images/vn_btn_upgb.jpg' width='262'/></a>"+
					"			          <br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' align='center' style='color:#BE1C32;"+
					"				font-size: 14px; font-weight: bold; '>VOLUME POLICY<br><br></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top' style='color:#000000;padding:0 0 0 20px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			                <ul style='list-style:disc;'> <li> Additional volume usage charges will apply, once your subscribed monthly volume is exhausted</li>"+
					"			         <li>  For additional volume usage and add-on purchases, you have been allotted a credit limit of <span  style='color:#C60651; font-weight: bold;'> PKR 300</span></li>"+
					"			           <li>  Once your subscribed monthly volume is exhausted, you will be charged <span  style='color:#C60651; font-weight: bold;'> Rs.0.10 </span> for every  <span  style='color:#C60651; font-weight: bold;'>1 MB </span> consumed till the  time you purchase a volume <br>add-on or the start of your next billing cycle (1st of every month)</li>"+
					"			            <li>  Additional volume consumption and/or add-on purchases, will reflect in your monthly invoice</li></ul>"+
					"			        </td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' valign='top'><p align='justify' style='color:#000000;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: normal;'>"+
					"			    <br>     "+
					"			    For more information, you can contact our customer care <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>24 hours </span>a day, <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a> <br>"+
					"			          or calling <span style='FONT-FAMILY: Arial, Helvetica, sans-serif;"+
					"				TEXT-DECORATION: none;"+
					"				color:#BE1C32;padding:0px;"+
					"				font-size: 12px; "+
					"				font-weight: bold;'>111 1tribe (111 187 423)</span>.<br>"+
					"			              <br>"+
					"			          </p></td>"+
					"			      </tr>"+
					"			      "+
					"			      <tr>"+
					"			        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					"			            "+
					"			            <tr>"+
					"			              <td width='164' align='center'><a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"			            </tr>"+
					"			          </table></td>"+
					"			      </tr>"+
					"			      <tr>"+
					"			        <td colspan='3' class='td'><table width='850' align='center'>"+
					"			          "+
					"			          <tr>"+
					"			            <td align='center'><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"			              <tr>"+
					"			                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"			                <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://itech.pk/newsletter/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://itech.pk/newsletter/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"			              </tr>"+
					"			            </table></td>"+
					"			          </tr>"+
					"			          <tr>"+
					"			            <td align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/account-update/images/payment-option-strip.png' hspace='3' vspace='3' border='0'></a><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><br>"+
					"			              "+
					"			            </a></td>"+
					"			          </tr>"+
					"			        </table>          </td>"+
					"			      </tr>"+
					"			      "+
					"			    </table></td>"+
					"			  </tr>"+
					"			  <tr>"+
					"			    <td align='center'><b"+
					"			  style='mso-bidi-font-weight:normal'><span style='font-size:9.0pt;font-family:"+
					"			  &quot;Verdana&quot;,&quot;sans-serif&quot;;mso-fareast-font-family:&quot;Times New Roman&quot;;color:black;"+
					"			  mso-no-proof:yes'><img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' '></span></b></td>"+
					"			  </tr>"+
					"			</table>"+
					"			"+
					"			</body>"+
					"			</html>";
		   
		   
		   
		return htmlStr;
	   }
	   
	   
	   public String get100B_NB()
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume Notification</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='903' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					"  <tr>"+
					"    <td width='903' align='center'> <img src='http://www.wi-tribe.pk/images/100-volume.jpg' alt=''  border=0  /></td>"+
					"  </tr>"+
					" <tr>"+
					"    <td><table width='903' border='0'>"+
					"      <tr>"+
					"        <td width='662' align='center' valign='top'></td>"+
					"      </tr>"+
					"    </table></td>"+
					"  </tr>"+
					  
					"  <tr>"+
					"    <td valign='top'><table width='876' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					   
					"  <tr>"+
					"        <td height='22' valign='top' ></td>"+
					"        <td valign='top' >&nbsp;</td>"+
					"        <td width='106' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					"  src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					"      </tr>"+
					"      <tr>"+
					"        <td width='136' height='22' valign='top' ></td>"+
					"        <td width='614' valign='top' >&nbsp;</td>"+
					"        </tr>"+
					      
					"      <tr>"+
					"        <td height='60' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"          Dear wi-triber,<br>"+
					            
					"          </span></p>          </td>"+
					"        </tr>"+
					      
					      
					     
					      
					      
					      
					"      <tr>"+
					"        <td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;' >"+
					    
					    
					    
					"We are glad to see you are enjoying the benefits of wi-tribe's business package. We just wanted to inform you that you have consumed <span style='font-weight:bold;color:#C00000;'>100%</span> of your subscribed volume limit for use during <span style='font-weight:bold;color:#C00000;'>BUSINESS</span> and <span style='font-weight:bold;color:#C00000;'>NON-BUSINESS HOURS</span>.<br><br>"+
					
					"Unfortunately, since you do not have sufficient volume in either <span style='font-weight:bold;color:#C00000;'>BUSINESS</span> or <span style='font-weight:bold;color:#C00000;'>NON-BUSINESS HOURS</span>, your account is suspended. It will remain suspended until you subscribe to an add-on or reach the start of your next billing cycle.<br><br>"+
					
					"To resume your services, you can subscribe to our Upsize GBs add-on and continue enjoying wi-tribe:<br><br>"+
					
					"</td>"+
					"      </tr>"+
					    
					"    <tr align='center'><td align='center' colspan='3'><a href='http://www.wi-tribe.pk/products-services/enterprise/packages-promos-enterprise/enterprise-promotional-add-ons/' target='_blank'>"+
					"    <img src='http://www.citsolclients.com/witribe-images/upsizesmall.jpg' border='0'></a>"+
					"    </td></tr>"+
					    
					    
					" <tr><td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;'>"+   
					
					"To purchase the Upsize GBs add-on, simply call us at <b>111-187-423</b> or visit your <a href='http://www.wi-tribe.pk/customer-care/find-nearby-locations/' target='_blank'>nearest wi-tribe customer care center.</a><br><br>"+
					"For more information, you can contact our customer care <span style='font-weight:bold;color:#C00000;'> 24 hours</span>  a day, <span style='font-weight:bold;color:#C00000;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a><br> or calling <span style='font-weight:bold;color:#C00000;'>111 1tribe (111 187 423) </span>"+ 
					
					
					"</td></tr>"+
					"     <tr>"+
					"        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					           
					"            <tr>"+
					"              <td width='164' align='center'>"+
					"              <br><br>"+
					              
					"              <a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"            </tr>"+
					"          </table></td>"+
					"      </tr>"+
					
					"      <tr>"+
					"       <td colspan='3' class='td'><table width='850' align='center'>"+
					          
					          
					          
					"          <tr>"+
					"            <td align='center'><br><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"              <tr>"+
					"                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"               <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://www.wi-tribe.pk/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"              </tr>"+
					"            </table></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td height='40' align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/images/footernew.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"          </tr>"+
					          
					"        </table>          </td>"+
					"      </tr>"+
					      
					"    </table></td>"+
					"  </tr>"+
					  
					"  <center>"+
					"  <tr>"+
					"    <td align='center'>"+
					 "   <img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' ' align='middle'>    </td>"+
					 " </tr>"+
					 " </center>"+
					"</table>"+
					
				"	</body>"+
				"	</html>";
		   
		   
		return htmlStr;
	   }
	   
	   
	   
	   public String get100Regular()
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume Notification</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='903' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					"  <tr>"+
					"    <td width='903' align='center'> <img src='http://www.wi-tribe.pk/images/100-volume.jpg' alt=''  border=0  /></td>"+
					"  </tr>"+
					" <tr>"+
					"    <td><table width='903' border='0'>"+
					"      <tr>"+
					"        <td width='662' align='center' valign='top'></td>"+
					"      </tr>"+
					"    </table></td>"+
					"  </tr>"+
					  
					"  <tr>"+
					"    <td valign='top'><table width='876' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					   
					"  <tr>"+
					"        <td height='22' valign='top' ></td>"+
					"        <td valign='top' >&nbsp;</td>"+
					"        <td width='106' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					"  src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					"      </tr>"+
					"      <tr>"+
					"        <td width='136' height='22' valign='top' ></td>"+
					"        <td width='614' valign='top' >&nbsp;</td>"+
					"        </tr>"+
					      
					"      <tr>"+
					"        <td height='60' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"          Dear wi-triber,<br>"+
					            
					"          </span></p>          </td>"+
					"        </tr>"+
					" <tr>"+
					"		        <td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"			font-size: 12px; "+ 
					"			font-weight: normal;FONT-FAMILY:  Arial;' >"+
					"		We are glad to see you are enjoying wi-tribe's student package so much! We just wanted to let you know that you have consumed <span style='font-weight:bold;color:#C00000;'>100%</span> of your subscribed volume limit allocated for <span style='font-weight:bold;color:#C00000;'>REGULAR HOURS* </span> (6 p.m. - 12 a.m.).<br><br>"+
					"		You can continue to surf, stream and socialize online during <span style='font-weight:bold;color:#C00000;'>STUDENT HOURS**</span>, but you will be unable use our services during <span style='font-weight:bold;color:#C00000;'>REGULAR HOURS</span>, unless you purchase an add-on or wait till the start of your next billing cycle. <br><br>"+
					
					"		By purchasing the Upsize GBs add-on, you can resume your services during regular hours and do much more online with "+
					"		wi-tribe:<br><br>"+
					
					"</td>"+
					"      </tr>"+
					    
					"    <tr align='center'><td align='center' colspan='3'>"+
					"    <img src='http://www.citsolclients.com/witribe-images/upsizesmall.jpg' border='0'></a>"+
					"    </td></tr>"+
					    
					    
					" <tr><td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;'>"+   
					
					"To purchase the Upsize GBs add-on, simply call us at <b>111-187-423</b> or visit your <a href='http://www.wi-tribe.pk/customer-care/find-nearby-locations/' target='_blank'>nearest wi-tribe customer care center.</a><br><br>"+
					"For more information, you can contact our customer care <span style='font-weight:bold;color:#C00000;'> 24 hours</span>  a day, <span style='font-weight:bold;color:#C00000;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a><br> or calling <span style='font-weight:bold;color:#C00000;'>111 1tribe (111 187 423) </span>"+ 
					
					
					"</td></tr>"+
					"     <tr>"+
					"        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					           
					"            <tr>"+
					"              <td width='164' align='center'>"+
					"              <br><br>"+
					              
					"              <a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"            </tr>"+
					"          </table></td>"+
					"      </tr>"+
					
			  		"		<tr>"+
					"            <td style='color:#000000;padding:0px;"+
					"	font-size: 11px; font-weight: normal;'>"+
					"     <span style='color:#c00; font-size:12px;''>*</span><strong> </strong>Regular hours: 512Kbps<br>"+
					"<span style='color:#c00; font-size:12px;'>*</span><strong> </strong>Student hours: 1Mbps</td><br>"+
			
					"          </tr>"+
					
					"      <tr>"+
					"       <td colspan='3' class='td'><table width='850' align='center'>"+
					          
					          
					          
					"          <tr>"+
					"            <td align='center'><br><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"              <tr>"+
					"                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"               <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://www.wi-tribe.pk/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"              </tr>"+
					"            </table></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td height='40' align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/images/footernew.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"          </tr>"+
					          
					"        </table>          </td>"+
					"      </tr>"+
					      
					"    </table></td>"+
					"  </tr>"+
					  
					"  <center>"+
					"  <tr>"+
					"    <td align='center'>"+
					 "   <img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' ' align='middle'>    </td>"+
					 " </tr>"+
					 " </center>"+
					"</table>"+
					
				"	</body>"+
				"	</html>";
		   
		   
		return htmlStr;
	   }
	    
	   
	   public String get100SRLP()
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume Notification</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='903' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					"  <tr>"+
					"    <td width='903' align='center'> <img src='http://www.wi-tribe.pk/images/100-volume.jpg' alt=''  border=0  /></td>"+
					"  </tr>"+
					" <tr>"+
					"    <td><table width='903' border='0'>"+
					"      <tr>"+
					"        <td width='662' align='center' valign='top'></td>"+
					"      </tr>"+
					"    </table></td>"+
					"  </tr>"+
					  
					"  <tr>"+
					"    <td valign='top'><table width='876' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					   
					"  <tr>"+
					"        <td height='22' valign='top' ></td>"+
					"        <td valign='top' >&nbsp;</td>"+
					"        <td width='106' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					"  src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					"      </tr>"+
					"      <tr>"+
					"        <td width='136' height='22' valign='top' ></td>"+
					"        <td width='614' valign='top' >&nbsp;</td>"+
					"        </tr>"+
					      
					"      <tr>"+
					"        <td height='60' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"          Dear wi-triber,<br>"+
					            
					"          </span></p>          </td>"+
					"        </tr>"+
					" <tr>"+
					"		        <td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"			font-size: 12px; "+ 
					"			font-weight: normal;FONT-FAMILY:  Arial;' >"+
					"		We are glad to see you are enjoying wi-tribe’s student package so much! We just wanted to let you know that you have consumed 100% of your subscribed volume limit allocated for <span style='font-weight:bold;color:#C00000;'>STUDENT</span> and <span style='font-weight:bold;color:#C00000;'>REGULAR HOURS</span>.  <br><br>"+
					
					
					"	As you do not have sufficient volume in either <span style='font-weight:bold;color:#C00000;'>STUDENT</span> or <span style='font-weight:bold;color:#C00000;'>REGULAR HOURS</span>, your account is currently suspended, and will remain so until you subscribe to an add-on or reach the start of your next billing cycle.<br><br>"+
						
					"	If you want to add more volume to your regular hours, you can purchase our Upsize GBs add-on and do much more online with wi-tribe:<br><br>"+

					
					"</td>"+
					"      </tr>"+
					    
					"    <tr align='center'><td align='center' colspan='3'><a href='http://www.wi-tribe.pk/products-services/enterprise/packages-promos-enterprise/enterprise-promotional-add-ons/' target='_blank'>"+
					"    <img src='http://www.citsolclients.com/witribe-images/upsizesmall.jpg' border='0'></a>"+
					"    </td></tr>"+
					    
					    
					" <tr><td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;'>"+   
					
					"To purchase the Upsize GBs add-on, simply call us at <b>111-187-423</b> or visit your <a href='http://www.wi-tribe.pk/customer-care/find-nearby-locations/' target='_blank'>nearest wi-tribe customer care center.</a><br><br>"+
					"For more information, you can contact our customer care <span style='font-weight:bold;color:#C00000;'> 24 hours</span>  a day, <span style='font-weight:bold;color:#C00000;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a><br> or calling <span style='font-weight:bold;color:#C00000;'>111 1tribe (111 187 423) </span>"+ 
					
					
					"</td></tr>"+
					"     <tr>"+
					"        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					           
					"            <tr>"+
					"              <td width='164' align='center'>"+
					"              <br><br>"+
					              
					"              <a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"            </tr>"+
					"          </table></td>"+
					"      </tr>"+
					
					"      <tr>"+
					"       <td colspan='3' class='td'><table width='850' align='center'>"+
					          
					          
					          
					"          <tr>"+
					"            <td align='center'><br><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"              <tr>"+
					"                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"               <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://www.wi-tribe.pk/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"              </tr>"+
					"            </table></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td height='40' align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/images/footernew.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"          </tr>"+
					          
					"        </table>          </td>"+
					"      </tr>"+
					      
					"    </table></td>"+
					"  </tr>"+
					  
					"  <center>"+
					"  <tr>"+
					"    <td align='center'>"+
					 "   <img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' ' align='middle'>    </td>"+
					 " </tr>"+
					 " </center>"+
					"</table>"+
					
				"	</body>"+
				"	</html>";
		   
		   
		return htmlStr;
	   }
	   
	   
	   public String get100StudentLP()
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume Notification</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='903' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					"  <tr>"+
					"    <td width='903' align='center'> <img src='http://www.wi-tribe.pk/images/100-volume.jpg' alt=''  border=0  /></td>"+
					"  </tr>"+
					" <tr>"+
					"    <td><table width='903' border='0'>"+
					"      <tr>"+
					"        <td width='662' align='center' valign='top'></td>"+
					"      </tr>"+
					"    </table></td>"+
					"  </tr>"+
					  
					"  <tr>"+
					"    <td valign='top'><table width='876' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					   
					"  <tr>"+
					"        <td height='22' valign='top' ></td>"+
					"        <td valign='top' >&nbsp;</td>"+
					"        <td width='106' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					"  src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					"      </tr>"+
					"      <tr>"+
					"        <td width='136' height='22' valign='top' ></td>"+
					"        <td width='614' valign='top' >&nbsp;</td>"+
					"        </tr>"+
					      
					"      <tr>"+
					"        <td height='60' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"          Dear wi-triber,<br>"+
					            
					"          </span></p>          </td>"+
					"        </tr>"+
					" <tr>"+
					"		        <td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"			font-size: 12px; "+ 
					"			font-weight: normal;FONT-FAMILY:  Arial;' >"+
						
					"		We are glad to see you are enjoying wi-tribe’s student package so much! We just wanted to let you know that you have consumed <span style='font-weight:bold;color:#C00000;'>100%</span> of your subscribed volume limit allocated for <span style='font-weight:bold;color:#C00000;'>STUDENT HOURS*</span> (12 a.m. – 6 p.m.).<br><br>"+
							
							
					"		Your <span style='font-weight:bold;color:#C00000;'>STUDENT HOURS</span> service parameters will now be changed to that of <span style='font-weight:bold;color:#C00000;'>REGULAR HOURS**</span>, meaning you will now enjoy the benefits of your regular hours, until the start of your next billing cycle.<br><br>"+
							
							
							
					"		If you want to add more volume to your regular hours, you can purchase our Upsize GBs add-on and do much more online with wi-tribe:<br><br>"+



					"</td>"+
					"      </tr>"+
					    
					"    <tr align='center'><td align='center' colspan='3'>"+
					"    <img src='http://www.citsolclients.com/witribe-images/upsizesmall.jpg' border='0'></a>"+
					"    </td></tr>"+
					    
					    
					" <tr><td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;'>"+   
					
					"To purchase the Upsize GBs add-on, simply call us at <b>111-187-423</b> or visit your <a href='http://www.wi-tribe.pk/customer-care/find-nearby-locations/' target='_blank'>nearest wi-tribe customer care center.</a><br><br>"+
					"For more information, you can contact our customer care <span style='font-weight:bold;color:#C00000;'> 24 hours</span>  a day, <span style='font-weight:bold;color:#C00000;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a><br> or calling <span style='font-weight:bold;color:#C00000;'>111 1tribe (111 187 423) </span>"+ 
					
					
					"</td></tr>"+
					"     <tr>"+
					"        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					           
					"            <tr>"+
					"              <td width='164' align='center'>"+
					"              <br><br>"+
					              
					"              <a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"            </tr>"+
					"          </table></td>"+
					"      </tr>"+
					
			 		"		<tr> "+
					"            <td style='color:#000000;padding:0px; "+
					"	font-size: 11px; font-weight: normal;'> "+
					"     <span style='color:#c00; font-size:12px;'>*</span><strong> </strong>Student hours: 1Mbps<br> "+ 
					"<span style='color:#c00; font-size:12px;'>*</span><strong> </strong>Regular hours: 512Kbps</td><br> "+
			
					  "        </tr> "+
					
					"      <tr>"+
					"       <td colspan='3' class='td'><table width='850' align='center'>"+
					          
					          
					          
					"          <tr>"+
					"            <td align='center'><br><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"              <tr>"+
					"                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"               <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://www.wi-tribe.pk/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"              </tr>"+
					"            </table></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td height='40' align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/images/footernew.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"          </tr>"+
					          
					"        </table>          </td>"+
					"      </tr>"+
					      
					"    </table></td>"+
					"  </tr>"+
					  
					"  <center>"+
					"  <tr>"+
					"    <td align='center'>"+
					 "   <img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' ' align='middle'>    </td>"+
					 " </tr>"+
					 " </center>"+
					"</table>"+
					
				"	</body>"+
				"	</html>";
		   
		   
		return htmlStr;
	   }
	   
	   
	   
	   public String get100B_LP()
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume Notification</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='903' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					"  <tr>"+
					"    <td width='903' align='center'> <img src='http://www.wi-tribe.pk/images/100-volume.jpg' alt=''  border=0  /></td>"+
					"  </tr>"+
					" <tr>"+
					"    <td><table width='903' border='0'>"+
					"      <tr>"+
					"        <td width='662' align='center' valign='top'></td>"+
					"      </tr>"+
					"    </table></td>"+
					"  </tr>"+
					  
					"  <tr>"+
					"    <td valign='top'><table width='876' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					   
					"  <tr>"+
					"        <td height='22' valign='top' ></td>"+
					"        <td valign='top' >&nbsp;</td>"+
					"        <td width='106' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					"  src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					"      </tr>"+
					"      <tr>"+
					"        <td width='136' height='22' valign='top' ></td>"+
					"        <td width='614' valign='top' >&nbsp;</td>"+
					"        </tr>"+
					      
					"      <tr>"+
					"        <td height='60' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"          Dear wi-triber,<br>"+
					            
					"          </span></p>          </td>"+
					"        </tr>"+
					      
					      
					     
					      
					      
					      
					"      <tr>"+
					"        <td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;' >"+
					    
					"	We are glad to see you are enjoying the benefits of wi-tribe's business package. We just wanted to inform you that you have consumed <span style='font-weight:bold;color:#C00000;'>100%</span> of your subscribed volume limit for use during <span style='font-weight:bold;color:#C00000;'>BUSINESS HOURS</span> (9 a.m. - 6 p.m.).<br><br>"+
						
					"	Your <span style='font-weight:bold;color:#C00000;'>BUSINESS HOURS</span> service parameters will be changed to that of <span style='font-weight:bold;color:#C00000;'>NON-BUSINESS HOURS</span> till the end of the month."+
					"	<br><br>"+
						
					"	To get additional volume during non-business hours, you can subscribe to our Upsize GBs add-on:<br><br>"+
						
						   
											    


					"</td>"+
					"      </tr>"+
					    
					"    <tr align='center'><td align='center' colspan='3'><a href='http://www.wi-tribe.pk/products-services/enterprise/packages-promos-enterprise/enterprise-promotional-add-ons/' target='_blank'>"+
					"    <img src='http://www.citsolclients.com/witribe-images/upsizesmall.jpg' border='0'></a>"+
					"    </td></tr>"+
					    
					    
					" <tr><td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;'>"+   
					
					"To purchase the Upsize GBs add-on, simply call us at <b>111-187-423</b> or visit your <a href='http://www.wi-tribe.pk/customer-care/find-nearby-locations/' target='_blank'>nearest wi-tribe customer care center.</a><br><br>"+
					"For more information, you can contact our customer care <span style='font-weight:bold;color:#C00000;'> 24 hours</span>  a day, <span style='font-weight:bold;color:#C00000;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a><br> or calling <span style='font-weight:bold;color:#C00000;'>111 1tribe (111 187 423) </span>"+ 
					
					
					"</td></tr>"+
					"     <tr>"+
					"        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					           
					"            <tr>"+
					"              <td width='164' align='center'>"+
					"              <br><br>"+
					              
					"              <a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"            </tr>"+
					"          </table></td>"+
					"      </tr>"+
					
					"      <tr>"+
					"       <td colspan='3' class='td'><table width='850' align='center'>"+
					          
					          
					          
					"          <tr>"+
					"            <td align='center'><br><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"              <tr>"+
					"                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"               <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://www.wi-tribe.pk/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"              </tr>"+
					"            </table></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td height='40' align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/images/footernew.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"          </tr>"+
					          
					"        </table>          </td>"+
					"      </tr>"+
					      
					"    </table></td>"+
					"  </tr>"+
					  
					"  <center>"+
					"  <tr>"+
					"    <td align='center'>"+
					 "   <img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' ' align='middle'>    </td>"+
					 " </tr>"+
					 " </center>"+
					"</table>"+
					
				"	</body>"+
				"	</html>";
		   
		   
		return htmlStr;
	   }
	   
	   
	   public String get100NB_LP()
	   {
		   String htmlStr="";
		   
		   htmlStr="<html>"+
					"<head>"+
					"<title>Volume Notification</title>"+
					"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
					"<style type='text/css'>"+
					
					"</style>"+
					"</head>"+
					"<body bgcolor='#FFFFFF'>"+
					"<table width='903' border='0' align='center' cellpadding='00' cellspacing='0' bgcolor='#FFFFFF' >"+
					"  <tr>"+
					"    <td width='903' align='center'> <img src='http://www.wi-tribe.pk/images/100-volume.jpg' alt=''  border=0  /></td>"+
					"  </tr>"+
					" <tr>"+
					"    <td><table width='903' border='0'>"+
					"      <tr>"+
					"        <td width='662' align='center' valign='top'></td>"+
					"      </tr>"+
					"    </table></td>"+
					"  </tr>"+
					  
					"  <tr>"+
					"    <td valign='top'><table width='876' border='0' align='center' cellpadding='2'   style='padding-left:10px;'>"+
					   
					"  <tr>"+
					"        <td height='22' valign='top' ></td>"+
					"        <td valign='top' >&nbsp;</td>"+
					"        <td width='106' rowspan='3' align='center' valign='middle' class='burgandy'><span class='black11'><img"+
					"  src='http://www.wi-tribe.pk/images/no1small.jpg'></span></td>"+
					"      </tr>"+
					"      <tr>"+
					"        <td width='136' height='22' valign='top' ></td>"+
					"        <td width='614' valign='top' >&nbsp;</td>"+
					"        </tr>"+
					      
					"      <tr>"+
					"        <td height='60' colspan='2' valign='top' style='FONT-FAMILY: Arial, Helvetica, sans-serif;TEXT-DECORATION: none;	color:#BE1C32;	font-size: 18px; padding:0px;	font-weight: bold;'><p><br>"+
					"          Dear wi-triber,<br>"+
					            
					"          </span></p>          </td>"+
					"        </tr>"+
					      
					      
					     
					      
					      
					      
					"      <tr>"+
					"        <td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;' >"+
					    
					"		We are glad to see you are enjoying the benefits of wi-tribe's business package. We just wanted to inform you that you have consumed <span style='font-weight:bold;color:#C00000;'>100%</span> of your subscribed volume limit for use during <span style='font-weight:bold;color:#C00000;'>NON-BUSINESS HOURS</span> (6 p.m. - 9 a.m.). <br><br>"+
							
					"		Please note that you will be unable to use our services during <span style='font-weight:bold;color:#C00000;'>NON-BUSINESS HOURS</span>. Your <span style='font-weight:bold;color:#C00000;'>BUSINESS HOURS</span> volume will, however, not be affected, and will continue to resume normally. <br><br>"+
							
							
					"		<br><br>"+
							
					"		To continue using your service during non-business hours, you can get additional volume by subscribing to our Upsize GBs add-on:"+
							  
											    


					"</td>"+
					"      </tr>"+
					    
					"    <tr align='center'><td align='center' colspan='3'><a href='http://www.wi-tribe.pk/products-services/enterprise/packages-promos-enterprise/enterprise-promotional-add-ons/' target='_blank'>"+
					"    <img src='http://www.citsolclients.com/witribe-images/upsizesmall.jpg' border='0'></a>"+
					"    </td></tr>"+
					    
					    
					" <tr><td colspan='3' valign='top' style='color:#000000;padding:0px;"+
					"	font-size: 12px; "+
					"	font-weight: normal;FONT-FAMILY:  Arial;'>"+   
					
					"To purchase the Upsize GBs add-on, simply call us at <b>111-187-423</b> or visit your <a href='http://www.wi-tribe.pk/customer-care/find-nearby-locations/' target='_blank'>nearest wi-tribe customer care center.</a><br><br>"+
					"For more information, you can contact our customer care <span style='font-weight:bold;color:#C00000;'> 24 hours</span>  a day, <span style='font-weight:bold;color:#C00000;'>7 days</span> a week by  emailing <a href='mailto:customercare@wi-tribe.pk' target='_blank'>customercare@wi-tribe.pk</a><br> or calling <span style='font-weight:bold;color:#C00000;'>111 1tribe (111 187 423) </span>"+ 
					
					
					"</td></tr>"+
					"     <tr>"+
					"        <td colspan='3' align='left' class='td'><table width='170' border='0'>"+
					           
					"            <tr>"+
					"              <td width='164' align='center'>"+
					"              <br><br>"+
					              
					"              <a href='http://www.wi-tribe.pk/' target='_blank'><img src='http://www.wi-tribe.pk/images/wi-tribe_logo.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"            </tr>"+
					"          </table></td>"+
					"      </tr>"+
					
					"      <tr>"+
					"       <td colspan='3' class='td'><table width='850' align='center'>"+
					          
					          
					          
					"          <tr>"+
					"            <td align='center'><br><span style='FONT-FAMILY: Arial, Helvetica, sans-serif;	TEXT-DECORATION: none;	color:#BE1C32;	font-size: 16px; padding:0px;font-weight:bold;'>Find us  online</span></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td align='center'><table width='165' border='0' align='center' cellpadding='0' cellspacing='0'>"+
					"              <tr>"+
					"                <td width='56' align='center' ><p><a href='http://www.facebook.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/facebook.jpg' width='35' height='35' hspace='3' vspace='3' border='0'></a></p></td>"+
					"               <td width='52' align='center'><a href='http://www.twitter.com/witribePK' target='_blank'><img src='http://www.wi-tribe.pk/images/twitter.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"                <td width='57' align='center'><a href='http://www.youtube.com/witribePakistan' target='_blank'><img src='http://www.wi-tribe.pk/images/youtube.jpg' width='35' height='35' hspace='3' vspace='4' border='0'></a></td>"+
					"              </tr>"+
					"            </table></td>"+
					"          </tr>"+
					"          <tr>"+
					"            <td height='40' align='center'><a href='http://www.wi-tribe.pk/customer-care/payment-options/' target='_blank'><img src='http://www.wi-tribe.pk/images/footernew.jpg' hspace='3' vspace='3' border='0'></a></td>"+
					"          </tr>"+
					          
					"        </table>          </td>"+
					"      </tr>"+
					      
					"    </table></td>"+
					"  </tr>"+
					  
					"  <center>"+
					"  <tr>"+
					"    <td align='center'>"+
					 "   <img src='http://www.wi-tribe.pk/images/footer-2.gif' alt=' ' align='middle'>    </td>"+
					 " </tr>"+
					 " </center>"+
					"</table>"+
					
				"	</body>"+
				"	</html>";
		   
		   
		return htmlStr;
	   }
	   
	   
}



