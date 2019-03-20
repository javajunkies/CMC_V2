package CMC;

/**
 * @author Java Junkies
 *
 * Driver for all use cases
 */
public class Phase2Driver { 
  
  /* ---- Dane stuff ------
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter username to login");
   String username = sc.nextLine();
   System.out.println("Enter password to login");
   String password = sc.nextLine(); */
  
  
  //objects
  UserInteraction  ui = new UserInteraction();
  AdminInteraction ai = new AdminInteraction();
  
  public static void main(String[] args)
  {
    //create testers
    ai.addNewUser("test", "user", "testUser", "Password1", a);
    ai.addUniversity("testSchool", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 );
    
    
    //U1 Login
    System.out.println("U1: Login");
    ui.login("nadmin","admin");
    System.out.println("A1: Username is incorrect");
    ui.login("wrong","admin");
    System.out.println("A2: Password is incorrect");
    ui.login("nadmin", "wrong");
    System.out.println("A3: Inactive Account");
    ui.login("luser","user");
    System.out.println("A4: Temporary Account");
    ui.login("luser","user");
    
    System.out.println('\n');
    
    //U2 Register
    System.out.println("U2: Register");
    ui.register("TyreeseIsCool1","Tyreese","Man","Password1","Password1");
    System.out.println("A1: Username is not unique");
    ui.register("nadmin","Tyreese","Man","Password1","Password1");
    System.out.println("A2: Password isn't good enough");
    ui.register("TyreeseIsCool2","Tyreese","Man","pass","pass");
    System.out.println("A3: Passwords don't match");
    ui.register("TyreeseIsCool3","Tyreese","Man","Password1","WrongPassword1");
    
    System.out.println('\n');
    
    //U3 View Saved Schools
    System.out.println("U3: View Saved Schools");
    ui.viewSavedSchools("juser");
    System.out.println("A1: User has no saved schools");
    ui.viewSavedSchools("admin");
    
    //U4 Sort Saved Schools
    System.out.println("U4: Sort Saved Schools");
    ui.sortSavedSchools(1 ,0 , 0, "testUser");
    System.out.println('\n');
    
    //U5 View Recommended Schools    
    System.out.println("U5: View Recommended Schools");
    ui.getRecommendedList(testSchool);              //takes type university
    //System.out.println("A1: No recommendations");
    System.out.println('\n');
    
    //U6 Remove Saved School
    System.out.println("U6: Remove Saved School");
    ui.removeSavedSchool("testUser", "ADELPHI");
    System.out.println('\n');
    
    //U7 View Existing University
    System.out.println("U7: View Existing University");
    ui.viewExistingUniversity("ADELPHI");
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
    ai.addUniversity("School", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 );
    //ai.removeUniversity("School");
    //System.out.println("A1: ");  //errors
    //ai.addUniversity("School", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, null);
    System.out.println('\n');
    
    //U11 Edit Universities 
    System.out.println("U11: Edit University");
    ai.editUniversity("School", "State", "Location", "Control" , 100, 50, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 );
    System.out.println('\n');
    
    //U12 Search
    System.out.println("U12: Search");
    ui.search("testSchool");
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
    ui.compare(BARD, ADELPHI);
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
    ai.addNewUser("Dane", "Man", "DMan", "Password1", a);
    System.out.println('\n');
    
    //U21 Deactivate user
    System.out.println("U21: Deactivate user");
    ai.deactivateUser("DMan");
    System.out.println('\n');
    
    //U22 Logoff
    System.out.println("U22: Logout");
    ui.logoff();
    System.out.println('\n');
    
    //clean up after yourself
    ai.deleteUser("testUser");
    ai.deleteUser("DMan");
  }
}
