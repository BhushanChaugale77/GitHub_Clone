public class TestOperator{
	
	public static void main(String [] args)
	{
		int a = 5;
		
		int b = 10;
		
		boolean res1 = (a < b) && (b > a);// true & true = true
		
		boolean res2 = (a > b) && (b > a); // false & true = false
				
        boolean res3 = (a < b) && (b < a); // true & false = false
						
		boolean res4 = (a > b) && (b < a); // false & false = false
		
		
		boolean res5 = !(a < b) && (b > a);  // Reverse the result, returns false if the result is true
		
		System.out.println("res 5 :"+res5);
		
		System.out.println("res 1 :"+res1);
		System.out.println("res 2 :"+res2);
		System.out.println("res 3 :"+res3);
		System.out.println("res 4 :"+res4);
	}
}
