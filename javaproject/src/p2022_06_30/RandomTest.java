package p2022_06_30;

import java.util.Date;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		
//		 난수발생방법 : 1. Math.random();
//				   2. random 클래스
		
//		Random r = new Random();	// import를 하지않고 사용해서 그냥 Random으로 생성자를 호출하면 오류발생함
									// 컨트롤 쉬프트 O 키를누르면 자동으로 import됨
		
//		java.util.Random r = new java.util.Random();
		
		Random r = new Random();
		
		int n1 = r.nextInt(10); // 정수형태의 n1 변수에 랜덤숫자를 출력 (10) = 0~9까지값을 랜덤하게 출력함
		System.out.println("n1= "+ n1);
		
		int n2 = (r.nextInt(45)+1 );
		System.out.println("n2= "+n2);
		
		// 0.0 <= Math.random() < 1.0 의 난수발생
		int n3 = (int)(Math.random()*45)+1;
		System.out.println(n3);
		
		Date d = new Date ();
		System.out.println(d.getTime());
		
		
	}

}
