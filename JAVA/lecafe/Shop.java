package lecafe;

import java.util.Scanner;

public class Shop {
	static Scanner sc = new Scanner(System.in);
	
	static boolean waitForInput()
	{
		int input;
		System.out.println("��� �ֹ��Ϸ��� 1��, �����Ϸ��� 0�� �Է��ϼ���");
		input = sc.nextInt();
		if(input == 0)
			return false;
		return true;
	}
	
	static void ClearScreen()
	{
		for(int i = 0; i < 10; i++)
			System.out.println();
	}
	
	public static void main(String[] args) {

		Menu menu = new Menu();
		int input;
		Customer customer = new Customer();	
		
		Coffee c2 = new Coffee("�Ƹ޸�ī��",3000,1,false);
		menu.addMenu(c2);
		
		Coffee c3 = new Coffee("Ŀ�Ƕ�",3500,1,false);
		menu.addMenu(c3);
		Coffee c4 = new Coffee("��ī��",3500,1,true);
		menu.addMenu(c4);
		Coffee c5 = new Coffee("īǪġ��",3500,1,false);
		menu.addMenu(c5);
		Coffee c = new Coffee("��ġĿ��", 3500, 2, false);
		menu.addMenu(c);
		
		while(true)
		{
			ClearScreen();
			menu.printmenu();
			System.out.println("�ֹ� : ��ȣ �Է�\t������ Ŀ�� ��� : 0 �Է�");
			System.out.print("�Է� >> ");
			input = sc.nextInt();
			if(input > menu.arrSize())
			{
				System.out.println("�޴��� �������� �ʽ��ϴ�.");			
				if(waitForInput() == false)
					break;
				else
					continue;
			}
			
			if(input == 0)
			{
				customer.showHand();
				if(waitForInput() == false)
					break;
				else
					continue;
			}
			else
			{
				customer.order(menu.getCoffee(input - 1));
				if(waitForInput() == false)
					break;				
			}
		}
		System.out.println("�����մϴ�. �ȳ��� ������.");		
	}
}
