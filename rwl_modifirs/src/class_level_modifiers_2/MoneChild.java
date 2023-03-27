package class_level_modifiers_2;

import class_level_modifiers_1.Mine;

public class MoneChild  extends Mine{

	void m1() {
		MoneChild m = new MoneChild();
		System.out.println(m.name);
	}
}
