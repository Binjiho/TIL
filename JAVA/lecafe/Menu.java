package lecafe;

import java.util.ArrayList;

public class Menu {
//	attribute
	ArrayList<Coffee> menuarray=new ArrayList<>();
	int count = 1;
//  constructor
	
//  methods
	public void printmenu() {
		System.out.println("---------------------¸Þ´º---------------------");
		for(int i=0;i<menuarray.size();i++) {
			System.out.println((i+1)+"."+menuarray.get(i).getName()+" \t "+menuarray.get(i).getPrice()+" \t "+
					menuarray.get(i).getEspressoshot()+"¼¦  \t "+menuarray.get(i).getTopping() );
		}
		
		System.out.println("--------------------------------------------");
	}
	public void addMenu(Coffee c) {
		menuarray.add(c);
	} //ArrayList

	public int arrSize() {
		return menuarray.size();
	}

	public Coffee getCoffee(int input) {
		return menuarray.get(input);
	}
}
