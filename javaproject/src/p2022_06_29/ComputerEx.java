package p2022_06_29;

import java.util.Scanner;

class Computer{
	int[] sum4 = new int[] {1,2,3,4,5};
	int sum1(int[] values) {
		int sum = 0;
		for (int i=0 ; i<values.length; i++)
		{
			sum += values [i];
		}
		return sum;
	}
	int sume2(int ... values) {
		int sum = 0;
		for (int i=0 ; i<values.length; i++)
		{
			sum += values [i];
		}
		return sum;
	}
}

public class ComputerEx {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		for(int i=0; i<5 ;i++)
		{
			input[i] = sc.nextInt();
		}
		/////////////// 값을 5개 입력받아서 배열로 저장하고, 해당 값을 메소드값에 대입하여 호출하는방법?
		for (int i=0 ; i<5 ; i++)
			int [] values1 = {input};
		
		int result1 = com.sum1(values1);
		System.out.println("result1: "+result1);
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2: "+result2);
		
		int result3 = com.sume2(1,2,3);
		System.out.println("result3: "+result3);
		
		int result4 = com.sume2(1,2,3,4,5);
		System.out.println("result4: "+result4);
	}
}
