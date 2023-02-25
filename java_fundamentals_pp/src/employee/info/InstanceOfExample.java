package employee.info;
	
	class A{
		
	}

	class B extends A{
		
	}

	class C{
		
	}

	public class InstanceOfExample {

		public static void main(String[] args) {
		
			A a= new A();
			
			boolean f = a instanceof A;
			System.out.println(f); // true
			
			boolean f1 = a instanceof B;
			System.out.println(f1); // false
			
		//	boolean f3 = a instanceof C;
		//	System.out.println(f3);
		}
	}
