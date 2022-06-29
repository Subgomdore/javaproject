package p2022_06_24;

public class ArrayEx01 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

//		배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
//		변수 -> 배열 -> 자료구조(list)
		
		// 1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않는 경우에 주로 사용한다.
		int[] score = new int[3];
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println();
		
		score[0]=80;
		score[1]=90;
		score[2]=100;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println();
		
		double[] d = new double[3];
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println();
		
		// char 형 배열은 초기화가 되지않아 값을 넣지않으면 컴파일되지않는다.
//		char[] c = new char[3];
//		System.out.println(char[0]);
//		System.out.println(char[1]);
//		System.out.println(char[2]);
//		System.out.println();
		
		boolean b[] = new boolean[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println();
		
		// 참조형 배열 (대표적인 String)
		String[] str = new String[3];
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println();
		
		
		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스트링";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println();
		
//		1차원 배열 두번째 형식: 배열선언과 동시에 초기화를 할때 사용한다.
//		배열에 할당될 값이 정해져 있는 경우에 주로 사용
		
		int[] s1 = {80, 90, 100};
		int[] s2 = new int[]{80, 90, 100};
		
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		
		System.out.println("배열의크기: "+s1.length);
		
		
		for(int i=0; i<s1.length;i++)
		{

			System.out.print(s1[i]+"\t");
			
		}
		
		System.out.println();
		
		double[] dd = {3.14, 10.5, 42.195, 50};
		for(int i=0; i<dd.length;i++)
		{
			System.out.print(dd[i]+"\t");
		}
		System.out.println();
		System.out.println();
		
		
		
		char[] cc = {'j' , 'a' , 'v' , 'a' , '자' , '바'};
		for(int i=0 ; i<cc.length;i++)
		{
			System.out.print(cc[i]+"\t");
		
		}
		System.out.println();
		System.out.println();
		
		boolean[] bb = {true, false, true};
		for(int i=0; i<bb.length;i++)
		{
			System.out.println(bb[i]+"\t");
		}
		System.out.println();
		
		String[] str1 = {"자바", "오라클", "스프링", "파이썬", "텐스플로우"};
//		String[] str2 = new String[]{"자바", "오라클", "스프링", "파이썬", "텐스플로우"};
		
//		System.out.println("아래 내용");
		for(int i=0; i<str1.length;i++)
		{
//			System.out.println(str1.length);
			System.out.print(str1[i]+"\t");
			
		}
		
		
				

		
		
		
	}

}
