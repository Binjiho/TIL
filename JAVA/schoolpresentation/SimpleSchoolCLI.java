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
		System.out.println("::::::::::�׽�Ʈ ���α׷��� �����մϴ�::::::::::");
		
		registerRecord();
		
		displayAllRecords();
		
	}
	
	private void registerRecord() {
		System.out.println("\n����� �л� ���� �Է��ϼ���.");
		System.out.print("�̸� : ");
		
//		Ű����� �����Է¹޴°�
		String name = readString();		
		System.out.print("���� : ");
		int age = readInt();
		System.out.print("�й� : ");
		int id = readInt();
		
		Person p = new Student(name, age, id);
		
		try {
			model.addPerson(p);
		} catch (SchoolException e) {
			System.out.println(e.getMessage());
		}
	}

	private void displayAllRecords() {
		System.out.println("::::::::::��ü���::::::::::");
		Person[] persons = model.getAllPersons();
		for (Person psn : persons) {
			psn.printinfo2();

		}

	}
	
	private BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
	
//	Ű����κ��� �� �� �Է� �޾� ���ڿ��� ��ȯ
	public String readString() {
		String input = null;
		try {
			while((input = keyReader.readLine()).length()==0){
				System.out.print("�ٽ� �Է��� �ּ���: ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}
//	Ű����κ��� ���� �Է¹޾� ������ ��ȯ
	public int readInt(){
		int input = 0;
		try {
			input = Integer.parseInt(readString());
		} catch (NumberFormatException e) {
			System.out.print("������ �Է��� �ּ���: ");
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
