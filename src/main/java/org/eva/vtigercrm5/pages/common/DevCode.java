package org.eva.vtigercrm5.pages.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DevCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Select * from Accounts;

		/// mysql , ms sql server, oracle mongo db

		/// db url - username passsword
		/// connection string

		try {
//			Connection conn = DriverManager.getConnection(
//					"Driver={MySQL ODBC 5.2 ANSI Driver};Server=localhost;Database=myDataBase;User=root;Password=root;Option=3;");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root");
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("SELECT * FROM persons ");
			
			// to get the total number of column
			int clmCount = res.getMetaData().getColumnCount();
			System.out.println(clmCount);
			
			// to get the total number of row
			int rwCount=res.getRow();
			System.out.println(rwCount);
			
			System.out.println(clmCount);
			while (res.next()) {
				String data = res.getString("firstName");
				System.out.println(data);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
