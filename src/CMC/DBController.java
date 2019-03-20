/**
 * File: DBController.java
 */

package CMC;
import dblibrary.project.csci230.*;
import java.util.*;


/**
 * @author Java Junkies
 *
 * Database controller class
 */
public class DBController {
  
  /**
   * database controller
   */
  public DBController() {
    
  }
  
  UniversityDBLibrary db = new UniversityDBLibrary("javajunk", "CSCI230");
  
  /**
   * Searches for a specified user in the database.
   * @param username username being searched for
   * @return boolean representation of outcome, true if user is found, false if not.
   */
  
  public boolean isUser(String username) 
  { 
    String[][] users = db.user_getUsers();
    for(int i = 0; i < users.length; i++) {
      if(users[i][2].equals(username)) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Finds an account associated with specified username.
   * 
   * @param username is the username of the account being searched for.
   * @return the account with the specified username.
   */
  
  public Account findByUsername(String username) {
    String[][] users = db.user_getUsers();
    for(int i = 0; i < users.length; i++) {
      if(users[i][2].equals(username)) {
        Account u = new User(users[i][0], users[i][1], users[i][2], users[i][3], users[i][4].charAt(0));
        return u;
      }
    }
    return null;
  }
  
  /**
   * Searches for a specified users password in database.
   * @param username user whos password is being searched for.
   * @return String String representation of the users password.
   */
  
  public String findUserPassword(String username) 
  {
    String[][] users = db.user_getUsers();
    for(int i = 0; i < users.length; i++){
      if(users[i][2].equals(username)) {
        return users[i][3];
      }
    }
    return "Could not find " + username;
  }
  /**
   * @description
   * 
   * @param University object 
   * @return List<University> of length 5 for the recommended schools
   */
  public ArrayList<University> getRecommendations(University university)
  {
   
   String[][] universities = this.getAllUniversities();
   ArrayList[][] distance = new ArrayList[][];
   ArrayList[][] maximum = new ArrayList[][];
   ArrayList[][] minimum = new ArrayList[][];
   for(int j = 0; j<universities[0].length(); j++) {
    for(int i = 4; i < universities[1].length(); i++) {
     if(universities[j][i] > maximum[0][i]) {
      maximum[0][i] = universities[j][i];
     }
     if(universities[j][i] < minimum[0][i]) {
      minimum[0][i] = universities[j][i];
     }
    }
   }
   for(int j = 0; j < universities[0].length(); j++) {
     distance[j][0] = universities[j][0];
     String state = universities[j][1];
     String location = universities[j][2];
     String control = universities[j][3];
     int numStudents = Integer.parseInt(universities[j][4]);
     double percentFemale = Double.parseDouble(universities[j][5]);
     double SATVerbal = Double.parseDouble(universities[j][6]);
     double SATMath = Double.parseDouble(universities[j][7]);
     double expenses = Double.parseDouble(universities[j][8]);
     double percentFinancialAid = Double.parseDouble(universities[j][9]);
     int numApplicants = Integer.parseInt(universities[j][10]);
     double percentAdmitted = Double.parseDouble(universities[j][11]);
     double percentEnrolled = Double.parseDouble(universities[j][12]);
     int academicsScale = Integer.parseInt(universities[j][13]);
     int socialScale = Integer.parseInt(universities[j][14]);
     int qualityOfLife = Integer.parseInt(universities[j][15]);
     
     if(state.equals(university.getState())) {
      double x1=0;
     }
     else {
      double x1=1;
     }
     
     if(location.equals(university.getState())) {
      double x2=0;
     }
     else {
      double x2=1;
     }
     
     if(control.equals(university.getState())) {
      double x3=0;
     }
     else {
      double x3=1;
     }
     
     distance[j][1] = x1 + x2 + x3 + abs(numStudents-university.getNumStudents())/abs(maximum[0][4]-minimum[0][4]) + abs(percentFemale-university.getNPercentFemale())/abs(maximum[0][5]-minimum[0][5]) + abs(SATVerbal-university.getSATVerbal())/abs(maximum[0][6]-minimum[0][6]) + abs(SATMath-university.getSATMath())/abs(maximum[0][7]-minimum[0][7]) + abs(expenses-university.getExpenses())/abs(maximum[0][8]-minimum[0][8]) + abs(percentFinancialAid-university.getPercentFinancialAid())/abs(maximum[0][9]-minimum[0][9]) + abs(numApplicants-university.getnumApplicants())/abs(maximum[0][10]-minimum[0][10]) + abs(percentAdmitted-university.getPercentAdmitted())/abs(maximum[0][11]-minimum[0][11]) + abs(percentEnrolled-university.getPercentEnrolled())/abs(maximum[0][12]-minimum[0][12]) + abs(academicsScale-university.getAcademicsScale())/abs(maximum[0][13]-minimum[0][13]) + abs(socialScale-university.getSocialScale())/abs(maximum[0][14]-minimum[0][14]) + abs(qualityOfLife-university.getQualityOfLife())/abs(maximum[0][15]-minimum[0][15]);
     
   }
   
   for(int j = 0; j < distance[0].length(); j++) {
    if(distance[j+1][1] < distance[j][1]) {
     double tempDist = distance[j][1];
     distance[j][1] = distance[j+1][1];
     distance[j+1][1] = distance[j][1];
     String tempName = distance[j][0];
     distance[j][0] = distancs[j+1][0];
     distance[j+1][0] = tempName;
    }
   }
   ArrayList<University> recommendedSchools = new ArrayList<University>();
   
   for(int i = 0; i<5; i++) {
    for(int j = 0; j < universities[0].length(); j++) {
     if(distance[i][0].equals(universities[j][0]){
      String school = universities[j][0];
      String state = universities[j][1];
      String location = universities[j][2];
      String control = universities[j][3];
      int numStudents = Integer.parseInt(universities[j][4]);
      double percentFemale = Double.parseDouble(universities[j][5]);
      double SATVerbal = Double.parseDouble(universities[j][6]);
      double SATMath = Double.parseDouble(universities[j][7]);
      double expenses = Double.parseDouble(universities[j][8]);
      double percentFinancialAid = Double.parseDouble(universities[j][9]);
      int numApplicants = Integer.parseInt(universities[j][10]);
      double percentAdmitted = Double.parseDouble(universities[j][11]);
      double percentEnrolled = Double.parseDouble(universities[j][12]);
      int academicsScale = Integer.parseInt(universities[j][13]);
      int socialScale = Integer.parseInt(universities[j][14]);
      int qualityOfLife = Integer.parseInt(universities[j][15]);
      University recommendedUniv = new University(school, state, location, control, numStudents, percentFemale, mySATVerbal, mySATMath, myExpenses, myPercentFinancialAid, myNumApplicants, myPercentAdmitted, myPercentEnrolled, myAcademicsScale, mySocialScale, myQualityOfLife);
      recommendedSchools.add(univ);
     }
    }
   }
   return recommendedSchools;
  }
  
  public int editUnivInfo(String school, String state, String location, String control, int numberOfStudents,
          double percentFemales, double SATVerbal, double SATMath, double expenses, 
          double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
          double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) 
  {
    return db.university_editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
  }
  
  /**
   * @param u1 the first university to compare
   * @param u2 the second university to compare
   * 
   * This methods puts two universities side by side so that they may be compared
   */
  public ArrayList<University> compare(University u1, University u2) {
	  ArrayList<University> list = new ArrayList<University>();
	  list.add(u1);
	  list.add(u2);
	  return list;
  }
  
  /**
   * @param String firstName
   * @param String lastName
   * @param String username
   * @param String password
   * @param char type
   * 
   * @return boolean if user was created, return true
   */
  public boolean createUser(String firstName, String lastName, String username, String password, char type)
  {
    db.user_addUser(firstName, lastName, username, password, type);
    if(type == 'a') {
      User admin = new User(firstName, lastName, username, password, type);
      return true;
    }
    else if(type == 'u')
    {
      User user = new User(firstName, lastName, username, password, type);
      return true;
    }
    else {
    return false;
    }
  
  /**
   * method to search for a university 
   * @param state the search criteria
   * @param numberOfStudents the search criteria
   */
  public ArrayList<University> searchUniversities(String mySchool,String myState,String myLocation,String myControl,int minNumStudents, int maxNumStudents,double minPercentFemale, double maxPercentFemale,double minSATVerbal, double maxSATVerbal,double minSATMath, double maxSATMath,double minExpenses, double maxExpenses,double minPercentFinancialAid, double maxPercentFinancialAid,int minNumApplicants, int maxNumApplicants,double minPercentAdmitted, double maxPercentAdmitted,double minPercentEnrolled, double maxPercentEnrolled,int minAcademicsScale, int maxAcademicsScale,int minSocialScale, int maxSocialScale,int minQualityOfLife, int maxQualityOfLife) 
  {
    String[][] universities = db.university_getUniversities();
    int rowLength = universities[0].length;
    int colLength = universities[1].length; 
    ArrayList<University> matchUni = new ArrayList<University>();
    int k = 0;
    
    for(int i = 0; i < rowLength; i++) {
        if(universities[i][0].contains(mySchool) 
        		|| mySchool.equals("0") 
        		&& universities[i][1].contains(myState) 
        		|| myState.equals("0") 
        		&& universities[i][2].equals(myLocation) 
        		|| myLocation.equals("0") 
        		&& universities[i][3].contains(myControl) 
        		|| myControl.equals("0") 
        		&& minNumStudents <= Integer.parseInt(universities[i][4]) <= maxNumStudents 
        		|| minNumStudents <= Integer.parseInt(universities[i][4]) 
        		&& maxNumStudents == 0 
        		&& minPercentFemale <= Double.parseDouble(universities[i][5]) <= maxPercentFemale 
        		|| minPercentFemale <= Integer.parseInt(universities[i][5]) 
        		&& maxPercentFemale == 0 
        		&& minSATVerbal <= Double.parseDouble(universities[i][6]) <= maxSATVerbal 
        		|| minSATVerbal <= Double.parseDouble(universities[i][6]) 
        		&& maxSATVerbal == 0 
        		&& minSATMath <= Double.parseDouble(universities[i][7]) <= maxSATMath 
        		|| minSATMath <= Double.parseDouble(universities[i][7]) 
        		&& maxSATMath == 0 
        		&& minExpenses <= Double.parseDouble(universities[i][8]) <= maxExpenses 
        		|| minExpenses <= Double.parseDouble(universities[i][8]) 
        		&& maxExpenses == 0 
        		&& minPercentFinancialAid <= Double.parseDouble(universities[i][9]) <= maxFinancialAid 
        		|| minPercentFinancialAid <= Double.parseDouble(universities[i][9]) 
        		&& maxPercentFinancialAid == 0 
        		&& minNumApplicants <= Integer.parseInt(universities[i][10]) <= maxNumApplicants 
        		|| minNumApplicants <= Integer.parseInt(universities[i][10]) 
        		&& maxNumApplicants == 0 
        		&& minPercentAdmitted <= Double.parseDouble(universities[i][11]) <= maxPercentAdmitted 
        		|| minPercentAdmitted <= Double.parseDouble(universities[i][11]) 
        		&& maxPercentAdmitted == 0 
        		&& minPercentEnrolled <= Double.parseDouble(universities[i][12]) <= maxPercentEnrolled 
        		|| minPercentEnrolled <= Double.parseDouble(universities[i][12]) 
        		&& maxPercentEnrolled == 0 
        		&& minAcademicsScale <= Integer.parseInt(universities[i][13]) <= maxAcademicsScale 
        		|| minAcademicsScale <= Integer.parseInt(universities[i][13]) 
        		&& maxAcademicsScale == 0 
        		&& minSocialScale <= Integer.parseInt(universities[i][14]) <= maxSocialScale 
        		|| minSocialScale <= Integer.parseInt(universities[i][14]) 
        		&& maxSocialScale == 0 
        		&& minQualityOfLife <= Integer.parseInt(universities[j][15]) <= maxQualityOfLife 
        		|| minQualityOfLife <= Integer.parseInt(universities[j][15]) 
        		&& maxQualityOfLife == 0) {
        	University univ = new University(university[i][0],university[i][1],university[i][2],university[i][3],university[i][4],university[i][5],university[i][6],university[i][7],university[i][8],university[i][9],university[i][10],university[i][11],university[i][12],university[i][13],university[i][14],university[i][15]);
        	matchUni.add(univ);
        }
    }
    return matchUni;
  }
  
  
  /**
   * A method to view a List of all universities
   */
  public ArrayList<University> getAllUniversities()
  {
	 ArrayList<University> univList = new ArrayList<University>();
	 String[][]univInfo = db.universities.getUniversities();
	 for(int j=0; j<univInfo[1].length; j++) {
	   University university = new University(univInfo[j][0], univInfo[j][1], univInfo[j][2], univInfo[j][3], univInfo[j][4], univInfo[j][5], univInfo[j][6], univInfo[j][7], univInfo[j][8], univInfo[j][9], univInfo[j][10], univInfo[j][11], univInfo[j][12], univInfo[j][13], univInfo[j][14], univInfo[j][15]); 
	   univList.add(univIersity)
	 }
	 return univList; 
  }
  
  /**
   *  A method that Lists all of the users
   */
  public ArrayList<User> getAllUsers() 
  {
    ArrayList<User> userList = new ArrayList<User>();
    String[][]usersInfo = db.user_getUsers();
    for(int j=0; j<usersInfo[1].length; j++) {
      User user = new User(usersInfo[j][0],usersInfo[j][1],usersInfo[j][2],usersInfo[j][3],usersInfo[j][4].charAt(0));
      userList.add(user);
   }
    return userList;  
  }
  
  /**
   * @param username the active users username 
   * 
   * method to view retrieve a users info from the database and display it. 
   */
  public User viewUser(String username)
  {
    String[] userInfo = new String[5];
    String[][] users = db.user_getUsers();
    for (int i = 0; i < users.length; i++)
    {
      if (users[i][2].equals(username))
      {
        for(int s = 0; s < 5; s++)
        {
          userInfo[s] = users[i][s];
        }
      }
    }
    String first = userInfo[0];
    String last = userInfo[1];
    String user = userInfo[2];
    String password = userInfo[3];
    char userType = userInfo[4].charAt(0);
    
    User user1 = new User(first, last, user, password, userType);
    return user1;  
  }
  
  
  
  /**
   * @param firstName the new username to be updated
   * @param lastName the new lastname to be updated
   * @param password the new password to be updated
   * 
   * method to edit the current users information that is stored in the database
   */
  public int adminEditUser(String username, String firstName, String lastName, String password, char type, char status)
  {
    return db.user_editUser(username, firstName, lastName, password, type, status);
  }
  

  public int userEditUser(String username, String first, String last, String password) {
   return db.user_editUser(username, first, last, password, 'u', 'Y');
  }


  /**
   * @param username username of the user 
   * 
   * a method to get the User's saved schools
   */

  public ArrayList<University> viewSavedSchools(String username) 
  {
      
   ArrayList<University> userSavedSchools = new ArrayList<University>();
   
   //get all of the users with saved schools
   String[][] users = db.user_getUsernamesWithSavedSchools();
   
  //get the Universities from db and make a new list with them
  String[][] universities = db.university_getUniversities();
  int rowLength = universities[0].length;
  int colLength = universities[1].length;
  for(int i = 0; users[0].length; i++) {
   for(int j = 0; j <rowLength; i++) {
	   if(users[i][1].equals(universities[j][0]){
		   String school = universities[j][0];
		   String state = universities[j][1];
		   String location = universities[j][2];
		   String control = universities[j][3];
		   int numStudents = Integer.parseInt(universities[j][4]);	
		   double percentFemale = Double.parseDouble(universities[j][5]);
		   double SATVerbal = Double.parseDouble(universities[j][6]);
		   double SATMath = Double.parseDouble(universities[j][7]);
		   double expenses = Double.parseDouble(universities[j][8]);
		   double percentFinancialAid = Double.parseDouble(universities[j][9]);
		   int numApplicants = Integer.parseInt(universities[j][10]);
		   double percentAdmitted = Double.parseDouble(universities[j][11]);
		   double percentEnrolled = Double.parseDouble(universities[j][12]);
		   int academicsScale = Integer.parseInt(universities[j][13]);
		   int socialScale = Integer.parseInt(universities[j][14]);
		   int qualityOfLife = Integer.parseInt(universities[j][15]);
		   University univ = new University(school, state, location, control, numStudents, percentFemale, mySATVerbal, mySATMath, myExpenses, myPercentFinancialAid, myNumApplicants, myPercentAdmitted, myPercentEnrolled, myAcademicsScale, mySocialScale, myQualityOfLife);
		   userSavedSchools.add(univ);
	   }
   }
  }
  return userSavedSchools;
  }
   
 
   //for those Universiies , find the price of their saved schools
   
   //if (users[i] = username);
   //go to their  price column of all of their saved universities
   //String [][] = price
   //sort the price column using a temp variable
     
  //return userSavedSchools; 
   //}
  //}

   
  /**
   * @param numStudent  the number of students attending a university
   * 
   * This method sorts a users saved schools by attendance
   */
  public ArrayList<University> sortByNumStudents(int numStudents, String username) {
  
   ArrayList<Universities> byNumStudents = new ArrayList<>();
   byNumStudents.getUsersSavedSchools();
  }
     
  /**
   * @param price price of the school
   * 
   * This method sorts a users saved schools by price
   */
  public ArrayList<University> sortByPrice(int price, String username) {
    
	  

	  
  }
  
  //should this be an int?????
  /**
   * @param acceptanceRate 
   * 
   * This method sorts a users saved school by acceptance rate
   */
     public ArrayList<University> sortByAcceptance(int acceptanceRate, String username) {
   
  }  
    //publicSortSavedSchools
}

   
   // make a point system or assign a to add up all of the 
  

  public int removeUniversity(String name)
  {
    return db.university_deleteUniversity(name);
  }
  
  
  public int addUniversity(String school, String state, String location, String control, int numberOfStudents,
                            double percentFemales, double SATVerbal, double SATMath, double expenses, 
                            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
                            double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale)
  {
    return db.university_addUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
  }
  
  
  public boolean isUniqueUsername(String username)
  {
    String[][] users = db.user_getUsers();
     for(int i = 0; i < users.length; i++) {
       if(users[i][2].equals(username)) {
         return false;
       }
     }
     return true;
  }
  
  public University viewExistingUniversity(University university) {
    String [][] universities = db.university_getUniversities();
    for (int i = 0; i < universities[0].length(); i++){
      if (universities[i][0].equals(university.getSchool())) {
        String school = universities[i][0];
        String state = universities[i][1];
        String location = universities[i][2];
        String control = universities[i][3];
        int numStudents = Integer.parseInt(universities[i][4]);
        double percentFemale = Double.parseDouble(universities[i][5]);
        double SATVerbal = Double.parseDouble(universities[i][6]);
        double SATMath = Double.parseDouble(universities[i][7]);
        double expenses = Double.parseDouble(universities[i][8]);
        double percentFinancialAid = Double.parseDouble(universities[i][9]);
        int numApplicants = Integer.parseInt(universities[i][10]);
        double percentAdmitted = Double.parseDouble(universities[i][11]);
        double percentEnrolled = Double.parseDouble(universities[i][12]);
        int academicsScale = Integer.parseInt(universities[i][13]);
        int socialScale = Integer.parseInt(universities[i][14]);
        int qualityOfLife = Integer.parseInt(universities[i][15]);
        University university = new University(school, state, location, control, numStudents, percentFemale, mySATVerbal, mySATMath, myExpenses, myPercentFinancialAid, myNumApplicants, myPercentAdmitted, myPercentEnrolled, myAcademicsScale, mySocialScale, myQualityOfLife);
      }
    }
    return university;
  }


public int addToSaved(String username, String university)
{
 return db.user_saveSchool(username, university);
}

public int removeFromSaved(String username, String university)
{
 return db.user_removeSchool(username, university);
}

/**
 * Deactivates user by setting status to 'N'
 * 
 * @param username is the user being deactivated
 * @return an int representation of the deactivation, 1 means successful, -1 means unsuccessful
 */

public int deactivateUser(String username) {
 String[][] users = db.user_getUsers();
 //String first = "";
 //String last = "";
 //String user = ""; 
 //String password = "";
 //char type = 'N';
 for(int i = 0; i < users.length; i++) {
  if(users[i][2].equals(username)) {
   //first = users[i][0];
   //last = users[i][1];
   //user = users[i][2];
   //password = users[i][3];
   //type = users[i][4].charAt(0);
   users[i][4]='N';
   return 0;
  }
  else if(users[i[4] == 'N'||'n']) {
	  return 1;
  }
 }
 
//db.user_editUser(user, first, last, password, type, 'N');
}