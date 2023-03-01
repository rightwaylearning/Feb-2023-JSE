package student_info;

public class School {
   private String SchoolName;
   private  Address adr;
   private  String regNo;
   
   public School() {
	   
	   public School(String regNo, String SchoolName, Address adr) {
			super();
			this.regNo = regNo;
			this.SchoolName = SchoolName;
			this.adr = adr;
		}
	   
	   
   }

public String getSchoolName() {
	return SchoolName;
}

public void setSchoolName(String schoolName) {
	SchoolName = schoolName;
}

public Address getAdr() {
	return adr;
}

public void setAdr(Address adr) {
	this.adr = adr;
}

public String getRegNo() {
	return regNo;
}

public void setRegNo(String regNo) {
	this.regNo = regNo;
}
   
}
