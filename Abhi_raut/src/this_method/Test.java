package this_method;

public class Test {
     
	int a;
	int b;
	
 public void m1 () {
	 
	 int a = 250;
	 int b = 300;   
	 
	 System.out.println(a);     // to print value of local variable 
	 System.out.println(b);
	 
	 System.out.println(this.a); // to print value inside t and t1 then use = this 
     System.out.println(this.b);	 
 }
}
