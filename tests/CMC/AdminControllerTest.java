package CMC;

import static org.junit.Assert.*;
//import org.java.util.ArrayList.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dkuhr001
 *
 */
public class AdminControllerTest {
	//@BeforeClass
	private AdminController ac;
	private DBController db;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ac = new AdminController();
		db = new DBController();
	}

	@Test
	public void testLoginValid() {
		int login = ac.login("juser","user");
		assertEquals("Login Successful",0,login);
	}
	
	@Test
	public void testLoginIncorrectUsername(String username, String password) {
		int login = ac.login("juserssss","user");
		assertEquals("Username doesn't match password. Not logged in.",1,login);
	}
	
	@Test
	public void testLoginIncorrectPassword(String username, String password) {
		int login = ac.login("juser","user22");
		assertEquals("Username doesn't match password. Not logged in.",1,login);
	}
	
	@Test
	public void testLoginInactiveUser(String username, String password) {
		int login = ac.login("juser","user");
		assertEquals("User is inactive. Not logged in.",3,login);
	}
	
	@Test
	public void testLoginTemporaryAccount() {
		db.registerNewUser("dane","kuhr","dkuhr","danekuhr1234");
		int login = ac.login("dkuhr","danekuhr1234");
		assertEquals("User type is temporary. Not logged in.",4,login);
		db.deleteUser("dkuhr");
	}
	
	
	
	
	@Test
	public void testLogoff() {
		ac.logoff();
	}
	
	
	
	
	@Test
	public void testViewUniversities() {
		//ArrayList<University> view = new ArrayList<University>();
		//view = ac.viewUniversities();
		
	}
	
	
	
	
	@Test
	public void testRemoveUniversity(String schoolName) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRemoveUniversityInvalid(String schoolName) {
		fail("Not yet implemented");
	}
	
	
	
	
	@Test
	public void testAddUniversity(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidSchool(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityNullState(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityNullLocation(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityNullControl(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidNumStudents(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidPercentFemale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidSATVerbal(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidSATMath(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidExpenses(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidPercentFinancialAid(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidNumberOfApplicants(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidPercentAdmitted(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidPercentEnrolled(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidAcademicsScale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidSocialScale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUniversityInvalidQualityOfLifeScale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	
	
	@Test
	public void testEditUniversity(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidSchool(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityNullState(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityNullLocation(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityNullControl(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidNumStudents(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidPercentFemale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidSATVerbal(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidSATMath(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidExpenses(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidPercentFinancialAid(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidNumberOfApplicants(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidPercentAdmitted(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidPercentEnrolled(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidAcademicsScale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidSocialScale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUniversityInvalidQualityOfLifeScale(String school, String state, String location, String control, int numberOfStudents,
            double percentFemales, double SATVerbal, double SATMath, double expenses, 
            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
		fail("Not yet implemented");
	}

	
	
	
	
	
	@Test
	public void testEditUser(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUserNotUniqueUsername(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUserInvalidPassword(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUserInvalidStatus(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEditUserInvalidType(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	@Test
	public void testViewUsers() {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	@Test
	public void testIsUniqueUsername(String username) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsUniqueUsernameNullUsername(String username) {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	@Test
	public void testAddNewUser(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddNewUserNotUniqueUsername(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddNewUserInvalidPassword(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddNewUserInvalidStatus(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddNewUserInvalidType(String username, String first, String last, String password, char type, char status) {
		fail("Not yet implemented");
	}
	
	
	
	
	@Test
	public void testViewUserInfo(String username) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testViewUserInfoInvalidUsername(String username) {
		fail("Not yet implemented");
	}
	
	
	
	
	@Test
	public void testDeactivateUser(String username) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDeactivateUserInvalidUsername(String username) {
		fail("Not yet implemented");
	}
	
	
	
	
	
	@Test
	public void testDeleteUser(String username) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDeleteUserInvalidUsername(String username) {
		fail("Not yet implemented");
	}
	
	
	
	
	//@After
	//db.deleteUser("dkuhr");
	
}
