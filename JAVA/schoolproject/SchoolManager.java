package schoolproject;
//ArrayList 사용시
import java.util.*;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import schoolbusiness.*;

public class SchoolManager extends Person {
	private Person [] personDB;
	private Person findp;
//	List<Person> personDB = new ArrayList<>();
	private int count;

	public SchoolManager() {
		personDB = new Person[200]; //200명으로 제한
		count=0;
	}
	
//	1.등록
	public void registerPerson(Person p) {

		if (personDB != null) {
			for (int i = 0; i < count; i++) {
				if (p.getName().equals(personDB[i].getName())) {
					System.out.println("동일한 이름을 가진 사람이 있습니다.");
					break;
				} else {
					personDB[count++] = p;
					System.out.println("생성횟수:" + count);
					personDB[count - 1].printinfo();
				}
			}
		}
		personDB[count++] = p;
		System.out.println("생성횟수:" + count);
		personDB[count - 1].printinfo();
	}

//  2.찾기
	public Person findPerson(String name) {
		for (int i = 0; i < count; i++) {				 // count 만큼 돌려서 nullpoint없앤것
			if (name.equals(personDB[i].getName())) {
				return personDB[i];
			}
		}
		return null;
	}

//  3.삭제
	/*
	public Person[] deletePerson(String name) {
//		새로운배열만들기
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
		System.out.println(name + "님의 데이터가 삭제되었습니다.");
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
	
//	4.전체출력
	public Person[] getAllPersons() {
		Person[] persons = new Person[count];
		for(int i=0;i<persons.length;i++) {
			persons[i]=personDB[i];
		}
		return persons;
	}

//	5. view 출력
	public void view() {
		
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
			scanner.nextLine();
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
						scanner.nextLine();
						System.out.println("이름: ");
						String sname = scanner.nextLine();
						System.out.println("나이: ");
						int sage = scanner.nextInt();
						System.out.println("학번: ");
						int sid = scanner.nextInt();
						registerPerson(new Student(sname, sage, sid));
						break;
					case 2:
						scanner.nextLine();
						System.out.println("이름: ");
						String tname = scanner.nextLine();
						System.out.println("나이: ");
						int tage = scanner.nextInt();
						scanner.nextLine();
						System.out.println("과목: ");
						String tsubject = scanner.nextLine();
						registerPerson(new Teacher(tname, tage, tsubject));
						break;
					case 3:
						scanner.nextLine();
						System.out.println("이름: ");
						String ename = scanner.nextLine();
						System.out.println("나이: ");
						int eage = scanner.nextInt();
						scanner.nextLine();
						System.out.println("부서: ");
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
				System.out.println("::::::: 찾기 :::::::");
				System.out.println("이름:");
				String findname = scanner.nextLine();
				findPerson(findname).printinfo2();
				
			}
			if (maintab == 3) {
				System.out.println("::::::: 삭제 :::::::");
				System.out.println("이름:");
				String deletename = scanner.nextLine();
				deletePerson(deletename);
			}
			if (maintab == 4) {
				Person[] personDB = getAllPersons();
				System.out.println("::::::: 전체출력 :::::::");
				for(Person person : personDB) {
					person.printinfo();
				}
			}
			if (maintab == 99) {
				mainexit = false;
				System.out.println("프로그램이 종료됩니다.");
			}
		}
	}
}
