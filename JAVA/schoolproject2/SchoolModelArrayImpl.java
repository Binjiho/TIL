package schoolproject2;

import schoolbusiness.*;

public class SchoolModelArrayImpl implements SchoolModel{
	private Person [] personDB;
	private int count;
	
	public SchoolModelArrayImpl() throws SchoolException{
		personDB = new Person[200]; //200명으로 제한
		count=0;
	}
//등록
	@Override
	public void addPerson(Person person) throws SchoolException {

		for (int i = 0; i < count; i++) {
			if (person.getName().equals(personDB[i].getName())) {
				throw new SchoolException("동일한 이름을 가진 사람이 있습니다.");
			}
		}
		personDB[count] = person;
		count++;
		System.out.println("생성횟수:" + count);
		personDB[count - 1].printinfo();
	}
//찾기
	@Override
	public Person findPerson(String name) throws SchoolException {

		for (int i = 0; i < count; i++) {
			if (name.equals(personDB[i].getName())) {
				return personDB[i];
			}
		}
		throw new SchoolException("찾는 사람이 존재하지 않습니다.");
	}

//삭제
	@Override
	public void deletePerson(String name) throws SchoolException {

		for (int i = 0; i < count; i++) {
			if ((name.equals(personDB[i].getName()))) {
				personDB[i] = personDB[--count];
				return ;
			}
		}
		throw new SchoolException("삭제할 사람이 존재하지 않습니다");
	}
	

	//전체출력
	@Override
	public Person[] getAllPersons() {
		Person[] persons = new Person[count];
		for(int i=0;i<persons.length;i++) {
			persons[i]=personDB[i];
		}
		return persons;
	}

	@Override
	public void close() throws SchoolException {
		// TODO Auto-generated method stub
		
	}

}
