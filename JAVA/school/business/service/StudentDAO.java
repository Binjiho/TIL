package school.business.service;

import java.sql.*;
import java.util.*;

import school.business.domain.Student;

public class StudentDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	private String jdbc_driver = "com.mysql.cj.jdbc.Driver";
	private String jdbc_url = "jdbc:mysql://localhost:3306/schooldb?serverTimezone=UTC";

	private void connect() {
		try {
			Class.forName(jdbc_driver);

			conn = DriverManager.getConnection(jdbc_url, "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void createTable() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "create table student(userId int primary key,name varchar(20),age int default 1,id int)";
			stmt.execute(sql);
//			System.out.println("테이블 생성");
		} catch (SQLException e) {
//			System.out.println("테이블 생성 실패");

		} finally {
			disconnect();
		}
	}
	
	public void insert(Student student) throws SchoolException {
		connect();
		
		String sql = "insert into student values(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getUserId());
			pstmt.setString(2, student.getName());
			pstmt.setInt(3, student.getAge());
			pstmt.setInt(4, student.getId());
			
			int r = pstmt.executeUpdate();
			if(r == 0) {
				throw new SchoolException("It's already exist `userId`. can't insert this student");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void delete(int userId) throws SchoolException {
		connect();
		
		String sql = "delete from student where userId = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			int r = pstmt.executeUpdate();
			if(r == 0) {
				throw new SchoolException("can't find student. so can't delete information");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void update(Student student) throws SchoolException {
		connect();
		
		String sql = "update student set name = ?, age = ?, id = ? where userId = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getAge());
			pstmt.setInt(3,student.getId());
			pstmt.setInt(4, student.getUserId());
			
			int r = pstmt.executeUpdate();
			if(r == 0) {
				throw new SchoolException("can't find student. so can't update information");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public Student select(int userId) throws SchoolException {
		connect();
		
		String sql = "select * from student where userId = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new Student(userId, rs.getString("name"), rs.getInt("age"), rs.getInt("id"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		throw new SchoolException("can't find student");
	}
	
	public List<Student> selectAll() {
		connect();
		
		String sql = "select * from student";
		List<Student> list = new ArrayList<Student>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt("userId"), rs.getString("name"), rs.getInt("age"), rs.getInt("id")));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return list;
	}
}
