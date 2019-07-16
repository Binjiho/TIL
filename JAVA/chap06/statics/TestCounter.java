package chap06.statics;

class Person {
    private int serialNumber;
    private static int counter = 0;
    
//    initializer block ��ü�ʱ�ȭ, ��ü�� �����ɶ� �� �ѹ� �ʱ�ȭ��.
    {
    	serialNumber =0;
    	System.out.println(serialNumber);
    }
    
//    static initalizer block , Ŭ������ �ε��ɶ� �ѹ� �ʱ�ȭ 
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
