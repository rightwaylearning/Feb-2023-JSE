package cal_project;

public class EntryPoint_cal {
  
	public static void main(String[] args) {
		cal c = new cal();
		   
		c.a=10;
		c.b=20;
		
		int a=c.sum();
		
		System.out.println(a);
	}
}
