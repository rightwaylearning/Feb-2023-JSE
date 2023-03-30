package case1.method.overloading;

 class A {
     //void m1(int a){
    	// System.out.println("int-match");
    	 
     //}
     void m1(float f){
    	 System.out.println("auto-promotion");
     }
     void m1(Integer i){
    	 System.out.println("auto-boxing");
     }
     void m1(Number n){
    	 System.out.println("number-near parent");
     }
     void m1(Object o){
    	 System.out.println("object-root parent");
     
     }
    
}
    public class Test{
    	public static void main(String[] args) {
			A a=new A();
		int i=10;
		a.m1(i);
		}
    }