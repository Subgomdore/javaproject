package p2022_06_28;

class MyDate03{   
  private int year;    // 필드	
  private int month;    
  private int day;
  
  // 생성자 : 객체를 생성할때  생성자가 호출되고, 필드값을 초기화를 시켜주는 역할을 한다.
  public MyDate03(){  // 기본 생성자 
    year=2016;
    month=4;
    day=1;
  }  
  
  public void print(){ // 메소드
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate03 d=new MyDate03();
//                 생성자 호출
    d.print(); 
  }
}               