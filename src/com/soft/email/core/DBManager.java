package com.soft.email.core;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.security.MessageDigest;
import org.apache.log4j.Logger;

/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Comcerto (pvt) Ltd.</p>
 *
 * @author Afzaal
 *
 * @version 1.0
 **/

public class DBManager {

    protected Connection conn;
    private static final Logger log = Logger.getLogger(DBManager.class);

    public DBManager(Enviornment env) throws SQLException, ClassNotFoundException{
        this.conn = ConnectionManager.getConnectionManager(env).getConnection();
    }

    public DBManager(Connection conn){
        this.conn = conn;
    }

    public void reConnectDatabase(Connection conn){
        this.conn = conn;
    }

    public void reConnectDatabase(Enviornment env) throws SQLException, ClassNotFoundException{
        this.conn = ConnectionManager.getConnectionManager(env).getConnection();
    }

    public boolean disconnectDatabase() throws SQLException{
        if (conn != null) {
            if (!conn.isClosed()) {
                conn.close();
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean setAutoCommit(boolean autoCommit) throws SQLException{
        conn.setAutoCommit(autoCommit);
        return true;
    }

    public String isAuthorizedUser(String UserID, String Passwd) throws SQLException, java.security.NoSuchAlgorithmException{

        String RoleID = "-1";

        String sql = "SELECT A.SR_RoleID, A.SU_SysPassword  FROM SS_TblSysUsers A,  SS_TblSysRoles B";
        sql += " WHERE A.SU_SysLogin = '"+UserID+"' "+
               " AND A.SR_RoleID = B.SR_RoleID "+
               " AND A.SU_IsActive = 1 AND B.SR_IsActive = 1 ";
       log.debug(sql);

        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {

                RoleID = rs.getString("SR_ROLEID");
                if (RoleID == null)
                    RoleID = "-1";

                String APasswd = rs.getString("SU_SysPassword");
                if (APasswd == null)
                    APasswd = "";

                if (validatePassword(APasswd, Passwd))
                    return RoleID;

            }
            return "-1";
        } catch (SQLException ex) {

            throw ex;
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

    protected boolean validatePassword(String actualData, String providedData) throws java.security.NoSuchAlgorithmException{
        String md5 = encryptOneWay(providedData);
        if(md5 != null && md5.equals(actualData))
            return true;
        return false;
    }

    protected String encryptOneWay(String data) throws java.security.NoSuchAlgorithmException{

            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] dataBytes = data.getBytes();
            md5.update(dataBytes);
            byte[] digest = md5.digest();
            String res=ConvertToHexString(digest);
            return res;
    }

    private String ConvertToHexString(byte[] bytes){
        String md5Str = "";
        for (int i = 0; i < bytes.length; i++) {
            md5Str += Integer.toHexString((bytes[i] & 0xf0) >> 4);
            md5Str += Integer.toHexString(bytes[i] & 0x0f);
        }
        return md5Str;
    }


    public ResultSet query(String fields, String where, String order, String table) {
        String sql = "SELECT "+ fields +" FROM " + table + " ";
        if (where != null) {
            sql += "WHERE " + where + " ";
        }
        if (order != null) {
            sql += "ORDER BY " + order;
        }
        log.debug(sql);
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            return rs;
        } catch (Exception ex) {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }

            } catch (Exception ex1) {
            }
            return null;
        }
    }


    public PreparedStatement queryPreparedStatement(String fields, String where, String order, String table) {
        String sql = "SELECT "+ fields +" FROM " + table + " ";
        if (where != null) {
            sql += "WHERE " + where + " ";
        }
        if (order != null) {
            sql += "ORDER BY " + order;
        }
        log.debug(sql);
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            return pstmt;
        } catch (Exception ex) {
            try {

                if (pstmt != null) {
                    pstmt.close();
                }

            } catch (Exception ex1) {
            }
            return null;
        }
    }



    public void insertQuery(String fields, String values, String table) throws SQLException{
        String sql = "Insert into "+ table + " ( "+fields+" ) Values ( "+values+" ) ";
        log.debug(sql);
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

        } catch (Exception ex) {
            throw new SQLException();
        }finally{
            try {
                if (pstmt != null) {
                    pstmt.close();
                }

            } catch (Exception ex1) {
            }
        }

     }

     public void updateQuery(String fieldsandValues, String where, String table) throws SQLException{
        String sql = "Update "+ table + " Set "+fieldsandValues+"  Where "+where+" ";
        log.debug(sql);
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

        } catch (Exception ex) {
            throw new SQLException();
        }finally{
            try {
                if (pstmt != null) {
                    pstmt.close();
                }

            } catch (Exception ex1) {
            }
        }

     }


     public void deleteQuery(String table, String where) throws SQLException{
        String sql = "Delete from "+ table + " Where "+where+" ";
        log.debug(sql);
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

        } catch (Exception ex) {
            throw new SQLException();
        }finally{
            try {
                if (pstmt != null) {
                    pstmt.close();
                }

            } catch (Exception ex1) {
            }
        }

     }




    public ResultSet query(String strSql) throws SQLException{

        log.debug(strSql);
        PreparedStatement pstmt = conn.prepareStatement(strSql);
        ResultSet rs = pstmt.executeQuery();
        return rs;

    }

    public boolean doCommit() throws SQLException{
        conn.commit();
        return true;
    }

    public boolean rollbackTransaction() throws SQLException{
        conn.rollback();
        return true;
    }

    public Connection getConnection() throws SQLException {
        if (conn == null)
            throw new SQLException("Connection Closed");
        return conn;
    }

}
