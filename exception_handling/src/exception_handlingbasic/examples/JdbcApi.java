package exception_handlingbasic.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcApi {

	public static void main(String[] args) {
		try {
		Connection con = DriverManager.getConnection("");
		}catch (SQLException e) {
			// TODO: handle exception
		}
		// Unhandled exception type SQLException
	}
}
