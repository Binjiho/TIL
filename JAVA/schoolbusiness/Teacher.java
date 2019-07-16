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
		System.out.println(super.printinfo()+" ����:"+subject);
		return super.printinfo()+" ����:"+subject;
	}
	@Override
	public void printinfo2() {
		System.out.println("�̸�:"+super.getName()+" ����:"+super.getAge()+" ����:"+subject);
	}
	
	@Override
	public String toString() {
//		return "�̸�:"+super.getName()+"����"+super.getAge()+"�й�"+id;
		return super.toString()+"����"+subject;
	}
}
