package SVsSBVsSB;

public class Test {

	public static void main(String[] args) {
		
		String str = new String("hello");
		str.concat(" hi");
		
		System.out.println(str); //
		
		//--------------------------
		
		
		StringBuffer br = new StringBuffer("hello");
		br.append(" hi");
		
		System.out.println(br);
		
		//---------------------------------
		
		StringBuilder br1= new StringBuilder("Minna");
		br1.append(" kulkarni");
		System.out.println(br1);
	}
}
