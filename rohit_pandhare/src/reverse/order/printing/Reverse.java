package reverse.order.printing;

public class Reverse {

	
	public static void main(String[] args) {
		
		int[] a = {12,3,45,65,65,34,3};
		
		
		int i = a.length-1;//7
//		System.out.println(i);
//		
//		System.out.println("hello starting value = "+a[i-1]);//6
//		i--; //6
//		System.out.println("here new value " +i); //6
//		System.out.println("hello  ==  "+a[i-1]);//5
//		i--;//5
//		System.out.println("hello"+a[i-1]); //4
//		i--;//4
//		
//		a[7]
		while(i >= 0 ) {
			System.out.println(a[i]);//6//5//4//3//2//1//0
			i--;//6//5//4//3//2//1
		}
		
		
	}
}
