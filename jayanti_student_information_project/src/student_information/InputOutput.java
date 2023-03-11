package student_information;

public class InputOutput {
	
	public int[] getmarks() {
		
		int[] arr= new int[5];
		arr[0]= 80;
		arr[1]= 75;
		arr[2]= 69;
		arr[3]=98;
		arr[4]=45;		
		return arr;
	}
	
	
	School getSchoolInformation()  {
		School s = new School();
		s.setRegNo("SPPU11017530");
		s.setSchoolName("v. s. satav highschool, wagholi");
		
		Address adr = new Address("HXHH+W5R, Nagar Rd," ,"Opposite Wageshwar Mandir", "wagholi ,pune" ,4122067);
		s.setSchoolAddress(adr);
		
		return s;
	}
	
	Address[] getAddressArray() {
		   
		   
		   Address adr1 = new Address("xyz7560", "near by main road", "pune", 412202);
		   Address adr2= new Address("abc-7130", "MG road", "pune", 412107);
	   
//		   Address[] adr = new Address[2];
//		   adr[0] = adr1;
//		   adr[1] = adr2;
		   
		   Address[] adr = {adr1, adr2};
		   
		   return adr;		
		}
	
	public void printOutput(Student s) {
		
		System.out.println("RollNumber"+s.getRollNumber());
		System.out.println("StudentFirstName"+s.getStudentFirstName());
		System.out.println("StundentLastName"+s.getStudentLastName());
		int[] marks = s.getMarks();
		int i=0;
		while(i<marks.length) {
			System.out.println(marks[i]);
			i++;
		}
	}
	
	

}
