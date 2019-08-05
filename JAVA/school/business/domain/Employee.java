package school.business.domain;

public class Employee extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3816809309519924517L;
	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age); // super 호출을 통해서 부모의 생성자를 이용할 수 있음. 첫번째 라인에서 사용가능
		// this();
		// 한 생성자에 super호출과 this호출을 같이 사용할 수 없음.
		// setName(name);
		// setAge(age);

		this.dept = dept;
	}

	public Employee(int userId, String name, int age, String dept) {
		super(userId, name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
/*
	@Override
	public void printInfo() {

		System.out.println("이름: " + getName() + "\t나이 : " + getAge() + "\t부서: " + this.dept);
	}
*/
	@Override
	public String toString() {
		return super.toString() + "\t부서: " + this.dept;
	}

}