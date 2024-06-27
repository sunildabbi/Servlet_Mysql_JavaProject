package com.sunil.db;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {

	public Connection getDBCoonection() throws Exception {
		Connection con = null;
		try {
			System.out.println("driver loading..");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunil","root","1234567");
			System.out.println("driver loaded--DriverManager");

		} catch (Exception e) {
			// TODO: handle exception
			if(con != null) {
				con.close();
			}
			System.out.println("error | "+e.getMessage());
		}
		return con;
		
	}
}
