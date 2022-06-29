import java.util.Scanner;

public class Main 
{
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int v = (b+c)/60;
	
		if ( (a>=0 && a<=23) && (b>=0 && b<=59)) 
			if(v>0) //분 + 조리시간이 60분을 초과할경우 시간을+1
				
	}
}

