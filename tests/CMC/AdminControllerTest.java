package CMC;

//import org.java.util.*;
import static org.junit.Assert.*;

//import java.awt.List;
//import java.util.ArrayList;

import org.junit.Before;
import org.junit.After;
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
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginIncorrectUsername() {
		ac.login("juserssss","user");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginIncorrectPassword() {
		ac.login("juser","user22");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginInactiveUser() {
		db.deactivateUser("juser");
		ac.login("juser","user");
		
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoginTemporaryAccount() {
		db.registerNewUser("dane","kuhr","dkuhr","danekuhr1234");
		ac.login("dkuhr","danekuhr1234");
		
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
	public void testRemoveUniversity() {
		int remove = ac.removeUniversity("AUGSBURG");
		assertTrue("University removed", remove!=0 && remove!=-1);
		ac.addUniversity("AUGSBURG", "MINNESOTA", "SMALL-CITY", "PRIVATE" , 10000, 43, 420, 490, 29991, 80, 4000, 85, 50, 1, 3, 4);
	}
	
	@Test
	public void testRemoveUniversityInvalid() {
		int remove = ac.removeUniversity("hdfh57");
		assertTrue("University removed", remove==0 || remove== -1);
	}
	
	
	
	
	@Test
	public void testAddUniversity() {
		int add = ac.addUniversity("ADDED", "MINNESOTA", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
		assertTrue("University added.", add > 0);
		ac.removeUniversity("ADDED");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidSchool() {
		ac.addUniversity("AUGSBURG", "MINNESOTA", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityNullState() {
		ac.addUniversity("Asdjfh", "", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityNullLocation() {
		ac.addUniversity("Asdjfh", "MINN", "", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityNullControl() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidNumStudents() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", -5,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidPercentFemale() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            -445, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidSATVerbal() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, -342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidSATMath() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            445, 342, -456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidExpenses() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, -6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidPercentFinancialAid() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            660, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidNumberOfApplicants() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, -6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidPercentAdmitted() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 881, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidPercentEnrolled() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            -55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidAcademicsScale() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 74, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidSocialScale() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 32, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversityInvalidQualityOfLifeScale() {
		ac.addUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 7, 3, -1);
	}
	
	
	
	
	
	
	
	
	@Test
	public void testEditUniversity() {
		int add = ac.editUniversity("AUGSBURG", "MINNESOTA", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 4);
		assertTrue("University edited.", add > 0);
		ac.editUniversity("AUGSBURG", "MINNESOTA", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidSchool() {
		ac.editUniversity("AUGSBURG", "MINNESOTA", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityNullState() {
		ac.editUniversity("Asdjfh", "", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityNullLocation() {
		ac.editUniversity("Asdjfh", "MINN", "", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityNullControl() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidNumStudents() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", -5,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidPercentFemale() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            -445, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidSATVerbal() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, -342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidSATMath() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            445, 342, -456, 6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidExpenses() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, -6653, 
	            66, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidPercentFinancialAid() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            660, 6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidNumberOfApplicants() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, -6688, 88, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidPercentAdmitted() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 881, 
	            55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidPercentEnrolled() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            -55, 4, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidAcademicsScale() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 74, 3, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidSocialScale() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 4, 32, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUniversityInvalidQualityOfLifeScale() {
		ac.editUniversity("Asdjfh", "MINNN", "SMALL-CITY", "PRIVATE", 555,
	            44, 342, 456, 6653, 
	            66, 6688, 88, 
	            55, 7, 3, -1);
	}
	
	
	@Test
	public void testEditUser() {
		ac.editUser("juser", "First", "Last1", "password1", 'u', 'Y');
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUserNotUniqueUsername() {
		ac.editUser("user", "First", "Last1", "user", 'u', 'Y');
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUserInvalidPassword() {
		ac.editUser("juser", "First", "Last1", "u", 'u', 'Y');
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUserInvalidStatus() {
		ac.editUser("juser", "First", "Last1", "user", 'u', 'Y');
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEditUserInvalidType() {
		ac.editUser("juser", "First", "Last1", "user", 'u', 'Y');
	}
	
	
	
	
	/*
	
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
	
	
	*/
	
	@After
	public void remove() {
	db.adminEditUser("User John","User","juser","user",'u','Y');
	}
	
}
