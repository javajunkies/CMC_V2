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
  
  UniversityDBLibrary db = new UniversityDBLibrary("javajunk", "csci230");
  
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
   * @param username user whose password is being searched for.
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
/*  public ArrayList<University> getRecommendations(University university)
  {
    
    String[][] universities = db.university_getUniversities();
    ArrayList[][] distance = new ArrayList[5][];
    ArrayList[][] maximum = new ArrayList[5][];
    ArrayList[][] minimum = new ArrayList[5][];
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
        if(distance[i][0].equals(universities[j][0])){
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
  }*/
  
  public int editUnivInfo(String school, String state, String location, String control, int numberOfStudents,
                          double percentFemales, double SATVerbal, double SATMath, double expenses, 
                          double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
                          double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) 
  {
    return db.university_editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
  }
  
  /**
   * 
   * 
   * @param firstName is the first name of the new user
   * @param lastName is the last name of the new user
   * @param username is the username of the new user
   * @param password is the password of the new user
   * @param type is the type of new user
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
  public int createUser(String firstName, String lastName, String username, String password, char type)
  {
    return db.user_addUser(firstName, lastName, username, password, type);
  }
  
  /**
   * This method searches for schools that meet the criteria entered as parameters
   * 
   * @param mySchool  mySchool is the name of the school
   * @param myState   is the state that the school is located
   * @param myLocation is the type of area in which the school is located (i.e. Suburban, Small-city, ...)
   * @param myControl specifies who controls the university (i.e. Public, Private, ...)
   * @param minNumStudents is the min number of students desired at a university
   * @param maxNumStudents is the max number of students desired at a university
   * @param minPercentFemale is the min percentage of females desired at a university
   * @param maxPercentFemale is the max percentage of females desired at a university
   * @param minSATVerbal is the min average SAT Verbal score, out of 800, for the students at a university
   * @param maxSATVerbal is the max average SAT Verbal score, out of 800, for the students at a university
   * @param minSATMath is the min average SAT Math score, out of 800, for the students at a university
   * @param maxSATMath is the max average SAT Math score, out of 800, for the students at a university
   * @param minExpenses is the min annual tuition for a university
   * @param maxExpenses is the max annual tuition for a university
   * @param minPercentFinancialAid is the min percentage of students who received some sort of financial aid from a university
   * @param maxPercentFinancialAid is the max percentage of students who received some sort of financial aid from a university
   * @param minNumApplicants is the min number of students who typically apply to this university
   * @param maxNumApplicants is the max number of students who typically apply to this university
   * @param minPercentAdmitted is the min percentage of students who are admitted annually to a university
   * @param maxPercentAdmitted is the max percentage of students who are admitted annually to a university
   * @param minPercentEnrolled is the min percentage of students who are currently enrolled at this university
   * @param maxPercentEnrolled is the max percentage of students who are currently enrolled at this university
   * @param minAcademicsScale is an integer between 1 and 5 (5 being the best) indicating the min quality of academics at this university 
   * @param maxAcademicsScale is an integer between 1 and 5 (5 being the best) indicating the max quality of academics at this university 
   * @param minSocialScale is an integer between 1 and 5 (5 being the best) indicating the min quality of the social life at this university
   * @param maxSocialScale is an integer between 1 and 5 (5 being the best) indicating the max quality of the social life at this university
   * @param minQualityOfLife is an integer between 1 and 5 (5 being the best) indicating the min overall quality of life at this university
   * @param maxQualityOfLife is an integer between 1 and 5 (5 being the best) indicating the max overall quality of life at this university
   * 
   * @return ArrayList<Universities> an array list of university objects that matched search criteria
   */
/*  public ArrayList<University> searchUniversities(String mySchool, String myState,String myLocation,String myControl,int minNumStudents, int maxNumStudents,double minPercentFemale, double maxPercentFemale,double minSATVerbal, double maxSATVerbal,double minSATMath, double maxSATMath,double minExpenses, double maxExpenses,double minPercentFinancialAid, double maxPercentFinancialAid,int minNumApplicants, int maxNumApplicants,double minPercentAdmitted, double maxPercentAdmitted,double minPercentEnrolled, double maxPercentEnrolled,int minAcademicsScale, int maxAcademicsScale,int minSocialScale, int maxSocialScale,int minQualityOfLife, int maxQualityOfLife) 
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
  }*/
  
  /**
   * A method to view a List of all universities in the DB
   * 
   */
  public List<String> getAllUniversities()
  {
	  String [][] univs = db.university_getUniversities();
	  List<String> result = new ArrayList<String>();
	  for(int i = 0; i < univs.length; i++) {
		 result.add(univs[i][0]);
	  }
	  return result;
  }
  
  /**
   *  A method that Lists all of the users in the DB
   */
  
  
  public List<User> getAllUsers() {
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
  
  
  /**
   * @param username
   * @param first (user's first name)
   * @param last (user's last name)
   * @param password
   * 
   * method that allows user to edit their account
   * returns 1 if user edited successfully, 0 if not
   */
  
  public int userEditUser(String username, String first, String last, String password) {
    return db.user_editUser(username, first, last, password, 'u', 'Y');
  }
  
 
  /**
   * View saved schools
   * 
   * @param username - person
   */
  public List<String> viewSavedSchools(String username) 
  {
    
    List<String> userSavedSchools = new ArrayList<String>();
    
    //get all of the users with saved schools
    String[][] users = db.user_getUsernamesWithSavedSchools();
    for(int i = 0; i < users.length; i++) {
    	if(users[i][0].equals(username)) {
    		userSavedSchools.add(users[i][1]);
    	}
    }
    return userSavedSchools;
    }
  
  
  /**
   * @param numStudent  the number of students attending a university
   * 
   * This method sorts a users saved schools by attendance
   */
/*  public void sortByNumStudents(int numStudents, String username) {
    
    ArrayList<University> byNumStudents = new ArrayList<University>();

  }*/
  
  /**
   * @param price price of the school
   * 
   * This method sorts a users saved schools by price
   */
  
  public void sortByPrice(int price, String username) {
    
  }
  
  
  /*
   * @param name (name of the university to remove)
   * 
   * method that allows admin to remove a specific university from the database
   * returns 1 if adm removed university successfully, 0 if not
   */
  //point system or assign a to add up all of the 
  public void sortByAcceptance(int acceptanceRate) {   
  }  
  
  
  
  public int removeUniversity(String name)
  {
    return db.university_deleteUniversity(name);
  }
  
  /**
   * @param School (name of university)
   * @param State (name of state university is in)
   * @param Location (name of location of the university)
   * @param Control (name of person who controls university)
   * @param numberOfStudents (number of students attending university)
   * @param percentFemales (percentage of students attending university that are female)
   * @param SATVerbal (average score of student at university on SAT Verbal)
   * @param SATMath (average score of student at university on SAT Math)
   * @param expenses (cost of expenses for students attending university)
   * @param percentFinancialAid (percent of financial aid offered to accepted students at university)
   * @param numberOfApplicants (number of people who applied to university)
   * @param percentAdmitted (percent of applicants accepted to university)
   * @param percentEnrolled (percent of accepted applicants who enrolled at the university)
   * @param academicsScale (a number between 1 and 5 with 5 being the best indicating the quality of academics at the university)
   * @param socialScale (a number between 1 and 5 with 5 being the best indicating the quality of the social atmosphere at the university)
   * @param qualityOfLifeScale (a number between 1 and 5 with 5 being the best indicating the quality of the students' lives at the university)
   * 
   * method allows admin to add a university to the database with all the given information
   * @return 1 if university was successfully added, -1 if not.
   */
  
  public int addUniversity(String school, String state, String location, String control, int numberOfStudents,
                           double percentFemales, double SATVerbal, double SATMath, double expenses, 
                           double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
                           double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale)
  {
    return db.university_addUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
  }
  
  
  /**
   * @param School (name of university)
   * @param State (name of state university is in)
   * @param Location (name of location of the university)
   * @param Control (name of person who controls university)
   * @param numberOfStudents (number of students attending university)
   * @param percentFemales (percentage of students attending university that are female)
   * @param SATVerbal (average score of student at university on SAT Verbal)
   * @param SATMath (average score of student at university on SAT Math)
   * @param expenses (cost of expenses for students attending university)
   * @param percentFinancialAid (percent of financial aid offered to accepted students at university)
   * @param numberOfApplicants (number of people who applied to university)
   * @param percentAdmitted (percent of applicants accepted to university)
   * @param percentEnrolled (percent of accepted applicants who enrolled at the university)
   * @param academicsScale (a number between 1 and 5 with 5 being the best indicating the quality of academics at the university)
   * @param socialScale (a number between 1 and 5 with 5 being the best indicating the quality of the social atmosphere at the university)
   * @param qualityOfLifeScale (a number between 1 and 5 with 5 being the best indicating the quality of the students' lives at the university)
   * 
   * method allows admin to edit information about a university given the current criteria.
   * @return 1 if university successfully edited, -1 if not
   */
  
  
  public int editUniversity(String school, String state, String location, String control, int numberOfStudents,
                            double percentFemales, double SATVerbal, double SATMath, double expenses, 
                            double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                            int academicsScale, int socialScale, int qualityOfLifeScale) 
  {
    return db.university_editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale); 
  }
  
  /**
   * @param username (the username being checked)
   * 
   * method searches through the list of usernames to ensure that the given username does not already refer to an existing account.
   * @return true if username is unique, otherwise false
   */
  
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
  
  /**
   * @param university (the university being viewed)
   * 
   * method displays information on a university from the database
   * @return the university with all the given information
   */
  
  public University viewExistingUniversity(University university) {
    String [][] universities = db.university_getUniversities();
    String school = "";
    String state = "";
    String location = "";
    String control = "";
    int numStudents = 0;
    int numApplicants = 0;
    int academicsScale = 0;
    int socialScale = 0;
    int qualityOfLife = 0;
    double percentFemale = 0;
    double SATVerbal = 0;
    double SATMath = 0; 
    double expenses = 0;
    double percentFinancialAid = 0;
    double percentAdmitted = 0;
    double percentEnrolled = 0; 
    for (int i = 0; i < universities.length; i++){
      if (universities[i][0].equals(university.getSchool())) {
        school = universities[i][0];
        state = universities[i][1];
        location = universities[i][2];
        control = universities[i][3];
        numStudents = Integer.parseInt(universities[i][4]);
        percentFemale = Double.parseDouble(universities[i][5]);
        SATVerbal = Double.parseDouble(universities[i][6]);
        SATMath = Double.parseDouble(universities[i][7]);
        expenses = Double.parseDouble(universities[i][8]);
        percentFinancialAid = Double.parseDouble(universities[i][9]);
        numApplicants = Integer.parseInt(universities[i][10]);
        percentAdmitted = Double.parseDouble(universities[i][11]);
        percentEnrolled = Double.parseDouble(universities[i][12]);
        academicsScale = Integer.parseInt(universities[i][13]);
        socialScale = Integer.parseInt(universities[i][14]);
        qualityOfLife = Integer.parseInt(universities[i][15]);
      }
    }
    University university1 = new University(school, state, location, control, numStudents, percentFemale, SATVerbal, SATMath, expenses, percentFinancialAid, numApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLife);
    return university1;
  }

  
  /**
   * @param username (the username of the user)
   * @param university (the university being added to the user's saved schools)
   * 
   * method adds university to a user's list of saved school's
   * @return int 1 if school successfully added, -1 otherwise
   */
  
  public int addToSaved(String username, String university)
  {
    return db.user_saveSchool(username, university);
  }
  
  /**
   * @param username (the username of the user)
   * @param university (the university being removed from the user's saved schools)
   * 
   * method removes a school from the user's list of saved schools.
   * @return 1 if school successfully removed from user's saved schools, otherwise -1
   */
  
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
    String first = "";
    String last = "";
    String user = ""; 
    String password = "";
    char type = 'u';
    for(int i = 0; i < users.length; i++) {
      if(users[i][2].equals(username)) {
        first = users[i][0];
        last = users[i][1];
        user = users[i][2];
        password = users[i][3];
        type = users[i][4].charAt(0);
      }
    }
    return db.user_editUser(user, first, last, password, type, 'N');
  }
  
  /**
   * @param username (the username of the user)
   * 
   * method allows admin to delete user from db
   * @return 1 if the user was successfully deleted, otherwise -1
   */
  
  public int deleteUser(String username){
    return db.user_deleteUser(username);
  }
  
  /**
   * @param first (the first name of the new user)
   * @param last (the last name of the new user)
   * @param user (the username of the new user's account)
   * @param pass (the password of the new user's account)
   * 
   * method allows user to become registered into the database
   * @return 1 if user was successfully registered, otherwise -1
   */
  
  public int registerNewUser(String first, String last, String user, String pass) {
    return db.user_addUser(first, last, user, pass, 't');
  }
  
  public static void main(String[] args) {
	  DBController dbc = new DBController();
	  System.out.println(dbc.isUser("juser"));
  }
  
  }

