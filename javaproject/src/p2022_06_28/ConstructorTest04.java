package p2022_06_28;

class MyDate04
{   
  int year;    
  int month;    
  int day;  

  public MyDate04()
  {
    year=2016;    month=4;    day=1;
  }
 
  
  public MyDate04(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
}


// 내부 래퍼런스 변수
//  public MyDate04(int year,int month,int day)
//  {
//   this.year=year;
//   this.month=month;
//   this.day=day;
//  }
  public void print()
  {
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate04 end

public class ConstructorTest04 
{     
  public static void main(String[] args) 
  {
    MyDate04 d=new MyDate04();	
    d.print();
    System.out.println(d.year);
    System.out.println(d.month);
    System.out.println(d.day);

    MyDate04 d2=new MyDate04(2017, 7, 19);
    d2.print();
  }
}            