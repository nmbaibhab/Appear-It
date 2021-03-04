package source_packages;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;
	public static Connection getCon() {
		try {
			if(con == null) {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam_management_system", "root", "");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}