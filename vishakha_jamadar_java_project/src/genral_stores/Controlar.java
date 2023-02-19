package genral_stores;

public class Controlar {
	public static void main(String[] args) {
	
		shop p= new shop() ;
			p.setName("mojmart");
			p.setId(203);
			
			address adr= new address();
			adr.setLine1("shivaji nagar");
			adr.setLine2("near bus stand");
			adr.setId(678);
			
			System.out.println (p.getName());
			System.out.println(p.getId());
			System.out.println(adr.getLine1());
			System.out.println(adr.getLine2());
			System.out.println(adr.getId());
			
			
		
	}
	

}
