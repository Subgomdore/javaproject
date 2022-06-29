package p2022_06_24;

import java.util.Scanner;

public class MethodEx03 
{
		// 키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요
	
		// 단, 메소드를 이용해서 작성하세요.
	
	static int max(int a, int b)
	{
		if(a>b)
			return a;
		else 
			return b;
	}
	
	static int min(int a, int b)
	{
		if(a<b)
			return a;
		else 
			return b;
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int input=0, input2=0;
		System.out.println("2개의 정수를 입력해주세요. ");
		Scanner sc =new Scanner (System.in);
		
		input = sc.nextInt();
		input2 = sc.nextInt();
		
		int max = max(input, input2);
		int min = min(input, input2);
		
		System.out.println("입력한 값의 최대값은 : "+max);
		System.out.println("입력한 값의 최소값은 : "+min);
	}

}
