package awt_test;
import java.awt.*;

public class ButtonEx {
	public static void main(String[] args) {
		Frame f = new Frame("��ư�׽�Ʈ"); //������ ����
		Panel p = new Panel(); //�г� ����
		
		Button b1 = new Button(); //��ư ����
		Button b2 = new Button("���");
		Button b3 = new Button("����");
		Button b4 = new Button("����");
		
		b1.setLabel("�Է�"); //��ư 1�� �̸�����
		p.add(b1);  //�гο� ��ư ���̱�
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.add(p); //�����ӿ� �г� ���̱�
		
		f.setLocation(300,300); //������ ��ġ
		f.setSize(300,100); // ������ ũ��
		f.setVisible(true); // ������ ����
	}
}
