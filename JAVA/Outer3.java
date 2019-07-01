//내부클래스

interface InterB{
	void add(int a, int b);
}

class Outer{ //클래스 버튼
	
	InterB addInt() {  //addInt()는 버튼눌렀다
		return new InterB(){  //InterB는 이벤트
			public void add(int a, int b){ //이벤트하는일
				System.out.println("a와b의 합:"+(a+b));
			}
		};
	}
}
	



public class Outer3 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		InterB inter = outer.addInt();
		inter.add(3,4);

	}

}
