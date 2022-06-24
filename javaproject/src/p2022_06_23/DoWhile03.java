package p2022_06_23;

import java.util.Scanner;

public class DoWhile03 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do
		{
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println("입력한값은:"+inputString);
			
		}while
			( ! inputString.equals("q") );
			System.out.println("프로그램종료");
			
			

	}

}
