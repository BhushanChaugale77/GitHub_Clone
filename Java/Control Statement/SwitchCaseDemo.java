import java.util.Scanner;
public class SwitchCaseDemo {
	
	public static void main(String [] args){
		System.out.println("Please Enter a size in number : ");
		
		Scanner obj = new Scanner(System.in);
		
		int size = obj.nextInt();
		
		System.out.println("You have entered size : " +size);
		
		switch(size)
		{
			case 28:
			System.out.println("small");
			break;
			
			case 32:
			System.out.println("Medium");
			break;
			
			case 40:
			System.out.println("Large");
			break;
			
			case 42 :
			System.out.println("Extra Large");
			break;
			
			default : 
			System.out.println("Invalid Size");
		}
	}
}
