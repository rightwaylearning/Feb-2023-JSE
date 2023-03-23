package string_programs.programs;

public class Assignment1 {

	public static void main(String[] args) {
		
		String str = "hi hello, how are you?";
		StringBuffer br = new StringBuffer();
		String[] arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
		    br.append(arr[i]);
		    
		    if(i != arr.length-1 )
		    br.append(" ");
		}
		
		System.out.println(str);
		System.out.println(br.toString());
	}
}
