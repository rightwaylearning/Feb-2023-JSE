package override_method_example;

public class Testing {
	
	public static void main(String[] args) {
		
		Employee e=new Employee(121, "Akshay", new Address("falt no.103","sainagar jalochi",413102));
		
		Employee e1=new Employee(121, "Akshay", new Address("falt no.103","sainagar jalochi",413102));
		
		Employee e2=e;
		System.out.println(e.equals(e1));
		
		System.out.println(e.equals(e2));
	}

}
