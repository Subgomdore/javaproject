package p2022_06_23;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~100까지 홀수, 짝수의 합을 구하는 프로그램을 작성하세요
		// 단, for문 1개와 if ~els문으로 작성하세요
		
		int odd = 0, even=0;
		
		
		for (int i=0 ; i<=100 ; i++) 
		{
			if (i%2 == 0)
			{
				even += i;
				
			}
			
			else 
			{
				odd += i;
			}
		}
		System.out.println("짝수의합="+even);
		System.out.println("홀수의합="+odd);
		
	}

}
