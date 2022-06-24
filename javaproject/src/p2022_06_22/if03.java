package p2022_06_22;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로 정수 2개를 입력 받았을때,  최대값과 최소값을 구하는 프로그램을 작성하세요
		
		int input1, input2;
		
		System.out.println("정수 2개를 입력해주세요");
		
		
		Scanner sc = new Scanner(System.in);
		
		input1 = sc.nextInt();
		input2 = sc.nextInt();

		if (input1 > input2) {
			System.out.println("최대값은="+input1+"입니다");
			System.out.println("최소값은="+input2+"입니다");
		}
		else {
			System.out.println("최대값은="+input2+"입니다");
			System.out.println("최소값은="+input1+"입니다");
		}
		

	}

}
