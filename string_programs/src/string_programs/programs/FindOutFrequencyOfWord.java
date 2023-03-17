package string_programs.programs;

import java.util.HashMap;
import java.util.Map;

public class FindOutFrequencyOfWord {

	public static void main(String[] args) {
		
		String str = "hi     hello      hi heelo hi hi";
		String[] arr = str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
				if(map.containsKey(arr[i])) {
					Integer  k = map.get(arr[i]);
					k++;
					map.put(arr[i], k);
				}else {
					map.put(arr[i], 1);
				}
			}
		}
		System.out.println(map);
	}
}
