package creating.new_thread;

public class Test {

	public static void main(String[] args) {
		
		 MyCriticalWork work = new MyCriticalWork();
		
		
		 MyThreadJob child = new MyThreadJob(work);
		 child.setName("Suresh");
		 child.start();
		
		
		 MyNewJob newChild = new MyNewJob(work);
		 newChild.setName("Ramesh");
		 newChild.start();
		
		
	}
}
