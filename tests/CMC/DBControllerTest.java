package CMC;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.BeforeClass;
import org.junit.Test;

public class DBControllerTest {

	private static DBController db;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
		assertEquals(1, u);
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
		ArrayList<University> expected = new ArrayList<University>();
		University Uni = new University("UNIVERSITY OF CALIFORNIA BERKELEY", "CALIFORNIA", "URBAN", "STATE", 40000, 45.0, 530.0, 600.0, 15328.0, -1.0, 15000, 50.0, 70.0, 5, 3, 3);
		expected.add(Uni);
		ArrayList<University> searchTest = db.searchUniversities("ber", "calif", false, "urb", "st", 0 ,40000, 0.0, 45.0, 0.0, 530.0, 0.0, 600.0, 0.0, 15328.0, 0.0, 0.0, 0, 15000, 0.0, 50.0, 0.0, 70.0, 0, 5, 0, 3, 0, 3);
		//ArrayList<University> searchTest = db.searchUniversities("A", "", false, "", "",0,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0,0,0.0,0.0,0.0,0.0,0,0,0,0,0,0);
		
//		for (int i = 0; i!= searchTest.size();i++)
//		{
//			System.out.println(searchTest.get(i));
//		}
//		System.out.println(searchTest.size());
		
		assertEquals(searchTest.toString(), expected.toString());
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
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	public void addToSavedTest() {
		db.createUser("TestAdd", "ToSaved", "testAdd", "Password1", 'u');
		int expected = 1;
		int actual = db.addToSaved("testAdd", "Augsburg");
		assertTrue("Should return " + expected + " but returned " + actual, expected == actual);
	}

//	@Test
//	public void getRecommendationsTest() {
//		University Uni = new University("UNIVERSITY OF CALIFORNIA BERKELEY", "CALIFORNIA", "URBAN", "STATE", 40000, 45.0, 530.0, 600.0, 15328.0, -1.0, 15000, 50.0, 70.0, 5, 3, 3);
//		ArrayList<University> Test = db.getRecommendations(Uni);
//		
//		for (int i = 0; i!= Test.size();i++)
//		{
//			System.out.println(Test.get(i));
//		}
//		
//	}

	@Test
	public void userEditUserTest() {
		db.userEditUser("juser","User","Last","password1");
	}
	
	@Test
	public void findByUsernameTest() {
		db.findByUsername("juser");
	}
	
	@Test
	public void viewSavedSchoolsTest() {
		db.viewSavedSchools("juser");
	}
	
	@Test
	public void deactivateUserTest() {
		db.deactivateUser("luser");
	}
	
	@Test
	public void sortByNumStudentsTest() {
		db.sortByNumStudents("juser");
	}
	
	@Test
	public void addUniversityTest() {
		int expResult = db.addUniversity("CSBSJU", "MN", "St. Joseph", "private", 3000, 50.0, 2000.0, 2000.0, 7000.0, 50.0, 4000, 75.0, 60.0, 4, 3, 2);
		assertEquals("Expected Result = 1", expResult, 1);
	}

	@Test
	public void getRecommendationsTest() {
		University testUniversity = new University("CSBSJU", "MN", "St. Joseph", "private", 3000, 50.0, 2000.0, 2000.0, 7000.0, 50.0, 4000, 75.0, 60.0, 4, 3, 2);
		db.addUniversity("Dane Kuhr University", "MN", "St. Joseph", "private", 3001, 49.0, 2001.0, 1999.0, 7001.0, 49.0, 4001, 74.0, 61.0, 5, 2, 3);
		db.addUniversity("John Wolff University", "MN", "St. Joseph", "private", 2999, 50.5, 1999.6, 2001.7, 6999.8, 50.9, 3999, 76.1, 59.2, 3, 4, 1);
		db.addUniversity("Justin Brakob University", "WA", "Walla Walla", "private", 3000, 50.0, 2000.0, 200.0, 7000.0, 50.0, 4000, 75.0, 60.0, 4, 3, 2);
		db.addUniversity("Tyreese Robinson University", "MN", "St. Joseph", "public charter", 3000, 50.0, 2000.0, 2000.0, 7000.0, 50.0, 4000, 75.0, 60.0, 4, 3, 2);
		db.addUniversity("Ben West University", "MN", "West St. Joseph", "private", 3002, 49.9, 1999.9, 1999.9, 6999.9, 49.9, 3999, 74.9, 59.9, 3, 2, 1);
		ArrayList<University> actualResult = db.getRecommendations(testUniversity);
		ArrayList<University> expResult = new ArrayList<University>();
		expResult.add(db.viewExistingUniversity("Dane Kuhr University"));
		expResult.add(db.viewExistingUniversity("John Wolff University"));
		expResult.add(db.viewExistingUniversity("Justin Brakob University"));
		expResult.add(db.viewExistingUniversity("Tyreese Robinson University"));
		expResult.add(db.viewExistingUniversity("Ben West University"));
		// Finish this john
	}
	
	@Test
	public void editUnivInfo() {
		//fill this out
		db.editUnivInfo(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale)
	}
	
	@Test
	public void viewUserTest() {
		db.viewUser("juser")
	}
	
	@Test 
	public void isUserTest() {
	    db.isUser("auser")
	}

	@Test 
	public void removeFromSaved() {
	    db.removeFromSaved("auser", "BUTLER")
	}
	
	@Test
	public void sort() {
		//finish after sort is done
		db.sort();
	}
	
	@Test
	public void removeUniversityTest() {
		db.removeUniversity("Augsburg");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void InvalidremoveUniversityTest() {
		db.removeUniversity("fdsafdsa");
	}



	@AfterClass
	public static void setUpAfterClass() throws Exception
	{
		db.deleteUser("username");
		db.deleteUser("testAdd");
		db.removeUniversity("testSchool");
		db.removeUniversity("CSBSJU");
	}
}
