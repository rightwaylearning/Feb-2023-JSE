package test.demo;

import org.junit.Test;

import junit.framework.Assert;

public class HelloTest {

	@Test
	public void test1() {
		String str = new String();
		Assert.assertNotNull(str);
	}
}
