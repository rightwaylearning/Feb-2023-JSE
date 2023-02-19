package getter_setter_method2;

public class Control {

	public static void main(String[] args) {
		
		Student S = new Student();
		S.setName("raghu");
		S.setShcoolNme( "mg School");
		
	
	
	Addres adr = new Addres();
	adr.setLine1("kada");
	adr.setLine2("ashti");
	adr.setPinCode(414202);
	S.setAdr(adr);
	
	System.out.println(S.getName());
	System.out.println(S.getShcoolNme( ));
	System.out.println(	S.getAdr());
	System.out.println(adr.getLine1());
	System.out.println(adr.getLine2());
	System.out.println(adr.getPinCode());
	
	
	
	
	}
	
	


	}
	
	
	
	
	

            
