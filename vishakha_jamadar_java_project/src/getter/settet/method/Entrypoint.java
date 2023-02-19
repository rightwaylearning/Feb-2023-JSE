package getter.settet.method;

public class Entrypoint {
	public static void main(String[] args) {
		Company c= new Company();
		c.setCid(1001);
		c.setEname("Vishakha");
		System.out.println(c.getCid());
		System.out.println(c.getEname());
	}

}
