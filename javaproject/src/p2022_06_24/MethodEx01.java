package p2022_06_24;

// 메소드 : 여라깆 코드를 묶은 놓은 것
// 메소드를 사용하는 이유는 코드를 재사용하기 위해서 사용된다.

public class MethodEx01 

//사용자 정의 메소드
//사용자 정의 메소드는 프로그래머가 직접 호출해야만 실행된다.
{
	static void check() 	// static 이 붙어있는 메소드를 정적 메소드라고 부른다.
	{
		System.out.println("함수 호출 성공");
		return;											// void의 경우에는 return 생략가능
	}
	
	
	// 값 전달에 의한 메소드 호출(call by value 방식)
	static void check(int a) 
	{
		System.out.println("전달된값 : "+ a);
	}
	
	static void check(int a, double d)
	{
		double result = a+ d;
		System.out.println("전달된 값의 합: "+result);
	}
	
	static void check(char c )
	{
		System.out.println("전달된 값: "+c);
	}
	
	static void check(boolean b)
	{
		System.out.println("전달된값: "+ b);
	}
	
	// 주소값 전달에 의한 call by reference 방식
	static void check(String s)
	{
		System.out.println("전달된 값: "+ s);
	}
	
	// return문은 메소드 가장 마지막 줄에 사용해야 한다.
	static int check01()
	{
		System.out.println("출력");
		return 50;
	}
	
	static double check02(int a, double d)
	{
		double result = a+ d;
		return result;
	}
	
//	MAIN
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodEx01 .check();
		check(30); 
		check(10 , 20.5);
		check('A');
		check(true);
		check("자바");
		check(new String("파이썬"));
		check01();
		int result = check01();
		System.out.println("돌려받은값 출력: "+result);
		System.out.println(check01());
		
		double result2 = check02(50, 3.14);
		System.out.println("전달받은값: "+result2);
		
		System.out.println("함수호출로 받은값 "+(int)check02(50, 3.14));
		
		double result3 = (double)check02(50, 3.14)+10;
		System.out.println("계산한값: "+ result3);
		
	}

}
