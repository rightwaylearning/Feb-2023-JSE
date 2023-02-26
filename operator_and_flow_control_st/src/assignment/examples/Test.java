package assignment.examples;

public class Test {
	
	public static void main(String[] args) {
		
	
	// case 1 with primitive & reference
	
	int a = 10;
	Object o = new Object();
	
	//case 2
    
	int b,c,d,e;
	b=c=d=e=20; // chain assighnment
	
	// int l=m=n=p=30;  // chain assignment is not allow while declaration
	
	// case 3
	
	int y = 10;
	y += 20;  // y = (int)y +20;   // 30
	System.out.println(y);
	
	byte b1 =10;
	b1 += 20; // byte =(byte)b1+20;
	
	int i = 10;
	i*=10;       // 100-25+30 
	i-=25;        // 75 +30
	i+=30;        //  105
	
	System.out.println(i); //105
	
	}
	}


