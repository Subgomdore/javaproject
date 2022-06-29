package Report;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요
		System.out.println("5개 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int max = 0, min=0;
		int data[] = new int[5];
		
		for (int i=0 ; i<data.length; i++)
		{
			 data[i] = sc.nextInt();
			max = (max<data[i]) ? data[i] : max;
			 	
		}	
		
		for (int i=0 ; i<data.length; i++)
		{
			data[i] = sc.nextInt();
			min = (min>data[i]) ? data[i] : min;
			 	
		}	
	}
}


