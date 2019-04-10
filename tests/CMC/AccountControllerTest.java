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

	private static DBController db; 
	private static AccountController ac; 
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ac = new AccountController();
		db = new DBController();
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testRegister(String first, String last, String username, String password) {
<<<<<<< HEAD
		int expected = 1; 
		int actual = ac.register("ben", "west", "bwest", "pass1");
		assertTrue("Register ", expected == actual);
=======
		ac.register("juser,", "user", "bwest", "pass1");
>>>>>>> d3ddee0f8366fc043cb23fbe2dbc31d8447d7ab5
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRegisterNotUniqueUsername(String first, String last, String username, String password) {
		int expected = 1;
		int acutal = ac.register("Snoopdawg", "smith", "juser", "passw");
		AssertTrue("Not Unique username ", expected == actual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRegisterInvalidPassword(String first, String last, String username, String password) {
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsNotUniqueUsername(String username) {
		
	}
	
	
	@Test
	public void testIsUniqueUsername(String username) {
		
	}
}
	

