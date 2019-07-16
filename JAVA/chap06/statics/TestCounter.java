package chap06.statics;

class Person {
    private int serialNumber;
    private static int counter = 0;
    
//    initializer block 객체초기화, 객체가 생성될때 딱 한번 초기화됨.
    {
    	serialNumber =0;
    	System.out.println(serialNumber);
    }
    
//    static initalizer block , 클래스가 로딩될때 한번 초기화 
    static {
    	System.out.println("Babo");
    }

    public static int getTotalCount() {
        return counter;
    }

    public Person() {
        counter++;
        serialNumber = counter;
    }
}

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("Number of people is " + Person.getTotalCount());
        Person psn1 = new Person();
        System.out.println("Number of people is " + Person.getTotalCount());
        Person psn2 = new Person();
        System.out.println("Number of people is " + psn1.getTotalCount());
    }
}
