package org.eva.vtigercrm5.pages.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DevCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  Select * from Accounts;
		
		///  mysql , ms sql server, oracle   mongo db
		
		///  db url - username passsword
		///  connection string
		
		try {
			Connection conn=DriverManager.getConnection("Driver={MySQL ODBC 5.2 ANSI Driver};Server=localhost;Database=myDataBase;User=myUsername;Password=myPassword;Option=3;");
			Statement st=conn.createStatement();
			ResultSet res = st.executeQuery("Select * from Accounts where name='rahul'");
			while(res.next()) {
        	   String data =res.getString("salary");
        	   System.out.println();
           }
		   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
