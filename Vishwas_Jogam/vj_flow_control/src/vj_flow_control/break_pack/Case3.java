package vj_flow_control.break_pack;

public class Case3 {
	public static void main(String[] args) {
		for(int i =1; i <=3; i++) {
			
			for(int j =1; j<=3 ; j++) {
                 if(i != j) {
				    System.out.println("("+i+" "+j+")");
                 }else {
                	 break;
                 }
			}
		}
		
	}
}


