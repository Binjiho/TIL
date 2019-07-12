package schoolproject;

import schoolbusiness.*;

public class Example {

	public static void main(String[] args) {
		SchoolManager manager = new SchoolManager();
		
//		����׽�Ʈ
		Student s = new Student("������",27,2012);
		manager.registerPerson(s);
		
//		�˻��׽�Ʈ
		Person p = manager.findPerson("������");
		p.printinfo();
		
//		�����׽�Ʈ
		manager.deletePerson("ȫ�浿");
		
		
//		��ü ��ȸ�׽�Ʈ
		Person[] persons = manager.getAllPersons();
		System.out.println("::::::: ��ü��� :::::::");
		/*
		for (int i=0;i<persons.length;i++) {
			persons[i].printinfo();
		}
		*/
//		Inhanced forloop(= for each)
//		arraycollection�� element type : �迭  ��ü�� �̸�
		for (Person a : persons) {
			a.printinfo();
		}
		

	}

}
