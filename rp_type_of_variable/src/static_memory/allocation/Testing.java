package static_memory.allocation;

public class Testing {

	public static void main(String[] args) {
		
		A.z = 555;
//		onlu getting one time memory
		
		A a = new A();
		a.x = 32;
		a.y = 22;
		a.z = 999;
		
		
		A a1 = new A();
		a1.x = 32;
		a1.y = 22;
		a1.z = 1000;
//		this a1.z getting static memory
		
		
		System.out.println(a.z);

		System.out.println(a1.z);
				
		
		
	}
}
