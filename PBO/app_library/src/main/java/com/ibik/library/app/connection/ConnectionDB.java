package com.ibik.library.app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private Connection conn;
	
	public Connection connect() throws SQLException {
		String host = "127.0.0.1:3306"; //port mysql
		String dbName = "ibik_applibrary";
		String dbuser = "root";
		String dbpassword = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+"/"+dbName,
				dbuser, dbpassword);
		
		return conn;
	}
	
	public Connection close () throws SQLException {
		conn.close();
		return conn;
	}
}

//sql kamu bentrok dengan wireshark