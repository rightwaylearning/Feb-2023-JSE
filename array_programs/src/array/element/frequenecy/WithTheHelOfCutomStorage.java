package array.element.frequenecy;

import java.util.ArrayList;
import java.util.List;

public class WithTheHelOfCutomStorage {

	public static void main(String[] args) {
		
		int[] arr = {10,20,10,1,2,1,20,20,3};
		
		List<MyMap> list = new ArrayList<>();
		
		for (Integer element : arr) {
			
			if(containsKey(element,list)) {
				 updateCount(element,list);
			}else {
				list.add(new MyMap(element, 1));
			}
			
		}
		
		System.out.println(list);
	}
	
	static boolean containsKey(Integer key,List<MyMap> list) {
		
		for(MyMap obj:list) {
			if(obj.getKey().equals(key)) {
				return true;
			}
		}
		return false;
		
	}
	
	static void updateCount(Integer key,List<MyMap> list) {
		
		for (MyMap obj:list) {
			
			if(obj.getKey().equals(key)) {
				Integer oldCount = obj.getValue();
				oldCount++;
				obj.setValue(oldCount);
				break;
			}
			
		}
	}
	
}
