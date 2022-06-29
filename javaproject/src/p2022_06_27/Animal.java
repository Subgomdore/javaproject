package p2022_06_27;

// Animal 사용자 정의 클래스(자료형)
public class Animal 
{
	int age;			// 멤버변수, 필드(field), 전역변수
						// 메소드 바깥쪽에 정의되는 변수
	public Animal() {
						// 기본생성자(Default Constructor)
						// : 매개 변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 10; 	// 지역변수
		String str = new String("자바");
		
		Animal 		a1 		= new Animal();
		a1.age = 5;
		System.out.println(a1.age);
		
		Animal a2 = new Animal();
		a2.age = 10;
		System.out.println(a2.age);
		
		if(a1 == a2)
		{
			System.out.println("같은주소");
		}
		else
		{
			System.out.println("다른주소");
		}

	}

}
