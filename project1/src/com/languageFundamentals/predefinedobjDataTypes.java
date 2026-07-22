package com.languageFundamentals;
import java.math.*;
//pre defined object data type are 6 Types
//--String'
//--BigInteger
//--BigDecimal
//--StringBuffer
//--StringBuilder
//--ArrayList  

public class predefinedobjDataTypes {
	Integer i; //  Integer.valueOf(100) // int to Integer auto boxing
	int i1;
	int i2=100;
	Integer i3=i2; //Integer to int Auto Unboxing
	String st ="Shafi";
	StringBuffer stb=new StringBuffer("Is good");
	
	StringBuilder stu = new StringBuilder("Boy");
	{
		stb.append(" and cool");
		stu.append(" Ever");
	}
	
	BigInteger bi = new BigInteger("856525652325412741264541254255452412541254124");
	BigInteger bi1 = new BigInteger("8542541254");
	BigDecimal bd = new BigDecimal("4541254125412541251.4541254125412412541541");
//	BigDecimal bd1 = new BigDecimal("745415454.7458425");
	public static void main(String[] args) {

		predefinedobjDataTypes obj = new predefinedobjDataTypes();
		System.out.println(obj.i);// gives null because of  object data type
		System.out.println(obj.i1);// gives 0 because of  data type
		System.out.println(obj.i2);
		System.out.println(obj.i3);
		System.out.println(obj.st);
		System.out.println(obj.stb);
		System.out.println(obj.stu);
		System.out.println(obj.st+" "+obj.stb+" "+obj.stu);	
		System.out.println(obj.bi);
		System.out.println(obj.bd);
		System.out.println("Addition of Big Integer : "+obj.bi.add(obj.bi));
		System.out.println("Multiplication of Big Integer : "+obj.bi.multiply(obj.bi));
		System.out.println("Subtraction of Big Integer : "+obj.bi.subtract(obj.bi1));
		
		
		System.out.println("Addition of Big Decimal : "+obj.bd.add(obj.bd));
		System.out.println("Multiplication of Big Decimal : "+obj.bd.multiply(obj.bd));
		System.out.println("Subtraction of Big Decimal : "+obj.bd.subtract(obj.bd));
			
	}

}
