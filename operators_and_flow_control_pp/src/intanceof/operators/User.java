package intanceof.operators;

public class User {
	
	public void caller(Object obj) {

		if (obj instanceof String) {
			String s1 = (String) obj;
			int l = s1.length();
			System.out.println(l);
		}
		
		if(obj instanceof MathsOpt) {
			MathsOpt m = (MathsOpt)obj;
			int r = m.square(100);
			System.out.println(r);
		}


	}

}
