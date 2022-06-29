package p2022_06_27;

public class StringEx01 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		== : 참조하는 주소를 비교
//		 equals() : 참조하는 값(데이터) 를 비교
		
		String str1 = "자바";
		String str2 = "자바";
		
		if (str1 == str2 )
		{
			System.out.println("같은주소");
		}
		else 
		{
			System.out.println("다른주소");
		}
		
		String str3 = new String("자바");
		String str4 = new String("자바");
		
		if (str3 == str4 )
		{
			System.out.println("같은주소");
		}
		else 
		{
			System.out.println("다른주소");
		}
		
		if ( str1.equals(str2))
		{
			System.out.println("같은값");
		}
		
		else 
		{
			System.out.println("다른값");
		}
		
		if (str3.equals(str4))
		{
			System.out.println("같은값");
		}
		
		else
		{
			System.out.println("다른값");
		}
		
		boolean b = "자바".equals("파이썬");
		if(b)
		{
			System.out.println("boolean같은값");
		}
		else
		{
			System.out.println("boolean다른값");
		}
		
		if(new Integer(30).equals(30))
		{
			System.out.println("Integer같은값");
		}
		else
		{
			System.out.println("Integer다른값");
		}
		
	}

}
