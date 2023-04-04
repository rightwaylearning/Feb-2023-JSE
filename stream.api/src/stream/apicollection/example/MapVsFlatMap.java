package stream.apicollection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		List<Integer> set = list.stream().map(i->i*i).collect(Collectors.toList());
	
		System.out.println(set);
		
		// flatmap
		

		List<List<Integer>> list1 =Arrays.asList(
				Arrays.asList(10,20,30,40),
				Arrays.asList(11,23,45,67,89)
		);
		
		// using normal foreach loop
//		List<Integer> output = new ArrayList<>();
//		
//		for (List<Integer> l : list1) {
//			
//			for (Integer i : l) {
//				output.add(i);
//			}
//		}
//		
//		System.out.println(output);
		
		
		List<Integer> data= list1.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		System.out.println(data);
		
	}
}
