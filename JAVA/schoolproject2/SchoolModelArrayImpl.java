package schoolproject2;

import schoolbusiness.*;

public class SchoolModelArrayImpl implements SchoolModel{
	private Person [] personDB;
	private int count;
	
	public SchoolModelArrayImpl() throws SchoolException{
		personDB = new Person[200]; //200������ ����
		count=0;
	}
//���
	@Override
	public void addPerson(Person person) throws SchoolException {

		for (int i = 0; i < count; i++) {
			if (person.getName().equals(personDB[i].getName())) {
				throw new SchoolException("������ �̸��� ���� ����� �ֽ��ϴ�.");
			}
		}
		personDB[count] = person;
		count++;
		System.out.println("����Ƚ��:" + count);
		personDB[count - 1].printinfo();
	}
//ã��
	@Override
	public Person findPerson(String name) throws SchoolException {

		for (int i = 0; i < count; i++) {
			if (name.equals(personDB[i].getName())) {
				return personDB[i];
			}
		}
		throw new SchoolException("ã�� ����� �������� �ʽ��ϴ�.");
	}

//����
	@Override
	public void deletePerson(String name) throws SchoolException {

		for (int i = 0; i < count; i++) {
			if ((name.equals(personDB[i].getName()))) {
				personDB[i] = personDB[--count];
				return ;
			}
		}
		throw new SchoolException("������ ����� �������� �ʽ��ϴ�");
	}
	

	//��ü���
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
