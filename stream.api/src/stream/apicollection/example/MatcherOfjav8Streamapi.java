package stream.apicollection.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatcherOfjav8Streamapi {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		// anyMatch >> terminal operation
		boolean isExist = list.stream().anyMatch(i->i.equals(300));
		System.out.println(isExist);
		
		// allMatch
		// if all matches are found then only true else false
		List<String> list2= Arrays.asList("abc","abc","abcl","abc");
		boolean status = list2.stream().allMatch(i->i.equals("abc"));
		System.out.println(status);
		
		// noneMatch :- if no match found then true else false
		List<String> list3= Arrays.asList("abc12","abc22","abc","23abc");
		boolean status1 = list3.stream().noneMatch(i->i.equals("abc"));
		System.out.println(status1);
		
		
		// toArray:- here I am converting collection object into array
		
		Object[]  arr=list2.stream().toArray();
		
		
	}
}
