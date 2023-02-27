package student.info;

public class Output {
	
	public int[] getmarks(){
		
		int[] marks = new int[5];
		marks[0]=65;
		marks[1]=89;
		marks[2]=74;
		marks[3]=38;
		marks[4]=69;
		
		return marks;
	}
      
	public School getSchoolinfo() {
		
		School s = new School();
		s.setRegNo("ab-256/85/dbshbx");
		s.setSchoolName("skdv");
		Address a= new Address("near bus stand ","kolgaon , shrigonda",413728);
		
		s.setSchoolAdr(a);
		return s;
	}
    
	public Address[] getAddressinfo() {
		
		Address[] adr = new Address[2];
		
		adr[0] = new Address(" near main road ","kolgaon ",413728);
		adr[1] = new Address("marchands bank","ahmednagar",414001);
		
		return adr;	
	}
	  
	   public void printEntry(Student s) {
		   
		   System.out.println("Student RollNo = "+s.getRollNumber());
		   System.out.println("Student Name = "+s.getName());
		   
		   int[] marks = s.getMarks();
		   
		   System.out.println("..........Student Marks..........");
		   
		   int i = 0;
		   while(i<marks.length) {
			   System.out.println(marks[i]);
			   i++;
	   }
		   
		   School school = s.getSchool();
		     System.out.println(".............School Information............");
		       
		       System.out.println("School Reg.No = "+school.regNo);
		       System.out.println("School Name = "+ school.schoolName);
		       
               System.out.println(".............School Address................");
               
               System.out.println("landmark = "+school.schoolAdr);
		   
               
               
		   Address[] adr = s.getAddress();
		  System.out.println("..........Student (permanant) Address.........");
		   
             System.out.println("Landmark = "+adr[0].landmark);
		     System.out.println("Area = "+adr[0].area);
		     System.out.println("PinCode = "+adr[0].pinCode);
		     
		  System.out.println("...........Student (current) Address...........");
		  
		     System.out.println("Landmark = "+adr[1].landmark);
		     System.out.println("Area = "+adr[1].area);
		     System.out.println("PinCode = "+adr[1].pinCode);
		     
		     
		 }
		  }
         
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

