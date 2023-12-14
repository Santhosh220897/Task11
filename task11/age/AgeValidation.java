package task11.age;

public class AgeValidation {

	public static void main(String[] args) {
		
		//Object is implemented for invalidageException class

		InvalidAgeException obj = new InvalidAgeException("Exception for age");
		
		//Object calling is done with input of age-13;

		obj.ageValidation(13);
	}

}
//Output-Your age is less than 18, so you are not eligible to vote