package schoolproject2;

import java.util.*;

import schoolbusiness.Person;

public class SchoolModelImpl implements SchoolModel {
	private Collection<Person> personDB = new HashSet<Person>();
	
//	Iterator<Person> it = personDB.iterator();
	
	public SchoolModelImpl() throws SchoolException{
//		personDB = new ArrayList<>(); //200������ ����
		personDB = new HashSet<>();
		
	}
//���
	@Override
	public void addPerson(Person person) throws SchoolException {
		for (Person p : personDB) {
			if(person.getName().equals(p.getName())) {
				throw new SchoolException("������ �̸��� ���� ����� �ֽ��ϴ�.");
			}
		}
		personDB.add(person);
		System.out.println("��ü ���� ����");
	}
//ã��
	@Override
	public Person findPerson(String name) throws SchoolException {
		for (Person p : personDB) {
			if (name.equals(p.getName())) {
				return p;
			}
		}
		throw new SchoolException("ã�� ����� �������� �ʽ��ϴ�.");
	}

//����
	@Override
	public void deletePerson(String name) throws SchoolException {
		for (Person p : personDB) {
			if (name.equals(p.getName())) {
				personDB.remove(p);
				return ;
			}
		}
		throw new SchoolException("������ ����� �������� �ʽ��ϴ�");

	}
//��ü���
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
