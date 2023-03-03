package student.info.project;

public class InputOutput {
	public int[] getMarks() {
		int[] marks = new int[6];
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 70;
		marks[3] = 50;
		marks[4] = 60;
		marks[5] = 70;

		// int[] marks={30,40,50,60,70,80};

		return marks;
	}

	public Address[] getAddress() {
		Address[] adr = new Address[2];
		adr[0] = new Address("Gorakshanath Colony,"," Bhingar,"," Ahmednagar,", 414002);
		adr[1] = new Address("Wagholi", "Haveli", "Pune", 414030);
		return adr;

//		Address adr1=new Address("Bingar","Nagar","Ahmednagar",414002);
//		Address adr2=new Address("Wagholi","Haveli","Pune",414030);
//		Address[] adr=new Address[2];
//		adr[0]=adr1;
//		adr[1]=adr2;
//		Address[] adrr={adr1,adr2};
//		return adrr;
		

	}

	public School getSchoolInfo() {
		School s1 = new School();
		s1.setRegNumber("reg-20/45367");
		s1.setSchoolName("Jspm Bsiotr");
		Address adr = new Address("Wagholi,", "Pune,", "Maharashtra,", 41022);
		s1.setSchoolAddress(adr);
		return s1;
	}

	public void printOutput(Student s)
	{
		System.out.println("Student Information");
//		****************************************************************************************
		
	    System.out.println("Roll_Number : "+s.getRollNumber());
	    System.out.println("Student_Name : "+s.getStudentName());
//	*****************************************************************************************
	    System.out.print("Student_Marks :");
		 int[] marks = s.getMarks();
		 int i=0;
		 while(i<marks.length)
		 {
			 System.out.print(" "+ marks[i]+" ");
			 i++;
			 
		 }
		 System.out.println();
		 
//**********************************************************************************************	 
	    System.out.print("Student_Address :");
	    
	    Address[] adr=s.getAddress();
	    System.out.print(adr[0].getLine1());
	    System.out.print(adr[0].getLine2());
	    System.out.print(adr[0].getCity());
	    System.out.print(adr[0].getPinCode());
	    
//**********************************************************************************************	     
	   System.out.println("Student_School_Info :");
	   School sch=s.getSchool();
	   System.out.println("Reg_Number :"+sch.getRegNumber());
	   System.out.println("School_Name :"+sch.getSchoolName());
	   
//	   Address adr = new Address("Wagholi", "Pune", "Pune", 41022);
//	   s1.setSchoolAddress(adr);
	      Address a=sch.getSchoolAddress();
	   System.out.print("School_Address: ");
	  System.out.print
	  (a.getLine1());
	  System.out.print(a.getLine2());
	  System.out.print(a.getCity());
	  System.out.print(a.getPinCode());
	  
	   
	   
	   
	 
	   
	   
	    
		
		 
	    
		
		
	}
}
