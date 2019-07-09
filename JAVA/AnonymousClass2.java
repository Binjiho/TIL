package kr.ac.hansung;
//Runnable �������̽��� �����ϰ� �ִ� anonymous class ��ü ����
public class AnonymousClass2 {
public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getName());
		
		//Runnable �������̽��� �����ϰ� �ִ� anonymous class ��ü ����
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

