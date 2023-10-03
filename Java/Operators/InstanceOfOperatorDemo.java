public class InstanceOfOperatorDemo{
	public static void main(String [] args)
	{
		String s = new String ("Helllo");
		
		StringBuffer s1 = new StringBuffer("hii");
		
		StringBuilder s2 = new StringBuilder("hiiHello");
		
		doSomething(s);
		
	}
	
	public static void doSomething(Object o)
	{
		if(o instanceof String)
		{
			System.out.println("do some String operations!!");
		}
		else 
		{
			System.out.println("its not a string !!");
		}
	}
}
