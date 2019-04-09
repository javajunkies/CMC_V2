package CMC;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginControllerTest {

	private static UserInteraction ui;
	private static AdminInteraction ai;
	private static LoginController l;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ui = new UserInteraction();
		ai = new AdminInteraction();
		l = new LoginController();
		ai.addNewUser("Test", "Login", "testLogin", "Password1", 'u');
	}

	@AfterClass
	public static void setUpAfterClass() throws Exception{
		ai.deleteUser("testLogin");
	}
	
	@Test
	public void testLoginInvalidUsername() {
		int expected = 1;
		int actual = l.login("FakeUsername", "Password1");
		assertEquals("Login should return " + expected, expected, actual);
	}

	@Test
	public void testLoginInvalidPassword() {
		int expected = 2;
		int actual = l.login("testLogin", "FakePassword");
		assertEquals("Login should return " + expected, expected, actual);
	}
	
	@Test
	public void testLoginTempAccount() {
		ui.register("Tyreese", "Robinson", "testTempAccount", "Password1", "Password1");
		int expected = 4;
		int actual = l.login("testTempAccount", "Password1");
		assertEquals("Login should return " + expected, expected, actual);
		ai.deleteUser("testTempAccount");
	}
	
	@Test
	public void testLoginSuccesful() {
		int expected = 0;
		int actual = l.login("testLogin", "Password1");
		assertEquals("Login should return " + expected, expected, actual);
	}
	@Test
	public void testFindUser() {
		assertTrue("No such user", l.findUser("juser"));
	}

	@Test
	public void testFindPassword() {
		String expected = "password1";
		String actual = l.findPassword("juser");
		assertTrue("Password is " + expected, expected.equals(actual));
	}

	@Test
	public void testCheckStatus() {
		char expected = 'Y';
		char actual = l.checkStatus("nadmin");
		assertTrue("Check status should return " + expected, expected == actual);
	}
	
	@Test
	public void testLoginInactiveAccount() {
		int expected = 3;
		int actual = l.login("luser", "user");
		assertEquals("Login should return " + expected, expected, actual);
	}

	@Test
	public void testLogoff() {
		fail("Not yet implemented");
	}

}
