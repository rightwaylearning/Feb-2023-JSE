package string_programs.programs;

import java.util.HashMap;
import java.util.Map;

public class FindOutMaxOccuranceOFCharacter {

	public static void main(String[] args) {
		
		String str = "hi good morning india good good";
		
		Map<Character, Integer> map= new HashMap<>();
		
		// option -1
		
//		for (int i = 0; i < str.length(); i++) {
//			
//		    if(map.containsKey(str.charAt(i))) {
//		    	
//		    	Integer f = map.get(str.charAt(i));
//		    	f++;
//		    	map.put(str.charAt(i), f);
//		    	
//		    }else {
//		    	
//		    	map.put(str.charAt(i), 1);
//		    }
//			
//		}
//		
//		System.out.println(map);
		
		//---------------------------------------------------------
		// option-2
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			
			   if(map.containsKey(str.charAt(i))) {
			    	
			    	Integer f = map.get(arr[i]);
			    	f++;
			    	map.put(arr[i], f);
			    	
			    }else {
			    	
			    	map.put(arr[i], 1);
			    }
		}
		
		System.out.println(map);
	}
}
