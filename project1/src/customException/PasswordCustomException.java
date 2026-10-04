package customException;

import java.util.Scanner;

public class PasswordCustomException {

	public static void main(String[] args)throws PasswordExeption {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PassWord : ");
		String password=sc.nextLine();
//		System.out.println(password.length());
		if(password.length()>8) {
			System.out.println("Password Accepted");
		}else {
			throw new PasswordExeption("Invalid Password");
		}
		
	}

}
