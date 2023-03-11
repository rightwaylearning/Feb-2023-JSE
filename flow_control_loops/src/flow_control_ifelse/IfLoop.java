package flow_control_ifelse;

public class IfLoop {

	public static void main(String[] data) {

		int a = 10;
		if (a >= 10) {
			System.out.println("its true");

		} else {

			System.out.println("its false");
		}

	}

}
/*
Error: LinkageError occurred while loading main class flow_control_ifelse.IfLoop
java.lang.UnsupportedClassVersionError: flow_control_ifelse/IfLoop has been compiled by a 
more recent version of the Java Runtime (class file version 62.0), this version of the 
Java Runtime only recognizes class file versions up to 61.0
*/