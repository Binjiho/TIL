package schoolproject2;

import java.util.*;

import schoolbusiness.Person;

public class SchoolModelImpl implements SchoolModel {
	private Collection<Person> personDB = new HashSet<Person>();
	
//	Iterator<Person> it = personDB.iterator();
	
	public SchoolModelImpl() throws SchoolException{
//		personDB = new ArrayList<>(); //200명으로 제한
		personDB = new HashSet<>();
		
	}
//등록
	@Override
	public void addPerson(Person person) throws SchoolException {
		for (Person p : personDB) {
			if(person.getName().equals(p.getName())) {
				throw new SchoolException("동일한 이름을 가진 사람이 있습니다.");
			}
		}
		personDB.add(person);
		System.out.println("객체 생성 성공");
	}
//찾기
	@Override
	public Person findPerson(String name) throws SchoolException {
		for (Person p : personDB) {
			if (name.equals(p.getName())) {
				return p;
			}
		}
		throw new SchoolException("찾는 사람이 존재하지 않습니다.");
	}

//삭제
	@Override
	public void deletePerson(String name) throws SchoolException {
		for (Person p : personDB) {
			if (name.equals(p.getName())) {
				personDB.remove(p);
				return ;
			}
		}
		throw new SchoolException("삭제할 사람이 존재하지 않습니다");

	}
//전체출력
	@Override
	public Person[] getAllPersons() {
		Person[] persons = new Person[personDB.size()];
		
		Iterator<Person> it = personDB.iterator();
		
		for(int i=0;i<personDB.size();i++) {	
			persons[i]=it.next();
		}
		
		return persons;
	}

	@Override
	public void close() throws SchoolException {
		// TODO Auto-generated method stub

	}

}
