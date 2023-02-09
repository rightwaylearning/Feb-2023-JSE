package local_variable_instance_variable;

public class Test1 {
	
	 int a;
     int b;
     
     void m1(Test1 obj) {
    	 int a=100;
    	 System.out.println(a);
    	 System.out.println(obj.a);
    	 System.out.println(obj.b);
    	 System.out.println(b);
     }

}
