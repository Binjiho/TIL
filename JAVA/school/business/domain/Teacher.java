package school.business.domain;

public class Teacher extends Person {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6108564216950005685L;
	private String subject;
	
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public Teacher(int userId, String name, int age, String subject) {
		super(userId, name, age);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
/*
	public void printInfo() {
		System.out.println("이름: " + getName() + "\t나이 : " + getAge() + "\t과목: " + this.subject);
	}
*/
	@Override
	public String toString() {
		return super.toString() + "\t과목: " + this.subject;
	}
}
