package stream.apicollection.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxAndMinsalaryEmployeeDeatisl {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(1, "A", 23455.00),
				new Employee(2, "B", 1455.00),
				new Employee(3, "C", 2455.00),
				new Employee(4, "D", 123455.00),
				new Employee(5, "E", 3455.00)
				);
		
	  Optional<Employee> e = list.stream().min((e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
       System.out.println(e.get());
       
       Employee e3= list.stream().max((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).get();
       System.out.println(e3);
       
       // tree >>  TreeSet  TreeMap >> 
       
       //------------------------  sort
       
       List<Integer> nums = Arrays.asList(23,67,1,34,89,1,89,23,23);
       // natural 
       List<Integer> nums1= nums.stream().sorted().collect(Collectors.toList());
       
       System.out.println(nums1);
       
       
       List<Integer> nums2= nums.stream().sorted((e1,e2)-> e2.compareTo(e1)).collect(Collectors.toList());
       
       System.out.println(nums2);
       
       // sort employee according to salary
       
        List<Employee> listEmp =  list.stream().sorted((e1,e2)->-e1.getSalary().compareTo(e2.getSalary()) ).collect(Collectors.toList());
       
        listEmp.forEach(System.out::println);
	}
}
