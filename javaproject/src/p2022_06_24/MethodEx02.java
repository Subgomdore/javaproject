package p2022_06_24;

import java.util.Scanner;

public class MethodEx02 
{
	// 1~n까지 합을 구하는 메소드
	static void sum(int n)
	{
		int hap=0;
		for(int i=1; i<=n;i++)
		{
			hap += i;
			System.out.println("1~"+n+"까지의합 ="+hap);
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("값을 입력하세요");
		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
		sum(a);
		

	}

}
