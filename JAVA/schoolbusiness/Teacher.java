package schoolbusiness;

public class Teacher extends Person {
	
	String subject;
//constructor
	public Teacher() {}
	public Teacher(String name,int age,String subject) {
		super(name,age);
		this.subject=subject;
	}
//methods
	public String getId() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public String printinfo() {
		System.out.println(super.printinfo()+" 과목:"+subject);
		return super.printinfo()+" 과목:"+subject;
	}
	@Override
	public void printinfo2() {
		System.out.println("이름:"+super.getName()+" 나이:"+super.getAge()+" 과목:"+subject);
	}
	
	@Override
	public String toString() {
//		return "이름:"+super.getName()+"나이"+super.getAge()+"학번"+id;
		return super.toString()+"과목"+subject;
	}
}
