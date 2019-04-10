/**
 * 
 */
package CMC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author jwolff001
 *
 */
public class UserControllerTest {

	private DBController db;
	private UserController UC;
	
	@Before
	public void setUp() throws Exception {
		db.createUser("john", "wolff", "accountUsername", "Password1", 'u');
	}

	@Test
	public void Logintest() {
		int expResult = 0;
		int actualResult = UC.login("accountUsername", "Password1");
		assertEquals(expResult, actualResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginIncorrectUsername() {
		UC.login("juserssss","user");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginIncorrectPassword() {
		UC.login("juser","user2678");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginInactiveUser() {
		db.deactivateUser("juser");
		UC.login("juser","user");
		db.adminEditUser("User John","User","juser","user",'u','Y');	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginTemporaryAccount() {
		db.registerNewUser("John","Wolff","jwolff","JohnWolff1234");
		UC.login("jwolff","JohnWolff1234");
		//db.deleteUser("jwolff");???????????
	}
	
	@Test
	public void Logofftest() {
		int expResult = 1;
		int actualResult = UC.logoff();
		assertTrue("The result of the logoff attempt was " + expResult, expResult == actualResult);
	}
	
	@Test
	public void ViewExistingUniversitytest() {
		double expResult = 29991;
		University halfResult = UC.viewExistingUniversity("Augsburg");
		double actualResult = halfResult.getExpenses();
		assertTrue("The result of viewing an existing university was " + expResult, expResult == actualResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ViewExistingUniversityInvalidtest() {
		UC.viewExistingUniversity("fadsfs");
	}
	
	@Test
	public void SaveSchooltest() {
		int expResult = 1;
		int actualResult = UC.saveSchool("accountUsername", "Augsburg");
		assertTrue("The result of the save attempt was " + expResult, expResult == actualResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void InvalidAccountSaveSchooltest() {
		UC.saveSchool("accountUsernamefdsa", "Augsburg");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void InvalidSaveSchooltest() {
		UC.saveSchool("accountUsername", "fdsafds");
	}
	
	@Test
	public void Comparetest() {
		//ArrayList<University> expResult = ;
		//ArrayList<University> actualResult = UC.compare("Boston College", "Cal Tech");
		//actual1Result = 
		//assertTrue("The result of the save attempt was " + expResult, expResult.equals(actual1Result));
	}

	@Test
	public void editUserInfotest() {
		int expResult = 1;
		int actualResult = UC.editUserInfo("Johnny", "Wolff", "accountUsername", "Password1");
		assertTrue("The number of the updates due to the save attempt was " + expResult, expResult == actualResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void InvalidPasswordeditUserInfotest() {
		UC.editUserInfo("Johnny", "Wolff", "accountUsername", " f");
	}
	
	@Test
	public void RemoveSaveSchooltest() {
		int expResult = 1;
		//db.addToSaved("accountUsername", "Augsburg");
		int actualResult = UC.removeSavedSchool("accountUsername", "Augsburg");
		assertTrue("The number of the updates due to the remove attempt was " + expResult, expResult == actualResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void InvalidSchoolRemoveSaveSchooltest() {
		UC.removeSavedSchool("accountUsername", "fdsafvsa");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void InvalidAccountRemoveSaveSchooltest() {
		UC.removeSavedSchool("fdsafdsa", "Augsburg");
	}
	
	@Test
	public void ViewUserInfotest() {
		User expResult = c;
		User actualResult = UC.viewUserInfo("accountUsername");
		assertEquals(expResult, actualResult);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void InvalidiAccountViewUserInfotest() {
		UC.viewUserInfo("fdsafd");
	}
	
	@Test
	public void SearchUniversitiestest() {
		ArrayList<University> expected = new ArrayList<University>();
		University Uni = new University("UNIVERSITY OF CALIFORNIA BERKELEY", "CALIFORNIA", "URBAN", "STATE", 40000, 45.0, 530.0, 600.0, 15328.0, -1.0, 15000, 50.0, 70.0, 5, 3, 3);
		expected.add(Uni);
		ArrayList<University> searchTest = db.searchUniversities("ber", "calif", false, "urb", "st", 0 ,40000, 0.0, 45.0, 0.0, 530.0, 0.0, 600.0, 0.0, 15328.0, 0.0, 0.0, 0, 15000, 0.0, 50.0, 0.0, 70.0, 0, 5, 0, 3, 0, 3);
		assertEquals(searchTest.toString(), expected.toString());
	}
	
	@After
	public void remove() {
		db.deleteUser("accountUsername");
		//what else????
	}

}
