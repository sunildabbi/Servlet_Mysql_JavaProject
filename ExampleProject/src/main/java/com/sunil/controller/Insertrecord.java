package com.sunil.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sunil.db.DBConnection;

public class Insertrecord {
	private static final String Insert_Query = "insert into form(NAME,CITY,NUMBER,DOB) VALUES (?,?,?,?)";
	 public void inserRecord(String Name,String CITY,String MOBILE,String DOB) throws Exception {
		 DBConnection DBC = new DBConnection();
		 Connection con = DBC.getDBCoonection();
		 if(con != null) {
			 PreparedStatement ps = con.prepareStatement(Insert_Query);
			 ps.setString(1,Name);
			 ps.setString(2,CITY);
			 ps.setString(3,MOBILE);
			 ps.setString(4,DOB);
			 ps.executeUpdate();
			 ps.close();
			 con.close();
		 }
		 
	}
}