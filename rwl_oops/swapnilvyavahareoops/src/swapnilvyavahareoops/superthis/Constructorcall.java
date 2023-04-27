package swapnilvyavahareoops.superthis;

public class Constructorcall {
	
	
	Constructorcall(){
		System.out.println("this is default constructor");
		
	}
	
    Constructorcall(int a){
    	super();
    	System.out.println("this is single parameter constructor");
		
	}
    
    Constructorcall(int a, int b){
		this(10);
		System.out.println("this is default constructor");
	}
	
	

}


