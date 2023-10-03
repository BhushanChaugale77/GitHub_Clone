public class Employee{
	int id;
	String name;
	String department;
	String address;
	
	public Employee() //no-arg construtor
	{
	}
	public Employee(int id) //parametrized constructor 1-arg
	{
		this.id = id;
	}
	public Employee(int id, String name)  //parametrized construtor 2- arg
	{
		this.id = id;
		this.name = name;
	}
	public Employee(int id, String name, String department, String address)   //parametrized constructor 4- arg
	{
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
	}
	public static void main(String []args)
	{
		Employee e1 = new Employee();
		e1.id = 77;
		e1.name = "Ram";
		e1.department = "Design";
		e1.address = "Kokan";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.address);
		System.out.println(e1.department);
		
		Employee e2 = new Employee();
		e2.id = 97;
		e2.name = "sham";
		e2.department = "H.R";
		e2.address = "goa";
		
			
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.address);
		System.out.println(e2.department);
		
		Employee e3 = new Employee();
		e3.id = 99;
		e3.name = "Hari";
		e3.department = "Security";
		e3.address = "Kerala";
		
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.address);
		System.out.println(e3.department);
		
		Employee e4 = new Employee();
		e4.id = 95;
		e4.name = "Govinda";
		e4.department = "cloud";
		e4.address = "Jakarta";
		
		System.out.println(e4.id);
		System.out.println(e4.name);
		System.out.println(e4.address);
		System.out.println(e4.department);
	}
}

		