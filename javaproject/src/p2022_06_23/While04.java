package p2022_06_23;

public class While04 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// while문을 이용해서 2~9 구구단을 출력하는 프로그램을 작성하세요
		
		
		
	
		int dan=2;
		
		while(dan<=9)
		{
			System.out.println("["+dan+"]");
			int i=1;
			while(i<=9)
				{
					System.out.println(dan+"*"+i+"="+dan*i);
					i++;
				}
			System.out.println();
			dan++;
		}	
	}

}
