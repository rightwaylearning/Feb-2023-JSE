package grouping.steam.api.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Sudamna",Gender.MALE,23));
		list.add(new Person("Mahesh", Gender.MALE, 45));
		list.add(new Person("Sushil",Gender.MALE,23));
		list.add(new Person("Radhika", Gender.FEMALE, 32));
		list.add(new Person("Madhura",Gender.FEMALE,32));
		list.add(new Person("damini", Gender.FEMALE, 30));
		
		
		Map<Gender, List<Person>> map = new HashMap<>();
		
		
		for (Person person : list) {
		
			if(map.containsKey(person.getGender())) {
				List<Person> l = map.get(person.getGender());
				l.add(person);
				map.put(person.getGender(), l);
				
			}else {
				List<Person> l = new ArrayList<>();
				l.add(person);
				map.put(person.getGender(), l);
			}
		}
				
//		map.keySet().stream().forEach(i->{
//			System.out.println(i +" = "+map.get(i));
//		});
		
		//-------------------------------------------------------
		// now above problem we are going to fix with stream api
		
		
		Map<Gender, List<Person>> map1 = list.stream().collect(Collectors.groupingBy(i->i.getGender(),Collectors.toList()));
	   
//		map1.keySet().stream().forEach(i->{
//		System.out.println(i +" = "+map1.get(i));
//	    });
		
		
		// count How many female or mail present in list
	
		Map<Gender, Long> map2 = list.stream().collect(Collectors.groupingBy(i->i.getGender(),Collectors.counting()));
		   
		map2.keySet().stream().forEach(i->{
		System.out.println(i +" = "+map2.get(i));
	    });
		
		
		//
		
		List<Integer> nums = Arrays.asList(1,1,2,3,41,2,2,1,4,41);
		
		Map<Integer,Long> mpa4 = nums.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(mpa4);
		
		
	}
}
