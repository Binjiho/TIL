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
		new Thread(new Runner()).start();  //'.'�� ����� �����Ҷ� ���  '.'�ڿ��� ���, �տ��� ����� ���� Ŭ���� 
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
