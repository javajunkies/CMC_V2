package CMC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UniversityTest {
	
	private University a;

	@Before
	public void setUp() throws Exception {
		a = new University("CSBSJU", "MN", "St. Joseph", "private", 3000, 50.0, 1300, 1300, 1000, 10, 5000, 50, 50, 5, 1, 1);
	}
	
	@Test
	public void testGetSchool() {
		String expResult = "CSBSJU";
		String actualResult = a.getSchool();
		assertTrue("University is " + expResult, expResult.equals(actualResult));
	}
	
	@Test
	public void testSetSchool() {
		a.setSchool("Imad Rahal University");
		String expResult = "Imad Rahal University";
		assertTrue("University is " + expResult, expResult.equals(a.getSchool()));
	}
	
	@Test
	public void testGetState() {
		String expResult = "MN";
		String actualResult = a.getState();
		assertTrue("State is " + expResult, expResult.equals(actualResult));
	}
	
	@Test
	public void testSetState() {
		a.setState("HI");
		String expResult = "HI";
		assertTrue("State is " + expResult, expResult.equals(a.getState()));
	}
	
	@Test
	public void testGetLocation() {
		String expResult = "St. Joseph";
		String actualResult = a.getLocation();
		assertTrue("Location is " + expResult, expResult.equals(actualResult));
	}
	
	@Test
	public void testSetLocation() {
		a.setLocation("Timbuktu");
		String expResult = "Timbuktu";
		assertTrue("Location is " + expResult, expResult.equals(a.getLocation()));
	}
	
	@Test
	public void testGetControl() {
		String expResult = "private";
		String actualResult = a.getControl();
		assertTrue("Control is " + expResult, expResult.equals(actualResult));
	}
	
	@Test
	public void testSetControl() {
		a.setControl("public charter");
		String expResult = "public charter";
		assertTrue("Control is " + expResult, expResult.equals(a.getControl()));
	}
	
	@Test
	public void testGetNumStudents() {
		int expResult = 3000;
		int actualResult = a.getNumStudents();
		assertTrue("Number of students is " + expResult, (expResult == actualResult));
	}
	
	@Test
	public void testSetNumStudents() {
		a.setNumStudents(69);
		int expResult = 69;
		assertTrue("Number of Students is " + expResult, (expResult == a.getNumStudents()));
	}
	
	@Test
	public void testGetPercentFemale() {
		double expResult = 50.0;
		double actualResult = a.getPercentFemale();
		assertTrue("The Percent Female is " + expResult, )
	}

	private void assertTrue(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
