package kr.ac.hansung;
//Runnable 인터페이스를 구현하고 있는 anonymous class 객체 생성
public class AnonymousClass2 {
public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getName());
		
		//Runnable 인터페이스를 구현하고 있는 anonymous class 객체 생성
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;

				while (true) {
					System.out.println("count " + i++ + " by " + Thread.currentThread().getName());
					if (i == 50) {
						break;
					}
				}
			}
		});
		
		t.start();
	}
}

