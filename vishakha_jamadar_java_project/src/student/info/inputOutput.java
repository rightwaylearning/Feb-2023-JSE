package student.info;

public class inputOutput {
	public int[] getMarks() {
		int[] arr = new int[4];
		arr[0] = 20;
		arr[1] = 60;
		arr[2] = 70;
		arr[3] = 80;
		return arr;
	}

	School getSchoolInfo() {
		School s = new School();
		s.setRegNo(12345);
		s.setSchoolName("saraswati vidyalay");
		Address adr = new Address("Shivaji nagar" ,"near santoshi mata chaufully","",425408);
		s.setSchoolAddress(adr);
		return s;
	}

	Address[] getAddressAray(){
		Address adr1=new Address("near bus stop","","",1234);
		Address adr2=new Address("pune highway","","",5678);
		
		Address[]adr= {adr1,adr2};
		return adr;
	}

	public void printoutput(Student s) {
		System.out.println("Roll No=" + s.getRollNumber());
		System.out.println("Name:-" + s.getStudentFullName());
		System.out.println("Address:-" + s.getAddress());
	}

}
