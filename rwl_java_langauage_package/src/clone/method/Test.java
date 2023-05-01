package clone.method;

import java.awt.Image;

class Profile implements Cloneable{
	private int pId;
	private int addharNo;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getAddharNo() {
		return addharNo;
	}
	public void setAddharNo(int addharNo) {
		this.addharNo = addharNo;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


public class Test {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Profile p = new Profile();
		p.setAddharNo(999999);
		p.setpId(11);
		
	
		
	
		Profile p1 = (Profile)p.clone();
		//-----------------------------------
		p.setpId(22);
		
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		System.out.println(p.getpId());
		System.out.println(p1.getpId());
	}
}



