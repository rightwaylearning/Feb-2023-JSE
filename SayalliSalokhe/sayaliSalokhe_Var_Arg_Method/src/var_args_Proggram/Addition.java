package var_args_Proggram;

public class Addition {
	
	void add(int... args)
	{
		int index = 0;
		int sum = 0;
		
		while (index < args.length) {
			sum = sum + args[index];
			index++;

		}
		System.out.println(sum);
	}

}
