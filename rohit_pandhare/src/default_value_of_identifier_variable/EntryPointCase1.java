package default_value_of_identifier_variable;

public class EntryPointCase1 {
	
	public static void main(String[] args) {
		
		Case1 c =new Case1();
		
		System.out.println(c.b);
		System.out.println(c.s);
		System.out.println(c.i);
		System.out.println(c.l);
		System.out.println(c.f); //primitive all default values are
		System.out.println(c.d); //0 
		                          //and only char showing empty box
		System.out.println(c.c);  //and boolean is false
		System.out.println(c.b1);
	
//		this are ref type
		System.out.println(c.str);
		System.out.println(c.adr);
	
		System.out.println("........................");
		
		System.out.println(Case2.b);
		System.out.println(Case2.s);
		System.out.println(Case2.i);
		System.out.println(Case2.l);
		System.out.println(Case2.f); 
		System.out.println(Case2.d);  
		System.out.println(Case2.c);
		System.out.println(Case2.b1);
	
//		this are ref type
		System.out.println(Case2.str);
		System.out.println(Case2.adr);
		
		
		
		
	}

}
