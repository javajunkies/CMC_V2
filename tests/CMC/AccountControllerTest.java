/**
 * 
 */
package CMC;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author bwest001
 *
 */
public class AccountControllerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testIsUniqueUsername(String username) {
		int login = ac.login("juser","user");
		assertEquals("Username is invaid. Not logged in.",3,login);
	}

}
