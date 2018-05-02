import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class DatabaConnectionExample {
	
	 public static void main(String[] argv) throws Exception {
		    String driver = "com.mysql.jdbc.Driver";
		    String connection = "jdbc:mysql://localhost:3306/test";
		    String user = "root";
		    String password = "root";
		    Class.forName(driver);
		    Connection con = DriverManager.getConnection(connection, user, password);
		    
		    String query = "SELECT * FROM USERS";
		    //java statement
		    Statement st = (Statement) con.createStatement();
		    
		    //resultset
		    ResultSet rs = st.executeQuery(query);
		    
		    //get the data from database
		    while(rs.next()){
		    	int id = rs.getInt("id");
		    	String username = rs.getString("username");
		    	String password1 = rs.getString("password");
		    	System.out.println(id + " " + username + " " + password1);
		    }
		    
		    st.close();
		    if (!con.isClosed()) {
		      con.close();
		    }
		  }

}
