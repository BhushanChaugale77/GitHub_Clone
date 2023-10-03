public class B extends A{
	int i;
	
	public B()
	
	{
//     super();this(10); //this is not allowed
		System.out.println("inside B() Constructor!!");
	}
	public B(int inside)
	
	{
		this();
		System.out.println("inside B(int i) Constructor!!");
		
	}
}
