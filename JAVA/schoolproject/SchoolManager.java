package schoolproject;
import schoolbusiness.*;

public class SchoolManager extends Person {

	private Person [] personDB; 
	private int count;
	
	public SchoolManager() {
		personDB = new Person[100]; //100명으로 제한
		count=0;
	}
	
//	1.등록
	public void registerPerson(Person p) {
		personDB[count++]=p;
	}
	
//  2.찾기
	public Person findPerson(String name) {
		System.out.println("::::::: 찾기 :::::::");
		System.out.println("이름 :");
		for (int i = 0; i < 100; i++) {
			if (personDB[i].getName() == name) {
				return personDB[i];
			}
			else {
				System.out.println("해당되는 사람이 없습니다.");
			}
		}
	}

//  3.삭제
	public void deletePerson(String name) {
	
		System.out.println(name+"님의 데이터가 삭제되었습니다.");
	}
	
//	4.전체출력
	public Person[] getAllPersons() {
		return null;
	}
}
