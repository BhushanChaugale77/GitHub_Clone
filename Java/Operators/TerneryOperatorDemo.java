public class TerneryOperatorDemo{
	public static void main(String [] args)
	{
		String result1 = null;
		
		int num = 11;
		
		if(num % 2 == 0)
		{
			result1 = "Even Number!!";
			
		}
		else 
		{
			result1 = "Not even nuber!!";
			
		}
		
		System.out.println(result1);
		
		System.out.println("................");
		
		String result = null;
		
		result = (num % 2 == 0) ? "Even!!" : "Not Even!!";
		
		System.out.println(result);
	}
	
}
