package Report;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
	
		// 배열없이 로또 번호 뽑기 프로그램
		// 중복된숫자가 출력되면 안됨
		// 검증을 위한 범위를 6까지 지정해서 출력값확인함.
		
		// 1 ~ 45 사이의 난수
		int luck = 0;
		int luck2 = 0;
		int luck3 = 0;
		int luck4 = 0;
		int luck5 = 0;
		int luck6 = 0;
		
//		첫번째 로또번호 출력	
		luck = (int)(Math.random()*6)+1;
		System.out.println("첫번째로또번호:"+luck);

//		 두번째 로또번호 출력	
		luck2 = (int)(Math.random()*6)+1;
		if (luck == luck2) 
		{			
				for (int i=1 ; i<=10000; i++)
				{
					luck2 = (int)(Math.random()*6)+1;
					System.out.println("[2]"+i+"번째 다시뽑은숫자="+luck2);
						if (luck != luck2)
						{
							break;
						}
						else 
						{
						
						}
				break;
				}
		}
		System.out.println("두번째로또번호:"+luck+","+luck2);
//		 세번째 로또번호 출력
		
		luck3 = (int)(Math.random()*6)+1;
		if(luck == luck3 || luck2 == luck3)
		{
			for (int i= 1; i <= 1000; i++) 
			{
				luck3 = (int)(Math.random()*6)+1;				
					if(luck != luck3 && luck2 != luck3 ) 
					{
						break;
					}						
					else 
					{
					}
				System.out.println("[3]"+i+"번째 다시뽑은숫자="+luck3);
				
			}
			
			
		}
		System.out.println("세번째로또번호:"+luck+","+luck2+","+luck3);
		
//		네번째 로또번호 출력
		
		luck4 = (int)(Math.random()*6)+1;
		if(luck == luck4 || luck2 == luck4 || luck3 == luck4)
		{
			for (int i= 1; i <= 1000; i++) 
			{
				luck4 = (int)(Math.random()*6)+1;				
					if(luck != luck4 && luck2 != luck4 && luck3 != luck4) 
					{
						break;
					}						
					else 
					{
					}
				System.out.println("[4]"+i+"번째 다시뽑은숫자="+luck3);
				
			}
			
			
		}
		System.out.println("네번째로또번호:"+luck+","+luck2+","+luck3+","+luck4);
		
		// 다섯번째 로또 출력
		
		luck5 = (int)(Math.random()*6)+1;
		if(luck == luck5 || luck2 == luck5 || luck3 == luck5 || luck4 == luck5)
		{
			for (int i= 1; i <= 1000; i++) 
			{
				luck5 = (int)(Math.random()*6)+1;				
					if(luck != luck5 && luck2 != luck5 && luck3 != luck5 && luck4 != luck5) 
					{
						break;
					}						
					else 
					{
					}
				System.out.println("[5]"+i+"번째 다시뽑은숫자="+luck3);
				
			}
			
			
		}
		System.out.println("다섯째로또번호:"+luck+","+luck2+","+luck3+","+luck4+","+luck5);

//		int luck4 = (int)(Math.random()*4)+1;
//		int luck5 = (int)(Math.random()*5)+1;
//		int luck6 = (int)(Math.random()*6)+1;
		
//		System.out.println("로또번호:"+luck);
//		System.out.println("로또번호:"+luck2);
//		System.out.println("로또번호:"+luck3);
//		System.out.println("로또번호:"+luck4);
//		System.out.println("로또번호:"+luck5);
//		System.out.println("로또번호:"+luck6);
		
		
//		if (luck == luck2) {
//			(int)(Math.random()*45)+1;
//			return ;

	}

}
