package p2022_06_23;

public class DoWhile02
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
//		do~while 문을 이용해서 1~100까지 홀수,짝수의 합을 구하시오
		
		int i=1, odd=0, even=0;
		do
		{
			if(i%2==1)
			{
				odd += i;
			}
			else
			{
				even += i;
			}
			i++;
		}while(i<=100);
		
		System.out.println("홀수의합 ="+odd);
		System.out.println("짝수의합 ="+even);

	}

}
