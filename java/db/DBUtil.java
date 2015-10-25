package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Administrator 创建程序与数据库的链接 
 * 
 */
public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/GoddessInformation";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection conn = null;
	// 静态代码块 在类的加载的时候比静态方法还会提起执行这样之后调用get方法就是已经被创建好了而不需要每次都去调用两个方法
	static {

		try {
			// 1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			// 2.获得数据库的链接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return conn;
	}

}
