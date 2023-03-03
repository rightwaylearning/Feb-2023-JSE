package array_examples;


public class Entrypoint {

public static void main(String[] args) {
	
	Employeee[] arr = new Employeee[4];

	
	Employeee e = new Employeee();
	
	//e.empId(10);
	e.setEmpId(10);
	e.setEmpName("A");
arr[0] = e;

Employeee e1 = new Employeee(11,"B");
arr[1] = e1;

arr[2] = new Employeee();
arr[2].setEmpId(10);
arr[2].setEmpName("C");

arr[3] = new Employeee(13,"D");

Entrypoint.printStudentData(arr);
}


public static void printStudentData(Employeee[] arr) {

System.out.println(arr[1].getEmpName());
System.out.println(arr[1].getEmpId());
System.out.println(arr[0].getEmpName());
System.out.println(arr[0].getEmpId());
System.out.println(arr[2].getEmpName());
System.out.println(arr[2].getEmpId());
System.out.println(arr[3].getEmpName());
System.out.println(arr[3].getEmpId());
}	
}

