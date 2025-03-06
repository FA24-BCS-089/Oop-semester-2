package LibraryManagementSystem;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
        	this.day = day;
        	this.month = month;
        	this.year = year;
    	}

    	public Date(Date other) {
        	this.day=other.day;
		this.month=other.month;
		this.year=other.year;
    	}

    	public void show() {
        	System.out.println(day + "/" + month + "/" + year);
    	}

    	public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
       		Date date = (Date) obj;
        	return day == date.day && month == date.month && year == date.year;
    	}

    	public int getDay(){
		return day;
	}
    	
	public void setDay(int day){
		this.day = day;
	}

	public int getMonth(){
		return month;
	}
    	
	public void setMonth(int month){
		this.month = month;
	}

	public int getYear(){
		return year;
	}
    	
	public void setYear(int year){
		this.year = year;
	}
	
}
