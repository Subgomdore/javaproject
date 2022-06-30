package p2022_06_28;

class MyDate06 {
	private int year; // 필드
	private int month;
	private int day;

//  public MyDate06(){//default 생성자
//  }  
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year; 		// 2017
		month = new_month; 		// 7
		day = new_day; 			// 19
	}

	public int getYear() {				// getters method
		return year;
	}

	public void setYear(int year) {    // setters method
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

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2017, 7, 19);
		d.print();       // 생성자 호출
		
		d.setYear(2022);
		d.setMonth(6);
		d.setDay(28);
		d.print();
		
		System.out.println("year:"+d.getYear());
		System.out.println("month:"+d.getMonth());
		System.out.println("day:"+d.getDay());
	}
}