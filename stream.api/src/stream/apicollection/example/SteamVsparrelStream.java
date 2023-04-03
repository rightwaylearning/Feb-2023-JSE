package stream.apicollection.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamVsparrelStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50,1,2,3,4,5,5,6,7,8,9,0,0,1,3,4,5);

		List<Integer> set = list.stream().map(i -> i * i).collect(Collectors.toList());

		System.out.println(set);
		
		List<Integer> set1 = list.stream().parallel().map(i -> i * i).collect(Collectors.toList());
		// OR
	//	List<Integer> set1 = list.parallelStream().map(i -> i * i).collect(Collectors.toList());

		System.out.println(set1);
	}
}
