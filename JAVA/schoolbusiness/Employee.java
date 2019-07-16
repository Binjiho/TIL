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
		System.out.println(super.printinfo()+" 부서:"+dept);
		return super.printinfo()+" 부서:"+dept;
	}
	@Override
	public void printinfo2() {
		System.out.println("이름:"+super.getName()+" 나이:"+super.getAge()+" 부서:"+dept);
	}
	
	@Override
	public String toString() {
//		return "이름:"+super.getName()+"나이"+super.getAge()+"학번"+id;
		return super.toString()+"부서"+dept;
	}
}
