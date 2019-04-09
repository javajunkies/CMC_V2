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
		ArrayList<University> expected = new ArrayList<University>();
		University Uni = new University("UNIVERSITY OF CALIFORNIA BERKELEY", "CALIFORNIA", "URBAN", "STATE", 40000, 45.0, 530.0, 600.0, 15328.0, -1.0, 15000, 50.0, 70.0, 5, 3, 3);
		expected.add(Uni);
		ArrayList<University> searchTest = db.searchUniversities("ber", "calif", false, "urb", "st", 0 ,40000, 0.0, 45.0, 0.0, 530.0, 0.0, 600.0, 0.0, 15328.0, 0.0, 0.0, 0, 15000, 0.0, 50.0, 0.0, 70.0, 0, 5, 0, 3, 0, 3);
		//ArrayList<University> searchTest = db.searchUniversities("", "", false, "", "",0,0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0,0,0.0,0.0,0.0,0.0,0,0,0,0,0,0);
		
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
	}
	
	@Test
	public void addToSavedTest() {
		db.createUser("TestAdd", "ToSaved", "testAdd", "Password1", 'u');
		int expected = 1;
		int actual = db.addToSaved("testAdd", "Augsburg");
		assertTrue("Should return " + expected + " but returned " + actual, expected == actual);
	}
	
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

	

	@AfterClass
	public static void setUpAfterClass() throws Exception
	{
		db.deleteUser("username");
		db.deleteUser("testAdd");
		db.removeUniversity("testSchool");
	}
}
