package chap06.statics;

public class SingletonTest {

	public static void main(String[] args) {
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        Singleton st3 = Singleton.getInstance();

        System.out.println(st1 == st2);
		System.out.println(st2 == st3);
	}
}

