package setter_getter_method;

public class EntryStudent {
	
	public static void main(String[] args) {
		
		Student s= new Student();
		s.setName("Abhi");
		s.setRollnumber(41);
		
		String Name = s.getName();		
		System.out.println(Name);
		
		int Rollnumber = s.getRollnumber();
		System.out.println(Rollnumber);
// .....................................................		
		
		Info i = new Info();
		i.setName("Varun sandeep kapse");
		i.setEmployeeid(4586);
        i.setCompanyname("Infosys");
        
        String name = i.getName();
        System.out.println(name);
        
        int id = i.getEmployeeid();
        System.out.println(id);
        
        String company= i.getCompanyname();
        System.out.println(company);
 //........................................................
        
        Employee e = new Employee();
        e.setName("Suresh Patel");
        e.setId(56234);
       
        
                                  Address adr = new Address();
                                  adr.landmark="main line, near crown plaza";
                                  adr.area="pune,maharashtra";
                                  adr.pinCode=400023;
         e.setAdr(adr);                      
                                 
        String n =e.getName();
        int d = e.getId();
        Address adr1 = e.getAdr();    
        
        System.out.println(n);
        System.out.println(d);
        System.out.println(adr1);
        
        System.out.println(adr1.landmark);
        System.out.println(adr1.area);
        System.out.println(adr1.pinCode);
             
	}

}
