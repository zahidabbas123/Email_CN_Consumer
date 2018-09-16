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
  SU_SYSUSERID             NUMBER(10)           NOT NULL,
  SU_SYSLOGIN              VARCHAR2(50 BYTE)    NOT NULL,
  SU_SYSPASSWORD           VARCHAR2(50 BYTE)    NOT NULL,
  SU_SYSUSERIP             VARCHAR2(15 BYTE)    DEFAULT '',
  SU_ACTIVATIONDATE        DATE                 NOT NULL,
  SU_ISACTIVE              NUMBER(1)            DEFAULT (0)                   NOT NULL,
  SR_ROLEID                NUMBER(10)           NOT NULL,
  SU_INSERTEDBY            NUMBER(10)           NOT NULL,
  SU_SYSUSERNAME           VARCHAR2(50 BYTE)    DEFAULT '',
  SU_REMOTEIP              VARCHAR2(15 BYTE)    DEFAULT '',
  SU_ISAUTHMANAGER         NUMBER(1)            DEFAULT (0),
  SU_SYSUSEREMAIL          VARCHAR2(50 BYTE)    DEFAULT '',
  SU_ISACCTMANAGER         NUMBER(1)            DEFAULT (0),
  SU_ASSIGNAM              NUMBER(1)            DEFAULT (1)                   NOT NULL,
  SU_APPACCESS             NUMBER(3)            DEFAULT 3                     NOT NULL,
  UD_DESIGNATIONID         NUMBER(10)           DEFAULT 0,
  UP_DEPARTMENTID          NUMBER(10)           DEFAULT 0,
  SU_ISSTOCKMANAGER        NUMBER(1)            DEFAULT 0,
  SU_CANDELIVERORDER       NUMBER(1)            DEFAULT 0,
  SU_CANAPPROVESALESORDER  NUMBER(1)            DEFAULT 0,
  SU_CALLCENTER            NUMBER(1)            DEFAULT 0                     NOT NULL,
  SU_ISSALESUSER           NUMBER(1)
 */

public class SysUser {
    int UserID;
    String Login;
    String Password;
    String ActivationDate;
    int isActive;
    int RoleID;
    String UserName;
    int isAuthManager;
    String Email;
    int isAcctManager;
    int AssingAM;
    int AppAccess;
    int DesignationID;
    int DepartmentID;
    int isStockManager;
    int CanDeliverOrder;
    int CanApproveSalesOrder;
    int CallCenter;
    int isSalesUser;
      
    
    public SysUser() {
    	this.UserID=0;
    	this.Login="";
    	this.Password="";
    	this.ActivationDate="";
    	this.isActive=0;
    	this.RoleID=0;
    	this.UserName="";
    	this.isAuthManager=0;
    	this.Email="";
    	this.isAcctManager=0;
    	this.AssingAM=0;
    	this.AppAccess=0;
    	this.DesignationID=0;
    	this.DepartmentID=0;
    	this.isStockManager=0;
    	this.CanDeliverOrder=0;
    	this.CanApproveSalesOrder=0;
    	this.CallCenter=0;
    	this.isSalesUser=0;
    }

    public SysUser(int userid, String login, String password, String actdate, int isactive, int roleid, String username, int authmanager, 
    		String email, int acctmanager, int assignam, int appaccess, int designationid, int departmentid, int isstockmanager, int candeliver,
    		int canapprove, int callcenter, int issalesuser) {
    	
    	this.UserID=userid;
    	this.Login=login;
    	this.Password=password;
    	this.ActivationDate=actdate;
    	this.isActive=isactive;
    	this.RoleID=roleid;
    	this.UserName=username;
    	this.isAuthManager=authmanager;
    	this.Email=email;
    	this.isAcctManager=acctmanager;
    	this.AssingAM=assignam;
    	this.AppAccess=appaccess;
    	this.DesignationID=designationid;
    	this.DepartmentID=departmentid;
    	this.isStockManager=isstockmanager;
    	this.CanDeliverOrder=candeliver;
    	this.CanApproveSalesOrder=canapprove;
    	this.CallCenter=callcenter;
    	this.isSalesUser=issalesuser;
    }

    
    public int getUserID() {
        return UserID;
    }
    public void setUserID(int UserID) {
        this.UserID = UserID;
    }
    
    public String getLogin() {
        return Login;
    }
    public void setLogin(String Login) {
        this.Login = Login;
    }
        
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String getActivationDate() {
        return ActivationDate;
    }
    public void setActivationDate(String ActivationDate) {
        this.ActivationDate = ActivationDate;
    }
    
    public int getisActive() {
        return isActive;
    }
    public void setisActive(int isActive) {
        this.isActive = isActive;
    }
    
    public int getRoleID() {
        return RoleID;
    }
    public void setRoleID(int RoleID) {
        this.RoleID = RoleID;
    }
    
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    public int getisAuthManager() {
        return isAuthManager;
    }
    public void setisAuthManager(int isAuthManager) {
        this.isAuthManager = isAuthManager;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    
    public int getisAcctManager() {
        return isAcctManager;
    }
    public void setisAcctManager(int isAcctManager) {
        this.isAcctManager = isAcctManager;
    }
    
    public int getAssingAM() {
        return AssingAM;
    }
    public void setAssingAM(int AssingAM) {
        this.AssingAM = AssingAM;
    }
    
    public int getAppAccess() {
        return AppAccess;
    }
    public void setAppAccess(int AppAccess) {
        this.AppAccess = AppAccess;
    }
    
    public int getDesignationID() {
        return DesignationID;
    }
    public void setDesignationID(int DesignationID) {
        this.DesignationID = DesignationID;
    }
    
    public int getDepartmentID() {
        return DepartmentID;
    }
    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }
    
    public int getisStockManager() {
        return isStockManager;
    }
    public void setisStockManager(int isStockManager) {
        this.isStockManager = isStockManager;
    }
    
    public int getCanDeliverOrder() {
        return CanDeliverOrder;
    }
    public void setCanDeliverOrder(int CanDeliverOrder) {
        this.CanDeliverOrder = CanDeliverOrder;
    }
    
    public int getCanApproveSalesOrder() {
        return CanApproveSalesOrder;
    }
    public void setCanApproveSalesOrder(int CanApproveSalesOrder) {
        this.CanApproveSalesOrder = CanApproveSalesOrder;
    }
    
    public int getCallCenter() {
        return CallCenter;
    }
    public void setCallCenter(int CallCenter) {
        this.CallCenter = CallCenter;
    }
    
    public int getisSalesUser() {
        return isSalesUser;
    }
    public void setisSalesUser(int isSalesUser) {
        this.isSalesUser = isSalesUser;
    }
   
   
    

   

    

    

   

    

    
}
