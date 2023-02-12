package local_var_instance_variable;

public class Entrypoint {
public static void main(String[] args) {

	Test t1=new Test();
	t1.a=12;
	t1.b=20;
	t1.m1();
	
	Test t2=new Test();
	t2.a=32;
	t2.b=18;
	t2.m1();

}
}
