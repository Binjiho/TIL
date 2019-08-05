package school.business.service;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;

import java.util.*;

import school.business.domain.Employee;

public class EmployeeDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private String jdbc_driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/schooldb?serverTimezone=UTC";

	private void connect() {
		try {
			try {
				Class.forName(jdbc_driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url, "root", "1234");
//			System.out.println("Connect 객체 생성");
		} catch (SQLException e) {
//			System.out.println("Connection 객체 생성 실패");

		}
	}

	private void disconnect() {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
//				System.out.println("Connection 객체 변환");
			} catch (SQLException e) {
//				System.out.println("Connection 객체 반환 실패");

			}
		}

	}

	public void createTable() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "create table employee(userId int primary key,name varchar(20),age int default 1,dept varchar(20))";
			stmt.execute(sql);
//			System.out.println("테이블 생성");
		} catch (SQLException e) {
//			System.out.println("테이블 생성 실패");

		} finally {
			disconnect();
		}
	}

	public Employee select(int userId) throws SchoolException {
		connect();

		String sql = "select * from employee where userId = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				return new Employee(userId, rs.getString("name"), rs.getInt("age"), rs.getString("dept"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		throw new SchoolException("can't find employee");
	}

	public List<Employee> selectAll() {
		connect();

		String sql = "select * from employee";
		List<Employee> list = new ArrayList<Employee>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Employee(rs.getInt("userId"), rs.getString("name"), rs.getInt("age"),
						rs.getString("dept")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	public void insert(Employee employee) throws SchoolException {
		connect();

		String sql = "insert into employee values(?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employee.getUserId());
			pstmt.setString(2, employee.getName());
			pstmt.setInt(3, employee.getAge());
			pstmt.setString(4, employee.getDept());

			int r = pstmt.executeUpdate();
			if (r == 0) {
				throw new SchoolException("It's already exist `userId`. can't insert this employee");
			}
		} catch (SQLException e) {
			System.out.println("can't insert record");
		} finally {
			disconnect();
		}
	}

	public void delete(int userId) throws SchoolException {
		connect();
		String sql = "delete from employee where userId= ?";
		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			int r = pstmt.executeUpdate();
			if (r == 0) {
				throw new SchoolException("can't find employee. so can't delete information");

			}
		} catch (SQLException e) {
			System.out.println("can't delete record");
		} finally {
			disconnect();
		}
	}

	public void update(Employee employee) throws SchoolException {
		connect();

		String sql = "update employee set name = ?, age = ?, dept = ? where userId = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, employee.getName());
			pstmt.setInt(2, employee.getAge());
			pstmt.setString(4, employee.getDept());
			pstmt.setInt(3, employee.getUserId());

			int r = pstmt.executeUpdate();
			if (r == 0) {
				throw new SchoolException("can't find employee. so can't update information");
			}
		} catch (SQLException e) {
			System.out.println("can't update record");
		} finally {
			disconnect();
		}
	}

}
