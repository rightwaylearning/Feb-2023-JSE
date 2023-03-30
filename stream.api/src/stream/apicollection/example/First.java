package stream.apicollection.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class First {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
				list.add(10);
				list.add(15);
				list.add(30);
				list.add(25);
				list.add(30);
				
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}	
				
				
//	  Stream<Integer> obj =  list.stream();		
//	  obj.forEach(i->System.out.println(i));
				
		//		::
				
				
//	  list.stream().forEach(num -> System.out.println(num));			
				
				
	  list.stream().forEach(System.out :: println);			
				
	}
}
