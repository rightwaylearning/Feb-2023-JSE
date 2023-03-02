package while_Loop_Program;

public class PrintNO {
	public static int printnum(int no) {
		int i=0;
		while(i<=no)
		{
			no=no+i;
			i++;
		}
		System.out.println(no);
		return no;
		
	}

}
