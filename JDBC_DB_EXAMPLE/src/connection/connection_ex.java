package connection;
import java.sql.*;
import javax.sql.*;

public class connection_ex {
	
	public static final String url="jdbc:mysql://localhost:3306/student";
	public static final String username="root";
	public static final String password="Lee!@#123";
	
	public static void getConnection() {
		
		Connection cn;
	
		try {
			//ste2 : load the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			/*step 3
			 * 1 : url/database
			 * 2  : username
			 * 3 : password
			 */
			cn = DriverManager.getConnection(url,username,password);
			System.out.println(cn);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
					
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		connection_ex.getConnection();

	}

}
