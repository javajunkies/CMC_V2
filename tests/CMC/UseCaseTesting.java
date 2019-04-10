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
	}

	@Test
	public void testU1Login() {
		int expected = 0;
		int actual = ui.login("testUser", "Password1");
		assertTrue("Login returned " + actual + " it should have returned " + expected ,expected == actual);
	}

}
