package array.element.frequenecy;

import java.util.HashMap;
import java.util.Map;

public class WithTheHelOfMap {

	public static void main(String[] args) {
		
		int[] arr = {10,20,10,1,2,1,20,20,3};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int element : arr) {
			
			if(map.containsKey(element)) {
				Integer count = map.get(element);
				count++;
				map.put(element, count);
				
			}else {
				map.put(element, 1);
			}
			
		}
		
		System.out.println(map);
		
	}
}
