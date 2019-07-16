package chap09;

public class BirthDate {
//	Attributes
	private int year;
	private int month;
	private int day;
//	Constructor
	public BirthDate() {}
	public BirthDate(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
//	Operators
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj != null) && (obj instanceof BirthDate)) {
			BirthDate date = (BirthDate)obj;
			if((this.year == date.year) && (this.month == date.month) && (this.day == date.day)) {
				return true;
			}
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
		return year^month^day;  //일부러 복잡한 연산값을 써야함
	}
	
	@Override
	public String toString() {
		return year+"_"+month+"_"+day;
	}
}
