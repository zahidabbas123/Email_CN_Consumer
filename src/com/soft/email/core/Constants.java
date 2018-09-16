package com.soft.email.core;

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

public class Constants {

    public static final String ENVIORNMENT_PATH= "config/EMailManager.config";
    public static final String LOG_PATH= "config/logging.properties";
    public static final String[] DATABASE_TYPES = {"SQL", "MySQL", "Oracle"};
    public static final String[] DATABASE_CLASS_NAMES = {"com.microsoft.jdbc.sqlserver.SQLServerDriver", "com.mysql.jdbc.Driver", "oracle.jdbc.driver.OracleDriver"};
    public static final int SESSION_TIMEOUT = 8000;

}
