package stringbuffer_example;

public class Test {
	
	public static void main(String[] args) {
		
		//1] SB sb = new SB();//16
		
         StringBuffer br= new StringBuffer();
         System.out.println(br.capacity());//16
         
         
		
		br.append("abnngnnbgabavwert");
		System.out.println(br.capacity());//34 
		
		// new capacity = (old capacity +1)*2
		
		br.append("abcdefghijklmnpkfnvb");
		System.out.println(br.capacity());//70
		
		//---------------------------------------------
		
		//StringBuffer br1= new StringBuffer(int capacity);
			StringBuffer br1= new StringBuffer(100);
			System.out.println(br1.capacity());//100
			br1.append("bahavgafdsvsgbajtfnhfnkfbndndnyfrkvnmvfgjknjhsahjgsjhabandkjsadgwnskajdgsdksnajdgadjksadghsadjsdjlkwdnjksjbsjkadgshanxsjadnhsasajdjakmsnakjdsadsandbsadb");//153
	        System.out.println(br1.capacity());//202
	        
	        br1.append("bavfbxzsavsxajzajsdsfvdvdcadsfcwedscscxsxcxscsdzcxsdxcsxcsdzcsdfcbdjsnfcb jdsnbfjsdnfbvjc dvfhcfjdvbfhdkddjsvfbjvhcbfjdcjdvcbjfhfsdbvchdvjbdfjvjhvfdgjjhfdkj");
	        System.out.println(br1.capacity());//406
		
		
		
		
	}

}
