package awt_test;
import java.awt.*;
public class Text_PasswordEx {

	public static void main(String[] args) {
		Frame f =new Frame("�ؽ�Ʈ�ʵ� �׽�Ʈ"); //�����ӻ���
		Panel p = new Panel(); //�гλ���
			
		TextField tf1 = new TextField("���̵� �Է�",12); //�ؽ�Ʈ�ʵ����
		TextField tf2 = new TextField("��ȣ �Է�",10);
			
		tf1.selectAll();
		tf2.selectAll();
			
		tf2.setEchoChar('*'); //���ڰ� *�� ����
			
		p.add(tf1);//�гο� �ؽ�Ʈ�ʵ� �������
		p.add(tf2);
		f.add(p);//�����ӿ� �г��������
			
		f.setSize(300,100); //�����ӻ�����
		f.setVisible(true); //����
	    }
	}