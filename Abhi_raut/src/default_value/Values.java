package default_value;

public class Values {
	public static void main(String[] args) {
		DataTypes d1 = new DataTypes();
		
		// primitive type
		System.out.println("byte = "+d1.getB());
		System.out.println("short ="+d1.getS());
		System.out.println("int = "+d1.getI());
		System.out.println("long = "+d1.getL());
		
		System.out.println("float = "+d1.getF());
		System.out.println("double = "+d1.getD());
		
		System.out.println("char = "+d1.getC());
		System.out.println("boolean = "+d1.isB1());
		
		// reference type
		System.out.println("String = "+d1.getStr());
		System.out.println("Student = "+d1.getSt());
		
	}

}
