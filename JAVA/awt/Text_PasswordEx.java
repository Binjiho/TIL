package awt_test;
import java.awt.*;
public class Text_PasswordEx {

	public static void main(String[] args) {
		Frame f =new Frame("텍스트필드 테스트"); //프레임생성
		Panel p = new Panel(); //패널생성
			
		TextField tf1 = new TextField("아이디 입력",12); //텍스트필드생성
		TextField tf2 = new TextField("암호 입력",10);
			
		tf1.selectAll();
		tf2.selectAll();
			
		tf2.setEchoChar('*'); //문자가 *로 보임
			
		p.add(tf1);//패널에 텍스트필드 집어넣음
		p.add(tf2);
		f.add(p);//프레임에 패널집어넣음
			
		f.setSize(300,100); //프레임사이즈
		f.setVisible(true); //생성
	    }
	}