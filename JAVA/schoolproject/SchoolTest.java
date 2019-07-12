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
			System.out.println("1. 등록");
			System.out.println("2. 찾기");
			System.out.println("3. 삭제");
			System.out.println("4. 전체출력");
			System.out.println("99. 종료");
			System.out.println("번호 :");

			Scanner scanner = new Scanner(System.in);
			int maintab = scanner.nextInt();

			if (maintab == 1) {
				boolean subexit = true;
				while (subexit) {
					System.out.println("*************Sub menu*************");
					System.out.println("1. 학생");
					System.out.println("2. 교수");
					System.out.println("3. 직원");
					System.out.println("4. 상위메뉴");
					System.out.println("번호 :");
					int subtab = scanner.nextInt();

					switch (subtab) {
					case 1:
						System.out.println("이름: ");
						String sname = scanner.toString();
						System.out.println("나이: ");
						int sage = scanner.nextInt();
						System.out.println("학번: ");
						int sid = scanner.nextInt();
						manager.registerPerson(new Student(sname,sage,sid));
						break;
					case 2:
						System.out.println("이름: ");
						String tname = scanner.toString();
						System.out.println("나이: ");
						int tage = scanner.nextInt();
						System.out.println("과목: ");
						String tsubject = scanner.toString();
						manager.registerPerson(new Teacher(tname,tage,tsubject));
						break;
					case 3:
						System.out.println("이름: ");
						String ename = scanner.toString();
						System.out.println("나이: ");
						int eage = scanner.nextInt();
						System.out.println("부서: ");
						String edept = scanner.toString();
						manager.registerPerson(new Employee(ename,eage,edept));
						break;
					case 4:
						subexit = false;
						break;

					}
				}
				if (maintab==2) {
					System.out.println("::::::: 찾기 :::::::");
					System.out.println("이름:");
					String findname=scanner.toString();
					if(personDB[count].name==findname) {
						System.out.println(personDB[count].printinfo());
					}
				}
				if (maintab==3) {}
				if (maintab==4) {}
				if (maintab==99) {
					mainexit=false;
					System.out.println("프로그램이 종료됩니다.");
				}
			}
		}
		public void find(String name) {
			
		}
	}
*/
}
