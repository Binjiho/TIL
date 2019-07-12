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
		System.out.println(super.printinfo()+" 학번:"+id);
		return super.printinfo()+" 학번:"+id;
	}
	@Override
	public void printinfo2() {
		System.out.println("이름:"+super.getName()+" 나이:"+super.getAge()+" 학번:"+id);
	}

}
