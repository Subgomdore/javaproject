package p2022_06_27;

public class StringEx02 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// 객체배열 : 객체의 주소를 참조하는 배열(저장하는)
		String[] strArray = new String[3] ;
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);  // 같은 주소값이라서 True
		System.out.println(strArray[0] == strArray[2]);  // [2]번이 new연산자로 새로운주소값이라 False
		System.out.println(strArray[0].equals(strArray[2]));  // equals 는 주소값안의 데이터를 비교해서 True

	}

}
