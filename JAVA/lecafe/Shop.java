package lecafe;

import java.util.Scanner;

public class Shop {
	static Scanner sc = new Scanner(System.in);
	
	static boolean waitForInput()
	{
		int input;
		System.out.println("계속 주문하려면 1을, 종료하려면 0을 입력하세요");
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
		
		Coffee c2 = new Coffee("아메리카노",3000,1,false);
		menu.addMenu(c2);
		
		Coffee c3 = new Coffee("커피라떼",3500,1,false);
		menu.addMenu(c3);
		Coffee c4 = new Coffee("모카라떼",3500,1,true);
		menu.addMenu(c4);
		Coffee c5 = new Coffee("카푸치노",3500,1,false);
		menu.addMenu(c5);
		Coffee c = new Coffee("더치커피", 3500, 2, false);
		menu.addMenu(c);
		
		while(true)
		{
			ClearScreen();
			menu.printmenu();
			System.out.println("주문 : 번호 입력\t구매한 커피 목록 : 0 입력");
			System.out.print("입력 >> ");
			input = sc.nextInt();
			if(input > menu.arrSize())
			{
				System.out.println("메뉴가 존재하지 않습니다.");			
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
		System.out.println("감사합니다. 안녕히 가세요.");		
	}
}
