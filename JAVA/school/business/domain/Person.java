package school.business.domain;

import java.util.Objects;

public abstract class Person implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6344969695803162349L;
	private int userId;
	private String name;
	private int age;
	
	protected Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	protected Person(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}
	
	public void setUser_id(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return userId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public final void printInfo() {
		System.out.print(this);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if ((obj != null) && (obj instanceof Person)) {
			
		result = Objects.equals(this.name, ((Person)obj).name);
			
			
		}
		return result;
	}
	
	@Override
	public int hashCode() {

		return Objects.hashCode(name);

	}


	
	@Override
	public String toString() {
		return "이름: " + name + "\t나이: " + age;
	}
	
}
