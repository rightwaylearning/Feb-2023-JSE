package array.data.structure.example;

public class EntrypointToStroreArrayObject {

	public static void main(String[] args) {
		
		Employee[] e = new Employee[4];
		
//		3 is the size of array index then 0 to 2
		                            
		                           
		Employee e1 = new Employee(32,"Ravi");
				e1.setEmpId(34);
		e[0]= e1;
		
		Employee e2 = new Employee();
		e2.setEmpId(33);
		e2.setEmpName("Rahul");
		
		e[1]= e2;
	
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		
		e[2]= new Employee();
		e[2].setEmpId(34);
		e[2].setEmpName("Riyansh");
		
		System.out.println("................");

		e[3]= new Employee(35,"prem");
		
		System.out.println("<<<<<<<<Print Data>>>>>");
		
		System.out.println(e[0].getEmpId());
		System.out.println(e[0].getEmpName());
		
		System.out.println("<<<<<<<<Print Data using loop>>>>>");
	int i = 0;
	
		while(i < e.length ) {
			
			System.out.println("Employee name = "+e[i].getEmpName());
			System.out.println("Employee name = "+e[i].getEmpId());
			
			System.out.println(">>>>>>>>>>>>>>>>>>>");
			i++;
		}
		
		System.out.println("<<<<<this is method call giving or passing object argument to that method>>>>>>>>>>>>");
		EntrypointToStroreArrayObject.m1(e);
	}
	
	public static void m1(Employee[] e) {
		
		System.out.println("this is Employee id = "+e[0].getEmpId());
		System.out.println("this is Employee name = "+e[0].getEmpName());
		
	}
	
}
