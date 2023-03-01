package student.info;

public class InputOutput {

	public int[] getMarks() {
		
		int[] arr = new int[3];
		arr[0] = 10; arr[1] =20; arr[2] = 30;
		return arr;
	}
	
	
	
	School getSchoolInfo() {
		School s = new School();
		s.setRegNo("ab/po/56/9087-67");
		s.setSchoolName("skdv");
		Address adr = new Address("C 505 B A vermont", "baif road wagholi", "PUNE", 876543);
		s.setSchoolAddress(adr);

		return s;
	}
	
	Address[] getAddressArray() {
	   
	   
	   Address adr1 = new Address("abc-7890", "opt road", "pune", 987066);
	   Address adr2= new Address("abc-7090", "pqr road", "pune", 980766);
//	   
//	   Address[] adr = new Address[2];
//	   adr[0] = adr1;
//	   adr[1] = adr2;
	   
	   Address[] adr = {adr1, adr2};
	   
	   return adr;		
	}
	
	public void printOutput(Student s) {
		
		System.out.println("RollNumber "+ s.getRollNumber());
		System.out.println("Full name= " + s.getStudentFullName());
		int[] marks = s.getMarks();
		System.out.println("------------- student marks");
		int i =0;
		while(i<marks.length) {
			System.out.println(marks[i]);
			i++;
		}
		System.out.println("-------------------- marks is over");
		// ??? 
	}
	
	
	
}
