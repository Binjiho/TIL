package test;

import java.sql.*;
import java.util.*;


public class DAOTest1 {

	//  객체 생성할 때 한번만 부르겠다.
	//  인터페이스 이니셜라이져	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Manager 객체 생성 완료");
		}catch(Exception e) {
			System.out.println("Driver Manager 객체 생성 실패");
		}
	}
	
//	비싼 Connection을 다른 아이들이 못건드리게하겠다.
	private Connection conn = null;
	private String url = "jdbc:mysql://localhost:3306/schooldb?serverTimezone=UTC";

//	Connection 연결
	private void connect() {
		try {
			conn=DriverManager.getConnection(url,"root","binjiho");
			System.out.println("Connection 객체 생성 완료");
		}catch(SQLException e) {
			System.out.println("Connection 객체 생성 실패");
		}
	}
//	Connection 연결 해제
	private void disconnect() {
		try {
			conn.close();
			System.out.println("Connection 객체 반환");
		}catch(SQLException e) {
			System.out.println("Connection 객체 반환 실패");
		}		
	}
	
//	Statement 바구니
	private Statement stmt =null;

//	createTable
	public void createTable() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "create table members(member_id int, name varchar(10))";
			stmt.execute(sql);
			System.out.println("테이블 생성 완료");
		}catch(SQLException e) {
			System.out.println("테이블 생성 실패");
		}finally {
			disconnect();
		}
	}
//	dropTable
	public void dropTable() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "Drop table members";
			stmt.execute(sql);
			System.out.println("테이블 삭제 완료");
		}catch(SQLException e) {
			System.out.println("테이블 삭제 실패");
		}finally {
			disconnect();
		}
	}
//	getAllPersons & Select
	public List getAllPersons() {
		List list = new ArrayList();
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "select name from person_db";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString(1);
				list.add(name);
			}
			System.out.println("검색 완료");
		}catch(SQLException e) {
			System.out.println("검색 실패");
		}finally {
			disconnect();
		}
		return list;
	}
//	addPerson - Statement
	public void addPerson(String name) {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into person_db values('"+name+"',24,null,null)";
			stmt.execute(sql);
			System.out.println("레코드삽입 완료");
		}catch(SQLException e) {
			System.out.println("레코드삽입 실패");
		}finally {
			disconnect();
		}
	}
	
//	addPerson & Insert - PreparedStatement
	public void addPerson(String name,int age) {
		connect();
		try {
			String sql = "insert into person_db values(?,?,?,?)"; 
			PreparedStatement stmt = conn.prepareStatement(sql);   
			stmt.setString(1, name);
			stmt.setString(2,Integer.toString(age));
			stmt.setString(3, null);
			stmt.setString(4, null);
			stmt.executeUpdate();
			System.out.println("insert완료");
		}catch(SQLException e) {
			System.out.println("insert실패");
		}finally {
			disconnect();
		}
	}

//  deletePerson & Delete
	public void deletePerson(String name) {
		connect();
		try {
			String sql = "delete from person_db where name = ? ";   // ?
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.executeUpdate();
			System.out.println("delete 완료");
		} catch (SQLException e) {
			System.out.println("delete 실패");
		} finally {
			disconnect();
		}
	}
	
//	updatePerson & Update
	//이름수정
	public void updatePerson(String setname,String findname) {
		connect();
		try {
			String sql = "update person_db set name =? where name = ? ";  
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, setname);
			stmt.setString(2, findname);
			stmt.executeUpdate();
			System.out.println("update 완료");
		} catch (SQLException e) {
			System.out.println("update 실패");
		} finally {
			disconnect();
		}
	}
	
	

	public static void main(String[] args) {
		DAOTest1 dao = new DAOTest1();
		dao.connect();
		dao.disconnect();
		dao.createTable();
		dao.dropTable();
//		dao.addPerson("최윤동",26);
//		dao.deletePerson("김영수");
		dao.updatePerson("김영수", "최윤동");
		List list = dao.getAllPersons();
		System.out.println(list);
	}
}
