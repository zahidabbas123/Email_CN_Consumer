package com.soft.email.core;

import java.io.*;
import java.util.*;

import org.apache.log4j.*;

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

public class Enviornment {

    private static Enviornment env;
    private static Properties envConfig;
    private static boolean logInitialized = false;

  private Enviornment(String envRoot) throws Exception{
        envConfig=new Properties();
        envConfig.load(new FileInputStream(new File(envRoot+Constants.ENVIORNMENT_PATH)));
        if(!logInitialized)
            initLog(envRoot+Constants.LOG_PATH);
    }

    public static Enviornment getEnviornment(String envRoot) throws Exception{
        if(env == null)
            env = new Enviornment(envRoot);
        return env;
    }

    public static Enviornment getNewEnviornment(String envRoot) throws Exception{
      env = new Enviornment(envRoot);
      return env;
    }


    private String getProperty(String propKey){
        return envConfig.getProperty(propKey)==null?"":envConfig.getProperty(propKey);
    }

    public String getDB_ID(){
        return getProperty("DB_ID");
    }

    public String getDB_URL(){
        return getProperty("DB_URL");
    }

    public String getDB_Login(){
        return getProperty("DB_Login");
    }

    public String getDB_Passwd(){
        return getProperty("DB_Passwd");
    }


    public Level getLogLevel(){
        String sll = getProperty("SYS_SystemLoggingLevel");
        if( sll.equalsIgnoreCase("0"))
            return Level.DEBUG;
        return Level.DEBUG;
    }


    private  void initLog(String filePath){
       if(logInitialized){
          return;
       }
       File f = new File(filePath);
       printlog(Level.DEBUG, "Initializing log from: "+f, null);
       Properties props = null;
       if(f==null){
          props = new Properties();
          props.put("log4j.rootLogger", "warn,stdout");
          props.put("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
          props.put("log4j.appender.stdout.layout.ConversionPattern", "%5p - %c:%L %m%n");
       } else{
          props = getPropertiesFromFile(filePath);
       }
       PropertyConfigurator.configure(props);
       logInitialized = true;
    }


    private Properties getPropertiesFromFile(String fileName) {
        Properties props = new Properties();
        File file = new File(fileName);
        if (!file.exists()) {
            printlog(Level.WARN,
                     "File [" + file.getAbsolutePath() + "] not exists.", null);
        } else {
            printlog(Level.DEBUG, "Getting properties from " + fileName, null);
            FileInputStream stream = null;
            try {
                stream = new FileInputStream(file);
                props.load(stream);
            } catch (Exception e) {
                printlog(Level.ERROR,
                         "Error while initializing properties from " + fileName,
                         e);
            } finally {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (IOException ex) {
                        printlog(Level.ERROR,
                                 "Error closing stream after reading properties from "
                                 + fileName, null);
                    }
                }
            }
        }
        return props;
    }

    public void printlog(String msg) {
        System.out.println("Environment > " + msg);
    }

    public void printlog(Level level, String msg, Throwable ta){
        System.out.println("Environment " + level + "> " + msg);
        if (ta != null) {
            ta.printStackTrace(System.out);
        }
    }

    public void printlog(String msg, Throwable ta){
        System.out.println("Environment > " + msg);
        if (ta != null) {
            ta.printStackTrace(System.out);
        }
    }

  public String getEMAIL_SERVER() {
    return getProperty("EMAIL_SERVER");
  }

  public String getROUNDS() {
    return getProperty("ROUNDS");
  }

  public String getROUND_INTERVAL() {
    return getProperty("ROUND_INTERVAL");
  }

  public String getServerUserName() {
    return getProperty("Server_User_Name");
  }

  public String getServerPassword() {
    return getProperty("Server_Password");
  }



}
