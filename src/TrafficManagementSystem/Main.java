package TrafficManagementSystem;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Main{

	public static void main(String[] args) {
		// connection string		
		String url = "jdbc:mysql://localhost:3306/traffic";
		String username = "root";
		String password = "root";
		String sql = "";		
		Statement stmt;
		ResultSet rs;
		Connection con;
		try {
			con = (Connection) DriverManager.getConnection(url, username, password);		
			sql = "Desc personaldetails;";			
			stmt = (Statement) con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				  System.out.println(rs.getString(1)+ " " +rs.getString(2));				 

			
			}
			

		} catch (SQLException e7) {
			// TODO Auto-generated catch block
			System.out.println(e7.getMessage());
		}

	}

}

}
