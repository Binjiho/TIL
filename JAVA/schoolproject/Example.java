package schoolproject;

import schoolbusiness.*;

public class Example {

	public static void main(String[] args) {
		SchoolManager manager = new SchoolManager();
		
//		등록테스트
		Student s = new Student("이지은",27,2012);
		manager.registerPerson(s);
		
//		검색테스트
		Person p = manager.findPerson("배주현");
		p.printinfo();
		
//		삭제테스트
		manager.deletePerson("홍길동");
		
		
//		전체 조회테스트
		Person[] persons = manager.getAllPersons();
		System.out.println("::::::: 전체출력 :::::::");
		/*
		for (int i=0;i<persons.length;i++) {
			persons[i].printinfo();
		}
		*/
//		Inhanced forloop(= for each)
//		arraycollection의 element type : 배열  객체의 이름
		for (Person a : persons) {
			a.printinfo();
		}
		

	}

}
