package p2022_06_30;

class FinalMember {
  final int a=10;		// final => a = 상수 : 값을 수정하거나 변경할수없음
  public void setA(int a){
//    this.a=a;    		// a는 final(상수) 이기때문에 수정하려고하면 오류가발생함
  }
}

public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember(); // FinalMember 생성자 호출 
	final int a=1000;
    ft.setA(100);
    System.out.println(a);
  }
}                                                    
