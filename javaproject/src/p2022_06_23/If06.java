package p2022_06_23;

public class If06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주사위 번호 뽑기 : 1 ~ 6
		// 난수 발생공식 
		// 난수 = (정수화)(Math.random()*(상한값-하한값+1) + 하한값;
		
		System.out.println("E="+Math.E);
		System.out.println("PI="+Math.PI);
		System.out.println(Math.random());
		
		
		int num = (int)(Math.random()*6) + 1;
		
		if (num==1) {
			System.out.println(num+"번이 나왔습니다");
		}else if (num==2){
			System.out.println(num+"번이 나왔습니다");
		}else if (num==3){
			System.out.println(num+"번이 나왔습니다");
		}else if (num==4){
			System.out.println(num+"번이 나왔습니다");
		}else if (num==5){
			System.out.println(num+"번이 나왔습니다");
		}else if (num==6){
			System.out.println(num+"번이 나왔습니다");
		}

		// 1 ~ 45 사이의 난수
		
		int luck = (int)(Math.random()*45)+1;
//		int luck2 = (int)(Math.random()*45)+1;
//		int luck3 = (int)(Math.random()*45)+1;
//		int luck4 = (int)(Math.random()*45)+1;
//		int luck5 = (int)(Math.random()*45)+1;
//		int luck6 = (int)(Math.random()*45)+1;
		
		System.out.println("로또번호:"+luck);
		
//		if (luck == luck2) {
//			(int)(Math.random()*45)+1;
//			return ;
//		}
	}

}
