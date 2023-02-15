package logical_message;



public class Office {
	String name;
	String ceoName;
    Address addr2;
    
    public Address infoAdd() {
    	Address a = new Address();
    	return a;
    }
    
    public void infoMsg(EmployeeInfo obj1) {
    	
    	obj1.showMessage("hello");
    	
    	
    }

}
