package CMC;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UseCaseTesting {

	private static UserInteraction ui;
	private static AdminInteraction ai;
	private static DBController db;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ui = new UserInteraction();
		ai = new AdminInteraction();
		db = new DBController();
		db.createUser("UseCase", "Testing", "testUser", "Password1", 'u');
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		db.deleteUser("testUser");
		db.deleteUser("testRegister");
		db.deleteUser("testTempAccount");
	}

	@Test
	public void testU1Login() {
		int expected = 0;
		int actual = ui.login("testUser", "Password1");
		assertTrue("Login returned " + actual + " it should have returned " + expected ,expected == actual);
	}
	
	@Test
	public void testU1LoginA1() {
		int expected = 1;
		int actual = ui.login("FakeUsername", "Password1");
		assertEquals("Login should return " + expected, expected, actual);
	}
	
	@Test
	public void testU1LoginA2() {
		int expected = 2;
		int actual = ui.login("testUser", "FakePassword");
		assertEquals("Login should return " + expected, expected, actual);
	}
	
	@Test
	public void testU1LoginA3() {
		int expected = 3;
		int actual = ui.login("luser", "user");
		assertEquals("Login should return " + expected, expected, actual);
	}

	@Test
	public void testU1LoginA4() {
		ui.register("Tyreese", "Robinson", "testTempAccount", "Password1", "Password1");
		int expected = 4;
		int actual = ui.login("testTempAccount", "Password1");
		assertEquals("Login should return " + expected, expected, actual);
		}
	
	@Test
	public void testU2Register() {
		int expected = 0;
		int actual = ui.register("Tyreese", "Robinson", "testRegister", "Password1", "Password1");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testU2RegisterA1() {
		int expected = 4;
		int actual = ui.register("should", "fail", "juser", "Password1", "Password1");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testU2RegisterA2() {
		int notEnough = ui.register("Less", "ThanEight", "UniqueNAme", "Pass1", "Pass1");
		int noLetter = ui.register("No", "Letter", "UniqueName", "1234568787", "1234568787");
		int noNum = ui.register("No", "Number", "NewNAme", "Passwords", "Passwords");
		int expected1 = 1;
		int expected2 = 2;
		int expected3 = 3;
		assertTrue(notEnough == expected1 && noLetter == expected2 && noNum == expected3);
	}
	
	@Test
	public void testU2RegisterA3() {
		int expected = 5;
		int actual = 
	}
/*	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}
	
	@Test
	public void testU1LoginA2() {
		
	}*/

}
