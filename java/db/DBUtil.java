package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Administrator �������������ݿ������ 
 * 
 */
public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/GoddessInformation";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection conn = null;
	// ��̬����� ����ļ��ص�ʱ��Ⱦ�̬������������ִ������֮�����get���������Ѿ����������˶�����Ҫÿ�ζ�ȥ������������
	static {

		try {
			// 1.������������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.������ݿ������
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
