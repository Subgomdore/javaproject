package p2022_06_28;

class MyDate05{   
  private int year;    		// 필드
  private int month;    
  private int day;

// 기본 생성자는 객체를 생성할때 컴파일러가 자동으로 만들어 주지만,
// 예외적으로 매개변수를 가진 생성자가 있을 경우에는 더이상 기본생성자를 
// 만들어 주지 않는다.
  
  public MyDate05(){		// 기본 생성자
  }
  public MyDate05(int new_year, int new_month, int new_day){
    year=new_year;    // 2017
    month=new_month;  // 7
    day=new_day;      // 19
  }  
  public void print(){		// 메소드
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest05 {     
  public static void main(String[] args) {
    MyDate05 d=new MyDate05(); 
//                 기본 생성자 호출
//    System.out.println(d.year);   오류 발생
    d.print();

    MyDate05 d2=new MyDate05(2017, 7, 19);
//                  매개변수가 있는 생성자 호출
    d2.print();
  }
}      