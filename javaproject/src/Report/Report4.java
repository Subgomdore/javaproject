package Report;

import java.util.Scanner;

public class Report4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요
		System.out.println("값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int max=0 , min=0;
		int data[] = new int[5];
		 
		for (int i=0 ; i<data.length; i++)
		{
			 data[i] = sc.nextInt();
			 
			 if(max<data[i] || (min==0 && i==0 ))
			 {
				 max = data[i];
			 }
			 
			 if(min>data[i] || (min==0 && i==0 ))
				
			 {
				 min = data[i];
			 }
			 
			 System.out.print((i+1)+"번째 MAX연산결과:" + max+"\t");
			 System.out.print((i+1)+"번째 MIN연산결과:" + min+"\t");
			 
			 
		}
		System.out.println();
		System.out.println("MAX값은 : "+max);
		System.out.println("MIN값은 : "+min);
		
	
		
		for(int i=0; i<=4;i++) 
		{
			System.out.print("[검수용] 입력된값: "+data[i]+"\t");
		}
		
	}

}
