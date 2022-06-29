package p2022_06_29;

class Calulator2{
	double areaRectangle(double width) {
		return width*width;
	}
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalulcatorEx2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calulator2 mycal = new Calulator2();
		
		double result1 = mycal.areaRectangle(10);
		
		double result2 = mycal.areaRectangle(10,20);

		System.out.println("정사각형의 넓이:" +result1);
		System.out.println("직사각형의 넓이:" +result2);

	}

}
