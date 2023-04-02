package stream.apicollection.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonTerminalMethod {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(1, "A", 23455.00),
				new Employee(2, "B", 1455.00),
				new Employee(1, "A", 23455.00),
				new Employee(4, "D", 123455.00),
				new Employee(5, "E", 3455.00)
				);
		
		List<Integer> nums = Arrays.asList(23,67,1,34,89,1,89,23,23);

		nums.stream().distinct().forEach(System.out::println);
		
		//list.stream().distinct().forEach(System.out::println);
		
		// limit
		
	 List<Integer> list2=nums.stream().limit(4).collect(Collectors.toList());
	  System.out.println(list2);
	  
	  
	  List<String> names = Arrays.asList("Poonam","Nilam","damini","Radhika");
	  
	  List<String> namesUpdated =   names.stream().limit(2).map(str->str.substring(0,4)).collect(Collectors.toList());
	  System.out.println(namesUpdated);
	  
	  // count, min, max
	  
	  List<Integer> numbers = Arrays.asList(23,67,1,34,89,999,89,23,23);
	  
	  
	  long length = numbers.stream().count();
	  System.out.println(length);
	  
	   Optional<Integer> min = numbers.stream().min((e1,e2)->e1.compareTo(e2));
	   
	   System.out.println(min.get());
	   
	   
	   
       Optional<Integer> max = numbers.stream().max((e1,e2)->e1.compareTo(e2));
	   
	   System.out.println(max.get());
	  
	}
}
