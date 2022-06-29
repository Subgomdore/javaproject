package p2022_06_27;

public class ArrayEx06 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// 향상된 for문, 확장 for문
//		 형식 : for ( 변수 : 순차적인 자료구조(배열,컬렉션) ) 
//					{
//						실행될 문장;
//					}
			
		int[] score = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for (int i=0; i<score.length; i++)
		{
			sum += score[i];
		}
		System.out.println("sum :"+ sum);
		
//		확장 for문
		int sum1 = 0;
		for (int s: score)  // 순차적인 배열의 모든 원소를 불러올때 자주사용함
		{
			sum1 += s;
//			sum1 = sum1 + s
		}
		System.out.println("sum1: "+sum1);
		

	}

}
