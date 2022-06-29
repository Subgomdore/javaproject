package p2022_06_28;

//p202
class FieldIntitValue
{
	// 필드(field)
	byte byteField;
	short shortField;
	int intField=5;
	long longField;
	
	float floatField;
	double doubleField;
	
	char charFiled;
	boolean booleanField;
	
	int[] arrField;
	String referenceField = "wow";
	


	public FieldIntitValue()
	{
		System.out.println(intField+referenceField);
	}
}

public class FieldEx 
{

	public static void main(String[] args) 
	{
		FieldIntitValue sum = new FieldIntitValue();
		// TODO Auto-generated method stub
//		FieldIntitValue f = new FieldIntitValue();
//		System.out.println("byteField 		"+f.byteField);
//		System.out.println("shortField 		"+f.shortField);
//		System.out.println("intField 		"+f.intField);
//		System.out.println("longField 		"+f.longField);
//		
//		System.out.println("floatField 		"+f.floatField);
//		System.out.println("doubleField 	"+f.doubleField);
//		
//		System.out.println("charField 		"+f.charFiled);
//		System.out.println("booleanField 	"+f.booleanField);
//		
//		System.out.println("arrField		"+f.arrField);
//		System.out.println("referenceField 	"+f.referenceField);
	}

}
