package getter_setter_example;

public class Entrypoint {

	public static void main(String[] args) {

	}

	 Employee emp = new Employee();
	{
        emp.seteId(107);
        emp.seteName("vishal Mane");
        emp.seteDesignation("Full stack Devloper");
        emp.seteComapany("IBM");
     	
	   System.out.println(emp.toString());
	}
	
}