package com.LabTask;

public class AllTerinary {

	public static void main(String[] args) {
		int marks=65;
		String grade =(marks>=90)?"A":(marks>=60)?"C":(marks>=75)?"B":(marks>=40)?"D":"Fail";
		System.out.println("Grade : "+grade);
		System.out.println("------------------------------------------------");

		// Eligible For vote
		int age=18;
		String vote=(age>=18)?"Eligible":"Not Eligible ";
		System.out.println("Eligible for vote : "+vote);
		System.out.println("------------------------------------------------");

		//Max and Min of Two Numbers
		int a1=5,b1=7;
		int max1=(a1>b1)?a1:b1;
		int min1=(a1<b1)?a1:b1;
		System.out.println("Maximum 1: "+max1);
		System.out.println("Minimum 1: "+min1);
		System.out.println("------------------------------------------------");
		
		//Max and sec Max and Min and sec Min of Two Numbers
		int a=5,b=7,c=9;
		int max = (a>b)?(a>c ? a:c):(b>c ? b:c);
		int sec_max=(max>a)?((a>b)?a:b):((b>c)?b:c);
		int min=(a<b)?(a<c?a:c):(b<c ? b:c);
		int sec_min=(min>a)?((a<b)?a:b):((b<c)?b:c);

		System.out.println("Max of three Numbers : "+max);
		System.out.println("Second Max of three Numbers : "+sec_max);
		System.out.println("Min of three Numbers : "+min);
		System.out.println("Second Min of three Numbers : "+sec_min);
		System.out.println("------------------------------------------------");

		
		// Positive or Negative
		int num=-1;
		String check=(num>0)?"positive":"Negative";
		System.out.println("The Given Number "+num+" : "+check);
		System.out.println("------------------------------------------------");

		
		//Odd OR Even 
		
		int number =5;
		String oe=(number%2==0)?"EVEN ":"Odd";
		System.out.println("The Given Number : "+oe);
		System.out.println("------------------------------------------------");

		//vowel
		char s='A';
		String VC=((s=='A')||(s=='E')||(s=='I')||(s=='O')||(s=='U') ||
				( s=='a')||(s=='e')||(s=='i')||(s=='o')||(s=='u'))?"Vowel":"Consonent";
		System.out.println(VC);
		System.out.println("------------------------------------------------");

		
	}

}
