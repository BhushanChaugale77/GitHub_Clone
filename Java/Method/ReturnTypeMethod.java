public class ReturnTypeMethod{
	public int addition(int a , int b)
	{
		System.out.println("Addition Method Started");
		int res = a + b;
		System.out.println("Addition Method Ended");
		return res;
	}
	 public static boolean isEvenNumber(int number)
	{
		if (number % 2==0){
			return true;
		} else {
			return false;
		}
	}
		
	  public static void print(int number)
	{
		System.out.println("Number is :" + number);
	}
	static public void main(String[] args)
	{
		System.out.println("Main Method Started");
		ReturnTypeMethod obj = new ReturnTypeMethod();
		int result = obj.addition(70,7);
		System.out.println(">>> Addition is :" +result);
		int number = 4;
		
		if (isEvenNumber(number))
		{
			print(number);
		}
		System.out.println("Main Method Ended");
	}
	}
	
		
		