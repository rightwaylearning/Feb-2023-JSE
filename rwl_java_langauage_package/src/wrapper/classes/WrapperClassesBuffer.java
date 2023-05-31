package wrapper.classes;

public class WrapperClassesBuffer {

	public static void main(String[] args) {
//		Integer i = 127;
//		Integer j = 127;
//		
//		System.out.println(i == j);
//		System.out.println(i.equals(j));
		
//		Integer i = 129;
//		Integer j = 129;
//		
//		System.out.println(i == j);
//		System.out.println(i.equals(j));
		
		
//		Integer i = 120;
//		Integer j = Integer.valueOf(120);
//		
//		System.out.println(i == j);
//		System.out.println(i.equals(j));
//		
		//-------------------------------------------
		
		
		
		Integer i = new Integer(100);
		Integer j = Integer.valueOf(100);
		Integer k  = 100;
		
		System.out.println(i == j);
		System.out.println(j == k); 
		System.out.println(i == k);
		
		
		//----------------------------------
		
		Character ch = new Character('A');
		Character ch1 = 'A';
		Character ch2 = Character.valueOf('A');
		
		System.out.println(ch ==ch1);
		System.out.println(ch1 ==ch2);
		System.out.println(ch ==ch2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
