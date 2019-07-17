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
		
		// ��� �׽�Ʈ		
		Person psn = new Student("������", 27, 2012);
		try {
			schoolModel.addPerson(psn);
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		psn = new Teacher("������", 42, "�ڹ�");
		try {
			schoolModel.addPerson(psn);
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		psn = new Employee("�����", 26, "�л��Ĵ�");
		try {
			schoolModel.addPerson(psn);
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		// �˻� �׽�Ʈ
		try {
			psn = schoolModel.findPerson("�����");
			psn.printinfo2();
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
		
		// ���� �׽�Ʈ
		try {
			schoolModel.deletePerson("ȫ�浿");
		} catch (SchoolException e1) {
			System.out.println(e1.getMessage());
		}
				
		// ��ü ���
		Person[] persons = schoolModel.getAllPersons();
		System.out.println("::::: ��ü ��� :::::");
		for (Person person : persons) {
			person.printinfo2();
		}		
	}
}
