public class ReturnTypeMethod2
{
	public int addition(int a, int b)
	{
		System.out.println("Addition Method Started ");
		
		int res = a + b;
		
		System.out.println("Addition Method Ended ");
		
		return res;
	
	}
	public int squre(int a)
	{
	System.out.println("Square Started");
	
	int res = a * a;
	
	System.out.println("Square Ended");
	
	return res;
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		
		ReturnTypeMethod2 obj = new ReturnTypeMethod2();
		
		int addition_result = obj.addition(90,9);
		
		System.out.println(">>> Addition is:" +addition_result);
		
		int square_result = obj.squre(addition_result);
		
		System.out.println(">>> square is:" +square_result);
		
		System.out.println("Main Method Ended!!");
	}
}

		
		