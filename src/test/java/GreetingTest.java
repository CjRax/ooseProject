import org.junit.Test;
import static org.junit.Assert.*;

public class GreetingTest {

	@Test
	public void testHello() {
		Greeting g1 = new Greeting();
		assertEquals("Hello", g1.getHello());
		
	}

	@Test
	public void testTranslation() {
		Greeting g2 = new Greeting();
		g2.setMessage("你好");

		assertEquals("Hello", g2.messageTranslation());
	}

}
