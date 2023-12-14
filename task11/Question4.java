package task11;

import java.util.Scanner;

public class Question4 {
	
	// Input a=40;b=0;

	// Static variable a & b is stored in Integer Data type.

	static int a, b;
	
	// Division method used for arithmetic operation

	public static void division() {

		//Try & Catch block is implemented for Exception handling 
		
		try {
			System.out.println("Division of A/B =" + a / b);
			
		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by Zero");

			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		// Scanner Class is imported for data input
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Value of A =");

		a = sc.nextInt();

		System.out.println("Please Enter the Value of B =");

		b = sc.nextInt();

		// Since it is Static method no need of object creation
		
		division();

	}

}

// output-Cannot divide by Zero

