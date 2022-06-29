package p2022_06_28;

// this() : 같은 클래스 안에 있는 생성자를 호출하라는 의미로 사용됨.
class MyDate10 {

	private int year;
	private int month;
	private int day;
	
	// 생성자 오버로딩: 한개의 클래스에 여러개의 생성자를 정의하는것
	// 매개변수의 자료형을 다르게 기술, 매개변수의 갯수를 다르게 지정하는기술, 매개변수가 순서를 바꾸면서 구분하는기술 
	public MyDate10() {
		this(2016, 1, 1);
	}

	public MyDate10(int new_year) {
		this(new_year, 1, 1);
	}

	public MyDate10(int new_year, int new_month) {
		this(new_year, new_month, 1);
	}

	public MyDate10(int new_year, int new_month, int new_day) {
		year = new_year;
		month = new_month;
		day = new_day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest10 {
	public static void main(String[] args) {
		MyDate10 d = new MyDate10(2017, 7, 19);
		d.print();
		MyDate10 d2 = new MyDate10(2017, 7);
		d2.print();
		MyDate10 d3 = new MyDate10(2017);
		d3.print();
		MyDate10 d4 = new MyDate10();
		d4.print();
	}
}