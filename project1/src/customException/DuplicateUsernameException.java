package customException;

public class DuplicateUsernameException extends Exception {

	DuplicateUsernameException(String s){
		super(s);
	}

}
