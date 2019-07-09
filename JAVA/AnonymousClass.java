package kr.ac.hansung;
//어떤 클래스를 확장하고 있을때의 anonymous class
public class AnonymousClass {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getName());

		Thread t = new Counter2();
		
		//anonymous class
		/*
		Thread t = new Thread(){
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
		};
		*/
		t.start();
	}
}

class Counter2 extends Thread {
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
}
