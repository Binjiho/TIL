package schoolproject;
import schoolbusiness.*;

public class SchoolManager extends Person {

	private Person [] personDB; 
	private int count;
	
	public SchoolManager() {
		personDB = new Person[100]; //100������ ����
		count=0;
	}
	
//	1.���
	public void registerPerson(Person p) {
		personDB[count++]=p;
	}
	
//  2.ã��
	public Person findPerson(String name) {
		System.out.println("::::::: ã�� :::::::");
		System.out.println("�̸� :");
		for (int i = 0; i < 100; i++) {
			if (personDB[i].getName() == name) {
				return personDB[i];
			}
			else {
				System.out.println("�ش�Ǵ� ����� �����ϴ�.");
			}
		}
	}

//  3.����
	public void deletePerson(String name) {
	
		System.out.println(name+"���� �����Ͱ� �����Ǿ����ϴ�.");
	}
	
//	4.��ü���
	public Person[] getAllPersons() {
		return null;
	}
}
