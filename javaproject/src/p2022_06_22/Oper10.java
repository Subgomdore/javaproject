package p2022_06_22;

public class Oper10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6. 증감 연산자
//	    ++      1씩 증가   ++a(선행 처리) // a=a+1;
//		               a++(후행 처리) // a=a+1;
//
//	    --      1씩 감소    --a(선행 처리)   // a=a-1;
//		               a--(후행 처리)  // a=a-1;
		
		int a=10, b=10, c=10, d=10;
		int a1, b1, c1, d1;
		
		a1 = ++a;
		b1 = b++;
		c1 = --c;
		d1 = d--;
		
		System.out.println("a1="+a1+" a="+a);
		System.out.println("b1="+b1+" a="+b);
		System.out.println("c1="+c1+" a="+c);
		System.out.println("d1="+d1+" a="+d);
		


	}

}
