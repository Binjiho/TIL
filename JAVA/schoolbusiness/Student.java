package schoolbusiness;

public class Student extends Person {

	int id;
//constructor
	public Student() {}
	public Student(String name,int age,int id) {
		super.setName(name);
		super.setAge(age);
		this.id=id;
	}
//methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String printinfo() {
		System.out.println(super.printinfo()+" �й�:"+id);
		return super.printinfo()+" �й�:"+id;
	}
	@Override
	public void printinfo2() {
		System.out.println("�̸�:"+super.getName()+" ����:"+super.getAge()+" �й�:"+id);
	}

}
