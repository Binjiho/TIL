package schoolbusiness;

public class Employee extends Person {

	String dept;
//constructor
	public Employee() {}
	/*
	public Employee(String name,int age,String dept) {
		super.setName(name);
		super.setAge(age);
		this.dept=dept;
	}
	*/
	public Employee(String name,int age,String dept) {
		super(name,age);
		this.dept=dept;
	}
//methods
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept=dept;
	}
	public String printinfo() {
		System.out.println(super.printinfo()+" �μ�:"+dept);
		return super.printinfo()+" �μ�:"+dept;
	}
	@Override
	public void printinfo2() {
		System.out.println("�̸�:"+super.getName()+" ����:"+super.getAge()+" �μ�:"+dept);
	}
	
	@Override
	public String toString() {
//		return "�̸�:"+super.getName()+"����"+super.getAge()+"�й�"+id;
		return super.toString()+"�μ�"+dept;
	}
}
