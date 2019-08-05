package school.util;

import java.util.*;

/** 
 *  KeyInput 클래스는 표준 입력(키보드)을 받기 위한 기능을 구현한
 *  유틸리티 클래스로 static 메소드만으로 구성되어 있다.
 *
 *  KeyInput 는 아래와 같은 기능이 있다.
 *  1. 키보드로 입력받은 내용(문자열)을 String 값으로 반환
 *  2. 키보드로 입력받은 내용(정수)을 int 값으로 반환
 */
public class KeyInput {
    /** 표준 입력(키보드)을 처리할 Scanner  */
    private static final Scanner keyReader = new Scanner(System.in);

	private KeyInput() {}

    /**
     *  키보드로부터 입력 받은 문자열을 String 타입으로 리턴한다.
     *  Return(Enter)키가 눌려질 때까지 입력된 내용이 처리된다.
     */
    public static String readString() {
        String input = null;
		while ((input = keyReader.nextLine()).length() == 0) {
			System.out.print("다시 입력해 주십시오: ");
		}
        return input;
    }

    /**
     *  키보드로부터 입력 받은 숫자를 int 타입으로 리턴한다.
     *  Return(Enter)키가 눌려질 때까지 입력된 내용이 처리되며 
     *  입력된 값이 정수가 아닐 경우 재입력을 요구한다.
     */
    public static int readInt() {		
        int input = 0;
        try {
            input = Integer.parseInt(readString());
        } catch (NumberFormatException e) {
            System.out.print("정수를 입력해 주십시오: ");
            input = readInt();
        }
        return input;
    }
}
