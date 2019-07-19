package schoolpresentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import schoolbusiness.*;
import schoolproject2.*;

public class SimpleSchoolCLI {
//implements
	private SchoolModel model;
	
	public SimpleSchoolCLI(SchoolModel model) {
		this.model = model;
		start();
	}
	
	public void start() {
		System.out.println("::::::::::테스트 프로그램을 시작합니다::::::::::");
		
		registerRecord();
		
		displayAllRecords();
		
	}
	
	private void registerRecord() {
		System.out.println("\n등록할 학생 정보 입력하세요.");
		System.out.print("이름 : ");
		
//		키보드로 문자입력받는것
		String name = readString();		
		System.out.print("나이 : ");
		int age = readInt();
		System.out.print("학번 : ");
		int id = readInt();
		
		Person p = new Student(name, age, id);
		
		try {
			model.addPerson(p);
		} catch (SchoolException e) {
			System.out.println(e.getMessage());
		}
	}

	private void displayAllRecords() {
		System.out.println("::::::::::전체출력::::::::::");
		Person[] persons = model.getAllPersons();
		for (Person psn : persons) {
			psn.printinfo2();

		}

	}
	
	private BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
	
//	키보드로부터 한 줄 입력 받아 문자열로 변환
	public String readString() {
		String input = null;
		try {
			while((input = keyReader.readLine()).length()==0){
				System.out.print("다시 입력해 주세요: ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}
//	키보드로부터 한줄 입력받아 정수로 반환
	public int readInt(){
		int input = 0;
		try {
			input = Integer.parseInt(readString());
		} catch (NumberFormatException e) {
			System.out.print("정수를 입력해 주세요: ");
			input = readInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		try {
			new SimpleSchoolCLI(new SchoolModelImpl()).start();			
		}catch(SchoolException e) {
			e.printStackTrace();
		}
	}
}
