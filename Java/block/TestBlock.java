
public class TestBlock{
	// static block 
	static {
		System.out.println("inside static block -1111!!!");
	}
	
	// no arg constructor 
	public TestBlock()
	{
		super();
		
		System.out.println("inside TestBlock() no-arg constructor!!!!!");
		
	}
	
	//instance block
	{
		System.out.println("inside instance block - 1111!!!");
	}
	
		// static block 
	static {
		System.out.println("inside static block -2222!!!");
	}
	
	//instance block
	{
		System.out.println("inside instance block - 2222!!!");
	}
	
	public static void printHello() //static method
	{
		System.out.println("inside printHello()");
	}
	
	public void printHii() //instance method
	{
		System.out.println("inside printHii()");
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("inside main method !!!");
		
		TestBlock obj = new TestBlock();
		
		printHello();   // Method calling static to static
		
		obj.printHii();   // Method calling through Object creted in line 47
		
	}
	
}
