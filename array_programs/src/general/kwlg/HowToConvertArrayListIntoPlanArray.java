package general.kwlg;

import java.util.ArrayList;
import java.util.List;

public class HowToConvertArrayListIntoPlanArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);list.add(20);list.add(100);list.add(200);
		
		Object[] arr1=list.toArray();
		
		for (int i = 0; i < arr1.length; i++) {
			Integer obj = (Integer) arr1[i];
			System.out.println(obj);
		}
	}
}
