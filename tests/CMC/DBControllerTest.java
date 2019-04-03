package CMC;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	
	@Test
	public void createUserTest() {
		int u = db.createUser("firstName", "lastName", "username", "password", 'u');
		assertEquals(u, 1);
	}
		
	@Test
	public void compareTest() {
		ArrayList<University> expected = new ArrayList<University>();
	    University univ1 = db.viewExistingUniversity("AUGSBURG");
	    University univ2 = db.viewExistingUniversity("BUTLER");
	    expected.add(univ1);
	    expected.add(univ2);
	    ArrayList<University> list = db.compare("AUGSBURG", "BUTLER");
	    assertEquals(expected.toString(), list.toString());
	}
	
	@Test
	public void registerNewUserTest() {
		int expected = 1;
		int registerNewUser = db.registerNewUser("first", "last" ,"username", "password");
		assertEquals(registerNewUser, expected);
	}
	
	@Test
	public void searchTest() {
		//ArrayList<University> expected = new ArrayList<University>();
		//ArrayList<University> searchTest = db.searchUniversities("a", "","","",0,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0,0,0.0,0.0,0.0,0.0,0,0,0,0,0,0);
		//assertEquals(searchTest, expected);
}
	
	@Test
	public void getAllUsersTest() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("John");
		expected.add("Lynn");
		expected.add("Noreen");
		expected.add("test");
		ArrayList<User> r = db.getAllUsers();
		ArrayList<String> actual = new ArrayList<String>();
		for(int i = 0; i < r.size(); i++) {
			actual.add(r.get(i).getFirst());
		}
	}
	
	@Test
	public void addToSavedTest() {
		db.createUser("TestAdd", "ToSaved", "testAdd", "Password1", 'u');
		int expected = 1;
		int actual = db.addToSaved("testAdd", "Augsburg");
		assertTrue("Should return " + expected + " but returned " + actual, expected == actual);
	}
	
	

	@After
	public void after()
	{
		db.deleteUser("username");
	}
}
