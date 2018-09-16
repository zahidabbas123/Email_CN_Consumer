package com.soft.email.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

public class ConnectionManager {

    private static Enviornment env;
    private static ConnectionManager connManager;

    private ConnectionManager(Enviornment env) {
        this.env = env;
    }

    public static ConnectionManager getConnectionManager(Enviornment env) {
        if(connManager == null)
            connManager = new ConnectionManager(env);
        return connManager;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException{
    	
        Class.forName(Constants.DATABASE_CLASS_NAMES[Integer.parseInt(env.getDB_ID())]);
        Connection conn = DriverManager.getConnection(env.getDB_URL(), env.getDB_Login(), env.getDB_Passwd());
        return conn;
    }
}
