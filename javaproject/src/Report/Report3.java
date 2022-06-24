package Report;

public class Report3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int dan=2, i=1;
		
			for (dan=2 ; dan <= 9 ; dan++)
				{
					System.out.print("["+dan+"단"+"]"+"\t");
				}
		
		for (i=1 ; i <=9 ; i++)
		{
			System.out.println();
			for (dan=2 ; dan <= 9 ; dan++)
				{
					System.out.print(dan+"*"+i+"="+dan*i+"\t");
				}
			
		}
		

	}

}

