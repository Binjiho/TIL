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
						System.out.println("�̸�: ");
						String sname = scanner.toString();
						System.out.println("����: ");
						int sage = scanner.nextInt();
						System.out.println("�й�: ");
						int sid = scanner.nextInt();
						manager.registerPerson(new Student(sname,sage,sid));
						break;
					case 2:
						System.out.println("�̸�: ");
						String tname = scanner.toString();
						System.out.println("����: ");
						int tage = scanner.nextInt();
						System.out.println("����: ");
						String tsubject = scanner.toString();
						manager.registerPerson(new Teacher(tname,tage,tsubject));
						break;
					case 3:
						System.out.println("�̸�: ");
						String ename = scanner.toString();
						System.out.println("����: ");
						int eage = scanner.nextInt();
						System.out.println("�μ�: ");
						String edept = scanner.toString();
						manager.registerPerson(new Employee(ename,eage,edept));
						break;
					case 4:
						subexit = false;
						break;

					}
				}
				if (maintab==2) {
					System.out.println("::::::: ã�� :::::::");
					System.out.println("�̸�:");
					String findname=scanner.toString();
					if(personDB[count].name==findname) {
						System.out.println(personDB[count].printinfo());
					}
				}
				if (maintab==3) {}
				if (maintab==4) {}
				if (maintab==99) {
					mainexit=false;
					System.out.println("���α׷��� ����˴ϴ�.");
				}
			}
		}
		public void find(String name) {
			
		}
	}
*/
}
