package schoolproject;
import schoolbusiness.*;
import java.util.*;

public class SchoolTest {
/*
	public static void main(String[] args) {
		SchoolManager manager = new SchoolManager();
		
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
						manager.registerPerson(new Student(sname, sage, sid));
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
						manager.registerPerson(new Teacher(tname, tage, tsubject));
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
						manager.registerPerson(new Employee(ename, eage, edept));
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
				manager.findPerson(findname);
			}
			if (maintab == 3) {
				System.out.println("::::::: ���� :::::::");
				System.out.println("�̸�:");
				String deletename = scanner.nextLine();
				manager.deletePerson(deletename);
			}
			if (maintab == 4) {
				Person[] personDB = manager.getAllPersons();
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
*/
}

