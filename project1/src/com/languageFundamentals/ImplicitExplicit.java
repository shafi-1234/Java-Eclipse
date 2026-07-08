package com.languageFundamentals;

public class ImplicitExplicit {

//		byte b=128 ;
//		byte b1=-129;
	//	gives compile time error because of out of range 
	//	1 Byte = 8 bits  ==> its store values from range of -2**7 to (2**7)-1 ==> -128 to 127 
	//  So Byte Store the value upto -128,-127,-126,....0,1,2,3,......126,127 i.e
	byte b2= 127;
	int b3= 128;
	
	
	short s;
	//short =2 Bytes ==> 16 bits==> its store values from range of = -2**15 to (2**15)-1 ==>-32,768 to 32,767
	
	int i;	//Int =4 Bytes ==> 32 bits =  its store values from range of -2**31 to (2**31)-1 ==> -2,147,483,648 to 2,147,483,647
	long l;	// long = 8 bytes ==> 64 bits = its store values from range of -2**63 to (2**63)-1 ==>-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	float f;	// float = 4 bytes==>32 bits = its store values from range of -2**31 to (2**31)-1 ==>About 6–7 decimal digits
	double d;//double = 8 bytes==>64 bits =its store values from range of -2**63 to (2**63)-1 ==> About 15–16 decimal digits
	char c;// char = 2Bytes ==>16 bits ==> Its UniCoder its Dont have Negative so, 2**15+(2**15)-1=65,535 ==>Unicode character (0 to 65,535)
	boolean boo; // boolean = 1byte ==> 8 bits==> true or false
	
	public static void main(String[] args) {
		// Java Type Casting Are Divided into
		// 1)Implicit Type Casting
		//	  (byte-->short-->int-->long-->float-->double-->char-->boolean)
		//		This Process which converting small data big data type happens default
		
		
		// 2)Explicit Type Casting
		//		(boolean-->char-->double-->float-->long-->int-->short-->byte)
		//		To convert the Big data into small Data type we use Type casting which used below Syntax		
		//		-- byte = (int) 129
		
		
		ImplicitExplicit o = new ImplicitExplicit();
		
		System.out.println("Byte is : "+o.b2);
		
		
		
		
	}

}
