package getter.setter.example;

public class Controller {
public static void main(String[] args) {
	 
	Doctor d=new Doctor();
	d.setDrId(10);
	d.setDrName("Dr.Ganesh");
	d.setLastName("Kauthale");
	
	d.getDrId();
	d.getDrName();
	d.getLastName();
	
	System.out.println(d.getDrId());
	System.out.println(d.getDrName());
	System.out.println(d.getLastName());
	
	
	Patient p=new Patient();
	p.setpId(120);
	p.setpName("gauri");
	p.setlName("thorat");
	
	p.getpId();
	p.getpName();
	p.getlName();
	
	
	System.out.println(p.getpId());
	System.out.println(p.getpName());
	System.out.println(p.getlName());
	
	
	Address adr=new Address();
	adr.setLine1("asd road");
	adr.setLine2("qwe raod chowk");
	adr.setPin(30);

	
	d.setAdr(adr);
	//adr.getLine1();
	//adr.getLine2();
///	adr.getPin();
	
	
	
}
}
