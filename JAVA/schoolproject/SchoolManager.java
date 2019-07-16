package schoolproject;
//ArrayList ����
import java.util.*;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import schoolbusiness.*;

public class SchoolManager extends Person {
	private Person [] personDB;
	private Person findp;
//	List<Person> personDB = new ArrayList<>();
	private int count;

	public SchoolManager() {
		personDB = new Person[200]; //200������ ����
		count=0;
	}
	
//	1.���
	public void registerPerson(Person p) {

		if (personDB != null) {
			for (int i = 0; i < count; i++) {
				if (p.getName().equals(personDB[i].getName())) {
					System.out.println("������ �̸��� ���� ����� �ֽ��ϴ�.");
					break;
				} else {
					personDB[count++] = p;
					System.out.println("����Ƚ��:" + count);
					personDB[count - 1].printinfo();
				}
			}
		}
		personDB[count++] = p;
		System.out.println("����Ƚ��:" + count);
		personDB[count - 1].printinfo();
	}

//  2.ã��
	public Person findPerson(String name) {
		for (int i = 0; i < count; i++) {				 // count ��ŭ ������ nullpoint���ذ�
			if (name.equals(personDB[i].getName())) {
				return personDB[i];
			}
		}
		return null;
	}

//  3.����
	/*
	public Person[] deletePerson(String name) {
//		���ο�迭�����
		Person[] persons= new Person[count];
		for (int i = 0; i < count+1; i++) {                  
			if (name.equals(personDB[i].getName())) {
				for (int j = 0; j < i; j++) {
					persons[j] = personDB[i];
				}
				for (int k=i;k<count;k++) {
					persons[k]=personDB[i+1];
				}
			}
			personDB=persons;
		}
		System.out.println(name + "���� �����Ͱ� �����Ǿ����ϴ�.");
		return personDB;
	}
	*/
	
	public void deletePerson(String name) {
		for (int i=0;i<count;i++) {
			if(name.equals(personDB[i].getName())){
				personDB[i]=personDB[--count];
				break;
			}
		}
	}
	
//	4.��ü���
	public Person[] getAllPersons() {
		Person[] persons = new Person[count];
		for(int i=0;i<persons.length;i++) {
			persons[i]=personDB[i];
		}
		return persons;
	}

//	5. view ���
	public void view() {
		
		boolean mainexit = true;
		while (mainexit) {
			System.out.println("*************Main menu*************");
			System.out.println("1. ���");
			System.out.println("2. ã��");
			System.out.println("3. ����");
			System.out.println("4. ��ü���");
			System.out.println("99. ����");
			System.out.println("��ȣ :");

			Scanner scanner = new Scanner(System.in);
			int maintab = scanner.nextInt();
			scanner.nextLine();
			if (maintab == 1) {
				boolean subexit = true;
				while (subexit) {
					System.out.println("*************Sub menu*************");
					System.out.println("1. �л�");
					System.out.println("2. ����");
					System.out.println("3. ����");
					System.out.println("4. �����޴�");
					System.out.println("��ȣ :");
					int subtab = scanner.nextInt();

					switch (subtab) {
					case 1:
						scanner.nextLine();
						System.out.println("�̸�: ");
						String sname = scanner.nextLine();
						System.out.println("����: ");
						int sage = scanner.nextInt();
						System.out.println("�й�: ");
						int sid = scanner.nextInt();
						registerPerson(new Student(sname, sage, sid));
						break;
					case 2:
						scanner.nextLine();
						System.out.println("�̸�: ");
						String tname = scanner.nextLine();
						System.out.println("����: ");
						int tage = scanner.nextInt();
						scanner.nextLine();
						System.out.println("����: ");
						String tsubject = scanner.nextLine();
						registerPerson(new Teacher(tname, tage, tsubject));
						break;
					case 3:
						scanner.nextLine();
						System.out.println("�̸�: ");
						String ename = scanner.nextLine();
						System.out.println("����: ");
						int eage = scanner.nextInt();
						scanner.nextLine();
						System.out.println("�μ�: ");
						String edept = scanner.nextLine();
						registerPerson(new Employee(ename, eage, edept));
						break;
					case 4:
						subexit = false;
						break;
					}
				}
			}
			if (maintab == 2) {
				System.out.println("::::::: ã�� :::::::");
				System.out.println("�̸�:");
				String findname = scanner.nextLine();
				findPerson(findname).printinfo2();
				
			}
			if (maintab == 3) {
				System.out.println("::::::: ���� :::::::");
				System.out.println("�̸�:");
				String deletename = scanner.nextLine();
				deletePerson(deletename);
			}
			if (maintab == 4) {
				Person[] personDB = getAllPersons();
				System.out.println("::::::: ��ü��� :::::::");
				for(Person person : personDB) {
					person.printinfo();
				}
			}
			if (maintab == 99) {
				mainexit = false;
				System.out.println("���α׷��� ����˴ϴ�.");
			}
		}
	}
}
