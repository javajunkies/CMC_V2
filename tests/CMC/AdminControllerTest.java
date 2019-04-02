/**
 * 
 */
package CMC;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author dkuhr001
 *
 */
public class AdminControllerTest {
	private AdminController ac; 
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ac = new AdminController();
	}

	@Test
	public void testLoginValid(String username, String password) {
		int login = ac.login(username, password);
		assertEquals("Login Successful",0,login);
	}
	
	@Test
	public void testLoginIncorrectUsername(String username, String password) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testLoginIncorrectPassword(String username, String password) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testLoginInactiveUser(String username, String password) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testLoginTemporaryAccount(String username, String password) {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testLogoff() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testViewUniversity() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRemoveUniversity(String schoolName) {
		fail("Not yet implemented");
	}

}
