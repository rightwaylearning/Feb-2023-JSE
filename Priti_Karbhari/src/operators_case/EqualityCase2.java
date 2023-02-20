package operators_case;

class A{}

class B{}

class C extends B{}


public class EqualityCase2 {
public static void main(String[] args) {
		
//		ya madhe downcasting kasach nahi chalnar karan kontach
//		operator ref var ch downcasting nahi allow karat 
		
//		aani relational operator madhe aani arthimatic madhe pn
//		ref var. as a type allow nahi operand1 > op2
//		aasa allowch nahi
		
		
		
		A a = new A();
		A a1 = a;
		
		boolean r = a == a1;
		System.out.println(r);
	
	
		A a2 = new A();
		A a3 = new A();
		
        System.out.println(a2 == a3); //false becoz 2 object aahet 	
	
    	B b = new B();
		A a4 = new A();
		
//        System.out.println(b == a4); 
//		compile time error karat ya madhe kahi relation nahiye b
//		and a4 madhe ref var madhe karat te parent nahi kahi B cha
//		kahi nahi
		
		A a5 = new A();
		Object obj = new A();
		
        System.out.println(a5 == obj); // false becoz 2 object aahet vegele
//        yat ref var vegle vegle store hotil
        
//        ya madhe compile time error ka nahi yenar karan ya madhe relation 
//        aahe parent class ch mhnje Object class mhnje parent
//        class of A class tya mule error nahi yenar
        
        C c = new C ();
        B b2 = c;
        
        System.out.println(c == b2);
//        ya madhe pn store karu shaktoh karan C class hai child aahe
//        B class cha....mhnje (B) parent class madhe aapn child store
//        karu shaktoh
        
        C c1 = new C ();
        B b3 = new C ();
        
        System.out.println(c1 == b3); //false aahe karan 
//        object 2 aahet vegle vegle ref var. separate sperate data 
//        object madhe taktil
//        aani hai chalel karan parent class madhe child class che
//        property taku shaktoh
 	}


}
