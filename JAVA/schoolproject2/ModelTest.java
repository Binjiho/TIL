package schoolproject2;

import schoolbusiness.*;


public class ModelTest {
	public static void main(String[] args) {
		SchoolModel schoolModel = null;
		
		try {
			schoolModel = new SchoolModelImpl();
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		// 등록 테스트		
		Person psn = new Student("이지은", 27, 2012);
		try {
			schoolModel.addPerson(psn);
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		psn = new Teacher("이지은", 42, "자바");
		try {
			schoolModel.addPerson(psn);
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		psn = new Employee("배수지", 26, "학생식당");
		try {
			schoolModel.addPerson(psn);
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		// 검색 테스트
		try {
			psn = schoolModel.findPerson("배수지");
			psn.printinfo2();
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		// 삭제 테스트
		try {
			schoolModel.deletePerson("홍길동");
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
				
		// 전체 출력
		Person[] persons = schoolModel.getAllPersons();
		System.out.println("::::: 전체 출력 :::::");
		for (Person person : persons) {
			person.printinfo2();
		}		
	}
}
