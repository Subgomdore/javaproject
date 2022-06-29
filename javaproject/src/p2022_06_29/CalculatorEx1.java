package p2022_06_29;


class Calculator1{
	int plus(int x, int y)
	{
		int result = x +y;
		return result;
	}
	
	double avg(int x, int y)
	{
		double sum = plus(x,y);
		double result = sum / 2;
		return result ;
	}
	
	void execute() 
	{
		double result = avg(7,10);
		println("실행결과: "+result); // 메소드 호출
	}
	
	void println(String message) // 			println 메소드 선언 	
	{
		System.out.println(message);		// println 메소드를 호출할시 "실행결과: "+result 내용물을을 가져온다
	}
}


public class CalculatorEx1 
{
//p227
//클래스 내부에서 메소드 호출: 메소드 안에서 다른 메소드 호출
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Calculator1 mycal = new Calculator1();
		mycal.execute(); // 
//		execute();  오류발생

	}

}
