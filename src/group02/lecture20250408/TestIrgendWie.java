package group02.lecture20250408;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
// Zum Ausführen: Rechtsklick > Run-As > JUnit
public class TestIrgendWie {
	@Test
	public void testPathname1() {
		AudioFile file = new AudioFile();
		String res = file.getPathname();
		//System.out.println(res);
		assertEquals("test.mp4", res); // <- überprüft erwartete mit berechneten Werten
	}

	@Test
	public void testPathname2() {

	}
}