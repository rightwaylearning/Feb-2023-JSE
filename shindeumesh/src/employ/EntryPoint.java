package employ;

public class EntryPoint {
public static void main(String[] args) {
	
InputOutput in = new  InputOutput();
	
	Employ E= new Employ();{
		
		E.setEmployName(" Ramesh");
		E.setCompneyNmae("sun farma MIDC");
		E.setSalary(in.getsalaryOfmounth());
        E.setAddress(in.getAddressinfo());
		
		
	//	in.printalldata(E);
	}
	
	
}
	
	//The method printalldata(Employ) is undefined for the type InputOutput
	
	
	
}
