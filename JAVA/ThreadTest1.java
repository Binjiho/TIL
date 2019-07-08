package kr.ac.hansung.Thread.basic;

class Runner implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread's run(); ");
	}
}


public class ThreadTest1 {
	public static void main(String[] args) {
		
		System.out.println("Start Of Main();");
		new Thread(new Runner()).start();  //'.'은 멤버에 접근할때 사용  '.'뒤에는 멤버, 앞에는 멤버의 주인 클래스 
		System.out.println("End Of Main();");
	}

}

//unnotation @Override
class RunnerA extends Object{
	
	//@Override 
	public boolean equal(Object obj) {
		return false;
	}
}
