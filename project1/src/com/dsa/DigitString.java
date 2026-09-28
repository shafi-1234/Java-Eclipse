package com.dsa;

public class DigitString {

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		String s="2a33b4c";
		for(int i=0;i<s.length();i+=2) {
				int count=s.charAt(i)-'0';
				char ch = 0;
				if(Character.isAlphabetic(s.charAt(i))) {
				ch=s.charAt(i);
				}
				
				for(int j=0;j<count;j++) {
					result.append(ch);
				}
				i++;
			
		}
		System.out.println(result);
	}
		

}
