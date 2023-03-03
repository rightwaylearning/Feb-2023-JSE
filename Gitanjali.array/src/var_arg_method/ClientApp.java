package var_arg_method;

public class ClientApp {
	public static void main(String[] args) {

		VarArgMethod var = new VarArgMethod();
		{
			var.add(67, 88);
			var.add(55, 45, 34);
			var.add(23, 98, 90, 56);

		}
	}
}