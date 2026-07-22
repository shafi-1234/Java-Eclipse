package com.languageFundamentals;

public class StringLiteral {

	public static void main(String[] args) {
		// String Literals 
		 
		String s1="Shafi"; 
		// it create one object to shafi and it assigned s1 to shafi in string Constant pool(SCP)
		
		String s2= new String("Java"); 
		// It create a two object and its one in heap class and assigned to string  and another in string pool as anonomyous object
		
		
		String s3= "Shafi";
		//Its not create another object insted the its assign the s3 to shafi in string pool
		
		String s4= new String("Java");
		//Its create a only one object in heap insted of two object because the string is same as s2 and its assiged to anonomyous object in SEP which  was created by s2 string Objext

		System.out.println(s1==s3); // True : Becuse its comapre the string s1=Shafi ,S3=Shafi;
		System.out.println(s1.equals(s3));//True : its compare the String address s1 and s3 are same are located in SCP;


		System.out.println(s2==s4);// False: In Object Case "==" Comapre the Address of the Object,s2 and s4 are stored in different location
		System.out.println(s2.equals(s4));//True : In Object case .equals is used to compare the string s2=Java and s4=Java
	}

}
