package p2022_06_29;

//p207
class Korean{
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}

	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}


public class KoreanEx {  // 메인 메소드를 가진 클래스 = 파일명과 동일해야함

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean k1 = new Korean("빅자바","011225-1234567");
		System.out.println("k1.name: "+k1.name);
		System.out.println("k1.ssn: "+k1.ssn);
		
		Korean k2 = new Korean("김자바","930525-9654321");
		System.out.println("k2.name: "+k2.name);
		System.out.println("k2.ssn: "+k2.ssn);
		

	}

}
