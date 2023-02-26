package setteraandgettermethod;

public class controllar {
	
	public static void main(String[] args) {
		
	Address ad = new Address ();

	ad.setLine1("baburav pacharne  nagar ");
	ad.setLine2("shirur pune ");
    ad.setPincode(412210);
    
    ad.getLine1();
    System.out.println (ad.getLine1());
    ad.getLine2();
    System.out.println(  ad.getLine2());
    ad.getPincode();
    System.out.println(ad.getPincode());
		
	employee obj=new employee();
	obj.setEmpId(12);
    obj.setName("omkar");
    
    obj.getEmpId();
    System.out.println(obj.getEmpId());
    obj.getName();
    System.out.println(obj.getName());
	}
}
