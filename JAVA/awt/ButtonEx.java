package awt_test;
import java.awt.*;

public class ButtonEx {
	public static void main(String[] args) {
		Frame f = new Frame("버튼테스트"); //프레임 생성
		Panel p = new Panel(); //패널 생성
		
		Button b1 = new Button(); //버튼 생성
		Button b2 = new Button("출력");
		Button b3 = new Button("정렬");
		Button b4 = new Button("순위");
		
		b1.setLabel("입력"); //버튼 1에 이름설정
		p.add(b1);  //패널에 버튼 붙이기
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.add(p); //프레임에 패널 붙이기
		
		f.setLocation(300,300); //프레임 위치
		f.setSize(300,100); // 프레임 크기
		f.setVisible(true); // 프레임 생성
	}
}
