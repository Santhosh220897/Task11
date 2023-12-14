package task11;

public class Question5 {

	public static void main(String[] args) {
		
		//Input for String-"Santhosh is studying 10th";charAt-24;
		
         // Try & catch block is included to catch exception of StringOutofBoundsException
		try {
			String student = "Santhosh is studing 10th";

			System.out.println("Identify the charactre at position 50 = " +  student.charAt(24));
			
			
			
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("String is out of bounds");

			e.printStackTrace();
		}
		
	

		//Try & catch is block used for ArrayOutofBoundsException
		try {

			int name[] = new int[5];

			System.out.println("Array is within the Boundy = " + name[6]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array is out of bounds");

			e.printStackTrace();
		}

	}

}

//Output-String is out of bounds,Array is out of bounds
