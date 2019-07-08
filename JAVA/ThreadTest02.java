package kr.ac.hansung.Thread.basic;

public class ThreadTest02 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  //수행하고 있는 Thread 이름 반환

		Counter c = new Counter();
		Thread t = new Thread(c);
		Thread t2 = new Thread(c);
		t.start();
		t2.start();
		System.out.println("End Of Main()");
	    
	}
}

class Counter implements Runnable {
	int i = 0;
	
	@Override
	public void run() {
		

		while (true) {
			System.out.println("count " + i++ + " by " + Thread.currentThread().getName());
			if (i == 50) {
				break;
			}
		}
	}
}


