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
        
	}

}
