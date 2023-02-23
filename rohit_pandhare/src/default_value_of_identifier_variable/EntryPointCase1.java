package default_value_of_identifier_variable;

public class EntryPointCase1 {
	
	public static void main(String[] args) {
		
//		suppose default value kadhyachi aasel tr parameterized
//		constructor ghyachach nahi
		
//		parameterized constructor mhnje to initialize value 
//		when we create object 
		int a ;
//		System.out.println(a);
//		aapn aasa karu nahi shakt karan local var la bydefault 
//		value naste karan aapn tyala kadhi initilize kartoh nahi 
//		kartoh tya mule
		
		Case1 c =new Case1();
		
//		aata aasa lihycha nahi aata constructor madhe intialize karaych
		
//		System.out.println(c.b);
//		System.out.println(c.s);
//		System.out.println(c.i);
//		System.out.println(c.l);
//		System.out.println(c.f); //primitive all default values are
//		System.out.println(c.d); //0 
//		                          //and only char showing empty box
//		System.out.println(c.c);  //and boolean is false
//		System.out.println(c.b1);
//	
////		this are ref type
//		System.out.println(c.str);
//		System.out.println(c.adr);
		
		System.out.println(c.getB());
		System.out.println(c.getS());
		System.out.println(c.getI());
		System.out.println(c.getL());
		System.out.println(c.getF());
		System.out.println(c.getD());
		System.out.println("default char value =  "+c.getC());
		System.out.println(c.isB1());
		
	
		System.out.println("........................");
		
		System.out.println(Case2.b);
		System.out.println(Case2.s);
		System.out.println(Case2.i);
		System.out.println(Case2.l);
		System.out.println(Case2.f); 
		System.out.println(Case2.d);  
		System.out.println("default char value in static is ' ' empty space =  "+Case2.c);
		System.out.println(Case2.b1);
	
//		this are ref type
		System.out.println(Case2.str);
		System.out.println(Case2.adr);
		
		
		
		
	}

}
