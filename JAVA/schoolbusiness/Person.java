package schoolbusiness;

import java.util.Objects;

import chap09.BirthDate;

public class Person {
	private String name="";
	private int age;
	
	public Person() {
		this("����ȣ",27);
	}
	
	public Person(String name, int age) {
		this.name =name;
		this.age=age;
	}
	
	public String getName() {
		
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String printinfo() {
		return "�̸�:"+name+" ����:"+age;
	}
//����2
	
	public void printinfo2() {
		System.out.println("�̸�:"+name+" ����:"+age);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if((obj != null) && (obj instanceof Person)) {
			Person p = (Person)obj;
			result=(Objects.equals(name, p.name));				
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
//		return Integer.parseInt(name)^age;  //�Ϻη� ������ ���갪�� �����
//		return (name==null)? 0 : name.hashCode();
		return Objects.hashCode(name);
	}
	
	@Override
	public String toString() {
		return "�̸�:"+name+"����"+age;
	}
}
