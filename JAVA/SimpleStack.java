package Chap13.Thread.problem;

public class SimpleStack {
	private char[] buffer = new char[5];
	private int index = 0;

	public void push(char c) {
		buffer[index] = c;
		index++;
	}

	public char pop() {
		index--;
		return buffer[index];
	}
}
