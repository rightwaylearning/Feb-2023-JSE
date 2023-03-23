package wrapperClass;

public class WraperClass {

	public static void main(String[] args) {
		byte b=10;
		short s=200;
		int i=10000;
		long l=124577l;
		float f=23.4f;
		double d=235.6655;
		char c='a';
		boolean b1=true;
		
		System.out.println("-----------------Primitive Value-------------------- ");
		System.out.println("Primitive byte:"+b);
		System.out.println("Primitive short:"+s);
		System.out.println("Primitive int:"+i);
		System.out.println("Primitive float:"+f);
		System.out.println("Primitive double:"+d);
		System.out.println("Primitive char:"+c);
		System.out.println("Primitive boolean:"+b1);
		System.out.println("Primitive long:"+l);
		
		Byte byte1=10;
		Short short1=200;
		Integer integer=120000;
		Long long1=245000l;
		Float float1=23.4f;
		Double double1=45.8778;
		Character character='d';
		Boolean boolean1=true;
		
		System.out.println("-----------------Object Value-------------------- ");
		System.out.println("Byte Object:"+byte1);
		System.out.println("Short Object:"+short1);
		System.out.println("Integer Object:"+integer);
		System.out.println("Long Object:"+long1);
		System.out.println("Float Object:"+float1);
		System.out.println("Double Object:"+double1);
		System.out.println("Character Object:"+character);
		System.out.println("Boolean Object:"+boolean1);
	}
}
