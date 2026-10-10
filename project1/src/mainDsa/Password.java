package mainDsa;

import java.util.Scanner;

public class Password {

	static String PassWord;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PassWord : ");
		PassWord=sc.nextLine();
		boolean upper=false;
		boolean lower=false;
		boolean number=false;
		boolean special=false;
		
		
		for(int i=0;i<PassWord.length();i++) {
			char ch =PassWord.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				upper=true;
			}else if(ch >='a' && ch<='z') {
				lower=true;
			}else if(ch>='0'  && ch<='9') {
				number =true;
			}else if("@#$!".indexOf(ch)!=-1){
				special=true;
			}
			
		}
		
		
		if(PassWord.length()>=8 && upper && lower && number && special) {
			System.out.println("Password Valid");
		}else {
			System.out.println("Password Not Valid");

		}
	}
	

}
