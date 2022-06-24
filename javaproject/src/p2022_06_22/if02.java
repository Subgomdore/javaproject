package p2022_06_22;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 키보드로 입력한 정수가 짱수인지, 홀수인지를 판별하는 프로그램을 작성하세요
		
		int n1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		
		
		n1 = sc.nextInt();
		
		System.out.println("입력한값="+n1);
		
		if (n1 % 2 ==0){
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
		
		
		
	}

}
