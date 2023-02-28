package while_loop;

public class Test5PrintArrayElement {
public static void main(String[] args) {
	int [] arr=new int[5];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	
	int i=0;
	while(i<5) {
		System.out.println(arr[i]);
		i++;
		
	}
}
}
