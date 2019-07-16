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
		for(Coffee cafe : menuarray) {
			System.out.println(count++ +"."+cafe.getName()+" \t "+cafe.getPrice()+" \t "+
		cafe.getEspressoshot()+"¼¦  \t "+cafe.getTopping());
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
