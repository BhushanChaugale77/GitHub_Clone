import java.util.Scanner;
public class ScannerDemo{
	public static void main(String [] args)
	{
		
		// Declare the object and initialize with
        // predefined standard input object
		Scanner sc = new Scanner (System.in);
		
		// String input
		String name = sc.nextLine();
		
		// Character input
		//char gender = sc.next().charAt();

		
	    // Numerical data input
        int age = sc.nextInt();
		
		// byte, short and float can be read using similar-named functions.
		Long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
		
		
		// Print the values to check if the input was correctly obtained.
		System.out.println("Name : "+name);
		//System.out.println("Gender : "+gendre);
		System.out.println("Age : "+age);
		System.out.println("Mobile No : "+mobileNo);
		System.out.println("CGPA : "+cgpa);
	}
}
