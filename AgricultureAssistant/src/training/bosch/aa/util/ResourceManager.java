package training.bosch.aa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// TODO: Auto-generated Javadoc
/**
 * The Class ResourceManager.
 */
public class ResourceManager {

	/** The connection. */
	public static Connection conn = null;

	/**
	 * Obtain connection.
	 * 
	 * @return the connection
	 */
	public static Connection obtainConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.47.42.27:1521:XE", "agriassist", "oracle");

		} catch (ClassNotFoundException CNFE) {
			CNFE.printStackTrace();
		} catch (SQLException SQLE) {
			SQLE.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * Disconnect.
	 */
	public static void disConnect() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
