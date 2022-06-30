package p2022_06_30;

// p 244 

class Singleton {
	
	// 싱글톤(Singleton): 객체 생성을 1번만 수행하는것을 의미함
	private static Singleton s = new Singleton();  	// 정적 필드 
	
	public static  Singleton getInstance() {		// 정적 메소드 Singleton 클래스에서 생성자를 호출  Singleton s = new Singleton(); 
		return s;									// 
	}
	
	
	public void check() {
		System.out.println("메소드 호출성공");
	}
	public void check1() {
		System.out.println("메소드 호출성공1");
	}
	
}

public class SingletonEx 
{

	public static void main(String[] args) 
	{
		Singleton obj1 = Singleton.getInstance(); // 정적메소드라서 생성자 호출안하고 .으로 바로 접근이됨
		Singleton obj2 = Singleton.getInstance(); // int a; 처럼 Singleton obj2; 으로 이해하면 좋음. Singleton 클래스안 메소드 .getInstance값을 리턴시킴
		
//		int a = c;
//		int b = c;
//		int c = '변수값'  -> 위에있는 Singleton.getInstance() 의 구조랑 비슷함. 
//		그래서 a,b 어떤걸 호출해도 c의 값을 불러오게되어잇음.
//		마찬가지로 obj1, obj2 모두 Singleton 의 s값을 호출하기때문에 주소가 같음.
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		if (obj1 == obj2)
		{
			System.out.println("같은주소");
		}
		else
		{
			System.out.println("다른주소");
		}
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	}

}
