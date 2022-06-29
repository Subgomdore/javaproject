package Report;
public class Report5_0627 
{
	public static void main(String[] args) 
	{
		int dan = 2; 
		int value = 1;
		int[][] array ;
		array = new int [8][9];
		for (int r=0 ; r <8 ; r++)
			{
					for(int c=0 ; c < 8 ; c++)
					{
						array[r][c] = dan * value;
						if(value==1)
						{
						System.out.print(dan+"*"+value + "=" + array[r][c]+"\t"+"\t");
						}
						else
						{
							System.out.print(array[r][c]+"\t");
						}
						value++;
						if(value==9)
							value=1;
					}
					dan++;
					System.out.println();
			}
	}
}
