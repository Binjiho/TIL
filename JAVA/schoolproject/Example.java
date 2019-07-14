package schoolproject;

import schoolbusiness.*;

public class Example {

	public static void main(String[] args) {
		SchoolManager manager = new SchoolManager();
		
//		����׽�Ʈ
		Student s1 = new Student("������",27,2012);
		manager.registerPerson(s1);
		Student s2 = new Student("������",27,2012);
		manager.registerPerson(s2);
		Student s3 = new Student("ȫ�浿",27,2012);
		manager.registerPerson(s3);
		Student s4 = new Student("���ѱ�",27,1993);
		manager.registerPerson(s4);

//		�˻��׽�Ʈ
		System.out.println("::::::: �˻� :::::::");
		Person p = manager.findPerson("������");
		p.printinfo();
		
//		�����׽�Ʈ
		manager.deletePerson("ȫ�浿");
		
		
//		��ü ��ȸ�׽�Ʈ
		Person[] persons = manager.getAllPersons();
		
		System.out.println("::::::: ��ü��� :::::::");
		
		for (int i=0;i<persons.length;i++) {
			persons[i].printinfo2();
		}
		/*
		
//		Inhanced forloop(= for each)
//		arraycollection�� element type : �迭  ��ü�� �̸�
		for (Person person : persons) {
			person.printinfo2();
		}
		*/	
	}
}
