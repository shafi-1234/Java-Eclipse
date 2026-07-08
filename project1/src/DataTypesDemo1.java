
public class DataTypesDemo1 {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean boo;
	char c;

	public static void main(String[] args) {
		
		// Data Types are Two 
		System.out.println("Data Types or Two Types");
		System.out.println("1) Primitive Data Types");
		System.out.println("2) Non Primitive Data Types");
		System.out.println("---------------------------------");
		DataTypesDemo1 dt= new DataTypesDemo1();
		dt.Premitive();

	}
	void Premitive() {
		
		
		System.out.println("1) Prenitive Data Types ");
		System.out.println("They are mainly 8 data types ");
		System.out.println("I) byte   	:- Default value is byte "+ b +" and used 1 Byte");
		System.out.println("II) short 	:- Default value is short "+s+" and used 2 Byte");
		System.out.println("III) int  	:- Default value is int "+i+" and used 4 Byte");
		System.out.println("IV) long  	:- Default value is long"+l+" and used 8 Byte");
		System.out.println("V) float  	:- Default value is float"+f+" and used 4 Byte");
		System.out.println("VI) double 	:- Default value is double "+d+" and used 8 Byte");
		System.out.println("VII) boolean :- Default value is boolean "+boo+" and used 1 Byte");
		System.out.println("VII) char 	:- Default value is char "+c+" and used 2 Byte ");
	}
	 
	 

}
