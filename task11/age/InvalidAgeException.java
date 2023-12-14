package task11.age;

//Class InvalidAgeException Extends to parent Exception

public class InvalidAgeException extends Exception {
	
	//Constructor with String Parameter is called;
	
	public InvalidAgeException(String str) {
		
		super(str);
	}
	
	//Method for age validation is implemented with integer parameter

	public void ageValidation(int age) {
		
		//Try & Catch block is surrounded with if else condition 
		try {
			if(age<18) {
				
				//throw new keyword is used for customized Exception
				
				throw new InvalidAgeException("Your age is less than 18, so you are not eligible to vote");
			}
			
			else {
				
				System.out.println("You age is "+age+"so you are not eligible to vote");
			}
		} catch (InvalidAgeException e) {
			
			e.printStackTrace();
		}
	}
	
}
