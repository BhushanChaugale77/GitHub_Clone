public class Static_Nonstatic_MethodDemo{
	public void m1()
	{
		System.out.println("m1 method started");
		m3=();
		System.out.println("m1 method ended");
	}
	public static void m2()
	{
		System.out.println("inside m2() Started");
	}
	public void m3()
	{
		System.out.println("inside M3() Started");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main() Started");
		Static_Nonstatic_MethodDemo obj = new Static_Nonstatic_MethodDemo();
		obj.m1();
		System.out.println("main() Ended!!");
	}
}

		