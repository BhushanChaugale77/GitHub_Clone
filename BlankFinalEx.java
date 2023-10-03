public class BlankFinalEx{
	final int i;
	final String s;
	
     BlankFinalEx(int i1,String s1)
	{
		i=i1;
		s=s1;
	}
	public static void main(String [] args)
	{
		BlankFinalEx b = new BlankFinalEx(10,"hii");
		
		System.out.println(b.i);
		System.out.println(b.s);
		
		BlankFinalEx b1 = new BlankFinalEx(11,"hello");
		
		System.out.println(b1.i);
		System.out.println(b1.s);
	}
}
