package JDBCTest;
import java.sql.*;
public class jdbcInsert {
	public static void main(String []args) throws Exception{
		String url = "jdbc:ucanaccess://StudentInfo.accdb";
		try {
			Connection conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
			
			String sql = "INSERT INTO Marksheet(Id, Name, Marks) VALUES('2010277105','Samiul','100')";
			int n = st.executeUpdate(sql);
			if(n == 1) {
				System.out.println("Successfully inserted into the database");
			}
			sql = "INSERT INTO Details(Id, FullName, Email, Gender) VALUES('2010277105','Samiul','asfkjaksjfaksjf','Male')";
			n = st.executeUpdate(sql);
			if(n == 1) {
				System.out.println("Successfully inserted into the database");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
