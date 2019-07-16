package chap09;

import chap09.BirthDate;

public class ObjectTest {
	public static void main(String[] args) {
		String myName = "이지은";
		String yourName = new String("이지은");
		
		System.out.println(myName == yourName);
		System.out.println(myName.equals(yourName));
		System.out.println(myName.hashCode());
		System.out.println(yourName.hashCode());
		System.out.println(myName.toString());
		System.out.println(yourName.toString());

		BirthDate myBirth = new BirthDate(1993, 5, 16);
		BirthDate yourBirth = new BirthDate(1993, 5, 16);

		System.out.println(myBirth == yourBirth);
		System.out.println(myBirth.equals(yourBirth));
		System.out.println(myBirth.hashCode());
		System.out.println(yourBirth.hashCode());
		System.out.println(myBirth.toString());
		System.out.println(yourBirth);
    }
	
	
}
