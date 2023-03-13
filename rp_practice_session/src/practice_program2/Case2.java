
package practice_program2;

import rp_practice.programs.Case1;

import static rp_practice.programs.Case1.m1;
import static rp_practice.programs.Case1.name;


//aapn jr static property import karaych aahe tr direct lihu shaktoh but 
//vari static lihav lagel 



public class Case2 {
	
	public static void main(String[] args) {
		
		Case1 c = new Case1();
		
		c.setMessage("hello");
		
		Case1.setname("this is name");
		
		Case1.name="hello";
		
		System.out.println(name);
		
		m1();

//	yala mhnatat inline import karan class name same aahet different package aasle tari
//		tya mule yala inline import karav lagte
		practice.Case1 c1 =new practice.Case1();
		
		c1.name = "name";
		System.out.println(c1.name);
		
	}

}
