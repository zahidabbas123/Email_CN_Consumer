package com.soft.email.db;

import com.soft.email.beans.Account;
import com.soft.email.beans.AccountState;
import com.soft.email.beans.AlertEmails;
import com.soft.email.beans.ApplicationConfig;
import com.soft.email.beans.City;
import com.soft.email.beans.CityRegion;
import com.soft.email.beans.Currency;
import com.soft.email.beans.CurrencyRate;
import com.soft.email.beans.Customer;
import com.soft.email.beans.CustomerState;
import com.soft.email.beans.CustomerType;
import com.soft.email.beans.Email;
import com.soft.email.beans.EmailAlert;
import com.soft.email.beans.EmailContentType;
import com.soft.email.beans.EmailList;
import com.soft.email.beans.EmailMessage;
import com.soft.email.beans.EmailStatus;
import com.soft.email.beans.EmailType;
import com.soft.email.beans.ExpireServiceAlert;
import com.soft.email.beans.IndustryType;
import com.soft.email.beans.ListEmail;
import com.soft.email.beans.NextBillServiceAlert;
import com.soft.email.beans.Product;
import com.soft.email.beans.SalutationType;
import com.soft.email.beans.Service;
import com.soft.email.beans.ServiceGroup;
import com.soft.email.beans.ServiceType;
import com.soft.email.beans.State;
import com.soft.email.beans.SubSveState;
import com.soft.email.beans.SubscriberIdentification;
import com.soft.email.beans.SubscriberService;
import com.soft.email.beans.SveFinType;
import com.soft.email.beans.SvsBlkPolicy;
import com.soft.email.beans.SystemProperty;
import com.soft.email.core.DBManager;
import com.soft.email.core.Enviornment;
import com.soft.email.core.exceptions.ObjectNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.TextIt_WebServices.*;
import org.tempuri.*;

public class EmailDBManager
  extends DBManager
{
	private static Enviornment env;
    private static final Logger log = Logger.getLogger(EmailDBManager.class);
    
    
  protected EmailDBManager(Enviornment env)
    throws SQLException, ClassNotFoundException
  {
    super(env);
    env = env;
   
  }
  
  protected EmailDBManager(Connection conn)
    throws SQLException, ClassNotFoundException
  {
    super(conn);
   }
 
  
  public Hashtable getHash(int TypeID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    Hashtable hash = new Hashtable(5, 5.0F);
    String sql = "";
    if (TypeID == 101)
    {
      hash.put(Integer.valueOf(0), new EmailContentType());
      sql = " SELECT  ECT_CONTENTTYPEID, ECT_CONTENTTYPEDESC, ECT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILCONTENTTYPES order by ECT_CONTENTTYPEID ";
    }
    else if (TypeID == 102)
    {
      hash.put(Integer.valueOf(0), new EmailStatus());
      sql = " SELECT  EMS_STATUSID, EMS_STATUSNAME, EMS_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILSTATUS order by EMS_STATUSID ";
    }
    else if (TypeID == 103)
    {
      hash.put(Integer.valueOf(0), new EmailType());
      sql = "SELECT  EMT_TYPEID, EMT_TYPENAME, ECT_CONTENTTYPEID,EMT_PRIORITY,EMT_STYLESHEET,EMT_SUBJECT,EMT_FROMADDRESS,EMT_TOLIST,EMT_CCLIST,EMT_BCCLIST,EMT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILTYPES order by EMT_TYPEID";
    }
    log.debug(sql);
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          if (TypeID == 101)
          {
            int ID = rs.getInt("ECT_CONTENTTYPEID");
            EmailContentType obj = new EmailContentType(rs.getInt("ECT_CONTENTTYPEID"), rs.getString("ECT_CONTENTTYPEDESC"), rs.getInt("ECT_ISDISABLED"), 
              rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
              rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
            hash.put(Integer.valueOf(ID), obj);
          }
          else if (TypeID == 102)
          {
            int ID = rs.getInt("EMS_STATUSID");
            EmailStatus obj = new EmailStatus(rs.getInt("EMS_STATUSID"), rs.getString("EMS_STATUSNAME"), rs.getInt("EMS_ISDISABLED"), 
              rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
              rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
            hash.put(Integer.valueOf(ID), obj);
          }
          else if (TypeID == 103)
          {
            int ID = rs.getInt("EMT_TYPEID");
            EmailType obj = new EmailType(ID, rs.getString("EMT_TYPENAME"), rs.getInt("ECT_CONTENTTYPEID"), rs.getInt("EMT_PRIORITY"), 
              rs.getString("EMT_STYLESHEET"), rs.getString("EMT_SUBJECT"), rs.getString("EMT_FROMADDRESS"), 
              rs.getString("EMT_TOLIST"), rs.getString("EMT_CCLIST"), rs.getString("EMT_BCCLIST"), rs.getInt("EMT_ISDISABLED"), 
              rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
              rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
            hash.put(Integer.valueOf(ID), obj);
          }
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return hash;
  }
  
  public static EmailDBManager getDBManager(Enviornment env)
    throws SQLException, ClassNotFoundException
  {
    return new EmailDBManager(env);
  }
  
  public EmailType getEmailType(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    EmailType sa = new EmailType();
    if (ID > 0)
    {
      String sql = " SELECT  EMT_TYPEID, EMT_TYPENAME, ECT_CONTENTTYPEID,EMT_PRIORITY,EMT_STYLESHEET,EMT_SUBJECT,EMT_FROMADDRESS,EMT_TOLIST,EMT_CCLIST,EMT_BCCLIST,EMT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILTYPES  Where EMT_TYPEID =" + 
      
        ID + " order by EMT_TYPENAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sa = new EmailType(rs.getInt("EMT_TYPEID"), rs.getString("EMT_TYPENAME"), rs.getInt("ECT_CONTENTTYPEID"), rs.getInt("EMT_PRIORITY"), 
            rs.getString("EMT_STYLESHEET"), rs.getString("EMT_SUBJECT"), rs.getString("EMT_FROMADDRESS"), 
            rs.getString("EMT_TOLIST"), rs.getString("EMT_CCLIST"), rs.getString("EMT_BCCLIST"), rs.getInt("EMT_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          sa.setEmailContentType(getEmailContentType(sa.getContentTypeID()));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public ArrayList getEmailTypes(String name)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ArrayList taskList = new ArrayList();
    EmailType sa = null;
    
    String sql = " SELECT  EMT_TYPEID, EMT_TYPENAME, ECT_CONTENTTYPEID,EMT_PRIORITY,EMT_STYLESHEET,EMT_SUBJECT,EMT_FROMADDRESS,EMT_TOLIST,EMT_CCLIST,EMT_BCCLIST,EMT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILTYPES  Where 1=1 ";
    if ((name != null) && (name.length() > 0)) {
      sql = sql + " and EMT_TYPENAME like '%" + name + "%'";
    }
    sql = sql + " order by EMT_TYPENAME";
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          sa = new EmailType(rs.getInt("EMT_TYPEID"), rs.getString("EMT_TYPENAME"), rs.getInt("ECT_CONTENTTYPEID"), rs.getInt("EMT_PRIORITY"), 
            rs.getString("EMT_STYLESHEET"), rs.getString("EMT_SUBJECT"), rs.getString("EMT_FROMADDRESS"), 
            rs.getString("EMT_TOLIST"), rs.getString("EMT_CCLIST"), rs.getString("EMT_BCCLIST"), rs.getInt("EMT_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          
          sa.setEmailContentType(getEmailContentType(sa.getContentTypeID()));
          
          taskList.add(sa);
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return taskList;
  }
  
  public Email getEmail(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    Email sa = new Email();
    if (ID > 0)
    {
      String sql = " SELECT  EM_EMAILID, EMT_TYPEID, EM_PRIORITY, EM_FROM, EM_TOLIST, EM_CCLIST, EM_BCCLIST, EM_SUBJECT, EM_MESSAGE, EMS_STATUSID, SU_SysUserID, SU_SysUserIP, SU_InsertDate  from TEM_TBLEMAILS  Where EM_EMAILID =" + 
      
        ID + " order by EM_EMAILID ";
      log.debug(sql);
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new Email(rs.getInt("EM_EMAILID"), rs.getInt("EMT_TYPEID"), rs.getInt("EM_PRIORITY"), 
            rs.getString("EM_FROM"), rs.getString("EM_TOLIST"), rs.getString("EM_CCLIST"), 
            rs.getString("EM_BCCLIST"), rs.getString("EM_SUBJECT"), rs.getString("EM_MESSAGE"), rs.getInt("EMS_STATUSID"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public ArrayList<Email> getEmails(int StatusID, boolean onlyNew)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ArrayList<Email> taskList = new ArrayList<Email>();
    Email sa = null;
    
    String sql = " SELECT  EM_EMAILID, EMT_TYPEID, EM_PRIORITY, EM_FROM, EM_TOLIST, EM_CCLIST, EM_BCCLIST, EM_SUBJECT, EM_MESSAGE, EMS_STATUSID, SU_SysUserID, SU_SysUserIP, SU_InsertDate from TEM_TBLEMAILS   Where 1=1 ";
    if (StatusID > 0) {
      sql = sql + " and EMS_STATUSID = " + StatusID + " ";
    }
    if (onlyNew) {
      sql = sql + " and EMS_STATUSID <= 1 ";
    } else {
      sql = sql + " and EMS_STATUSID in (0, 1, 3) " +
      		      " AND em_subject=\'[StormFiber] Payment Reminder\' ";
    }
    sql = sql + " order by EMS_STATUSID, EM_EMAILID";
    
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    boolean getHash = true;
    Hashtable EmailContentTypeHash = new Hashtable(5, 5.0F);
    Hashtable EmailTypeHash = new Hashtable(5, 5.0F);
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          if (getHash)
          {
            EmailContentTypeHash = getHash(101);
            EmailTypeHash = getHash(103);
            getHash = false;
          }
          sa = new Email(rs.getInt("EM_EMAILID"), rs.getInt("EMT_TYPEID"), rs.getInt("EM_PRIORITY"), 
            rs.getString("EM_FROM"), rs.getString("EM_TOLIST"), rs.getString("EM_CCLIST"), 
            rs.getString("EM_BCCLIST"), rs.getString("EM_SUBJECT"), rs.getString("EM_MESSAGE"), rs.getInt("EMS_STATUSID"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"));
          if (sa.getTypeID() > 0)
          {
            sa.setEmailType((EmailType)EmailTypeHash.get(Integer.valueOf(sa.getTypeID())));
            if ((sa.getEmailType() != null) && (sa.getEmailType().getContentTypeID() > 0)) {
              sa.setEmailContentType((EmailContentType)EmailContentTypeHash.get(Integer.valueOf(sa.getEmailType().getContentTypeID())));
            }
          }
          taskList.add(sa);
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return taskList;
  }
  
  public String UpdateEmail(long EmailID, int StatusID)
    throws SQLException, ClassNotFoundException, NullPointerException
  {
    String Message = "Failure";
    String sql = "";
    log.debug(sql);
    PreparedStatement pstmt = null;
    PreparedStatement pstmt2 = null;
    ResultSet rs = null;
    try
    {
      sql = " Update TEM_TBLEMAILS Set EMS_STATUSID=" + StatusID + "  Where EM_EMAILID = " + EmailID;
      log.debug(sql);
      pstmt2 = this.conn.prepareStatement(sql);
      int update = pstmt2.executeUpdate();
      if (update > 0) {
        Message = "Success";
      } else {
        Message = "Could not able to update database.";
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
        if (pstmt2 != null) {
          pstmt2.close();
        }
      }
      catch (Exception localException) {}
    }
    return Message;
  }
  
  public EmailList getEmailList(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    EmailList sa = new EmailList();
    if (ID > 0)
    {
      String sql = " SELECT  EL_LISTID, EL_LISTNAME, EL_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILLISTS  Where EL_LISTID =" + 
      
        ID + " order by EL_LISTNAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new EmailList(rs.getInt("EL_LISTID"), rs.getString("EL_LISTNAME"), rs.getInt("EL_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public ArrayList getEmailLists(String name)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ArrayList taskList = new ArrayList();
    EmailList sa = null;
    
    String sql = " SELECT  EL_LISTID, EL_LISTNAME, EL_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILLISTS  Where 1=1 ";
    if ((name != null) && (name.length() > 0)) {
      sql = sql + " and EL_LISTNAME like '%" + name + "%'";
    }
    sql = sql + " order by EL_LISTNAME";
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          sa = new EmailList(rs.getInt("EL_LISTID"), rs.getString("EL_LISTNAME"), rs.getInt("EL_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          
          taskList.add(sa);
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return taskList;
  }
  
  public ListEmail getListEmail(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ListEmail sa = new ListEmail();
    if (ID > 0)
    {
      String sql = " SELECT  ELA_EMAILID, EL_LISTID, ELA_EMAIL, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLLISTEMAILS  Where ELA_EMAILID =" + 
      
        ID + " order by ELA_EMAIL ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sa = new ListEmail(rs.getInt("ELA_EMAILID"), rs.getInt("EL_LISTID"), rs.getString("ELA_EMAIL"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          
          sa.setEmailList(getEmailList(sa.getListID()));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public ArrayList getListEmails(String name, int listID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ArrayList taskList = new ArrayList();
    ListEmail sa = null;
    
    String sql = " SELECT  ELA_EMAILID, EL_LISTID, ELA_EMAIL, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLLISTEMAILS  Where 1=1 ";
    if ((name != null) && (name.length() > 0)) {
      sql = sql + " and ELA_EMAIL like '%" + name + "%'";
    }
    if (listID > 0) {
      sql = sql + " and EL_LISTID = " + listID;
    }
    sql = sql + " order by ELA_EMAIL";
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          sa = new ListEmail(rs.getInt("ELA_EMAILID"), rs.getInt("EL_LISTID"), rs.getString("ELA_EMAIL"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          
          sa.setEmailList(getEmailList(sa.getListID()));
          
          taskList.add(sa);
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return taskList;
  }
  
  public EmailContentType getEmailContentType(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    EmailContentType sa = new EmailContentType();
    if (ID > 0)
    {
      String sql = " SELECT  ECT_CONTENTTYPEID, ECT_CONTENTTYPEDESC, ECT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILCONTENTTYPES  Where ECT_CONTENTTYPEID =" + 
      
        ID + " order by ECT_CONTENTTYPEDESC ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new EmailContentType(rs.getInt("ECT_CONTENTTYPEID"), rs.getString("ECT_CONTENTTYPEDESC"), rs.getInt("ECT_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public ArrayList getEmailContentTypes(String Desc)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ArrayList taskList = new ArrayList();
    EmailContentType sa = null;
    
    String sql = " SELECT  ECT_CONTENTTYPEID, ECT_CONTENTTYPEDESC, ECT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILCONTENTTYPES  Where 1=1 ";
    if ((Desc != null) && (Desc.length() > 0)) {
      sql = sql + " and ECT_CONTENTTYPEDESC like '%" + Desc + "%'";
    }
    sql = sql + " order by ECT_CONTENTTYPEDESC";
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          sa = new EmailContentType(rs.getInt("ECT_CONTENTTYPEID"), rs.getString("ECT_CONTENTTYPEDESC"), rs.getInt("ECT_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          taskList.add(sa);
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return taskList;
  }
  
  public EmailStatus getEmailStatus(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    EmailStatus sa = new EmailStatus();
    if (ID > 0)
    {
      String sql = " SELECT  EMS_STATUSID, EMS_STATUSNAME, EMS_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILSTATUS  Where EMS_STATUSID =" + 
      
        ID + " order by EMS_STATUSNAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new EmailStatus(rs.getInt("EMS_STATUSID"), rs.getString("EMS_STATUSNAME"), rs.getInt("EMS_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public ArrayList getEmailStatuses(String name)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ArrayList taskList = new ArrayList();
    EmailStatus sa = null;
    
    String sql = " SELECT  EMS_STATUSID, EMS_STATUSNAME, EMS_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILSTATUS  Where 1=1 ";
    if ((name != null) && (name.length() > 0)) {
      sql = sql + " and EMS_STATUSNAME like '%" + name + "%'";
    }
    sql = sql + " order by EMS_STATUSNAME";
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          sa = new EmailStatus(rs.getInt("EMS_STATUSID"), rs.getString("EMS_STATUSNAME"), rs.getInt("EMS_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          taskList.add(sa);
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return taskList;
  }
  
  public ArrayList getAlertEmails(String alertCode)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ArrayList taskList = new ArrayList();
    AlertEmails sa = null;
    




    String sql = " select EA.EMT_TYPEID,EA_ALERTID,EA_ALERTCODE,EMT_DAYSBEFORE,EMT_DAYSAFTER   FROM TEM_TBLEMAILALERTS EA,TEM_TBLEMAILTYPES ET   where EA.EMT_TYPEID=ET.EMT_TYPEID and EA.EA_ISDISABLED=0 and EMT_ISDISABLED=0   ";
    if ((alertCode != null) && (alertCode.length() > 0)) {
      sql = sql + " and EA_ALERTCODE like '%" + alertCode + "%'";
    }
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          sa = new AlertEmails(rs.getInt("EA_ALERTID"), rs.getInt("EMT_TYPEID"), rs.getString("EA_ALERTCODE"), 
            rs.getInt("EMT_DAYSBEFORE"), rs.getInt("EMT_DAYSAFTER"));
          


          taskList.add(sa);
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(" Exception :" + ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException2) {}
    }
    return taskList;
  }
  
  public String addCloseServiceAlert()
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    String Message = "Failure";
    ApplicationConfig conf = loadConf();
    ArrayList taskList = new ArrayList();
    ExpireServiceAlert esa = new ExpireServiceAlert();
    String sql = " select c.CUS_REFNO,c.CUS_NAME,ac.AC_ACCTHOLDERNAME,ac.ac_accountno,s.SVE_SERVICENAME,ss.SS_SUBSRVID,st.SSS_STATEDESC,ss.SVE_SERVICEID ,sc.SSFC_RECAMOUNT-sc.SSFC_DISCOUNT as recamount,SS_EXPIRYDATE from SM_TBLSUBSSERVICES ss,SM_TBLACCOUNTS ac,SM_TBLSUBSCRIBERS sub ,SM_TBLCUSTOMERS c,SM_TBLSUBSVESTATES st,SER_TBLSERVICES s,SM_TBLSSFIXCHARGES sc,SM_TBLSMHISTORY sh   where ss.SVE_SERVICEID=s.SVE_SERVICEID  and sc.SS_SUBSRVID=ss.SS_SUBSRVID and ss.SUB_SUBSCRIBERID=sub.SUB_SUBSCRIBERID  and sub.AC_ACCOUNTNO=ac.AC_ACCOUNTNO and ac.cus_customerid=c.cus_customerid and ss.SS_SUBSRVID=sh.SMH_OWNERID and sh.SMOT_TYPEID=5 and sh.SMH_STATEID=st.SSS_STATEID ";
    


    sql = sql + " and st.SSS_ISCHARGEABLE=0 and sh.SU_INSERTDATE>sysdate-1";
    








    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start)
      {
        Message = "<html><head><title>  </title></head><body><table border='0' width='80%' align='center'>  <tr><td colspan=10> </td></tr>  <tr><td colspan=10>&nbsp;</td></tr> ";
        




        Message = Message + " <tr><td colspan=10> Follwing Services were terminated in last 24 hours</td></tr> ";
        Message = Message + " <tr><td colspan=10>&nbsp;</td></tr> ";
        Message = Message + " <tr><td colspan=10>&nbsp;</td></tr> ";
        Message = Message + " <tr><td><b>#</b></td><td><b>Customer Name</b></td><td><b>SAP No</b></td><td><b>Account Name</b></td><td><b>Account No</b></td><td><b>Service Name</b></td><td><b>Service No</b></td><td><b>Rec Amount</b></td><td><b>Status</b></td></tr>";
        





        int count = 0;
        while (start)
        {
          count++;
          Message = Message + " <tr><td>" + (count + 1) + "</td><td>" + rs.getString("CUS_NAME") + "</td><td>" + rs.getString("CUS_REFNO") + "</td><td>" + rs.getString("AC_ACCTHOLDERNAME") + "</td><td>" + rs.getLong("ac_accountno") + "</td><td>" + rs.getString("SVE_SERVICENAME") + "</td><td>" + rs.getLong("SS_SUBSRVID") + "</td><td>" + rs.getDouble("recamount") + "</td><td>" + rs.getString("SSS_STATEDESC") + "</td></tr>";
          










          start = rs.next();
        }
        Message = Message + "</table></body></html>";
        





        log.debug("Email Message :" + Message);
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException) {}
    }
    return Message;
  }
  
  public String addCloseDSLServiceAlert()
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    String Message = "Failure";
    ApplicationConfig conf = loadConf();
    ArrayList taskList = new ArrayList();
    ExpireServiceAlert esa = new ExpireServiceAlert();
    String sql = " select c.CUS_REFNO,c.CUS_NAME,ac.AC_ACCTHOLDERNAME,ac.ac_accountno,s.SVE_SERVICENAME,ss.SS_SUBSRVID,ss.SVE_SERVICEID ,sc.SSFC_RECAMOUNT-sc.SSFC_DISCOUNT as recamount,SS_EXPIRYDATE,SST_DSLNUMBER from SM_TBLSUBSSERVICES ss,SM_TBLACCOUNTS ac,SM_TBLSUBSCRIBERS sub ,SM_TBLCUSTOMERS c,SER_TBLSERVICES s,SM_TBLSSFIXCHARGES sc,SM_TBLSSTECHNICALS stech   where ss.SVE_SERVICEID=s.SVE_SERVICEID and s.SG_GROUPID=21 and sc.SS_SUBSRVID=ss.SS_SUBSRVID and ss.SS_SUBSRVID=stech.SS_SUBSRVID and ss.SUB_SUBSCRIBERID=sub.SUB_SUBSCRIBERID  and sub.AC_ACCOUNTNO=ac.AC_ACCOUNTNO and ac.cus_customerid=c.cus_customerid and c.CT_TYPEID in (select CT_TYPEID from SM_TBLCUSTOMERTYPES where CT_ISCORPORATE=0) and ac.AC_CURRENTBALANCE<0 ";
    


    sql = sql + " and ss.SS_SUBSSVSTATEID>11 and ss.SS_SUBSRVID not in (select SMH_OWNERID from SM_TBLSMHISTORY  where SU_INSERTDATE>sysdate-30 and SMH_STATEID<11 )  and ss.SS_SUBSRVID in  (select SMH_OWNERID from SM_TBLSMHISTORY  where SU_INSERTDATE between sysdate-31 and sysdate-30 and SMH_STATEID>11 )";
    









    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start)
      {
        String html = "";
        
        Message = "<html><head><title>  </title></head><body><table border='0' width='80%' align='center'>  <tr><td colspan=10> </td></tr>  <tr><td colspan=10>&nbsp;</td></tr> ";
        




        Message = Message + " <tr><td colspan=10> Follwing Services were terminated 30 days before</td></tr> ";
        Message = Message + " <tr><td colspan=10>&nbsp;</td></tr> ";
        Message = Message + " <tr><td colspan=10>&nbsp;</td></tr> ";
        Message = Message + " <tr><td><b>#</b></td><td><b>Customer Name</b></td><td><b>SAP No</b></td><td><b>Account Name</b></td><td><b>Account No</b></td><td><b>Service Name</b></td><td><b>Service No</b></td><td><b>Rec Amount</b></td><td><b>DSL No</b></td></tr>";
        
        int count = 0;
        while (start)
        {
          esa.setAC_ACCOUNTNO(rs.getLong("ac_accountno"));
          esa.setAC_ACCTHOLDERNAME(rs.getString("AC_ACCTHOLDERNAME"));
          esa.setCUS_NAME(rs.getString("CUS_NAME"));
          esa.setCUS_REFNO(rs.getString("CUS_REFNO"));
          esa.setSS_EXPIRYDATE(rs.getString("SS_EXPIRYDATE"));
          esa.setSS_SUBSRVID(rs.getLong("SS_SUBSRVID"));
          esa.setSSFC_RECAMOUNT(rs.getDouble("recamount"));
          esa.setSSS_STATEDESC("");
          esa.setSVE_SERVICENAME(rs.getString("SVE_SERVICENAME"));
          esa.setDSLNO(rs.getString("SST_DSLNUMBER"));
          taskList.add(esa);
          

          Message = Message + " <tr><td>" + (count + 1) + "</td><td>" + esa.getCUS_NAME() + "</td><td>" + esa.getCUS_REFNO() + "</td><td>" + esa.getAC_ACCTHOLDERNAME() + "</td><td>" + esa.getAC_ACCOUNTNO() + "</td><td>" + esa.getSVE_SERVICENAME() + "</td><td>" + esa.getSS_SUBSRVID() + "</td><td>" + esa.getSSFC_RECAMOUNT() + "</td><td>" + esa.getDSLNO() + "</td></tr>";
          count++;
          start = rs.next();
        }
        Message = Message + "</table></body></html>";
        





        log.debug("Email Message :" + Message);
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException) {}
    }
    return Message;
  }
  
  public String addBillDateAlert(int daysAfter, int daysBefore)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    String Message = "Failure";
    ApplicationConfig conf = loadConf();
    ArrayList taskList = new ArrayList();
    NextBillServiceAlert esa = new NextBillServiceAlert();
    String sql = " select c.CUS_REFNO,c.CUS_NAME,ac.AC_ACCTHOLDERNAME,ac.ac_accountno,s.SVE_SERVICENAME,ss.SS_SUBSRVID,st.SSS_STATEDESC,ss.SVE_SERVICEID ,sc.SSFC_RECAMOUNT-sc.SSFC_DISCOUNT as recamount,SS_BILLSTARTDATE,AS_TODATE from SM_TBLSUBSSERVICES ss,SM_TBLACCOUNTS ac,SM_TBLSUBSCRIBERS sub ,SM_TBLCUSTOMERS c,SM_TBLSUBSVESTATES st,SER_TBLSERVICES s,SM_TBLSSFIXCHARGES sc, pm_tblacctsubinvoices si   where ss.SVE_SERVICEID=s.SVE_SERVICEID and ss.SS_SUBSSVSTATEID=st.SSS_STATEID and sc.SS_SUBSRVID=ss.SS_SUBSRVID and ss.SS_SUBSRVID = si.SS_SUBSRVID(+) and ss.SUB_SUBSCRIBERID=sub.SUB_SUBSCRIBERID  and sub.AC_ACCOUNTNO=ac.AC_ACCOUNTNO and ac.cus_customerid=c.cus_customerid ";
    if (daysBefore > 0) {
      sql = sql + "and ((SS_BILLSTARTDATE >sysdate-" + daysBefore + " and SS_BILLSTARTDATE<sysdate) or (AS_TODATE >sysdate-" + daysBefore + " and AS_TODATE<sysdate))";
    }
    if (daysAfter > 0) {
      sql = sql + "and ((SS_BILLSTARTDATE between sysdate and sysdate+" + daysAfter + ") or (AS_TODATE between sysdate and sysdate+" + daysAfter + ")) ";
    }
    sql = sql + " order by AS_TODATE ";
    
    log.debug(sql);
    
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start)
      {
        while (start)
        {
          String BillingStartDate = rs.getString("SS_BILLSTARTDATE");
          String NextBillDate = rs.getString("AS_TODATE");
          if (rs.wasNull()) {
            NextBillDate = "";
          }
          String NextBilling = "";
          
          Date curBillingStartDate = null;
          if (NextBillDate.length() > 0) {
            curBillingStartDate = getDateFromString(NextBillDate).getTime();
          } else {
            NextBilling = BillingStartDate;
          }
          Date orgBillingStartDate = getDateFromString(BillingStartDate).getTime();
          if (NextBilling.length() == 0) {
            if (curBillingStartDate.compareTo(orgBillingStartDate) >= 0) {
              NextBilling = NextBillDate;
            } else {
              NextBilling = BillingStartDate;
            }
          }
          esa.setAC_ACCOUNTNO(rs.getLong("ac_accountno"));
          esa.setAC_ACCTHOLDERNAME(rs.getString("AC_ACCTHOLDERNAME"));
          esa.setCUS_NAME(rs.getString("CUS_NAME"));
          esa.setCUS_REFNO(rs.getString("CUS_REFNO"));
          
          esa.setNextBillDate(NextBilling);
          
          esa.setSS_SUBSRVID(rs.getLong("SS_SUBSRVID"));
          esa.setSSFC_RECAMOUNT(rs.getDouble("recamount"));
          esa.setSSS_STATEDESC(rs.getString("SSS_STATEDESC"));
          esa.setSVE_SERVICENAME(rs.getString("SVE_SERVICENAME"));
          taskList.add(esa);
          start = rs.next();
        }
        EmailMessage emsg = new EmailMessage();
        Message = emsg.getServiceNextBillMessage(taskList, daysBefore, daysAfter, conf);
        
        log.debug("Email Message :" + Message);
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException) {}
    }
    return Message;
  }
  
  public ArrayList getNextBillEmails(int daysBefore)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    String Message = "Failure";
    
    ArrayList taskList = new ArrayList();
    NextBillServiceAlert esa = new NextBillServiceAlert();
    String sql = " select c.CUS_REFNO,c.CUS_NAME,ac.AC_ACCTHOLDERNAME,ac.ac_accountno,s.SVE_SERVICENAME,ss.SS_SUBSRVID,st.SSS_STATEDESC,ss.SVE_SERVICEID ,sc.SSFC_RECAMOUNT-sc.SSFC_DISCOUNT as recamount,AC_CURRENTBALANCE,SS_BILLSTARTDATE,AS_TODATE from SM_TBLSUBSSERVICES ss,SM_TBLACCOUNTS ac,SM_TBLSUBSCRIBERS sub ,SM_TBLCUSTOMERS c,SM_TBLSUBSVESTATES st,SER_TBLSERVICES s,SM_TBLSSFIXCHARGES sc, pm_tblacctsubinvoices si   where ss.SVE_SERVICEID=s.SVE_SERVICEID and s.SG_GROUPID=21 and ss.SS_SUBSSVSTATEID=st.SSS_STATEID and sc.SS_SUBSRVID=ss.SS_SUBSRVID and ss.SS_SUBSRVID = si.SS_SUBSRVID(+) and ss.SUB_SUBSCRIBERID=sub.SUB_SUBSCRIBERID  and sub.AC_ACCOUNTNO=ac.AC_ACCOUNTNO and ac.cus_customerid=c.cus_customerid and c.CT_TYPEID in (select CT_TYPEID from SM_TBLCUSTOMERTYPES where CT_ISCORPORATE=0) and s.SVE_SERVICEID<>152 and ss.SS_SUBSSVSTATEID<10";
    if (daysBefore > 0) {
      sql = sql + " and ((SS_BILLSTARTDATE  >sysdate+5 and  SS_BILLSTARTDATE<sysdate+" + daysBefore + ") or (AS_TODATE > sysdate+5 and AS_TODATE <sysdate+" + daysBefore + "))";
    }
    sql = sql + " order by AS_TODATE ";
    
    log.debug(sql);
    

    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          String BillingStartDate = rs.getString("SS_BILLSTARTDATE");
          if (rs.wasNull()) {
            BillingStartDate = "";
          }
          String NextBillDate = rs.getString("AS_TODATE");
          if (rs.wasNull()) {
            NextBillDate = "";
          }
          double balance = rs.getDouble("AC_CURRENTBALANCE");
          double recamount = rs.getDouble("recamount");
          
          double balanceAfter = balance + recamount;
          
          String NextBilling = "";
          
          Date curBillingStartDate = null;
          if (NextBillDate.length() > 0) {
            curBillingStartDate = getDateFromString(NextBillDate).getTime();
          } else {
            NextBilling = BillingStartDate;
          }
          Date orgBillingStartDate = new Date();
          if (BillingStartDate.length() > 0) {
            orgBillingStartDate = getDateFromString(BillingStartDate).getTime();
          }
          if (NextBilling.length() == 0) {
            if (curBillingStartDate.compareTo(orgBillingStartDate) >= 0) {
              NextBilling = NextBillDate;
            } else {
              NextBilling = BillingStartDate;
            }
          }
          esa.setAC_ACCOUNTNO(rs.getLong("ac_accountno"));
          esa.setAC_ACCTHOLDERNAME(rs.getString("AC_ACCTHOLDERNAME"));
          esa.setCUS_NAME(rs.getString("CUS_NAME"));
          esa.setCUS_REFNO(rs.getString("CUS_REFNO"));
          
          esa.setNextBillDate(NextBilling);
          
          esa.setSS_SUBSRVID(rs.getLong("SS_SUBSRVID"));
          esa.setSSFC_RECAMOUNT(rs.getDouble("recamount"));
          esa.setSSS_STATEDESC(rs.getString("SSS_STATEDESC"));
          esa.setSVE_SERVICENAME(rs.getString("SVE_SERVICENAME"));
          taskList.add(esa);
          if (balanceAfter < 0.0D)
          {
            SubscriberIdentification ident = getSubscriberIdentificationBySubServiceID(rs.getLong("SS_SUBSRVID"), 4);
            String UserName = ident.getIdentification();
            if (UserName.length() > 0)
            {
              if (UserName.indexOf("@") > -1)
              {
                log.info("UserNameb=" + UserName);
                UserName = UserName.substring(0, UserName.indexOf("@"));
                log.info("UserName=" + UserName);
              }
              String Email = UserName + "@cyber.net.pk";
              
              String Subject = " for Account No. " + rs.getLong("ac_accountno");
              
              log.info("Email=" + Email);
              
              EmailAlert ea = getEmailAlertCode("SERVICE-PTREMINDER");
              if ((ea.getAlertID() > 0) && (ea.getisDisabled() == 0) && (ea.getEmailTypeID() > 0))
              {
                EmailMessage emsg = new EmailMessage();
                String EmailMsg = "";
                String html = "";
                
                EmailMsg = "<html><head><title>  </title></head><body> ";
                


                EmailMsg = "Dear Customer,<br><br><br> This is to remind you that your payment date is near to reach. Please recharge your account before billing date to avoid any service interruption. <br><br> You can check your usage from the customer self care section (http://billing.cyber.net.pk) available on our website.<br><br> Please note that if your account is suspended due to non-payment for 30 days, it will be terminated without any further notification. <br><br> For further queries please feel free to call us at UAN 111-44-55-66.<br><br> For technical support call UAN 111-56-56-56 <br><br> Sincerely,<br> Consumer Sales <br><br><br> Note If you are making payment through cheque, please make all cheques in favor of Cyber Internet Services (Pvt.) Ltd. and write the account number at the back of the Cheque.<br><br> In Case you have already made payment kindly ignore this message.  <br><br><br>  **** This Email has been automatically generated by the System **** ";
                EmailMsg = EmailMsg + "</body></html>";
                try
                {
                  String outputmsg = insertEmailRequestNew(ea.getEmailTypeID(), Email, EmailMsg, 1L, "System", Subject);
                  log.debug("Email Message :" + outputmsg);
                }
                catch (Exception ex2)
                {
                  log.error(ex2);
                }
              }
            }
          }
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    return taskList;
  }
  
  public String getReminderEmails(int daysAfter)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    String Message = "Failure";
    
    int From = daysAfter;
    int To = daysAfter + 1;
    


    String sql = " select c.CUS_REFNO,c.CUS_NAME,ac.AC_ACCTHOLDERNAME,ac.ac_accountno,s.SVE_SERVICENAME,ss.SS_SUBSRVID,st.SSS_STATEDESC,ss.SVE_SERVICEID ,sc.SSFC_RECAMOUNT-sc.SSFC_DISCOUNT as recamount,SS_BILLSTARTDATE,AS_TODATE from SM_TBLSUBSSERVICES ss,SM_TBLACCOUNTS ac,SM_TBLSUBSCRIBERS sub ,SM_TBLCUSTOMERS c,SM_TBLSUBSVESTATES st,SER_TBLSERVICES s,SM_TBLSSFIXCHARGES sc, pm_tblacctsubinvoices si   where ss.SVE_SERVICEID=s.SVE_SERVICEID and s.SG_GROUPID=21 and ss.SS_SUBSSVSTATEID=st.SSS_STATEID and sc.SS_SUBSRVID=ss.SS_SUBSRVID and ss.SS_SUBSRVID = si.SS_SUBSRVID(+) and ss.SUB_SUBSCRIBERID=sub.SUB_SUBSCRIBERID  and sub.AC_ACCOUNTNO=ac.AC_ACCOUNTNO and ac.cus_customerid=c.cus_customerid and c.CT_TYPEID in (select CT_TYPEID from SM_TBLCUSTOMERTYPES where CT_ISCORPORATE=0) and s.SVE_SERVICEID<>152 and ac.AC_CURRENTBALANCE<0 and ss.SS_SUBSSVSTATEID<10 ";
    if (daysAfter > 0) {
      sql = sql + " and si.AS_FROMDATE<sysdate-" + From + " and  si.AS_FROMDATE>sysdate-" + To + "  ";
    }
    sql = sql + " order by si.AS_FROMDATE ";
    
    log.debug(sql);
    

    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          String Subject = " for Account No. " + rs.getLong("ac_accountno");
          SubscriberIdentification ident = getSubscriberIdentificationBySubServiceID(rs.getLong("SS_SUBSRVID"), 4);
          String UserName = ident.getIdentification();
          if (UserName.length() > 0)
          {
            if (UserName.indexOf("@") > -1)
            {
              log.info("UserNameb=" + UserName);
              UserName = UserName.substring(0, UserName.indexOf("@"));
              log.info("UserName=" + UserName);
            }
            String Email = UserName + "@cyber.net.pk";
            
            log.info("Email=" + Email);
            



            EmailAlert ea = getEmailAlertCode("SERVICE-REMINDER");
            if ((ea.getAlertID() > 0) && (ea.getisDisabled() == 0) && (ea.getEmailTypeID() > 0))
            {
              EmailMessage emsg = new EmailMessage();
              String EmailMsg = "";
              String html = "";
              

              EmailMsg = "<html><head><title>  </title></head><body> ";
              


              EmailMsg = "Dear Customer,<br><br><br> This is to remind you that your payment date has reached. Please recharge your account before deactivation of service. <br><br> You can check your usage from the customer self care section (http://terminusapp2.cyber.net.pk/tbssc) available on our website. Please note that if your account is suspended due to non-payment for 30 days, it will be terminated without any further notification.<br><br> For further queries please feel free to call us at UAN 111-44-55-66. <br><br> For technical support call UAN 111-56-56-56 <br><br> Sincerely,<br> Consumer Sales <br><br><br> Note If you are making payment through cheque, please make all cheques in favor of Cyber Internet Services (Pvt.) Ltd. and write the account number at the back of the Cheque. <br><br> In Case you have already made payment kindly ignore this message. <br><br><br>  **** This Email has been automatically generated by the System **** ";
              EmailMsg = EmailMsg + "</body></html>";
              try
              {
                String outputmsg = insertEmailRequestNew(ea.getEmailTypeID(), Email, EmailMsg, 1L, "System", Subject);
                log.debug("Email Message :" + outputmsg);
              }
              catch (Exception ex2)
              {
                log.error(ex2);
              }
            }
          }
          start = rs.next();
        }
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException1) {}
    }
    return Message;
  }
  
  /*public String getPaymentReminderEmails(int daysAfter)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    String Message = "Failure";
    
    int From = daysAfter;
    int To = daysAfter + 1;
    
    String sql = " select max(to_char(ai_generationdate,'dd-Mon-yyyy')) as ai_generationdate ,sum(ai_invoiceamnt) as ai_invoiceamnt ,ai_invoicecustrefno,max(to_char(ai_duedate,'dd-Mon-yyyy'))  as ai_duedate ,trunc(sysdate-ai_duedate) as noofdays,c.cus_customerid,CUS_EMAIL  from pm_tblacctinvoices ai,sm_tblcustomers c \twhere AI_ISCUSTOMERINV=1 and ai_invoiceid in (select ai_invoiceid from pm_tblacctsubinvoices where AS_ADJUSTABLEAMOUNT >0) and c.CUS_CUSTOMERID=ai.CUS_CUSTOMERID  and ai_duedate<sysdate-" + 
    

      From + " and ai_duedate>sysdate-" + To + " " + 
      " group by  ai_invoicecustrefno,trunc(sysdate-ai_duedate),c.cus_customerid,CUS_EMAIL ";
    
    log.debug(sql);
    

    PreparedStatement pstmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt1 = null;
    ResultSet rs1 = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      if (start) {
        while (start)
        {
          String invoiceDate = rs.getString("ai_generationdate");
          String invoiceDueDate = rs.getString("ai_duedate");
          double invoiceAmount = rs.getDouble("ai_invoiceamnt");
          String invoiceNumber = rs.getString("ai_invoicecustrefno");
          long customerID = rs.getLong("cus_customerid");
          String email = rs.getString("CUS_EMAIL");
          if (rs.wasNull()) {
            email = "";
          }
          int noofDays = rs.getInt("noofdays");
          sql = "select sum(AC_CURRENTBALANCE) as dueAmount from sm_tblaccounts where cus_customerid=" + customerID + " and AC_ISCUSTOMERBILL=1 ";
          pstmt1 = this.conn.prepareStatement(sql);
          rs1 = pstmt1.executeQuery();
          double dueAmount = 0.0D;
          if (rs1.next()) {
            dueAmount = rs1.getDouble("dueAmount");
          }
          rs1.close();
          pstmt1.close();
          if (dueAmount < 0.0D)
          {
            dueAmount *= -1.0D;
            
            EmailAlert ea = getEmailAlertCode("INVOICE-REMINDER");
            if ((ea.getAlertID() > 0) && (ea.getisDisabled() == 0) && (ea.getEmailTypeID() > 0) && (email.length() > 1))
            {
              EmailMessage emsg = new EmailMessage();
              String EmailMsg = "";
              String html = "";
              

              EmailMsg = "<html><head><title>  </title></head><body> ";
              


              EmailMsg = "Dear Valued Customer,<br><br><br> Your due date for payment has passed. Kindly make your payment according to the record mentioned below. If you have already made the payment than please disregard this email notice. <br><br> We currently hold the following record for you: <br><br> Invoice Date: " + invoiceDate + " <br>" + 
                "Invoice Amount:" + invoiceAmount + "<br>" + 
                "Invoice Number:" + invoiceNumber + "<br>" + 
                "Total outstanding amount:" + dueAmount + "<br>" + 
                
                "Due date for Payment:" + invoiceDueDate + "<br>" + 
                "Over Due days:" + noofDays + "<br><br> ";
              if (daysAfter == 45) {
                EmailMsg = EmailMsg + " <b>Accounts overdue by more than 45 days can be marked for suspension; please call or email us to intimate your payment status in order to avoid any inconvenience</b> ";
              }
              EmailMsg = EmailMsg + " For any further information, please contact Revenue Assurance Department @ 111-44-55-66 or write us at revenue.assurance@cyber.net.pk. It would be our pleasure to help you in case any further assistance is required. <br><br> Thank you in advance for your kind cooperation in this regard. <br><br> Kind Regards,<br><br><b> Revenue Assurance Department</b> <br>Cyber Internet Services (Pvt.) Ltd <br><br> (This is a system generated email and does not require any signature) ";
              EmailMsg = EmailMsg + "</body></html>";
              try
              {
                String outputmsg = insertEmailRequestNew(ea.getEmailTypeID(), email, EmailMsg, 1L, "System", "");
                log.debug("Email Message :" + outputmsg);
              }
              catch (Exception ex2)
              {
                log.error(ex2);
              }
            }
          }
          start = rs.next();
        }
      }
      rs.close();
      pstmt.close();
      
      sql = " select to_char(ai_generationdate,'dd-Mon-yyyy') as ai_generationdate ,ai_invoiceamnt  ,ai_invoicecustrefno,to_char(ai_duedate,'dd-Mon-yyyy')  as ai_duedate ,trunc(sysdate-ai_duedate) as noofdays,acct.ac_accountno,AC_EMAIL,AC_CURRENTBALANCE  from pm_tblacctinvoices ai,sm_tblaccounts acct \twhere AI_ISCUSTOMERINV=0 and ai_invoiceid in (select ai_invoiceid from pm_tblacctsubinvoices where AS_ADJUSTABLEAMOUNT >0) and acct.ac_accountno=ai.ac_accountno and ai_duedate<sysdate-" + 
      

        From + " and ai_duedate>sysdate-" + To + " ";
      

      log.debug(sql);
      


      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      start = rs.next();
      if (start) {
        while (start)
        {
          String invoiceDate = rs.getString("ai_generationdate");
          String invoiceDueDate = rs.getString("ai_duedate");
          double invoiceAmount = rs.getDouble("ai_invoiceamnt");
          String invoiceNumber = rs.getString("ai_invoicecustrefno");
          
          String email = rs.getString("AC_EMAIL");
          if (rs.wasNull()) {
            email = "";
          }
          int noofDays = rs.getInt("noofdays");
          

          double dueAmount = rs.getDouble("AC_CURRENTBALANCE");
          if (dueAmount < 0.0D)
          {
            dueAmount *= -1.0D;
            
            EmailAlert ea = getEmailAlertCode("INVOICE-REMINDER");
            if ((ea.getAlertID() > 0) && (ea.getisDisabled() == 0) && (ea.getEmailTypeID() > 0) && (email.length() > 1))
            {
              EmailMessage emsg = new EmailMessage();
              String EmailMsg = "";
              String html = "";
              

              EmailMsg = "<html><head><title>  </title></head><body> ";
              


              EmailMsg = "Dear Valued Customer,<br><br><br> Your due date for payment has passed. Kindly make your payment according to the record mentioned below. If you have already made the payment than please disregard this email notice. <br><br> We currently hold the following record for you: <br><br> Invoice Date: " + invoiceDate + " <br>" + 
                "Invoice Amount:\t" + invoiceAmount + "<br>" + 
                "Invoice Number:\t" + invoiceNumber + "<br>" + 
                "Total outstanding amount:\t" + dueAmount + "<br>" + 
                
                "Due date for Payment:\t" + invoiceDueDate + "<br>" + 
                "Over Due days:\t" + noofDays + "<br><br> ";
              if (daysAfter == 45) {
                EmailMsg = EmailMsg + " Accounts overdue by more than 45 days can be marked for suspension; please call or email us to intimate your payment status in order to avoid any inconvenience ";
              }
              EmailMsg = EmailMsg + " For any further information, please contact Revenue Assurance Department @ 111-44-55-66 or write us at revenue.assurance@cyber.net.pk. It would be our pleasure to help you in case any further assistance is required. <br><br> Thank you in advance for your kind cooperation in this regard. <br><br> Kind Regards,<br><br> Revenue Assurance Department <br>Cyber Internet Services (Pvt.) Ltd <br><br> (This is a system generated email and does not require any signature) ";
              EmailMsg = EmailMsg + "</body></html>";
              try
              {
                String outputmsg = insertEmailRequestNew(ea.getEmailTypeID(), email, EmailMsg, 1L, "System", "");
                log.debug("Email Message :" + outputmsg);
              }
              catch (Exception ex2)
              {
                log.error(ex2);
              }
            }
          }
          start = rs.next();
        }
      }
      rs.close();
      pstmt.close();
    }
    catch (SQLException ex)
    {
      ex.printStackTrace();
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception ex1)
      {
        ex1.printStackTrace();
      }
    }
    return Message;
  }*/
  
  public String getPaymentReminderEmails(int daysAfter,String EmailText,String smsText)
		    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
		  { 
	        
			
	        String Message = "Failure";
		    int From = daysAfter;
		    int To = daysAfter + 1;
		    
		    String sql = " select to_char(ai_generationdate,'dd-Mon-yyyy') as ai_generationdate ,ai_invoiceamnt  ," +
		    		" ai_invoicecustrefno,to_char(ai_duedate,'dd-Mon-yyyy')  as ai_duedate ,trunc(sysdate-ai_duedate) as noofdays," +
		    		" acct.ac_accountno,AC_ACCTHOLDERNAME,AC_STORMCELLNUMBER,AC_EMAIL,AC_CURRENTBALANCE  from pm_tblacctinvoices ai,sm_tblaccounts acct " +
		    		" where AI_ISCUSTOMERINV=0 " +
		    		" and ai_invoiceid in (select ai_invoiceid from pm_tblacctsubinvoices where AS_ADJUSTABLEAMOUNT >0) " +
		    		" and acct.ac_accountno=ai.ac_accountno and ai_generationdate<sysdate-"+From+" and ai_generationdate>sysdate-"+To+" ";
		    
		    log.debug(sql);
		    
		    PreparedStatement pstmt = null;
		    ResultSet rs = null;
		    try{
		      pstmt = this.conn.prepareStatement(sql);
		      rs = pstmt.executeQuery();
		      boolean start = rs.next();
		      if (start){
		    	  while (start){
			          String invoiceDate = rs.getString("ai_generationdate");
			          String invoiceDueDate = rs.getString("ai_duedate");
			          double invoiceAmount = rs.getDouble("ai_invoiceamnt");
			          String invoiceNumber = rs.getString("ai_invoicecustrefno");
			          String Name = rs.getString("AC_ACCTHOLDERNAME");
			          long Recipient = rs.getLong("AC_STORMCELLNUMBER");
			          String email = rs.getString("AC_EMAIL");
			          if (rs.wasNull()){
			            email = "";
			          }
			          int noofDays = rs.getInt("noofdays");
			          
			          
			          double dueAmount = rs.getDouble("AC_CURRENTBALANCE");
			          if (dueAmount < 0.0D){
			        	  	dueAmount *= -1.0D;
			        	  	String DueAmnt="0";
			        	  	DueAmnt= getDecimalFormatterInv(dueAmount);
			        	  	
			        	  	EmailAlert ea = getEmailAlertCode("INVOICE-REMINDER");
			        	  	if ((ea.getAlertID() > 0) && (ea.getisDisabled() == 0) && (ea.getEmailTypeID() > 0) && (email.length() > 1)){
			        	  		EmailMessage emsg = new EmailMessage();
			        	  		String EmailMsg = "";
			        	  		String html = "";
			              
			        	  		boolean SendSMS=true;
			        	  		boolean isSent=false;
			        	  		String EmailTextTemp =EmailText;
			        	  		EmailTextTemp=EmailTextTemp.replaceAll("\\bDueAmnt\\b",""+DueAmnt);
			        	  		EmailTextTemp=EmailTextTemp.replaceAll("\\binvoiceDate\\b",""+invoiceDate);
			        	  		EmailTextTemp=EmailTextTemp.replaceAll("\\binvoiceDueDate\\b",""+invoiceDueDate);
			        	  		EmailTextTemp=EmailTextTemp.replace("[","");
			        	  		EmailTextTemp=EmailTextTemp.replace("]","");
			        	  		
			        	  		EmailMsg = "<html><head><title> " +
			        	  				" </title></head><body> ";
			        	  		
			        	  		EmailMsg = EmailMsg + "Dear "+Name+",<br><br> "+EmailTextTemp+"<br><br>We hope you enjoy our service!<br><br><br>Best Wishes,<br>StormFiber Customer Care<br>111-1-STORM (78676)";
					             
			        	  		EmailMsg = EmailMsg + "</body></html>";
			        	  		//System.out.println(EmailMsg);
			        	  		try{
			        	  			String outputmsg= "";
			        	  			 outputmsg = insertEmailRequestNew(ea.getEmailTypeID(), email, EmailMsg, 1L, "System", "");
			        	  			//log.debug("Email Message :" + outputmsg);
			        	  			if(SendSMS){
			        	  				String SMSText="";
			        	  				String smsTextTemp=smsText;
			        	  				smsTextTemp=smsTextTemp.replaceAll("\\bDueAmnt\\b",""+DueAmnt);
			        	  				smsTextTemp=smsTextTemp.replaceAll("\\binvoiceDate\\b",""+invoiceDate);
			        	  				smsTextTemp=smsTextTemp.replaceAll("\\binvoiceDueDate\\b",""+invoiceDueDate);
			        	  				EmailTextTemp=EmailTextTemp.replace("[","");
					        	  		EmailTextTemp=EmailTextTemp.replace("]","");
			        	  				SMSText="Dear "+Name+" "+smsTextTemp;
			        	  				
			        	  				SMSText = java.net.URLEncoder.encode(SMSText, "UTF-8");
			        	  				isSent = SendSMS(Recipient, SMSText);
			        	  				
			        	  				log.info("SMS Sent : "+isSent);
			        	  			}
			                
			        	  		}catch (Exception ex2){
			        	  			log.error(ex2);
			        	  		}
			        	  	}
			          	}
			          	start = rs.next();
			        }
		      	}
		    }catch (SQLException ex){
		      ex.printStackTrace();
		      throw ex;
		    }finally{
		      try{
		        if(rs != null){
		          rs.close();
		        }
		        if(pstmt != null){
		          pstmt.close();
		        }
		      }catch (Exception ex1){
		        ex1.printStackTrace();
		      }
		    }
		    return Message;
		  }
  
  public String getPartnerBalanceEmails(int type)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    String html = "Failure";
    
    String sql = "select PAR_PARTNERNAME,PAR_CURRENTBALANCE,PAR_ISPREPAID,PAR_CREDITLIMIT from PAR_TBLINTERCONNECTPARTNERS where PAR_CURRENTBALANCE<>0 and par_stopbalancealert=0 order by PAR_ISPREPAID desc,PAR_CURRENTBALANCE asc";
    





    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      boolean start = rs.next();
      log.debug(sql);
      if (start)
      {
        html = "<html><head><title></title></head><body><table border='1' width='70%' align='center'><tr><td><b>#</b></td><td><b>Carrier Name</b></td><td><b>Current Balance</b></td><td><b>Credit Limit</b></td><td><b>Remaining Balance</b></td><td><b>Status</b></td><td><b>Usage %</b></td></tr>";
        

        int count = 0;
        
        String color = "";
        while (start)
        {
          String Newtml = "";
          



          count++;
          String PAR_PARTNERNAME = rs.getString("PAR_PARTNERNAME");
          long PAR_CURRENTBALANCE = rs.getLong("PAR_CURRENTBALANCE");
          int PAR_ISPREPAID = rs.getInt("PAR_ISPREPAID");
          long PAR_CREDITLIMIT = rs.getLong("PAR_CREDITLIMIT");
          String Status = "";
          if (PAR_ISPREPAID == 1) {
            Status = "Pre-Paid";
          } else {
            Status = "Post-Paid";
          }
          if ((PAR_CURRENTBALANCE < 100L) && (PAR_CURRENTBALANCE > 0L) && (PAR_ISPREPAID == 1)) {
            color = "#0000FF";
          } else if ((PAR_CURRENTBALANCE < 0L) && (PAR_ISPREPAID == 1)) {
            color = "#FF0000";
          } else {
            color = "#FFFFFF";
          }
          double prect = 0.0D;
          String percentage = "-";
          long netBalance = PAR_CURRENTBALANCE + PAR_CREDITLIMIT;
          if ((PAR_ISPREPAID == 0) && (PAR_CURRENTBALANCE < 0L) && (PAR_CREDITLIMIT > 0L))
          {
            prect = PAR_CURRENTBALANCE * -1L * 100L / PAR_CREDITLIMIT;
            
            percentage = ""+prect;
            
            log.info("PartnerName=" + PAR_PARTNERNAME);
            log.info("PAR_CURRENTBALANCE=" + PAR_CURRENTBALANCE);
            log.info("PAR_CREDITLIMIT=" + PAR_CREDITLIMIT);
            log.info("percentage=" + percentage);
          }
          if (prect > 0.0D)
          {
            if (prect > 75.0D) {
              color = "#00FF00";
            }
            if (prect > 85.0D) {
              color = "#FFFF00";
            }
            if (prect > 90.0D) {
              color = "#FF0080";
            }
            if (prect > 95.0D) {
              color = "#FF0000";
            }
          }
          Newtml = Newtml + "<tr bgcolor='" + color + "'><td align='right'>" + count + "</td><td>" + PAR_PARTNERNAME + "</td><td align='right'>" + PAR_CURRENTBALANCE + "</td><td align='right'>" + PAR_CREDITLIMIT + "</td><td align='right'>" + netBalance + "</td><td>" + Status + "</td><td align='center'>" + percentage + "</td></tr>";
          
          html = html + Newtml;
          





          start = rs.next();
        }
        html = html + "</table></body></html>";
        log.debug("Message=" + html);
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException) {}
    }
    return html;
  }
  
  public EmailAlert getEmailAlertCode(String code)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    EmailAlert sa = new EmailAlert();
    if ((code != null) && (code.length() > 0))
    {
      String sql = " SELECT  EA_ALERTID, EMT_TYPEID, EA_ALERTCODE,  EA_ALERTNAME,EA_ALERTDESC,  EA_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from TEM_TBLEMAILALERTS  Where EA_ISDISABLED=0 and lower(EA_ALERTCODE) ='" + 
      
        code.toLowerCase() + "' ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new EmailAlert(rs.getInt("EA_ALERTID"), rs.getInt("EMT_TYPEID"), rs.getString("EA_ALERTCODE"), 
            rs.getString("EA_ALERTNAME"), rs.getString("EA_ALERTDESC"), rs.getInt("EA_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public String insertEmailRequest(int EmailTypeID, String toEmailAddress, String EmailMessage, long userid, String userip)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException, Exception
  {
    String Message = "Failure";
    if (EmailTypeID > 0)
    {
      String sql = "";
      PreparedStatement pstmt = null;
      PreparedStatement pstmt2 = null;
      ResultSet rs = null;
      try
      {
        EmailType et = getEmailType(EmailTypeID);
        Email em = new Email(0, EmailTypeID, 5, et.getFromAddress(), toEmailAddress, et.getCCList(), et.getBCCList(), 
          et.getSubject(), EmailMessage, 1, userid, userip, "");
        Message = addEmail(em);
        if (Message.equalsIgnoreCase("Success")) {
          Message = "Email Request is generated";
        } else {
          Message = "Could not able to update database.";
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ext)
      {
        throw ext;
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
          if (pstmt2 != null) {
            pstmt2.close();
          }
        }
        catch (Exception localException1) {}
      }
    }
    return Message;
  }
  
  public String insertEmailRequestNew(int EmailTypeID, String toEmailAddress, String EmailMessage, long userid, String userip, String Subject)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException, Exception
  {
    String Message = "Failure";
    if (EmailTypeID > 0)
    {
      String sql = "";
      PreparedStatement pstmt = null;
      PreparedStatement pstmt2 = null;
      ResultSet rs = null;
      try
      {
        EmailType et = getEmailType(EmailTypeID);
       Email em = new Email(0, EmailTypeID, 5, et.getFromAddress(), toEmailAddress, et.getCCList(), et.getBCCList(), 
          et.getSubject() + Subject, EmailMessage, 1, userid, userip, "");
        Message = addEmail(em);
        if (Message.equalsIgnoreCase("Success")) {
          Message = "Email Request is generated";
        } else {
          Message = "Could not able to update database.";
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ext)
      {
        throw ext;
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
          if (pstmt2 != null) {
            pstmt2.close();
          }
        }
        catch (Exception localException1) {}
      }
    }
    return Message;
  }
  
  public String addEmail(Email cr)
    throws SQLException, ClassNotFoundException, NullPointerException, Exception
  {
    String Message = "Failure";
    String sql = " SELECT 1 FROM TEM_TBLEMAILS WHERE EMT_TYPEID = " + cr.getTypeID() + "  ";
    
    PreparedStatement pstmt = null;
    PreparedStatement pstmt2 = null;
    ResultSet rs = null;
    
    try
    {
      sql = 
      

        " INSERT INTO TEM_TBLEMAILS  (EMT_TYPEID, EM_PRIORITY, EM_FROM, EM_TOLIST, EM_CCLIST, EM_BCCLIST, EM_SUBJECT, EM_MESSAGE, EMS_STATUSID, SU_SysUserID, SU_SysUserIP, SU_InsertDate)  VALUES (" + cr.getTypeID() + ", " + cr.getPriority() + ", '" + cr.getFrom() + "','" + cr.getToList() + "','" + cr.getCCList() + "','" + cr.getBCCList() + "','" + cr.getSubject() + "','" + cr.getMessage() + "'," + cr.getStatusID() + ",  " + "  " + cr.getSU_SysUserID() + ", '" + cr.getSU_SysUserIP() + "', sysdate )";
      

      pstmt2 = this.conn.prepareStatement(sql);
      int update = pstmt2.executeUpdate();
      if (update > 0) {
        Message = "Success";
      } else {
        Message = "Could not able to update database.";
      }
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ext)
    {
      throw ext;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
        if (pstmt2 != null) {
          pstmt2.close();
        }
      }
      catch (Exception localException1) {}
    }
    return Message;
  }
  
  public Customer getCustomer(long ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    return getCustomer(ID, true);
  }
  
  public Customer getCustomer(long ID, boolean detail)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    Customer sa = new Customer();
    boolean getHash = true;
    if (ID > 0L)
    {
      String sql = " SELECT  CUS_CUSTOMERID, CT_TYPEID, IT_TYPEID, CUS_REFNO, ST_TYPEID, CUS_NAME, CUS_EMAIL, CUS_WEB, CR_RegionID, CI_CITYID, ST_STATEID,  FBP_FIXEDPERIODID, CUS_TERMINATEDATE, CUS_CONTRACTREFNO, CUS_NOOFACCOUNTS, CUS_ACCTMANAGERID, CS_STATEID, FR_FRANCHISEEID, C_CURRENCYID,  CUS_ONLINEACCESS, CUS_PASSWORD, CUS_INVREMARKS, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLCUSTOMERS  Where CUS_CUSTOMERID =" + 
      


        ID + " order by CUS_NAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sa = new Customer(rs.getLong("CUS_CUSTOMERID"), rs.getInt("CT_TYPEID"), rs.getInt("IT_TYPEID"), rs.getString("CUS_REFNO"), 
            rs.getInt("ST_TYPEID"), rs.getString("CUS_NAME"), rs.getString("CUS_EMAIL"), rs.getString("CUS_WEB"), 
            rs.getInt("CR_RegionID"), rs.getInt("CI_CITYID"), rs.getInt("ST_STATEID"), rs.getInt("FBP_FIXEDPERIODID"), 
            rs.getString("CUS_TERMINATEDATE"), rs.getString("CUS_CONTRACTREFNO"), rs.getInt("CUS_NOOFACCOUNTS"), 
            rs.getInt("CUS_ACCTMANAGERID"), rs.getInt("CS_STATEID"), rs.getInt("FR_FRANCHISEEID"), rs.getInt("C_CURRENCYID"), rs.getInt("CUS_ONLINEACCESS"), 
            rs.getString("CUS_PASSWORD"), rs.getString("CUS_INVREMARKS"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          if (detail)
          {
            sa.setCustomerType(getCustomerType(sa.getCustomerTypeID()));
            sa.setIndustryType(getIndustryType(sa.getIndustryTypeID()));
            sa.setSalutationType(getSalutationType(sa.getSalutationTypeID()));
            sa.setCityRegion(getCityRegion(sa.getRegionID()));
            sa.setCity(getCity(sa.getCityID()));
            sa.setState(getState(sa.getStateID()));
            sa.setCustomerState(getCustomerState(sa.getCustomerStateID()));
          }
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public CustomerState getCustomerState(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    CustomerState sa = new CustomerState();
    if (ID > 0)
    {
      String sql = " SELECT  CS_STATEID, CS_STATEDESC, CS_ISVISIBLE, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLCUSTOMERSTATES  Where CS_STATEID =" + 
      
        ID + " order by CS_STATEDESC ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new CustomerState(rs.getInt("CS_STATEID"), rs.getString("CS_STATEDESC"), 
            rs.getInt("CS_ISVISIBLE"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public CustomerType getCustomerType(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    CustomerType sa = new CustomerType();
    if (ID > 0)
    {
      String sql = " SELECT  CT_TYPEID, CT_TYPENAME, CT_TYPEDESC, CT_ISFORALL,CT_ISCORPORATE , CT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLCUSTOMERTYPES  Where CT_TYPEID =" + 
      
        ID + " order by CT_TYPEDESC ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new CustomerType(rs.getInt("CT_TYPEID"), rs.getString("CT_TYPENAME"), rs.getString("CT_TYPEDESC"), rs.getInt("CT_ISFORALL"), rs.getInt("CT_ISCORPORATE"), 
            rs.getInt("CT_ISDISABLED"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public IndustryType getIndustryType(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    IndustryType sa = new IndustryType();
    if (ID > 0)
    {
      String sql = " SELECT  IT_TYPEID, IT_TYPENAME, IT_TYPEDESC,IT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLINDUSTRYTYPES  Where IT_TYPEID =" + 
      
        ID + " order by IT_TYPEDESC ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new IndustryType(rs.getInt("IT_TYPEID"), rs.getString("IT_TYPENAME"), rs.getString("IT_TYPEDESC"), 
            rs.getInt("IT_ISDISABLED"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public Account getAccount(long ID, boolean detail)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    Account sa = new Account();
    if (ID > 0L)
    {
      String sql = " SELECT  AC_ACCOUNTNO, CUS_CUSTOMERID, AC_ISPREPAID, AC_ISCUSTOMERBILL, ST_TYPEID, AC_ACCTHOLDERNAME, AC_EMAIL, PR_PRODUCTID, AC_CREDITLIMIT, AC_CURRENTBALANCE, AC_EQPSALESBALANCE, AC_SECURITYDEPOSIT, AC_ACTIVATIONDATE, AC_EXPIRYDATE, AC_NOOFSUBSCRIBERS, AS_ACCTSTATEID, FBP_FIXEDPERIODID, FR_FRANCHISEEID, SBP_POLICYID,  CR_REGIONID, CI_CITYID, ST_STATEID, CL_LOCATIONID, AC_TownName, AC_BRANCHCODE, AC_ONLINEACCESS, AC_PASSWORD, AC_INVREMARKS, AC_PRINTDISCOUNT, AC_DISABLEASIAMNT, C_CURRENCYID, AC_PRINTCUSTOMERNAME,   SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLACCOUNTS  Where AC_ACCOUNTNO =" + 
      





        ID + " order by AC_ACCTHOLDERNAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sa = new Account(rs.getLong("AC_ACCOUNTNO"), rs.getLong("CUS_CUSTOMERID"), rs.getInt("AC_ISPREPAID"), rs.getInt("AC_ISCUSTOMERBILL"), 
            rs.getInt("ST_TYPEID"), rs.getString("AC_ACCTHOLDERNAME"), rs.getString("AC_EMAIL"), rs.getInt("PR_PRODUCTID"), 
            rs.getDouble("AC_CREDITLIMIT"), rs.getDouble("AC_CURRENTBALANCE"), rs.getDouble("AC_EQPSALESBALANCE"), rs.getDouble("AC_SECURITYDEPOSIT"), 
            rs.getString("AC_ACTIVATIONDATE"), rs.getString("AC_EXPIRYDATE"), rs.getInt("AC_NOOFSUBSCRIBERS"), 
            rs.getInt("AS_ACCTSTATEID"), rs.getInt("FBP_FIXEDPERIODID"), rs.getInt("FR_FRANCHISEEID"), 
            rs.getInt("SBP_POLICYID"), rs.getInt("CR_RegionID"), rs.getInt("CI_CITYID"), rs.getInt("ST_STATEID"), 
            rs.getInt("CL_LOCATIONID"), rs.getString("AC_TownName"), rs.getString("AC_BRANCHCODE"), rs.getInt("AC_ONLINEACCESS"), 
            rs.getString("AC_PASSWORD"), rs.getString("AC_INVREMARKS"), rs.getInt("AC_PRINTDISCOUNT"), rs.getInt("AC_DISABLEASIAMNT"), 
            rs.getInt("C_CURRENCYID"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"), rs.getInt("AC_PRINTCUSTOMERNAME"));
          if (detail)
          {
            sa.setSalutationType(getSalutationType(sa.getSalutationTypeID()));
            
            sa.setCityRegion(getCityRegion(sa.getRegionID()));
            sa.setCity(getCity(sa.getCityID()));
            sa.setState(getState(sa.getStateID()));
            
            sa.setAccountState(getAccountState(sa.getAccountStateID()));
          }
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public AccountState getAccountState(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    AccountState sa = new AccountState();
    if (ID > 0)
    {
      String sql = " SELECT  AS_ACCSTATEID, AS_ACCSTATEDESC,AS_ISVISIBLE from SM_TBLACCOUNTSTATE  Where AS_ACCSTATEID =" + 
        ID + " order by AS_ACCSTATEDESC ";
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new AccountState(rs.getInt("AS_ACCSTATEID"), rs.getString("AS_ACCSTATEDESC"), 
            rs.getInt("AS_ISVISIBLE"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public Service getService(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    return getService(ID, true);
  }
  
  public Service getService(int ID, boolean detail)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    Service sm = new Service();
    if (ID > 0)
    {
      String sql = " SELECT  SVE_SERVICEID, SVE_SERVICENAME, SVE_SERVICEDESC, SVE_SERVICECODE, SVE_SERVICESAPCODE, SVE_ISDAYSEXPIRY, SVE_EXPIRYLENGTH, SEV_CALCULATEEXPIRY,  SVE_RAFEEPERCENT, SVE_TAXPERCENT, SG_GROUPID, SVE_ACTIVATIONDATE,  SVE_ISCIR, SVE_ISDATA, SVE_NONAAA,SVE_BANDWIDTHKB, SVE_ISMFACTOR, SVE_EMAILMB, SVE_HOSTINGMB, SVE_BKSERVICEID, SVE_EQPSERVICEID,  SVE_CHECKATTR, SVE_REPLYATTR, SVE_DNREPLYATTR,   SVE_ONLINECHARGING, SVE_SUBINVOICETEXT, SVE_ISDISABLED ,   SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SER_TBLSERVICES  Where SVE_SERVICEID = " + 
      



        ID + " ";
      
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sm = new Service(rs.getInt("SVE_SERVICEID"), rs.getString("SVE_SERVICENAME"), rs.getString("SVE_SERVICEDESC"), rs.getString("SVE_SERVICECODE"), 
            rs.getString("SVE_SERVICESAPCODE"), rs.getInt("SVE_ISDAYSEXPIRY"), rs.getInt("SVE_EXPIRYLENGTH"), 
            rs.getInt("SEV_CALCULATEEXPIRY"), rs.getDouble("SVE_RAFEEPERCENT"), 
            rs.getDouble("SVE_TAXPERCENT"), rs.getInt("SG_GROUPID"), rs.getString("SVE_ACTIVATIONDATE"), 
            rs.getInt("SVE_ISCIR"), rs.getInt("SVE_ISDATA"), rs.getInt("SVE_NONAAA"), rs.getLong("SVE_BANDWIDTHKB"), rs.getInt("SVE_ISMFACTOR"), 
            rs.getLong("SVE_EMAILMB"), rs.getLong("SVE_HOSTINGMB"), rs.getInt("SVE_BKSERVICEID"), rs.getInt("SVE_EQPSERVICEID"), 
            rs.getString("SVE_CHECKATTR"), rs.getString("SVE_REPLYATTR"), rs.getString("SVE_DNREPLYATTR"), rs.getInt("SVE_ONLINECHARGING"), 
            rs.getString("SVE_SUBINVOICETEXT"), rs.getInt("SVE_ISDISABLED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          if (detail)
          {
            sm.setServiceGroup(getServiceGroup(sm.getGroupID()));
            sm.setBKServiceName(getService(sm.getBKServiceID()).getServiceName());
            sm.setEQPServiceName(getService(sm.getEQPServiceID()).getServiceName());
          }
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sm;
  }
  
  public ServiceGroup getServiceGroup(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ServiceGroup sm = new ServiceGroup();
    if (ID > 0)
    {
      String sql = " SELECT  SG_GROUPID, SG_GROUPNAME, SG_GROUPDESC, ST_TYPEID, SG_isDisabled , SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SER_TBLSERVICEGROUPS  Where SG_GROUPID =" + 
      
        ID + " order by SG_GROUPNAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sm = new ServiceGroup(rs.getInt("SG_GROUPID"), rs.getString("SG_GROUPNAME"), rs.getString("SG_GROUPDESC"), 
            rs.getInt("ST_TYPEID"), rs.getInt("SG_isDisabled"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          sm.setServiceType(getServiceType(sm.getServiceTypeID()));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sm;
  }
  
  public ServiceType getServiceType(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    ServiceType sm = new ServiceType();
    if (ID > 0)
    {
      String sql = " SELECT  ST_TYPEID, ST_TYPENAME, ST_TYPEDESC, ST_TYPECODE, ST_isDisabled, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SER_TBLSERVICETYPES  Where ST_TYPEID =" + 
      
        ID + " order by ST_TYPENAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sm = new ServiceType(rs.getInt("ST_TYPEID"), rs.getString("ST_TYPENAME"), rs.getString("ST_TYPEDESC"), 
            rs.getString("ST_TYPECODE"), rs.getInt("ST_isDisabled"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          
          start = rs.next();
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sm;
  }
  
  public SubscriberService getSubscriberService(long ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    return getSubscriberService(ID, true);
  }
  
  public SubscriberService getSubscriberService(long ID, boolean detail)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    SubscriberService sa = new SubscriberService();
    if (ID > 0L)
    {
      String sql = " SELECT  SS_SUBSRVID, SUB_SUBSCRIBERID, SVE_SERVICEID, SS_IDENTIFIER, SS_CAMREFNO, SS_PRSUBSRVID, SFT_TYPEID,  SS_ACTIVATIONDATE, SS_BILLSTARTDATE, SS_EXPIRYDATE, SS_SUBSSVSTATEID, SBP_POLICYID, NE_ELEMENTID,  SS_SERVICEBALANCE, SS_CREDITLIMIT, SS_USEDLIMIT, SS_VSECONDUSED, SS_DSECONDUSED, SS_VOLUMEUSED, SS_UNITUSED, SS_SUBINVOICETEXT, SPG_GROUPID, SS_PRINTSVEGROUP, SS_ISSVSBALANCE, EX_EXCHANGEID, C_CURRENCYID, SS_ISDELETED,   SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate,SS_PRINTONINVOICE,SS_EPCFNo  from SM_TBLSUBSSERVICES  Where SS_SUBSRVID =" + 
      





        ID + " ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sa = new SubscriberService(rs.getLong("SS_SUBSRVID"), rs.getLong("SUB_SUBSCRIBERID"), rs.getInt("SVE_SERVICEID"), 
            rs.getString("SS_IDENTIFIER"), rs.getString("SS_CAMREFNO"), rs.getInt("SS_PRSUBSRVID"), rs.getInt("SFT_TYPEID"), 
            rs.getString("SS_ACTIVATIONDATE"), rs.getString("SS_BILLSTARTDATE"), rs.getString("SS_EXPIRYDATE"), rs.getInt("SS_SUBSSVSTATEID"), 
            rs.getInt("SBP_POLICYID"), rs.getInt("NE_ELEMENTID"), rs.getDouble("SS_SERVICEBALANCE"), 
            rs.getDouble("SS_CREDITLIMIT"), rs.getDouble("SS_USEDLIMIT"), rs.getLong("SS_VSECONDUSED"), rs.getLong("SS_DSECONDUSED"), 
            rs.getLong("SS_VOLUMEUSED"), rs.getLong("SS_UNITUSED"), rs.getString("SS_SUBINVOICETEXT"), 
            rs.getInt("SPG_GROUPID"), rs.getInt("SS_PRINTSVEGROUP"), 
            rs.getInt("SS_ISSVSBALANCE"), rs.getLong("EX_EXCHANGEID"), rs.getInt("C_CURRENCYID"), rs.getInt("SS_ISDELETED"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"), rs.getInt("SS_PRINTONINVOICE"), rs.getString("SS_EPCFNo"));
          if (detail)
          {
            sa.setSveFinType(getSveFinType(sa.getServiceFinTypeID()));
            sa.setSubSveState(getSubSveState(sa.getSubServiceStateID()));
            
            sa.setService(getService(sa.getServiceID()));
            sa.setSvsBlkPolicy(getSvsBlkPolicy(sa.getBlockingPolicyID()));
          }
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public SveFinType getSveFinType(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    SveFinType sa = new SveFinType();
    if (ID > 0)
    {
      String sql = " SELECT  SFT_TYPEID, SFT_TYPENAME, SFT_ISCHARGEABLE,SFT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLSVEFINTYPE  Where SFT_TYPEID =" + 
      
        ID + " order by SFT_TYPENAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new SveFinType(rs.getInt("SFT_TYPEID"), rs.getString("SFT_TYPENAME"), rs.getInt("SFT_ISCHARGEABLE"), 
            rs.getInt("SFT_ISDISABLED"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public SvsBlkPolicy getSvsBlkPolicy(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    SvsBlkPolicy sa = new SvsBlkPolicy();
    if (ID > 0)
    {
      String sql = " SELECT  SBP_POLICYID, SBP_NAME,SBP_ISPREPAID,SBP_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLSVSBLKPOLICIES  Where SBP_POLICYID =" + 
      
        ID + " order by SBP_NAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new SvsBlkPolicy(rs.getInt("SBP_POLICYID"), rs.getString("SBP_NAME"), rs.getInt("SBP_ISPREPAID"), 
            rs.getInt("SBP_ISDISABLED"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public SubSveState getSubSveState(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    SubSveState sa = new SubSveState();
    if (ID > 0)
    {
      String sql = " SELECT  SSS_STATEID, SSS_STATEDESC,SSS_ISVISIBLE, SSS_ISCHARGEABLE, SSS_DOREVERSE, SSS_ISREMOVEABLE, NC_COMMANDID, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLSUBSVESTATES  Where SSS_STATEID =" + 
      
        ID + " order by SSS_STATEDESC ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new SubSveState(rs.getInt("SSS_STATEID"), rs.getString("SSS_STATEDESC"), rs.getInt("SSS_ISVISIBLE"), 
            rs.getInt("SSS_ISCHARGEABLE"), rs.getInt("SSS_DOREVERSE"), 
            rs.getInt("SSS_ISREMOVEABLE"), rs.getInt("NC_COMMANDID"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public State getState(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    State sm = new State();
    if (ID > 0)
    {
      String sql = " SELECT  ST_STATEID, ST_STATENAME, ST_STATEBAC, CO_COUNTRYPREFIX, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate from GC_TBLSTATES Where ST_STATEID = " + ID + " ";
      


      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sm = new State(rs.getInt("ST_STATEID"), rs.getString("ST_STATENAME"), rs.getString("ST_STATEBAC"), 
            rs.getInt("CO_COUNTRYPREFIX"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sm;
  }
  
  public SubscriberIdentification getSubscriberIdentificationBySubServiceID(long subServiceiD, int identType)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    SubscriberIdentification sa = new SubscriberIdentification();
    if ((subServiceiD > 0L) && (identType > 0))
    {
      String sql = " SELECT  SI_IDENTIFICATIONID, SS_SUBSRVID, NE_ELEMENTID, STIT_TYPEID, SI_IDENTIFICATION,  SI_PASSWD, SI_ACTIVATIONDATE, SI_DEACTIVATIONDATE, SI_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLSUBSIDENTIFICATIONS  Where (SI_DEACTIVATIONDATE is null or SI_DEACTIVATIONDATE>sysdate) and SI_ACTIVATIONDATE<sysdate  and SS_SUBSRVID=" + 
      

        subServiceiD + " and STIT_TYPEID= " + identType;
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new SubscriberIdentification(rs.getLong("SI_IDENTIFICATIONID"), rs.getLong("SS_SUBSRVID"), rs.getInt("NE_ELEMENTID"), 
            rs.getInt("STIT_TYPEID"), rs.getString("SI_IDENTIFICATION"), rs.getString("SI_PASSWD"), rs.getString("SI_ACTIVATIONDATE"), 
            rs.getString("SI_DEACTIVATIONDATE"), rs.getInt("SI_ISDISABLED"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public City getCity(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    City sm = new City();
    if (ID > 0)
    {
      String sql = " SELECT  CI_CITYID, CI_CITYNAME, CI_CITYDIALCODE, CI_CITYBAC, ST_STATEID, CR_RegionID, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from GC_TBLCITIES Where CI_CITYID = " + 
        ID + " ";
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sm = new City(rs.getInt("CI_CITYID"), rs.getString("CI_CITYNAME"), rs.getString("CI_CITYDIALCODE"), 
            rs.getString("CI_CITYBAC"), rs.getInt("ST_STATEID"), rs.getInt("CR_RegionID"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sm;
  }
  
  public Currency getCurrency(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    Currency sm = new Currency();
    if (ID > 0)
    {
      String sql = " SELECT C_CURRENCYID, C_CURRENCYNAME, C_CURRENCYSYMBOL, C_isDisabled, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SC_TBLCURRENCIES Where C_CURRENCYID =" + 
      
        ID + "  ";
      log.debug(sql);
      
      PreparedStatement pstmt1 = null;
      ResultSet rs = null;
      try
      {
        pstmt1 = this.conn.prepareStatement(sql);
        rs = pstmt1.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sm = new Currency(rs.getInt("C_CURRENCYID"), rs.getString("C_CURRENCYNAME"), rs.getString("C_CURRENCYSYMBOL"), 
            rs.getInt("C_isDisabled"), 
            rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          sm.setActiveCurrencyRate(getActiveCurrencyRate(sm.getCurrencyID()));
        }
        pstmt1.close();
        log.info(Integer.valueOf(pstmt1.getUpdateCount()));
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt1 != null) {
            pstmt1.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt1 != null) {
            pstmt1.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sm;
  }
  
  public CurrencyRate getActiveCurrencyRate(int CurrencyID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    CurrencyRate sm = new CurrencyRate();
    
    String sql = " SELECT CR_RATEID, C_CURRENCYID, CR_RATE, CR_ACTIVATIONDATE, CR_isDisabled, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SC_TBLCURRENCYRATES  Where CR_isDisabled = 0 and C_CURRENCYID =" + 
    
      CurrencyID + "  " + 
      " and CR_ACTIVATIONDATE < sysdate order by CR_ACTIVATIONDATE desc ";
    

    PreparedStatement pstmt2 = null;
    ResultSet rs = null;
    try
    {
      pstmt2 = this.conn.prepareStatement(sql);
      rs = pstmt2.executeQuery();
      boolean start = rs.next();
      if (start) {
        sm = new CurrencyRate(rs.getLong("CR_RATEID"), rs.getInt("C_CURRENCYID"), rs.getFloat("CR_RATE"), 
          rs.getString("CR_ACTIVATIONDATE"), rs.getInt("CR_isDisabled"), 
          rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
          rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
      }
      pstmt2.close();
    }
    catch (SQLException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      log.debug(ex.getMessage());
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt2 != null) {
          pstmt2.close();
        }
      }
      catch (Exception localException1) {}
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt2 != null) {
          pstmt2.close();
        }
      }
      catch (Exception localException2) {}
    }
    return sm;
  }
  
  public CityRegion getCityRegion(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    CityRegion sm = new CityRegion();
    if (ID > 0)
    {
      String sql = " SELECT  CR_RegionID, CR_RegionNAME, CR_RegionBAC, CO_COUNTRYPREFIX, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from GC_TBLCITYREGIONS  Where CR_RegionID =" + 
      
        ID + " order by CR_RegionNAME ";
      

      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start)
        {
          sm = new CityRegion(rs.getInt("CR_RegionID"), rs.getString("CR_RegionNAME"), rs.getString("CR_RegionBAC"), 
            rs.getInt("CO_COUNTRYPREFIX"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
          
          start = rs.next();
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sm;
  }
  
  public Product getProduct(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    Product sa = new Product();
    if (ID > 0)
    {
      String sql = " SELECT  PR_PRODUCTID, PR_PRODUCTNAME, PR_DESCRIPTION,PR_ACTIVATIONDATE,  FBP_FIXEDPERIODID,AC_APPCONFIGID,PR_ISDISPLAYABLE,PR_ISPREPAID,PR_ALLOWEDDIDS, DPP_PLANID , PR_ALLOWEDCUG, PR_ALLOWEDFAXLINES,PR_ALLOWEDTOLLFREE,PR_ISDISABLED,PR_ALLOWEDTRUNKS,  SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from PP_TBLPRODUCTS  Where PR_PRODUCTID =" + 
      



        ID + " order by PR_PRODUCTNAME ";
      

      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new Product(rs.getInt("PR_PRODUCTID"), rs.getString("PR_PRODUCTNAME"), rs.getString("PR_DESCRIPTION"), 
            rs.getString("PR_ACTIVATIONDATE"), rs.getInt("FBP_FIXEDPERIODID"), rs.getInt("AC_APPCONFIGID"), 
            rs.getInt("PR_ISDISPLAYABLE"), rs.getInt("PR_ISPREPAID"), rs.getInt("PR_ALLOWEDDIDS"), rs.getInt("DPP_PLANID"), 
            rs.getInt("PR_ALLOWEDCUG"), rs.getInt("PR_ALLOWEDFAXLINES"), rs.getInt("PR_ALLOWEDTOLLFREE"), 
            rs.getInt("PR_ISDISABLED"), rs.getInt("PR_ALLOWEDTRUNKS"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), 
            rs.getString("SU_InsertDate"), rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public SalutationType getSalutationType(int ID)
    throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException
  {
    SalutationType sa = new SalutationType();
    if (ID > 0)
    {
      String sql = " SELECT  ST_TYPEID, ST_TYPENAME, ST_TYPECODE,ST_isDisabled, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate  from SM_TBLSALUTATIONTYPES  Where ST_TYPEID =" + 
      
        ID + " order by ST_TYPENAME ";
      log.debug(sql);
      
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try
      {
        pstmt = this.conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        boolean start = rs.next();
        if (start) {
          sa = new SalutationType(rs.getInt("ST_TYPEID"), rs.getString("ST_TYPENAME"), rs.getString("ST_TYPECODE"), 
            rs.getInt("ST_isDisabled"), rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP"), rs.getString("SU_InsertDate"), 
            rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate"));
        }
      }
      catch (SQLException ex)
      {
        throw ex;
      }
      catch (Exception ex)
      {
        log.debug(" Exception :" + ex.getMessage());
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException1) {}
      }
      finally
      {
        try
        {
          if (rs != null) {
            rs.close();
          }
          if (pstmt != null) {
            pstmt.close();
          }
        }
        catch (Exception localException2) {}
      }
    }
    return sa;
  }
  
  public ApplicationConfig loadConf()
    throws SQLException, ClassNotFoundException, NullPointerException
  {
    ApplicationConfig invConfig = new ApplicationConfig();
    ArrayList SystemProperties = new ArrayList();
    String sql = " select SP_Name, SP_Value, AC_AppConfigID from SC_TBLSYSPROPERTIES ";
    log.debug(sql);
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try
    {
      pstmt = this.conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while (rs.next())
      {
        String SP_Name = rs.getString("SP_Name");
        if (SP_Name == null) {
          SP_Name = "";
        }
        String SP_Value = rs.getString("SP_Value");
        if (SP_Value == null) {
          SP_Value = "";
        }
        int AC_AppConfigID = rs.getInt("AC_AppConfigID");
        if (rs.wasNull()) {
          AC_AppConfigID = 0;
        }
        if (SP_Name.length() > 0)
        {
          SystemProperty tp = new SystemProperty(SP_Name, SP_Value, AC_AppConfigID, 0);
          SystemProperties.add(tp);
        }
      }
    }
    catch (SQLException ex)
    {
      log.debug(" Error :" + ex.getMessage());
      throw ex;
    }
    finally
    {
      try
      {
        if (rs != null) {
          rs.close();
        }
        if (pstmt != null) {
          pstmt.close();
        }
      }
      catch (Exception localException) {}
    }
    invConfig.setSystemProperties(SystemProperties);
    return invConfig;
  }
  
  private GregorianCalendar getDateFromString(String dateString)
  {
    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    GregorianCalendar calendarDate = null;
    try
    {
      if ((dateString == null) || (dateString.length() == 0)){
        calendarDate = null;
      }else{
        calendarDate = new GregorianCalendar();
        calendarDate.setTime(dateFormatter.parse(dateString));
        setTimeToZeroHours(calendarDate);
      }
    }catch (ParseException e){
      log.debug("INVALID DATE FORMAT");
      e.printStackTrace();
      calendarDate = null;
    }
    return calendarDate;
  }
  
  public String getDecimalFormatterInv(double value) {
  	String formatter = "#,##0";
  	try {
  		DecimalFormat decimalFormat = new DecimalFormat(formatter);
  	    return decimalFormat.format(value);
  	} catch (Exception e) {
  		DecimalFormat decimalFormat = new DecimalFormat("#,##0");
  		return decimalFormat.format(value);
  	}
  	
  }
  
  private void setTimeToZeroHours(GregorianCalendar calendar)
  {
    calendar.clear(11);
    calendar.set(11, 0);
    calendar.clear(12);
    calendar.set(12, 0);
    calendar.clear(13);
    calendar.set(13, 0);
    calendar.clear(14);
    calendar.set(14, 0);
  }
  
  
    /*//SMS
	  public boolean SendSMS(long Recipient, String SMSText){
	      boolean SMSSent = false;
	      try{
	   	   
	   	      String Recip = String.valueOf(Recipient);
	   	      Recip ="0"+Recip;
	   	                                                   Recip="03224610182";
	   	      SMSText = SMSText.replaceAll("\\+", "%20");
		      String requestUrl = "https://text.com.pk/_SRService/SendReceiveService.svc/SendMessageToIndividual/"+Recip+"/"+SMSText+"/215/875/0/textcybernet@yahoo.com/text2013";
		      log.info("requestUrl : "+requestUrl);
		      URL url = new URL(requestUrl);
		      log.info("before HttpURLConnection");
	          HttpURLConnection uc = (HttpURLConnection)url.openConnection();
	          log.info("after HttpURLConnection");
	          log.info("Response :: "+uc.getResponseMessage());
	          if (uc.getResponseMessage().equalsIgnoreCase("OK")){
	       	   SMSSent = true;
	          }
	          uc.disconnect();
	          //log.info("after disconnect");
	      } catch (Exception e) {
	   	   	log.error("Exception :"+e.getMessage());
	      }
	      return SMSSent;
	  }*/
	  
  public EmailType getEmailTypeMessages(int ID)throws SQLException, ClassNotFoundException, NullPointerException, ObjectNotFoundException{
 		EmailType sa = new EmailType();
      if (ID > 0){
	          String sql = " SELECT  EMT_TYPEID, EMT_TYPENAME, ECT_CONTENTTYPEID,EMT_PRIORITY,EMT_STYLESHEET,EMT_SUBJECT,EMT_FROMADDRESS,EMT_TOLIST,EMT_CCLIST,EMT_BCCLIST,EMT_ISDISABLED, SU_SysUserID, SU_SysUserIP, SU_InsertDate, SU_SysUserIDM, SU_SysUserIPM, SU_ModifyDate,  " +
	          		       " EMT_SMSMESSAGE1, EMT_SMSMESSAGE2, EMT_SMSMESSAGE3, EMT_EMAILMESSAGE1, EMT_EMAILMESSAGE2, EMT_EMAILMESSAGE3, EMT_AFTERDAYS  "+
	                       " from TEM_TBLEMAILTYPES "+
	                       " Where EMT_TYPEID ="+ID+" order by EMT_TYPENAME ";
	          log.debug(sql);

	          PreparedStatement pstmt = null;
	          ResultSet rs = null;
	          try {

	              pstmt = conn.prepareStatement(sql);
	              rs = pstmt.executeQuery();
	              boolean start = rs.next();
	              if(start){
	            	  sa = new EmailType(rs.getInt("EMT_TYPEID"), rs.getString("EMT_TYPENAME"),rs.getInt("ECT_CONTENTTYPEID"),rs.getInt("EMT_PRIORITY"),
	            			  rs.getString("EMT_STYLESHEET"),rs.getString("EMT_SUBJECT"),rs.getString("EMT_FROMADDRESS"),
	            			  rs.getString("EMT_TOLIST"),rs.getString("EMT_CCLIST"),rs.getString("EMT_BCCLIST"),rs.getInt("EMT_ISDISABLED"),
	            			  rs.getLong("SU_SysUserID"), rs.getString("SU_SysUserIP") ,rs.getString("SU_InsertDate"),
                  		  rs.getLong("SU_SysUserIDM"), rs.getString("SU_SysUserIPM"), rs.getString("SU_ModifyDate")  ); 
	            	  
	            	  sa.setEmailContentType(getEmailContentType(sa.getContentTypeID()));
	            	  sa.setEmailMessage1(rs.getString("EMT_EMAILMESSAGE1"));
		              sa.setEmailMessage2(rs.getString("EMT_EMAILMESSAGE2"));
		              sa.setEmailMessage3(rs.getString("EMT_EMAILMESSAGE3"));
		              sa.setSmsMessage1(rs.getString("EMT_SMSMESSAGE1"));
		              sa.setSmsMessage2(rs.getString("EMT_SMSMESSAGE2"));
		              sa.setSmsMessage3(rs.getString("EMT_SMSMESSAGE3"));
		              sa.setAfterDays(rs.getString("EMT_AFTERDAYS"));
	              }
	          }catch (SQLException ex) {
	              throw ex;
	          }catch (Exception ex) {
	              log.debug(" Exception :"+ex.getMessage());
	          }finally{
	              try {
	                  if (rs != null) {
	                      rs.close();
	                  }
	                  if (pstmt != null) {
	                      pstmt.close();
	                  }
	              } catch (Exception ex1) {
	              }
	          }
        }
        return sa;

 }
	  
	  
	 //Soap Message Call 
	 public boolean SendSMS(long Recipient, String SMSText){
		 boolean status=false;
		 
		 try{
			 
			 String Recip = String.valueOf(Recipient);
		   	   Recip ="0"+Recip;
		   	   SMSText = SMSText.replaceAll("\\+", " ");
		   	   SMSText = SMSText.replaceAll("%2C+", ",");
		       SMSText = SMSText.replaceAll("%5B+", " ");
		   	   SMSText = SMSText.replaceAll("%5D+", " ");
		   	   SMSText = SMSText.replaceAll("%26+", "and");
		   	   SMSText = SMSText.replaceAll("%0D%0A+", " ");
		        // Getting the Tokken
		   	ISendReceiveServiceSOAPProxy	service = new  	ISendReceiveServiceSOAPProxy() ;
		    String    userName = "textcybernet@yahoo.com";
		    String  userPassword = "text2013";
		    TokenRequest    tr = new TokenRequest(userPassword, userName);
		    String token = service.getToken(tr);
		                                                //     Recip="03217161939";//Give your own number here
		                                               //      Recip="03008242616";
                                                      //  Recip="03224610182";
		        String[] cellNumbers={Recip};
		    	OutboundMessage ob = new OutboundMessage(0,
		    	            cellNumbers,
		    	           true,
		    	           215,
		    	           true,
		    	           SMSText,
		    	           token,
		    	           875,
		    	         userName	);
		    	
		    	OutboundMessageResponse SmsResponse =new OutboundMessageResponse (); 
		    	SmsResponse= service.sendMessage(ob);
		   int  statusCode =	SmsResponse.getResponseCode();
		        // Checking Status
		    	if(statusCode==1){
		    		
		    		status=true;
		    	}
		    	
	     }
		 catch(Exception e){
			 log.error("Exception :"+e.getMessage());
			 System.out.println("");
					 }
		 return status;
		 
		 }
	 
}
