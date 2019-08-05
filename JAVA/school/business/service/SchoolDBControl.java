package school.business.service;

import java.util.*;

import school.business.domain.*;

public class SchoolDBControl {
	/**
	 * 1. private 으로 Student, Employee, Teacher DAO 선언 2. 생성자에서 각 DAO초기화, 테이블이 없다면 각
	 * DAO의 createTable을 통해 생성해 줄 것 3. addPerson 메소드 : 이 객체가 어떤 객체인지 확인하여 맞는 DAO에
	 * insert 4. findPerson 메소드 : userId를 입력 받아 3개의 DAO에 검색해본다. 리턴값은 Person 5.
	 * deletePerson 메소드 : find와 동일 6. getAllPersons : 모든 DAO의 selectAll을 수행하여 하나의
	 * List로 묶어 리턴
	 */
//   1.Modification
	private StudentDAO studentDAO;
	private EmployeeDAO employeeDAO;
	private TeacherDAO teacherDAO;

//   2.Constructor
	public SchoolDBControl() {
		studentDAO = new StudentDAO();
		teacherDAO = new TeacherDAO();
		employeeDAO = new EmployeeDAO();
//   테이블 생성
		studentDAO.createTable();
		teacherDAO.createTable();
		employeeDAO.createTable();
	}

	// 3.addPerson & insert
	public void addPerson(Person p) throws SchoolException {

		String className = p.getClass().getSimpleName();
		if(className.equals("Student")) {
			studentDAO.insert((Student)p);
		}
		else if(className.equals("Employee")) {
			employeeDAO.insert((Employee)p);
		}
		else if(className.equals("Teacher")) {
			teacherDAO.insert((Teacher)p);
		}


	}

//  4.findPerson & select
	public Person findPerson(int userId) throws SchoolException {
		try {
			Student s = studentDAO.select(userId);
			s.printInfo();
		} catch (SchoolException se) {
			try {
				Teacher t = teacherDAO.select(userId);
				t.printInfo();
			} catch (SchoolException te) {
				Employee e = employeeDAO.select(userId);
				e.printInfo();
			}
		}
		return null;
	}

//   5.deletePerson & delete
	public void deletePerson(int userId) throws SchoolException {
		try {
			studentDAO.delete(userId);
		} catch (SchoolException se) {
			try {
				teacherDAO.delete(userId);
			} catch (SchoolException te) {
				employeeDAO.delete(userId);
			}
		}
	}

//  6.getAllPersons
	public List<Person> getAllPersons() {
		List<Person> plist = new ArrayList<Person>();
		plist.addAll(studentDAO.selectAll());
		plist.addAll(teacherDAO.selectAll());
		plist.addAll(employeeDAO.selectAll());

//		return (Person[]) plist.toArray();
		return plist;
	}

}
