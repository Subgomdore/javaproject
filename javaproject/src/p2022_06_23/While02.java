package p2022_06_23;

public class While02 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// while 문을 이용해서 1~100까지 홀수, 짝수의 합을 구하는 프로그램을 작성하세요
		
		int odd=0, even=0, i=1;
		
		while (i <=100)
		{
			if(i%2 == 1)
			{
				odd = odd + i;
			}
			else
			{
				even = even + i;
			}
			
			i++;
		}
		
		System.out.println("홀수의합 = "+odd);
		System.out.println("짝수의합 = "+even);
		

	}

}
