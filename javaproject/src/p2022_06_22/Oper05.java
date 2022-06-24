package p2022_06_22;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("정수 2개를 입력하세요!");
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); // 스페이스바 또는 엔터키를 입력하면 변수지정이 끝남. 다시 변수를 입력하게되면 다음 변수로 지정됨
		int n2 = sc.nextInt();
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		
		if (n1 > n2) {
			System.out.println(n1+"이"+n2+"보다크다");
		}
		else if (n1 < n2) {
			System.out.println(n1+"이"+n2+"보다작다");
		}
		else {
			System.out.println(n1+"이랑"+n2+"같다");
		}
		
		

	}

}
