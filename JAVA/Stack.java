package Chap13.Thread.Synchronization;
//Thread wait(),notify()
import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<Character> buffer = new ArrayList<Character>(10); // not thread-safe

	public void push(char c) {
		synchronized(buffer){
			buffer.add(c);
			buffer.notify();
		}
	}
	
	public char pop() {
		synchronized (buffer) {
			while (buffer.size() == 0) {
				try {
					buffer.wait();  // lockflag놓고 object's wait pool 에서 조건이 만족될때까지 쉬고있을께
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			char c = buffer.remove(buffer.size() - 1); // index가 범위 밖이면 IndexOutOfBoundsException 발생
			return c;
		}
	}
}
