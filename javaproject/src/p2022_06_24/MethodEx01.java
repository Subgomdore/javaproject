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
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodEx01 .check();
		check(30); 

	}

}
