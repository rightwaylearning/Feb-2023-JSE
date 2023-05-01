package finalize.method;

class Mine {

	int x;
	int y;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("good bye");
	}
}

public class TestGCWork {
	public static void main(String[] args) throws Exception{

		Mine m = new Mine();
		m = null;
		System.gc(); // request
		//Thread.sleep(5000);
		System.out.println("program end");
	}
}
