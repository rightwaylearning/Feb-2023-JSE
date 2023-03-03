package student_info;

public class InputOutput {
public int[]getmarks(){
	int[]arr=new int[5];
	arr[0]=56;
	arr[1]=45;
	arr[2]=67;
	arr[3]=38;
	arr[4]=55;
	return arr;
}
School getSchoolInfo() {
	School s=new School();
	s.setRegNo("pb/ao/66/1998-1999");
	s.setSchoolName("VPD");
	Address adr=new Address("pqr-43,dyp road,shirur");
			s.getSchoolAddress(adr);
			return s;
	Address[]getAddressArray(){
		Address adr1=new address(pqr-1669,"dyp road,"shirur,431312);
		Address adr2=new Address("xyz-1760","dxl road""shirur 431312);"
				Address[]adr= {adr1,adr2};
		return adr;
		
		public void printInputOutput(Student s) {
			System.out.println("RollNumber "+s.getRollNumber());
			System.out.println("fullName "+s.getStudentFullName());
			int[]marks=s.getMarks();
			System.out.println("--------------Student Marks");
			int i=0;
			while (i<marks.length) {
				System.out.println(marks[i]);
				i++;
				System.out.println("-----------Marks is over");
			}
		}

}
}
