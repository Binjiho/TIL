package lecafe;

import java.util.ArrayList;

public class Customer {
//	attribute
	ArrayList<Coffee> customerarray = new ArrayList<>(); //customer�� ������ Ŀ�Ǹ��
//  constructor
//  methods
	public void showHand() { //�ֹ��� ��� ���
		for (Coffee coffee:customerarray) {
			System.out.println("�̸�: "+coffee.getName()+"���� : "+coffee.getPrice()+
					"�� �߰�:"+ coffee.getEspressoshot()+"���� �߰�: "+coffee.getTopping());
		}
	} 
	public void order(Coffee c) { //����
		customerarray.add(c);
	} 
}
