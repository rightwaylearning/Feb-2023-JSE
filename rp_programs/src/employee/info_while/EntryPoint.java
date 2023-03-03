package employee.info_while;

public class EntryPoint {
	
	public static void main(String[] args) {
		
//		Employee[] ya madhe ata employee che 4 object store hotat mhnje tyana sperate separate 
//		memory bhetel tya madhla properties la 
		
		Employee[] arr = new Employee[4];
		
		Employee e1 = new Employee();
		e1.setEmployeeId(43);
		e1.setEmpName("Rahul");
		e1.setEmpSalary(43234.00);
		arr[0] =  e1;
		
		Employee e2= new Employee(32,"Ravi" , 54322.32);
		arr[1] = e2;
		
		arr[2]= new Employee();
		arr[2].setEmployeeId(65);
		arr[2].setEmpName("Teja");
		arr[2].setEmpSalary(65443.32);
		
		arr[3] = new Employee(65, "Rakesh", 566432.00);
		
//		PrintData pr = new PrintData();
		System.out.println("Before salary");
		
//		aata hai sagla data tikde jail
		PrintData.printer(arr);
		
		int i = 0;
		
		while(i<arr.length) {
			
			double presentSalary = arr[i].getEmpSalary() + (arr[i].getEmpSalary()*10/100);
			
//			System.out.println("Salary increament  " + presentSalary);
		i++;	
		}
		
		System.out.println("After Salary Increment");
		
		PrintData.printer(arr);
		
		
		
		
	}

}
