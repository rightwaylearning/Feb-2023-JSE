package employee.aarry;

	public  class Employee1{
		
	   public static void main(String[] args)	{
		   
		   Employee[] arr=new Employee[3];
		                               
		   Employee e=new Employee();
		   e.setEmpId(10);
			e.setEmpName("shital");
		    arr[0]=e;

		    
		  
		   Employee e1=new Employee();
		   e1.setEmpId(23); e1.setEmpName("shital");
				   
		    arr[1]=e1;
  
		    arr[2]=new Employee(24,"Tanvi");
		    
		    int i=0;
		    while(i<arr.length) {
		    
		    System.out.println (arr[i].getEmpName());
		    System.out.println (arr[i].getEmpId());
		    
		    i++;
	
		    }
	
	}
		
	}
	
	
  
    




