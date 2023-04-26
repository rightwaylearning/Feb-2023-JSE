package equals.and.hashcode.override;

public class Testing {
	public static void main(String[] args) {
		
		Employee e= new Employee("A", 1281, new Address("a-34 shriram niwas", "sainagar Jalochi",413102));
		
		Employee e1= new Employee("A", 1281, new Address("a-34 shriram niwas", "sainagar Jalochi",413102));
		
		
		System.out.println(e.equals(e1));//true
		
		System.out.println(e.hashCode()==e1.hashCode());//true
	}

}


// overide hashcode and equals method that's why its true otherwise false

 