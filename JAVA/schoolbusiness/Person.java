package schoolbusiness;

import java.util.Objects;

import chap09.BirthDate;

public class Person {
	private String name="";
	private int age;
	
	public Person() {
		this("빈지호",27);
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
		return "이름:"+name+" 나이:"+age;
	}
//구현2
	
	public void printinfo2() {
		System.out.println("이름:"+name+" 나이:"+age);
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
//		return Integer.parseInt(name)^age;  //일부러 복잡한 연산값을 써야함
//		return (name==null)? 0 : name.hashCode();
		return Objects.hashCode(name);
	}
	
	@Override
	public String toString() {
		return "이름:"+name+"나이"+age;
	}
}
