package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_connection {

	static Connection conn = null;
	static PreparedStatement stmt = null;
	static ResultSet rs = null;
		
	public static boolean connectSQL() {
		
		try {
			
			//Driver setup.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception ex) {
			System.out.print("Exception Driver" + ex.getMessage());
			return false;
		}
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies_uppgift2", DatabaseLogin.getUserName(), DatabaseLogin.getUserPass());
			
			return true;
			
		}catch(SQLException ex) {
			// Error here
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VenderError: " + ex.getErrorCode());
			return false;
		}
		
		
	}
	
	public static void stateSQL(String pontanSnyggis, String requestQuery, String id) {

		try {

			//String requestQuery = "SELECT `movies_actor_id` FROM `movies` WHERE `movies_id` = ?";
			//System.out.println(requestQuery);

			stmt = conn.prepareStatement(requestQuery);
			
			stmt.setString(1, pontanSnyggis);
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(id));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
