package p2022_06_22;

public class if01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		 if(조건식) {
//			 조건식이 참인경우 실행될 문장;
		
		
//		if 10>=5 {}
		
		if (10>5) {
			System.out.println("실행1");	
		 }
		
		
//		실행될 문장이 1줄인 경우에는 중괄호를 생략할 수 있다.
		if(10>5) System.out.println("실행2");
		if(true) {
			System.out.println("무조건실행");
		}
		
		
//		if문에 중괄호가 없을경우 바로 아래  한줄만 인식한다.
		if (10 > 30) {
			System.out.println("출력안됨");
			System.out.println("조건식의 적용을 받지않고 실행됨");
		}
	}

}
