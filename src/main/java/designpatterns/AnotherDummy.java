package designpatterns;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnotherDummy {
	
	@Test
	public void testSwitchBlockWithMatchingCase() {
		int x = 20;
		String y;
		switch (x) {
			case 10:
				y = "ten";
				break;
			case 20:
				y = "twenty";
				break;
			default:
				y = "default";
				break;
		}
		assertEquals("twenty", y);
	}
	
}
