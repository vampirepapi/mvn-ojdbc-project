package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			Class.forName("orcale.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			
			String userName = "sys as sysdba";
			
			String password = "pass123";

			Connection con = DriverManager.getConnection(url, userName, password);
			
			Statement stmt = con.createStatement();
			ResultSet rs =  stmt.executeQuery("select * from product");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getDouble(4));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
