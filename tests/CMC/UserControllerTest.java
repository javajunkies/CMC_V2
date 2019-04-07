/**
 * 
 */
package CMC;

import static org.junit.Assert.*;

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
	private LoginController li;
	private User c;
	
	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		db.createUser("john", "wolff", "accountUsername", "Password1", 'u');
	}

	@Test
	public void Logintest() {
		int expResult = 0;
		int actualResult = li.login("accountUsername", "Password1");
		assertTrue("The result of the login attempt was " + expResult, expResult == actualResult);
	}
	
	@Test
	public void Logofftest() {
		int expResult = 1;
		int actualResult = li.logoff();
		assertTrue("The result of the logoff attempt was " + expResult, expResult == actualResult);
	}
	
	@Test
	public void ViewExistingUniversitytest() {
		double expResult = 29991;
		University halfResult = db.viewExistingUniversity("Augsburg");
		double actualResult = halfResult.getExpenses();
		assertTrue("The result of viewing an existing university was " + expResult, expResult == actualResult);
	}
	
	@Test
	public void SaveSchooltest() {
		int expResult = 1;
		int actualResult = db.addToSaved("accountUsername", "Augsburg");
		assertTrue("The result of the save attempt was " + expResult, expResult == actualResult);
	}
	
	@Test
	public void Comparetest() {
		ArrayList<University> expResult = ;
		ArrayList<University> actualResult = db.compare("Boston College", "Cal Tech");
		actual1Result = 
		assertTrue("The result of the save attempt was " + expResult, expResult.equals(actual1Result));
	}

	@Test
	public void editUserInfotest() {
		int expResult = 1;
		int actualResult = db.userEditUser("Johnny", "Wolff", "accountUsername", "Password1");
		assertTrue("The number of the updates due to the save attempt was " + expResult, expResult == actualResult);
	}
	
	@Test
	public void RemoveSaveSchooltest() {
		int expResult = 1;
		int actualResult = db.removeFromSaved("accountUsername", "Augsburg");
		assertTrue("The number of the updates due to the remove attempt was " + expResult, expResult == actualResult);
	}
	
	@Test
	public void ViewUserInfotest() {
		User expResult = c;
		User actualResult = db.viewUser("accountUsername");
		assertTrue("The result of the view user attempt was " + expResult, expResult.equals(actualResult));
	}
	
	@Test
	public void SearchUniversitiestest() {
		User expResult = ;
		User actualResult = db.searchUniversities("Arizona State", "Arizona", "-1", "State", 40000, "50", "450", "500", "16181", "50", 17000, 80, 60, 3, 4, 5);
		assertTrue("The result of the view user attempt was " + expResult, expResult.equals(actualResult));
	}

}
