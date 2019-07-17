package lecafe;

public class Coffee {
//	attribute
	private String name ="";
	private int price ;
	private int espressoshot ;
	boolean topping = false;
//  constructor
	public Coffee() {}
	public Coffee(String name, int price, int espressoshot, boolean topping) {
		this.name =name; this.price = price; this.espressoshot = espressoshot; this.topping = topping;
	}
//  methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEspressoshot() {
		return espressoshot;
	}
	public void setEspressoshot(int espressoshot) {
		this.espressoshot = espressoshot;
	}
	public String getTopping() {
		if( topping==true) {
			return "�����߰�";
		}else{
			return "���ι��߰�";
		}
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	
}
