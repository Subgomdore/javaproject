package Report;

import java.util.Scanner;

public class Report2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		1. 키보드를 이용해서 입력한 정수의 팩토리얼을
//		   구하는 프로그램을 작성 하세요?
//			ex) 3! = 3 * 2 * 1
//		                 5! = 5 * 4 * 3 * 2 * 1
		
	
		
		System.out.println("값을 입력해주세요");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int ft = 1;		
		
		for (int i=input; i > 1; i--)
		{
																					
			ft = ft*i;
			System.out.println("[검수용] 연산과정 : " + ft);					
		}
		System.out.println("입력한 값의 팩토리얼값은 : " + ft);

	}

}
