package practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class ConnectionCheck {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ravi", "ravi");
			String sql="delete from student where id="+"'s3'";
			Statement st =con.createStatement();
			if(!st.execute(sql))
				System.out.println("Deleted..");
			else
				System.out.println("Not Deleted..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
