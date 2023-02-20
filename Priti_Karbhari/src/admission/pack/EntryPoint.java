package admission.pack;

public class EntryPoint {
public static void main(String[] args) {
		
		TeacherRef t = new TeacherRef();
		
		String n = "Rahul";
		int no = 24;
    	
		t.generateStudentInfo(n,no);
	
    	Student obj1 = t.generateStudentInfo("Rahul",23);
		
        System.out.println("hai direct method aahe "+ obj1.name);
    	
    	obj1.printinfo();
    	
	}


}
