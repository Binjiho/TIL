package lecafe;

import java.util.ArrayList;

public class Customer {
//	attribute
	ArrayList<Coffee> customerarray = new ArrayList<>(); //customer가 구매한 커피목록
//  constructor
//  methods
	public void showHand() { //주문한 목록 출력
		for (Coffee coffee:customerarray) {
			System.out.println("이름: "+coffee.getName()+"가격 : "+coffee.getPrice()+
					"샷 추가:"+ coffee.getEspressoshot()+"토핑 추가: "+coffee.getTopping());
		}
	} 
	public void order(Coffee c) { //구매
		customerarray.add(c);
	} 
}
