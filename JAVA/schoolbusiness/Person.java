package schoolbusiness;

public class Person {
	private String name="";
	private int age;
	
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
}
