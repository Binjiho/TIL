package chap06.statics;

// * Singleton Pattern 을 적용해 설계한 클래스
// => 시스템 내에서 단 하나의 객체만 존재할 수 있는 클래스를 만들고 싶을 때 사용
public class Singleton {
	private static Singleton instance = new Singleton();	
	
	private Singleton() {}
	
	public static Singleton getInstance() {
/*		if (instance == null) { 
			instance = new Singleton();
		}	
*/		return instance;
	}
	
	// operations	
}
