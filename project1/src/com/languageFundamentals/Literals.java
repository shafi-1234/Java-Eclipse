package com.languageFundamentals;


public class Literals {
	//They are the Five Literals in Java 
			// 1) Decimal 	 = 0-9 => base =10 =>represent wit number
			// 2) Octal   	 = 0-7 => base =8 => represent with "0"  => Eg:01054
			// 3) HexaDecimal= 0-9 And A,a(10) - F,f(15) => base =16 => represent with "0X" or "0x" => Eg:OX1054
			// 4) Binary 	 = 0-1 => base =2 => represent with "0B" or "0b" => Eg:0B1054

	public static void main(String[] args) {
		
		int a=123;
		System.out.println("Decimal Value : " +a);
		
		int b=012; 
		System.out.println("Octal Value : " +b);
		// output=10 i.e its represent Octal Number =0*8^2 + 1*8^1 + 2*8^0 =0+8+2=10
		
		
		int c= 0xab;
		System.out.println("Hexa Decimal : "+c);
		//A,a(10) - F,f(15) 
		//a=10,b=11
		// output=171 i.e its represent HexaDecimal Number =a*16^1 + b*16^0 => 10*16^1 + 11*16^0 =160+11=171
		
		int d=0b1010;
		System.out.println("Binary Value : "+d);
		// output=10 i.e its represent Binary Number = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 =8+0+2+0=10


		
	}

}
