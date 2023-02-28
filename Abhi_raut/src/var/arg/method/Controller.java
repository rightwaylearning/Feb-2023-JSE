package var.arg.method;

public class Controller {
     
	public static void main(String[] args) {
	
	Examples e = new Examples();
	
	     e.sum(10,20,30);//60
	     e.sum(100,150,200,250,300,400,1000);//2400
	
	  Examples e1 = new Examples();
	 	
	   //  e1.reverse(10,20,30);//60
	   //  e1.reverse(100,150,200,250,300,400,1000);//2400
	     
	  e1.even(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
	
	  Examples e2 = new Examples();
	  
	  e2.odd(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);   
	}
}