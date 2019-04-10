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
		ac.register("juser,", "user", "bwest", "pass1");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRegisterNotUniqueUsername(String first, String last, String username, String password) {
		db.addUser
		ac.register("juser", "user", "", "" )
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRegisterInvalidPassword(String first, String last, String username, String password) {
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsNotUniqueUsername(String username) {
		
	}
	
	
	@Test
	public void testIsUniqueUsername(String username) {
		int login = ac.login("juser","user");
		assertEquals("Username is invaid. Not logged in.",3,login);
	}
	

