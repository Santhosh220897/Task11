package task11;

public class Login {
	
	//variable correctPassword is stored in String

	String correctPassword;

	//Constructor with arguments is used 
	
	public Login(String abc123) {
		
	        this.correctPassword = correctPassword;
	    }

	// Login function method is implemented
	
	//throws keyword is used which Exception will be handled in main method
	
	public void loginFn(String inCorrectPsw) throws Exception {
		
		//If else statement to verify the Password is matching/not
		
		if (!inCorrectPsw.equals(correctPassword) ){
			
			throw new Exception("Incorrect Password please try again");
			
		} else {
			
			System.out.println("Login successful!");
		}
	}

	public static void main(String[] args) {
		
		//Object creation for the class Login
		
		Login obj = new Login("correct_password");

		//Since the Throws is used in method while calling method surround with try/catch block to handle the Exception
		
		try {
			
			obj.loginFn("Wrong Password");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
//Output:-Incorrect Password please try again
