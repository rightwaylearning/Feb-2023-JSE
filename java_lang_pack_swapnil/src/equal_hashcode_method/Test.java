package equal_hashcode_method;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(101, "Swapnil", new Address("sr no 529/2 plot no 15", "charaholi", 412105));
		Employee e1 = new Employee(101, "Swapnil", new Address("sr no 529/2 plot no 15", "charaholi", 412105));
	
	
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode()==e1.hashCode());
	    System.out.println(e==e1);
	}

}
