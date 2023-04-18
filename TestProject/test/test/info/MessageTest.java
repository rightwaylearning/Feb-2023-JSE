package test.info;


import org.junit.Assert;
import org.junit.Test;

public class MessageTest {

	@Test
	public void test() {
        String m =  new Message().passMessage("good");
        Assert.assertEquals("hello good", m);
	}

}
