package var.arg.method;

public class ClientApp {

	public static void main(String[] args) {
		
		
		VarArgMethodDemo obj = new VarArgMethodDemo();
		
		obj.add(10,20);  // 20
		obj.add(10,20,30,40,50,60); // 60
		
		// 6 // arr.length -1 = 5
		
	}
}
