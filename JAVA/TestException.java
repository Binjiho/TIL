
public class TestException {

	public static void main(String[] args) {
		int arrays[]= {1,3,5,7};
		try {
			for (int i=0;i<6;i++) {
				System.out.println(arrays[i]); //ArrayIndexOutofBoundsException�߻�
			}
			int c=10/0; //ArithmeticException�߻�
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index����");
		}catch(ArithmeticException e) {
			System.out.println("0���� ����");
		}catch(Exception e) {
			System.out.println("Exception�� ����");
		}finally {
			System.out.println("������ ����");
		}
	}

}

