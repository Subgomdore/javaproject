package p2022_06_22;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자 : > >= < <= ==(같다), !=(같지않다)
		// 비교 연산자의 결과값이 참이면 True, 거짓이면 false값을 리턴한다.
		
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");  // new 연산자(참조형)는 힙에 값을 저장하는게 아니라, 주소값을 저장함
		
		if(str1 == str2) {
			System.out.println("같은주소");
		}
		else {
			System.out.println("다른주소");
		
		}
		
		if(str1 == str3) {
			System.out.println("같은주소");
		}
		else {
			System.out.println("다른주소");
		}
		
		
		// 연산자는 값을비교할수없기때문에 비교 연산자를 사용하지않고, equals 를 사용함.
		
		System.out.println(str1.equals(str2));  		// true
		System.out.println(str1.equals(str3));			// true
		
		
	}

}
