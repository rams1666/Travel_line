package com.vir.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnection {
	
	private DBConnection() {
		
	}
	//static Logger logger = Logger.getLogger(DBConnection.class);
	public static Connection getConnection(){
		ResourceBundle resource = ResourceBundle.getBundle("ResourceBundle");
		String path=resource.getString("DB_DRIVER_CLASS");
		String url = resource.getString("DB_URL");
		String user = resource.getString("DB_USERNAME");
		String pwd = resource.getString("DB_PASSWORD");
	
		try {
			Class.forName(path);
		    return DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException | SQLException e) {
			//logger.error(e);
			e.printStackTrace();
		} 
		return null;
	}

}
