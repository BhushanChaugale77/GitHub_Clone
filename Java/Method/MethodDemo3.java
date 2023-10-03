public class MethodDemo3{
	public void subtraction(int a,int b)
	{
		int res = a-b;
		System.out.println("Subtraction is :"+res);
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		
		MethodDemo3 obj = new MethodDemo3();
		
		//Addition obj1 = new Addition();
		 
		 obj.subtraction(100,30);
		 
		// obj1.sum(70,7);
		 System.out.println("Main Method Ended");
	}
}

		
		