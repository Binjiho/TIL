package chap06.statics;

class StaticInitializer {
    static int si = 3; //클래스 로딩하면 클래스가 갖는것
    int i = 5; //객체가 생성되면 객체당 갖는것

    static {
        System.out.println("Static Initializer");
        si = 7;
    }

    public StaticInitializer() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Initializer");
        i = 10;
    }
}

public class StaticInitializerTest {
    public static void main(String[] args) {
        System.out.println("START main()");
        System.out.println("StaticInitializer's si = " + StaticInitializer.si);
        StaticInitializer test = new StaticInitializer();
        System.out.println("Test's i = " + test.i);
        System.out.println("End of main()");
    }
}
