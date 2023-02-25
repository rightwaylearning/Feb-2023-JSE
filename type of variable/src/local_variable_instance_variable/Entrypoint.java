package local_variable_instance_variable;

public class Entrypoint {

public static void main (String [] args) {
	Test t1 =new Test ();
	   t1.c =25 ; 
	   t1.d = 20 ;
	   
	Test t2 = new Test () ;
	t2.c = 11 ;
	t2.d = 10 ;
	
	t1.m1 () ;
	t2.m1 () ;
	   
	
}      
       

}
