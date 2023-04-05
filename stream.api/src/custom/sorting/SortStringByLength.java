package custom.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ma","abc","abclsd","b");
		
		// Natural sorting order
		//List<String> ans = list.stream().sorted().collect(Collectors.toList());
        
		List<String> ans = list.stream().sorted((s1,s2)-> {
			if(s1.length() < s2.length()) {
				return -1;
			}else {
				return 1;
			}
		}).collect(Collectors.toList());
	       
		
		System.out.println(ans);
	}
}
