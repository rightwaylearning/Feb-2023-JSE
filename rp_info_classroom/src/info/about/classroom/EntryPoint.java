package info.about.classroom;

public class EntryPoint {

	public static void main(String[] args) {
		
		Advice a =new Advice();
		ClassRoom obj = a.inputOutPut(34);
	
		PrintData p = new PrintData();
		p.print(obj);
		
		
		
		System.out.println("this is prefix string concatination"+ obj.getFees()+10000);
	}
}
