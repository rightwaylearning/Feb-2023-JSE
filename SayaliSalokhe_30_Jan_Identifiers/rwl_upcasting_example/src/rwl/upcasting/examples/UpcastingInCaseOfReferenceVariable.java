package rwl.upcasting.examples;


class A{
	
}

class B extends A{
	
}

class C extends B{
	
}





public class UpcastingInCaseOfReferenceVariable {

	public static void main(String[] args) {
		
		// up casting  // compiler is respossible to do up cating
       C c= new C();
       B c1=new C();
       A c2=new C();
       Object c3 = new C();
       
       A a1=new A();
       
       Object a2=new A();
   // -------------------------------------------------  
       // down casting
        C a3=(C)new A();
		
       System.out.println("hello");
	}
}








