package customException;

import java.util.Scanner;

public class DuplicateUsernameCustomException {

	public static void main(String[] args) throws DuplicateUsernameException {
		Scanner sc = new Scanner(System.in);
		String arr[]= {"Ali","Shafi","Rafi","Vajeed","Ranjeeth"};
		
		System.out.println("Enter User Name");
		String newUser=sc.nextLine();

			for(int i=0;i<arr.length;i++) {
				if(!newUser.equalsIgnoreCase(arr[i])) {
					System.out.println("The Account is Created ");
					break;
				}else {
					throw new DuplicateUsernameException("User Already Exist!!");
				}
				
			}
	}

}
