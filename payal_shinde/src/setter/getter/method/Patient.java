package setter.getter.method;

public class Patient {

		public static void main(String[] args) {
			
			Doctor d= new Doctor();
			
			d.setRegNo(37456374);
			d.setName("Sadagopan");
			
		    int regNo = d.getRegNo();
			String name = d.getName();
			
			System.out.println(regNo);
			System.out.println(name);
		}
	}


