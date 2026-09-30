package customException;

import java.util.*;

public class InvalidAgeExceptionCustomException {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age =sc.nextInt();
		if(age > 18) {
			System.out.println("Registration Successfull!!");
		}else {
			throw new InvalidAgeException("Babu pakk elli Aduko!!");
		}
	}

}
