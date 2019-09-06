package file;

import java.sql.*;

public class FileDAO {
	
	private Connection conn; //db�� ������ ���� ��ü
	
//	������ db����
	public FileDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/bbs?serverTimezone=UTC&useSSL=false";
			String dbID = "root";
			String dbPassword = "binjiho";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int upload(String fileName, String fileRealName) {
		String SQL="INSERT INTO FILE VALUES(?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, fileName);
			pstmt.setString(2, fileRealName);
			return pstmt.executeUpdate();  //���� ����� �ش� ��ȯ�� 1
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
