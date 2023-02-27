package while_loop;

public class Test6Arraywithwhileloop {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int i = 0;
		int value = 100;
		while (i < arr.length) {
arr[i]=value;
value=value+100;
i++;
System.out.println(arr.length);
		}
	}
}

