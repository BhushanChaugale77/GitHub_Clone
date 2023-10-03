public class MethodDemo{
	public static void print() //method declaration
	{
		System.out.println("Print Method Started");
		System.out.println("hiii");
		print2();
		System.out.println("Print Method Ended");
	}
	public static void print2()
	{
		System.out.println("Print2 Method Started");
		System.out.println("Helllo");
		print2();
		System.out.println("Print2 Method Ended");
	}
	public static void main(String[] args)
	{
		int i = 10;
		Intejar j = 20;
		System.out.println("Main Method Started");
		print(); //method invocation
		System.out.println("Main Method Ended");
	}
}