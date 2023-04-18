package info.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InformationImplTest {

	private Information info =null;
	
	InformationImplTest(){
		this.info = new InformationImpl();
	}
	@Test
	void getMessageTest() {
		String val = info.getMessage("rwl");
		assertNotNull(val);
		assertEquals("hello rwl", val);
	}

}
