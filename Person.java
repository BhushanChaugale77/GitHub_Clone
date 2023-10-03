public class Person{
	
	String name;
	String address;
	int height;
	float weight;
	
	public Person()
	{
		super();
	}
	
	public Person(String name,int height,float weight,String address)
	{ 
		this.name = name;
		this.address = address;
		this.height = height;
		this.weight = weight;
		
	}
	public static void main(String []args)
	{
	    Person p1 = new Person();
		p1.name = "Ram";
		p1.address = "Kolhapur";
		p1.height = 6;
	    p1.weight = 77.7f; 
	  
	  //Person p1 = new Person("Ram","Kolhapur",6,77.7f);
	  
	  System.out.println(p1.name);
	  System.out.println(p1.height);
	  System.out.println(p1.address);
	  System.out.println(p1.weight);
	}
}

		
		