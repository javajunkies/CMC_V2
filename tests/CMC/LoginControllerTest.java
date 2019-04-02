package CMC;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginControllerTest {

	private UserInteraction ui;
	private static AdminInteraction ai;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ai.addNewUser("Test", "Login", "loginTest", "Password1", 'u');
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ai.deleteUser("loginTest");
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		int expected = 0;
		
	}

	@Test
	public void testFindUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogoff() {
		fail("Not yet implemented");
	}

}
