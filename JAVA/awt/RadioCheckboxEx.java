package awt_test;
import java.awt.*;
public class RadioCheckboxEx {

	public static void main(String[] args) {
		Frame f = new Frame("������ üũ�ڽ� �׽�Ʈ"); //������ ����
  		Panel p = new Panel();  //�г� ����
		
		CheckboxGroup group = new CheckboxGroup();  //üũ�ڽ� �׷�
		Checkbox radio1 = new Checkbox("����",group,false);  //���� ��ư
		Checkbox radio2 = new Checkbox("��������",group,false);
		Checkbox radio3 = new Checkbox("����",group,true);
		
		p.add(radio1); //�гο� ������ư ���̱�
		p.add(radio2);
		p.add(radio3);
		
		f.add(p);  //�����ӿ� �г� ���̱�
		f.setSize(300,100);  //ũ������
		f.setVisible(true);  //������ ����
	}

}
