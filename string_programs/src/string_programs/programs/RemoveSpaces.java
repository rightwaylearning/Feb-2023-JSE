package string_programs.programs;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String str = "hi hello hi      how are     you hi";
		StringBuffer br = new StringBuffer();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
			  br.append(arr[i]);
			  if(i != arr.length-1) {
				  br.append(" ");
			  }
			}
		}
		System.out.println(br);
		
	}
}
