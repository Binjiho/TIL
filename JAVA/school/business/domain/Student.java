package school.business.domain;

public class Student extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6201383042671964112L;
	private int id;

	/*
	 * public Student() {
	 * 
	 * }
	 */
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public Student(int userId, String name, int age, int id) {
		super(userId, name, age);
		this.id = id;
	}

	/*
	 * @Override protected Student getAnyPerson() { return this; }
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public void printInfo() {
	 * 
	 * System.out.println("이름: " + getName() + "\t나이 : " + getAge() + "\t학번: " +
	 * this.id); }
	 */
	public String toString() {
		return super.toString() + "\t학번: " + this.id;
	}

}
