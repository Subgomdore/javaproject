package p2022_06_22;

public class ExplicitConversion2 {

    public static void main( String[] args ) {
    	
    // int형 변수를 97로 초기화
    int intValue = 65;

    // int형 변수 값을 char형으로 변환 후 할당
    char charValue = ( char )intValue; // 10진수 97은 아스키코드값 소문자 a에 해당함. 97을 형변했기때문에 a
    System.out.println( "charValue = " + charValue );

    // float형 변수 초기화.
    float floatValue = 3.14F;

    // float형 변수 값을 int형으로 변환 후 할당
    int intValue2 = ( int )floatValue;
    System.out.println( "intValue2 = " + intValue2 );

    // float형 변수 초기화
    double doubleValue = 21.12345;
    
    // double형 변수 값을 float형으로 변환 후 할당
    float floatValue2 = ( float )doubleValue;
    System.out.println( "floatValue2 = " + floatValue2 );

    }
}