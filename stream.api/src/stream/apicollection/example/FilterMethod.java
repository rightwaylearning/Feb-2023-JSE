package stream.apicollection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	private String name;
	private Integer percentage;
	
	public Student() {}

	public Student(String name, Integer percentage) {
		super();
		this.name = name;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", percentage=" + percentage + "]";
	}
	
}

public class FilterMethod {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,41,23,65,46,89);
		
		// here just we printed result not stored
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		
		List<Integer> list1 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(list1);
		
		
		// -------------------------
		
		List<Student> studentList = Arrays.asList(
				  new Student("A", 56),
				  new Student("B", 66),
				  new Student("C", 67),
				  new Student("D", 90),
				  new Student("E", 58)
				);
		System.out.println("------------------------");
		//  list out all student who having 65 > percentage
		List<Student> filteredList= new ArrayList<>();
		for(Student s:studentList) {
			if(s.getPercentage() >= 65) {
				filteredList.add(s);
			}
		}
		System.out.println(filteredList);
		System.out.println("--------------------------------");
		
		List<Student> r =studentList.stream().filter(i->i.getPercentage() >= 65).collect(Collectors.toList());
		System.out.println(r);
		
		List<Student> r1 =studentList.stream().filter(i->i.getPercentage() >= 65 && i.getPercentage()%2==0).collect(Collectors.toList());
	    System.out.println(r1);
	    
	    //--------------------------------------------------------------------------
	    // map
	    
	    List<Integer> list3=Arrays.asList(1,2,3,4,5,6);
	    
	    List<Integer> r3 =  list3.stream().map(i->i*i).collect(Collectors.toList());
	    System.out.println(r3);
	    
	    list3.stream().map(i->i*i).forEach(System.out::println);
	    
	    // I want to do square operation on even number only
	    
	    System.out.println(">>>>>>>>>>>>>>>>>");
	    
	    List<Integer>  r4 = list3.stream().filter(i->i%2==0).map(i->i*i).collect(Collectors.toList());
	    r4.stream().forEach(System.out::println);
	    
	    // filter >> stream object    >>>  input Predicate interface >> lambda expression
	    // map    >> stream object    >>>  input Function interface >>  input & output custom
	    // forEach  >>  non stream object >> input Consumer interface >> input >> output void
	    // collect  >> non stream object
	    
	    // assignment List<Employee>  >> 
	}
}
