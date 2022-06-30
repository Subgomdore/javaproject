package Report;
// 1. MemberInput 으로 정보입력을 받는다 (main) 2. MemberInfo에 입력된값을 저장하고 3. MemberInfo를 출력해서 회원정보를 처리한다.
import java.util.Scanner;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;
	public void MemberInfo(String new_name, int new_age, String new_email, String new_address)
	{
		name = new_name;
		age = new_age;
		email = new_email;
		address = new_address;
		System.out.println("========================================================");
		System.out.println("이름: "+name+" 나이: "+age+" 이메일: "+email+" 주소: "+address);
	}
//	public void MemberInfo() {
//		// TODO 자동 생성된 메소드 스텁
//		System.out.println("========================================================");
//		System.out.println("이름: "+name+" 나이: "+age+" 이메일: "+email+" 주소: "+address);
//	}
}
public class MemberInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inputname 	= sc.next();
		int 	inputage 	= sc.nextInt();
		String inputemail 	= sc.next();
		String inputaddress = sc.next();
		
		MemberInfo info = new MemberInfo(); //메소드호출
		info.MemberInfo(inputname, inputage, inputemail, inputaddress); //메소드에 변수값 입력
		
		MemberInfo[] information = new MemberInfo[2];
		for (int i=0 ; i<information.length ;i++)
		{
			information[i] = new MemberInfo();
		}
		for (int i=0 ; i<information.length ;i++)
		{
			information[i].MemberInfo(inputname, inputage, inputemail, inputaddress);
		}
	}
}