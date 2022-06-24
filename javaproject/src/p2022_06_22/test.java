package p2022_06_22;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, max, max1, max2, min, min1, min2;

		System.out.println("정수 3개를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt(); //1
		n2 = sc.nextInt(); //2 
		n3 = sc.nextInt(); //3 
		
		max1 = (n1 > n2) ? n1 : n2 ; // 
		max2 = (n2 > n3) ? n1 : n3 ; // 
		max =  (max1 > max2) ? max1 :max2 ;		
		
		
		
		min1 = (n1 < n2) ? n1 : n2 ; // 
		min2 = (n2 < n3) ? n2 : n3 ; //  
		min =  (min1 < min2) ? min1 : min2 ;	
		

				
		System.out.println("Max1="+max1); 
		System.out.println("Max2="+max2); 
		System.out.println("최대값 Max="+max);
		
		System.out.println("");
		System.out.println("Min1="+min1);
		System.out.println("Min2="+min2);
		System.out.println("최소값 Min="+min);
		
	}

}
