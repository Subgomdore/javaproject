package p2022_06_28;

//p201

class Carr
{
	// 필드 field
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
//	public Car 클래스명과 반드시 맞춰야함
//	{
//		System.out.println("생성자 호출 성공");
//		
//	}
	
}


public class CarEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Carr mycar = new Carr(); //public Car() 를 호출함.             // 메소드 호출
		System.out.println("제작회사:"+mycar.company);
		System.out.println("모델명:"+ mycar.model);
		System.out.println("색상:"+ mycar.color);
		System.out.println("최고속도:"+mycar.maxSpeed);
		System.out.println("색상:"+ mycar.speed);
	}

}
