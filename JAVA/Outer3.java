//����Ŭ����

interface InterB{
	void add(int a, int b);
}

class Outer{ //Ŭ���� ��ư
	
	InterB addInt() {  //addInt()�� ��ư������
		return new InterB(){  //InterB�� �̺�Ʈ
			public void add(int a, int b){ //�̺�Ʈ�ϴ���
				System.out.println("a��b�� ��:"+(a+b));
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
