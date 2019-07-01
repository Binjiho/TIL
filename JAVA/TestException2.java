class MyException extends Exception{
	public String toString() {
		return "MyException";
	}
}
public class TestException2 {

	public static void main(String[] args) {
		try {
			throw new MyException();
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			
		}

	}

}
