package schoolproject;
//ArrayList 사용시
import java.util.*;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import schoolbusiness.*;

public class SchoolManager extends Person {
	private Person [] personDB;
	private Person findp;
//	List<Person> personDB = new ArrayList<>();
	private int count;

	public SchoolManager() {
		personDB = new Person[4]; //200명으로 제한
		count=0;
	}
	
//	1.등록
	public void registerPerson(Person p) {
		personDB[count++]=p;
		System.out.println("생성횟수:"+ count);
		personDB[count-1].printinfo();
	}
	
//  2.찾기
	public Person findPerson(String name) {
		for (int i = 0; i < personDB.length; i++) {
			if (name.equals(personDB[i].getName())) {
				findp = personDB[i];				
			}
		}
		return findp;
	}

//  3.삭제
	public Person[] deletePerson(String name) {
		for (int i = 0; i < personDB.length; i++) {
			if (name.equals(personDB[i].getName())) {
				for (int j = i; j < personDB.length -1; j++) {
					personDB[j] = personDB[i + 1];
					personDB[j].printinfo2();
				}
			}
		}
		System.out.println(name + "님의 데이터가 삭제되었습니다.");
		return personDB;
	}
	
//	4.전체출력
	public Person[] getAllPersons() {

		return personDB;
	}
}
