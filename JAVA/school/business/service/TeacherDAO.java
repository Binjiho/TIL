package school.business.service;

import java.sql.*;
import java.util.*;

import school.business.domain.Teacher;

public class TeacherDAO {
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
         String sql = "create table teacher(userId int primary key,name varchar(20),age int default 1,subject varchar(20))";
         stmt.execute(sql);
//         System.out.println("테이블 생성");
      } catch (SQLException e) {
//         System.out.println("테이블 생성 실패");

      } finally {
         disconnect();
      }
   }
   public void insert(Teacher teacher) throws SchoolException {
      connect();
      
      String sql = "insert into teacher values(?,?,?,?)";
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, teacher.getUserId());
         pstmt.setString(2, teacher.getName());
         pstmt.setInt(3, teacher.getAge());
         pstmt.setString(4, teacher.getSubject());
         
         int r = pstmt.executeUpdate();
         if(r == 0) {
            throw new SchoolException("It's already exist `userId`. can't insert this teacher");
         }
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
   }
   
   public void delete(int userId) throws SchoolException {
      connect();
      
      String sql = "delete from teacher where userId = ?";
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, userId);
         int r = pstmt.executeUpdate();
         if(r == 0) {
            throw new SchoolException("can't find teacher. so can't delete information");
         }
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
   }
   
   public void update(Teacher teacher) throws SchoolException {
      connect();
      
      String sql = "update teacher set name = ?, age = ?, subject = ? where userId = ?";
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, teacher.getName());
         pstmt.setInt(2, teacher.getAge());
         pstmt.setString(3,teacher.getSubject());
         pstmt.setInt(4, teacher.getUserId());
         
         int r = pstmt.executeUpdate();
         if(r == 0) {
            throw new SchoolException("can't find teacher. so can't update information");
         }
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
   }
   
   public Teacher select(int userId) throws SchoolException {
      connect();
      
      String sql = "select * from teacher where userId = ?";
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, userId);
         ResultSet rs = pstmt.executeQuery();
         
         if(rs.next()) {
            return new Teacher(userId, rs.getString("name"), rs.getInt("age"), rs.getString("subject"));
         }
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
      
      throw new SchoolException("can't find teacher");
   }
   
   public List<Teacher> selectAll() {
      connect();
      
      String sql = "select * from teacher";
      List<Teacher> list = new ArrayList<Teacher>();
      
      try {
         pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         while(rs.next()) {
            list.add(new Teacher(rs.getInt("userId"), rs.getString("name"), rs.getInt("age"), rs.getString("subject")));
         }
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
      
      return list;
   }
}