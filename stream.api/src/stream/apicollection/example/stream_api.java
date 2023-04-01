package stream.apicollection.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class stream_api {
  
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		
		// filter
		
		// case 1
//		List<Integer> output = new ArrayList<>();
//		for (Integer i : list) {
//			if(i%2 == 0) {
//				System.out.println(i);
//				output.add(i);
//			}
//		}
		
//		List<Integer> output1 = new ArrayList<>();
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			Integer i = itr.next();
//			if(i%2==0)
//			output1.add(i);
//		}
//		System.out.println(output1);
		
		// streamm api>> collection processing 
		
		//Consumer<Integer>
		 // Predicate
		// Function
	    // ::
		
		//list.stream().forEach(i->{System.out.println(i);});
		//list.stream().forEach(System.out::println);
		
		
	}
}
