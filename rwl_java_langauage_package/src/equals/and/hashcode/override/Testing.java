package equals.and.hashcode.override;

public class Testing {

	public static void main(String[] args) {
		
		Employee e = new Employee(111,"A",new Address("abc, path-23/89", "land-main road", 123));
		
		
		Employee e1 = new Employee(111,"A",new Address("abc, path-23/89", "land-main road", 123));
		
		
		System.out.println(e.equals(e1));
		
		System.out.println(e.hashCode() == e1.hashCode());
	}
}
