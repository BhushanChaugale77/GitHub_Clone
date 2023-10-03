public class TestConstructor{
	
	public static void main(String[] args)
	{
		Employee emp = new Employee(10,"ram","design");
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.dept);
	}
}