package CMC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
//import org.junit.BeforeClass;

import org.junit.Test;

public class DBControllerTest {

	private DBController db;
	
	@Before
	public void setUp() throws Exception {
		db = new DBController();
	}
	
	//isUniqueUsername tests
	@Test
	public void isUniqueUsernameTestFalse() {
		Boolean isUnique = db.isUniqueUsername("nadmin");
		assertEquals(isUnique, false);
	}
	
	@Test
	public void isUniqueUsernameTestTrue() {
		Boolean isUnique = db.isUniqueUsername("NewUsername");
		assertEquals(isUnique, true);
	}
	
	//createUser tests
	@Test
	public void createUserTest() {
		int u = db.createUser("firstName", "lastName", "username", "password", 'u');
		assertEquals(u, 1);
	}
		
	
	
	
	//delete things created in tests
	@After
	public void after()
	{
		db.deleteUser("username");
	}
}
