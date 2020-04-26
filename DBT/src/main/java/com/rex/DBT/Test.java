package com.rex.DBT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Connection con=DriverManager.getConnection("HAPPY-PC/SQLEXPRESS","" ,"" );
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from DEPT");
		while(rs.next()){
			System.out.println(rs.getString("DNAME"));
		}
		con.close();
	}

}
