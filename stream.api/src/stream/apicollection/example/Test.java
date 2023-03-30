package stream.apicollection.example;

import java.util.function.Function;


public class Test {

	public static void main(String[] args) {
          
		Integer d = doCalculation(i->i*i,20);
		System.out.println(d);
		
		Integer l = "hello".trim().concat("hi").substring(4).length();
		System.out.println(l);
		
	}
	
	
    static Integer doCalculation(Function<Integer, Integer> f, Integer num) {
    	return f.apply(num);
    }
	
}


