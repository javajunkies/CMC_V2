package CMC;

import static org.junit.Assert.*;

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

}
