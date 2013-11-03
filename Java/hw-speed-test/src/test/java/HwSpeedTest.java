import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;


public class HwSpeedTest {

	@Test
	public void testGetHelloWorld() {
		assertEquals("Hello World!", HwSpeed.getHelloWorld());
	}
	
	@Test
	public void testGetNumberOfLoopsIn1Second() {
		int forLoopCount = HwSpeed.getLoopCount();
		assertTrue(forLoopCount > 100);
		assertTrue(forLoopCount < Integer.MAX_VALUE / 2);
	}
	
	@Test
	public void testJavaSecondLogic() {
		long nanoStartTime = System.nanoTime();
		int counter = 0;
		while (nanoStartTime + 1000*1000*1000 > System.nanoTime()) {
			counter++;
		}
		System.out.println(counter);

		assertTrue(counter > 100);
		assertTrue(counter < Integer.MAX_VALUE / 2);
	}
	
	@Test
	public void displayTest() {
		System.out.println(HwSpeed.getHelloWorld() + ":" + HwSpeed.getLoopCount());
	}

}
