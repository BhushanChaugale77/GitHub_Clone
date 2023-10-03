public class Student{
	int roll;
	String name;
	String address;
	
	public Student()
	{
		
	}
	
	public Student(int roll, String name, String address)
	{
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
		
	 public static void main(String[] args)
	 {
		 Student s1 = new Student();
		 
		 Student s2 = new Student(7,"Ram","Kolhapur");
		 
		 Student s3 = new Student(9,"Sham","Pandharpur");
		  
		 Student s4 = new Student(11,"Veer","Sindhudurg");
		 
		 System.out.println(s2.roll);
		 System.out.println(s2.name);
		 System.out.println(s2.address);
		 
		 System.out.println(s3.roll);
		 System.out.println(s3.name);
		 System.out.println(s3.address);
		  
		  
		System.out.println(s4.roll);
		System.out.println(s4.name);
	    System.out.println(s4.address);  
	 }
	
}	
		 
		 