package school.presentation.cli;

import java.util.ArrayList;

import school.business.domain.*;
import school.business.service.*;
import school.util.KeyInput;

/* 키보드 입력 관련 Utility Method
   1. KeyInput.readInt() : 키보드로부터 입력받은 값을 int 값으로 변환하여 리턴
   2. KeyInput.readString() : 키보드로부터 입력받은 값을 String으로 만들어 리턴
*/
public class SchoolCLI {
//   private SchoolModel model;
   private SchoolDBControl control;
/*   
   public SchoolCLI(SchoolModel model) {
      this.model = model;
   }
*/
   public SchoolCLI(SchoolDBControl control) {
      this.control = control;
   }
   
   /** 프로그램의 시작 메소드로 무한 반복하며 메인 메뉴를 출력  
    * @throws TeacherException 
    * @throws StudentException */
   public void start() throws SchoolException{
      while (true) {
         displayMainMenu();   // 메인메뉴 출력
         int input = KeyInput.readInt();

         switch (input) {
            case 1 :    //  "1. 등록"일 경우
               registerRecord();
                  break;
             case 2 :    // "2. 찾기"일 경우
               findRecord();
               break;
            case 3 :    // "3. 삭제"일 경우
               deleteRecord();
               break;
            case 4 :    // "4. 전체출력"일 경우
               displayAllRecords();
               break;
            case 99:   // "99. 종료"일 경우
               exit();
               break;
            default :
               System.out.println("번호 입력 오류입니다.");
         }
      }
   }
   
   /** 메인메뉴에서 "1. 등록" 을 선택했을 때 호출될 메소드.
    *  Student, Teacher, Employee 객체를 생성하여 SchoolModel의 addPerson()을 호출 
 * @throws SchoolException */
   private void registerRecord() throws SchoolException {
      Person person = null;

      while (true) {
         displaySubMenu();   // 서브메뉴 출력
         int input = KeyInput.readInt();

         switch (input) {
            case 1 :    // "1. 학생"일 경우
               person = makeStudent();
               break;
            case 2 :    // "2. 교수"일 경우
               person = makeTeacher();
               break;
            case 3 :    // "3. 직원"일 경우
               person =  makeEmployee();
               break;
            case 4 :    // "4. 상위메뉴"일 경우
               return;
            default :
               System.out.println("번호 입력 오류입니다.");
               continue;
         }
         //이거 뭐야control.addPerson(person);
      }
   }

   /** 메인메뉴에서 "2. 찾기" 를 선택했을 때 호출될 메소드.
    *  이름을 입력받아 SchoolModel의 findPerson() 호출하여 해당 정보를 찾아 출력  
    * @throws TeacherException 
    * @throws StudentException */
   private void findRecord() {
      System.out.println("::::::: 찾기 :::::::");
      System.out.print("UserID : ");
         int userId = KeyInput.readInt();
      try {
         Person p = control.findPerson(userId);
         
         
      } catch (SchoolException e) {
         System.out.println(e.getMessage());
      }
   }

   /** 메인메뉴에서 "3. 삭제" 를 선택했을 때 호출될 메소드.
    *  이름을 입력받아 SchoolModel의 deletePerson()을 호출하여 해당 정보 삭제  
    * @throws TeacherException 
    * @throws StudentException */
   private void deleteRecord() {
      System.out.println("::::::: 삭제 :::::::");
      System.out.print("UserID : ");
      int userId = KeyInput.readInt();
      try {
         control.deletePerson(userId);
//         System.out.println(control.findPerson(userId).getName() + "님의 데이터가 삭제되었습니다.");
      } catch (SchoolException e) {
         System.out.println(e.getMessage());
      }
   }

   /** 메인메뉴에서 "4. 전체출력" 을 선택했을 때 호출될 메소드.
    *  SchoolModel의 getAllPersons()를 호출하여 얻은 모든 Person 정보를 출력  */
   private void displayAllRecords() {
      ArrayList<Person> list = new ArrayList<Person>();
      list.addAll(control.getAllPersons());
      for(Person p:list) {
         p.printInfo();
         System.out.println();
      }
      
   }

   /** 메인메뉴에서 "99. 종료" 를 선택했을 때 호출될 메소드.
    *  SchoolModel의 close()를 호출하여 데이터를 저장하고 프로그램을 종료  */
   private void exit() {
//      try {
//         control.close();
//      } catch (SchoolException e) {
//         System.out.println(e.getMessage());
//      }
      System.exit(0);
   }

   /** 등록의 서브메뉴에서 "1. 학생" 을 선택했을 때 호출될 메소드.
     *   이름, 나이, 학번 정보를 입력받아 Student 객체를 생성하여 리턴  
 * @throws SchoolException */
   private Student makeStudent() throws SchoolException {
      System.out.print("UserID: ");
         int userId = KeyInput.readInt();
      System.out.print("이름 : ");
         String name = KeyInput.readString();
      System.out.print("나이 : ");
         int age = KeyInput.readInt();
      System.out.print("학번 : ");
         int id = KeyInput.readInt();
      Student s =new Student(userId,name, age, id);
      control.addPerson(s);
      return s;
   }

   /** 등록의 서브메뉴에서 "2. 교수" 를 선택했을 때 호출될 메소드.
     *   이름, 나이, 과목 정보를 입력받아 Teacher 객체를 생성하여 리턴  
 * @throws SchoolException */
   private Teacher makeTeacher() throws SchoolException {
      System.out.print("UserID: ");
      int userId = KeyInput.readInt();
      System.out.print("이름 : ");
         String name = KeyInput.readString();
      System.out.print("나이 : ");
         int age = KeyInput.readInt();
      System.out.print("과목 : ");
         String subject = KeyInput.readString();
      Teacher t= new Teacher(userId,name, age, subject);
      control.addPerson(t);
      return t;
   }

   /** 등록의 서브메뉴에서 "3. 직원" 을 선택했을 때 호출될 메소드.
     *   이름, 나이, 부서 정보를 입력받아 Employee 객체를 생성하여 리턴  
 * @throws SchoolException */
   private Employee makeEmployee() throws SchoolException {
      System.out.print("UserID: ");
      int userId = KeyInput.readInt();
      System.out.print("이름 : ");
         String name = KeyInput.readString();
      System.out.print("나이 : ");
         int age = KeyInput.readInt();
      System.out.print("부서 : ");
         String dept = KeyInput.readString();
      Employee e= new Employee(userId,name, age, dept);
      control.addPerson(e);
      return e;
   }
    
   /** 메인메뉴를 출력하는 메소드  */
   private void displayMainMenu(){
      System.out.println("\n********** Main menu **********");
      System.out.println("1. 등록");
      System.out.println("2. 찾기");
      System.out.println("3. 삭제");
      System.out.println("4. 전체출력");
      System.out.println("99. 종료");
      System.out.print("번호 : ");
   }
   
   /** 등록의 서브메뉴를 출력하는 메소드  */
   private void displaySubMenu(){
      System.out.println("\n********** Sub menu ***********");
      System.out.println("1. 학생");
      System.out.println("2. 교수");
      System.out.println("3. 직원");
      System.out.println("4. 상위메뉴");
      System.out.print("번호 : ");
   }

   /** 프로그램의 시작점인 메인 메소드  */
   public static void main(String[] args) throws Exception {
//      SchoolModel model = new SchoolModelImpl();
      SchoolDBControl control = new SchoolDBControl();
//      new SchoolCLI(model).start();
      new SchoolCLI(control).start();
   }
}