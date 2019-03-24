	package CMC;

import java.util.List;

/**
	 * @author Java Junkies
	 *
	 * Driver for all use cases
	 */
	public class Phase2Driver { 
		
		UserInteraction  ui1 = new UserInteraction();
		AdminInteraction ai1 = new AdminInteraction();
		
		/**
		 * Tests the login functionality
		 * 
		 * @param username
		 * @param password
		 * @return String representation of outcome
		 */
	  public String testLogin(String username, String password) {
		  if(ai1.login(username, password) == 0) {
			  return "Login Successful!";
		  }
		  else if(ai1.login(username, password) == 1 || ai1.login(username, password) == 2) {
			  return "Username and Password combination is incorrect. Please try again.";
		  }
		  else if(ai1.login(username, password) == 3) {
			  return "Status is inactive.";
		  }
		  else {
			  return "We are unsure of the problem, please try again. Sorry for the inconvenience.";
		  }
	  }
	  
	  /**
	   * Tests the register functionality
	   * 
	   * @param 
	   */
	  public String testRegister(String first, String last, String user, String pass1, String pass2) {
		  if(ui1.register(first, last, user, pass1, pass2) == 0) {
			  return "Registration Successful";
		  }
		  else if (ui1.register(first, last, user, pass1, pass2) == 1 || ui1.register(first, last, user, pass1, pass2) == 2 || ui1.register(first, last, user, pass1, pass2) == 3) {
			  return "Password does not meet critera.";
		  }
		  else if (ui1.register(first, last, user, pass1, pass2) == 4) {
			  return "Username is not unique";
		  }
		  else if (ui1.register(first, last, user, pass1, pass2) == 5) {
			  return "Passwords do not match.";
		  }
		  else {
			  return "We are unsure of the problem, please try again. Sorry for the inconvenience.";
		  }
		  }
	  
	  /**
	   * Tests the view saved schools functionality
	   * 
	   * @param username is the user whos schools list is being viewed
	   * @return String representation of method call
	   */
	  public String testViewSavedSchools(String username) {
		  List<String> schools = ui1.viewSavedSchools(username);
		  String result = "";
		  int x = 0;
		  while(x < schools.size()) {
			  result = result + schools.get(x) + "\n";
		  x++;
		  }
		  if(result.equals("")) {
			  return "User has no saved schools";
		  }
		  return result;
	  }
	  
	  public static void main(String[] args)
	  {
		//objects
		Phase2Driver p = new Phase2Driver();
		UserInteraction  ui = new UserInteraction();
		AdminInteraction ai = new AdminInteraction();
		
	    //create testers
	    ai.addNewUser("test", "user", "testUser", "Password1", 'a');
	    ai.addUniversity("testSchool", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 );
	    
	    
	    //U1 Login Success
	    System.out.println(p.testLogin("testUser", "Password1"));
	    
	    //U1 A1 Username is incorrect
	    System.out.println(p.testLogin("asdfdf", "Password1"));
	    
	    //U1 A2 Password is incorrect
	    System.out.println(p.testLogin("testUser1", "asdfasdf"));
	    
	    //U1 A3 Inactive Account
	    ai.deactivateUser("testUser");
	    System.out.println(p.testLogin("testUser", "Password1"));
	   
	    
	    //U1 A4 Temporary Account
	    ui.register("Tyreese", "Fake", "TyDog", "Password2", "Password2");
	    System.out.println(p.testLogin("TyDog", "Password2"));
	    
	    System.out.println('\n');
	    
	    // Reset Account
	    ai.deleteUser("testUser");
	    ai.deleteUser("TyDog");
	    
	    
	    //U2 Register
	    System.out.println(p.testRegister("Reg","ister","Test1","Password1","Password1"));
	    
	    //U2 A1 Duplicate username
	    System.out.println(p.testRegister("Test","sameUser","Test1","Password1","Password1"));
	    
	    //U2 A2 Invalid password
	    System.out.println(p.testRegister("Bad", "Pass", "Test2", "pass", "pass"));
	    
	    //U2 A3 Passwords dont match
	    System.out.println(p.testRegister("Password","dontMatch","Test3","Password1","Password2"));
	    
	    //Delete account from database
	    ai.deleteUser("Test1");
	    System.out.println('\n');

	    
	    //U3 View Saved Schools
	    ai.addNewUser("Test", "viewSaved", "Test2", "Password1", 'u');
	    ui.saveSchool("Test2", "Butler");
	    ui.saveSchool("Test2", "Augsburg");
	    System.out.println(p.testViewSavedSchools("Test2"));
	    
	    // U3 A1 User has no saved schools
	    ai.addNewUser("Test", "Fail", "Test3", "Password1", 'u');
	    System.out.println(p.testViewSavedSchools("Test3"));
	    ai.deleteUser("Test2");
	    ai.deleteUser("Test3");
	    /*
	    //U4 Sort Saved Schools
	    System.out.println("U4: Sort Saved Schools");
	    //ui.sortSavedSchools(1 ,0 , 0, "testUser");
	    System.out.println('\n');
	    
	    //U5 View Recommended Schools    
	    System.out.println("U5: View Recommended Schools");
	    //ui.getRecommendedList(testSchool);              //takes type university
	    //System.out.println("A1: No recommendations");
	    System.out.println('\n');
	    
	    //U6 Remove Saved School
	    System.out.println("U6: Remove Saved School");
	    ui.removeSavedSchool("testUser", "ADELPHI");
	    System.out.println('\n');
	    
	    //U7 View Existing University
	    System.out.println("U7: View Existing University");
	    //ui.viewExistingUniversity("ADELPHI");
	    System.out.println('\n');
	    
	    //U8 View Universities
	    System.out.println("U8: View Universities");
	    ai.viewUniversities();
	    System.out.println('\n');
	    
	    //U9 Remove University
	    System.out.println("U9: Remove University");
	    ai.removeUniversity("testSchool");
	    System.out.println('\n');
	    
	    //U10 Add University   
	    System.out.println("U10: Add University");
	  //  ai.addUniversity("School", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 );
	    //ai.removeUniversity("School");
	    //System.out.println("A1: ");  //errors
	    //ai.addUniversity("School", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, null);
	    System.out.println('\n');
	    
	    //U11 Edit Universities 
	    System.out.println("U11: Edit University");
	    //ai.editUniversity("School", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 );
	    System.out.println('\n');
	    
	    //U12 Search
	    System.out.println("U12: Search");
	    //ui.search("testSchool");
	    System.out.println('\n');
	    
	    //U13 View Search Results
	    System.out.println("U13: View Results"); //same as U12
	    System.out.println('\n');
	    
	    //U14 Save School
	    System.out.println("U14: Save a school");
	    ui.saveSchool("testUser", "BARD");
	    System.out.println('\n');
	    
	    //U15 Compare two schools
	    System.out.println("U15: Compare Two Schools");
	   // ui.compare("BARD", "ADELPHI");
	    System.out.println('\n');
	    
	    //U16 View Other User's Info
	    System.out.println("U16: View Other User's Profile");
	    ai.viewUserInfo("nadmin");
	    System.out.println('\n');
	    
	    //U17 View Own Profile
	    System.out.println("U17: Edit info (reset)");
	    System.out.println('\n');
	    
	    //U18 Edit User Info
	    System.out.println("U18: Edit User Info");
	    ui.editUserInfo("testUser", "Greg", "Boy", "Password19");
	    System.out.println('\n');
	    
	    //U19 View Users    
	    System.out.println("U19: View Users");
	    ai.viewUsers();
	    System.out.println('\n');
	    
	    //U20 Add new User
	    System.out.println("U20: Add a new User");
	   // ai.addNewUser("Dane", "Man", "DMan", "Password1", a);
	    System.out.println('\n');
	    
	    //U21 Deactivate user
	    System.out.println("U21: Deactivate user");
	    ai.deactivateUser("DMan");
	    System.out.println('\n');
	    
	    //U22 Logoff
	    System.out.println("U22: Logout");
	    ui.logoff();
	    System.out.println('\n');
	    
	  */
	  }
	}
	