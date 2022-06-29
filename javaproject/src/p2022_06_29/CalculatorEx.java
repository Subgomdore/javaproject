package p2022_06_29;

class Calculator {
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다 ");
		return;
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double  divide(int x, int y) {
		double result = x / (double) y;
		return result;
	}
	
}

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int resulrt1 = cal.plus(5, 6);
		
		byte x = 10;
		byte y = 4;

	}

}
