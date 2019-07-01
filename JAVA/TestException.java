
public class TestException {

	public static void main(String[] args) {
		int arrays[]= {1,3,5,7};
		try {
			for (int i=0;i<6;i++) {
				System.out.println(arrays[i]); //ArrayIndexOutofBoundsException발생
			}
			int c=10/0; //ArithmeticException발생
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index에러");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눔");
		}catch(Exception e) {
			System.out.println("Exception의 조상");
		}finally {
			System.out.println("무조건 실행");
		}
	}

}

