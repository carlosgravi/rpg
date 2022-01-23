package rpg.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Join {
	
	private final static String url = "jdbc:psql://localhost:3306";
	private final static String user = "root";
	private final static String password = "";
	
	public static Connection searchConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
}
