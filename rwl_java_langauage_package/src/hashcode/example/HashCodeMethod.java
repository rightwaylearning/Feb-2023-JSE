package hashcode.example;

class M{}
class N{}
public class HashCodeMethod {

	public static void main(String[] args) {
		
		M m= new M();
		
		M m1= new M();
		
		N n1= new N();
		
		M m2 = m;
		
		
		System.out.println(n1.hashCode() == m1.hashCode());
		System.out.println(m.hashCode() ==m2.hashCode());
		
	}
}
