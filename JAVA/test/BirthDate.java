package collection.test;

public class BirthDate implements Comparable<BirthDate> {
    // attributes
    private int year = 2000;
    private int month = 1;
    private int day = 1;

    // constructors
    public BirthDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public BirthDate(BirthDate origin) {
        this.year = origin.year;
        this.month = origin.month;
        this.day = origin.day;
	}

	// operations
    public BirthDate addDays(int moreDays) {
        BirthDate newDate = new BirthDate(this);
        newDate.day = newDate.day + moreDays;
        return newDate;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void print() {
        System.out.println("BirthDate: " + year + "-" + month + "-" + day);
    }
	
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if ((obj != null) && (obj instanceof BirthDate)) {
            BirthDate date = (BirthDate) obj;
            if ((year == date.year) && (month == date.month) && (day == date.day)) {
                result = true;
            }	
        }
        return result;
    }
		
    @Override
    public int hashCode() {
        return year ^ month ^ day;
    }
	
    @Override
    public String toString() {		
        return  year + "-" + month + "-" + day;
    }

    @Override
    public int compareTo(BirthDate date) {
    	
    	if (year != date.year) {
            return (year - date.year);
			
        } else if (month != date.month) {
            return (month - date.month);
			
        } else {		
            return day - date.day;
			
        }
        
    }
}
