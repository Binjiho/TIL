package test;

import java.sql.*;
import java.util.*;


public class DAOTest1 {

	//  ��ü ������ �� �ѹ��� �θ��ڴ�.
	//  �������̽� �̴ϼȶ�����	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Manager ��ü ���� �Ϸ�");
		}catch(Exception e) {
			System.out.println("Driver Manager ��ü ���� ����");
		}
	}
	
//	��� Connection�� �ٸ� ���̵��� ���ǵ帮���ϰڴ�.
	private Connection conn = null;
	private String url = "jdbc:mysql://localhost:3306/schooldb?serverTimezone=UTC";

//	Connection ����
	private void connect() {
		try {
			conn=DriverManager.getConnection(url,"root","binjiho");
			System.out.println("Connection ��ü ���� �Ϸ�");
		}catch(SQLException e) {
			System.out.println("Connection ��ü ���� ����");
		}
	}
//	Connection ���� ����
	private void disconnect() {
		try {
			conn.close();
			System.out.println("Connection ��ü ��ȯ");
		}catch(SQLException e) {
			System.out.println("Connection ��ü ��ȯ ����");
		}		
	}
	
//	Statement �ٱ���
	private Statement stmt =null;

//	createTable
	public void createTable() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "create table members(member_id int, name varchar(10))";
			stmt.execute(sql);
			System.out.println("���̺� ���� �Ϸ�");
		}catch(SQLException e) {
			System.out.println("���̺� ���� ����");
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
			System.out.println("���̺� ���� �Ϸ�");
		}catch(SQLException e) {
			System.out.println("���̺� ���� ����");
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
			System.out.println("�˻� �Ϸ�");
		}catch(SQLException e) {
			System.out.println("�˻� ����");
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
			System.out.println("���ڵ���� �Ϸ�");
		}catch(SQLException e) {
			System.out.println("���ڵ���� ����");
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
			System.out.println("insert�Ϸ�");
		}catch(SQLException e) {
			System.out.println("insert����");
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
			System.out.println("delete �Ϸ�");
		} catch (SQLException e) {
			System.out.println("delete ����");
		} finally {
			disconnect();
		}
	}
	
//	updatePerson & Update
	//�̸�����
	public void updatePerson(String setname,String findname) {
		connect();
		try {
			String sql = "update person_db set name =? where name = ? ";  
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, setname);
			stmt.setString(2, findname);
			stmt.executeUpdate();
			System.out.println("update �Ϸ�");
		} catch (SQLException e) {
			System.out.println("update ����");
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
//		dao.addPerson("������",26);
//		dao.deletePerson("�迵��");
		dao.updatePerson("�迵��", "������");
		List list = dao.getAllPersons();
		System.out.println(list);
	}
}
