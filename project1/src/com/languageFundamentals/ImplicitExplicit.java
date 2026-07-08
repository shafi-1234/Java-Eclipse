package com.languageFundamentals;
//Java Type Casting Are Divided into
		// 1)Implicit Type Casting
		//	  (byte-->short-->int-->long-->float-->double-->char-->boolean)
		//		This Process which converting small data big data type happens default
		
		
		// 2)Explicit Type Casting
		//		(boolean-->char-->double-->float-->long-->int-->short-->byte)
		//		To convert the Big data into small Data type we use Type casting which used below Syntax		
		//		-- byte = (int) 129
public class ImplicitExplicit {

	//	byte b=128 ;
	//	byte b1=-129;
	//	gives compile time error because of out of range 
	//	1 Byte = 8 bits  ==> its store values from range of -2**7 to (2**7)-1 ==> -128 to 127 
	//  So Byte Store the value upto -128,-127,-126,....0,1,2,3,......126,127 i.e
	byte b= 127;
	byte b1= (byte)128;// 128 is out of range in byte so we use Explicit Type casting
	byte b2=-128;
	byte b3=(byte)-129;// -129 is out of range in byte so we use Explicit Type casting
	
	
	short s=32767;
	short s1=(byte)32768;// 32768 is out of range so we use explicit type casting
	short s2=-32768;
	short s3=(byte)-32769;// -32769 is out of range so we use explicit type casting
	//short =2 Bytes ==> 16 bits==> its store values from range of = -2**15 to (2**15)-1 ==>-32,768 to 32,767
	
	int i=2147483647;
	int i1=(short)2147483648L;// 2147483648L is out of range in byte so we use Explicit Type casting
	int i2=-2147483648;
	int i3=(short)-2147483649L;// -2147483649L is out of range in byte so we use Explicit Type casting
	//Int =4 Bytes ==> 32 bits =  its store values from range of -2**31 to (2**31)-1 ==> -2,147,483,648 to 2,147,483,647
	
	
	long l= 9223372036854775807L;
	long l1=(int)9223372036854775808f;// 9223372036854775808f is out of range in byte so we use Explicit Type casting
	long l2=-9223372036854775808L;
	long l3=(int)-9223372036854775808f;// -9223372036854775808f is out of range in byte so we use Explicit Type casting
	// long = 8 bytes ==> 64 bits = its store values from range of -2**63 to (2**63)-1 ==>-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	
	float f=2147483647;
	float f1=(long)2147483648L;// 2147483648L is out of range in byte so we use Explicit Type casting
	float f2=-2147483648;
	float f3=(long)-2147483649L;// 2147483649L is out of range in byte so we use Explicit Type casting
	// float = 4 bytes==>32 bits = its store values from range of -2**31 to (2**31)-1 ==>About 6–7 decimal digits
	
	double d=9223372036854775807L;
	double d1=(float)9223372036854775808f;// 9223372036854775808f is out of range in byte so we use Explicit Type casting
	double d2=-9223372036854775808f;
	double d3=(float)-9223372036854775809f;// -9223372036854775809f is out of range in byte so we use Explicit Type casting
	//double = 8 bytes==>64 bits =its store values from range of -2**63 to (2**63)-1 ==> About 15–16 decimal digits
	
	char c;
	// char = 2Bytes ==>16 bits ==> Its UniCoder its Dont have Negative so, 2**15+(2**15)-1=65,535 ==>Unicode character (0 to 65,535)
	boolean boo; // boolean = 1byte ==> 8 bits==> true or false
	
	public static void main(String[] args) {

		
		ImplicitExplicit o = new ImplicitExplicit();
		
		System.out.println("Byte is : "+o.b);
		System.out.println("Byte is : "+o.b1);
		System.out.println("Byte is : "+o.b2);
		System.out.println("Byte is : "+o.b3);
		System.out.println("short is : "+o.s);
		System.out.println("short is : "+o.s1);
		System.out.println("short is : "+o.s3);
		System.out.println("Integer is : "+o.i);
		System.out.println("Integer is : "+o.i1);
		System.out.println("Integer is : "+o.i2);
		System.out.println("Integer is : "+o.i3);
		System.out.println("long is : "+o.l);
		System.out.println("long is : "+o.l1);
		System.out.println("long is : "+o.l2);
		System.out.println("long is : "+o.l3);
		System.out.println("float is : "+o.f);
		System.out.println("float is : "+o.f1);
		System.out.println("float is : "+o.f2);
		System.out.println("float is : "+o.f3);
		System.out.println("double is : "+o.d);
		System.out.println("double is : "+o.d1);
		System.out.println("double is : "+o.d2);
		System.out.println("double is : "+o.d3);
		System.out.println("Char is : "+o.c);
		System.out.println("Boolean is : "+o.boo);
		
		
		
	}

}
