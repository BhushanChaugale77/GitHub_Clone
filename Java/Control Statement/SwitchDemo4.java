import java.util.Scanner;
public class SwitchDemo4{
	
	public static void main(String [] args)
	{
	System.out.print("Enter any value: ");
	
	Scanner s = new Scanner(System.in);
	
	int i = s.nextInt();
	
	 if (even(i))
	  System.out.println("even");
     else 
	  System.out.println("odd");
	}
	public static boolean even(int i){
	if (i%2==0)
	{
		 return true;
		
	}else{
		return false;
	}
	}
}
