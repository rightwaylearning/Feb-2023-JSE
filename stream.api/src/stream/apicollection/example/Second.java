package stream.apicollection.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Second {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(109,2390,21,45,67,89,34);
		
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			Integer i = itr.next();
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		// list.stream().filter(i->i%2 == 0).forEach(i->System.out.println(i));
		list.stream().filter(i->i%2 == 0).forEach(System.out::println);
		Collectors.toList();
	}
}
