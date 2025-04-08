package com.java.bank.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionHelper {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String user =rb.getString("user");
		String password = rb.getString("password");
		
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
}
