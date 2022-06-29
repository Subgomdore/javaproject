package p2022_06_27;

public class ArrayEx08 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// 배열복사 : for문으로 배열복사
		
		int[] oldArray = {10, 20, 30};
		int[] newArray = new int[99999];
		
		for (int i=0 ; i <oldArray.length ; i++)
		{
			newArray [i] = oldArray[i];
		}
		
		for (int i : newArray)
		{
			System.out.print(i+"\t");
		}

	}

}
