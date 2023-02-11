package static_first;

public class Entrypoint {
 public static void main (String [] value) {
	 
	 A a = new A () ;
	 a.e = 25 ;
	 a.f = 32 ;
	A.z = 100 ;
	 
	 A a1 = new A () ;
	 a1.e = 30 ;
	 a1.f = 31 ;
	 A.z = 200 ;
	 
	 A a2 = new A () ;
	 a2.e = 2 ;
	 a2.f = 30 ;
	 A.z = 101 ;
	 System.out.println (A.z);
	 System.out.println (A.z) ;
	 System.out.println (A.z) ;
	 System.out.println (A.z) ;
 }
}
