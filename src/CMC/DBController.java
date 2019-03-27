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
        Account u = new User(users[i][0], users[i][1], users[i][2], users[i][3], users[i][4].charAt(0), users[i][5].charAt(0));
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
  public ArrayList<University> getRecommendations(University university)
  {
    
    String[][] universities = db.university_getUniversities();
    String[][] distance;
    Double[] maximum;
    Double[] minimum;
    double x1;
    double x2;
    double x3;
    //int maxIndex = 0;
    //int minIndex = 0;
    for(int j = 0; j<universities[0].length; j++) {
      for(int i = 4; i < universities[1].length; i++) {
        if(Double.parseDouble(universities[j][i]) > maximum[i]) {	// || Integer.parseInt(universities[j][i] > maximum[0][i])) {
          maximum[i] = Double.parseDouble(universities[j][i]);
          //maxIndex++;
        }
        if(Double.parseDouble(universities[j][i]) < minimum[i]) {	//|| Integer.parseInt(universities[j][i] < maximum[0][i]) {
          minimum[i] = Double.parseDouble(universities[j][i]);
          //minIndex++;
        }
      }
    }
    for(int j = 0; j < universities[0].length; j++) {
      distance[j][0] = universities[j][0];
      String state = universities[j][1];
      String location = universities[j][2];
      String control = universities[j][3];
      int numStudents = Integer.parseInt(universities[j][4]);
      double maxNumStudents = maximum[4];
      double minNumStudents = minimum[4];
      double percentFemale = Double.parseDouble(universities[j][5]);
      double maxPercentFemale = maximum[5];
      double minPercentFemale = minimum[5];
      double SATVerbal = Double.parseDouble(universities[j][6]);
      double maxSATVerbal = maximum[6];
      double minSATVerbal = minimum[6];
      double SATMath = Double.parseDouble(universities[j][7]);
      double maxSATMath = maximum[7];
      double minSATMath = minimum[7];
      double expenses = Double.parseDouble(universities[j][8]);
      double maxExpenses = maximum[8];
      double minExpenses = minimum[8];
      double percentFinancialAid = Double.parseDouble(universities[j][9]);
      double maxPercentFinancialAid = maximum[9];
      double minPercentFinancialAid = minimum[9];
      int numApplicants = Integer.parseInt(universities[j][10]);
      double maxNumApplicants = maximum[10];
      double minNumApplicants = minimum[10];
      double percentAdmitted = Double.parseDouble(universities[j][11]);
      double maxPercentAdmitted = maximum[11];
      double minPercentAdmitted = minimum[11];
      double percentEnrolled = Double.parseDouble(universities[j][12]);
      double maxPercentEnrolled = maximum[12];
      double minPercentEnrolled = minimum[12];
      int academicsScale = Integer.parseInt(universities[j][13]);
      double maxAcademicsScale = maximum[13];
      double minAcademicsScale = minimum[13];
      int socialScale = Integer.parseInt(universities[j][14]);
      double maxSocialScale = maximum[14];
      double minSocialScale = minimum[14];
      int qualityOfLife = Integer.parseInt(universities[j][15]);
      double maxQualityOfLife = maximum[15];
      double minQualityOfLife = minimum[15];
      
      if(state.equals(university.getState())) {
        x1=0;
      }
      else {
        x1=1;
      }
      
      if(location.equals(university.getState())) {
        x2=0;
      }
      else {
        x2=1;
      }
      
      if(control.equals(university.getState())) {
        x3=0;
      }
      else {
        x3=1;
      }
      double schoolDistance = x1 + x2 + x3 + Math.abs(numStudents-university.getNumStudents())/Math.abs(maxNumStudents-minNumStudents) + Math.abs(percentFemale-university.getPercentFemale())/Math.abs(maxPercentFemale-minPercentFemale) + Math.abs(SATVerbal-university.getSATVerbal())/Math.abs(maxSATVerbal-minSATVerbal) + Math.abs(SATMath-university.getSATMath())/Math.abs(maxSATMath-minSATMath) + Math.abs(expenses-university.getExpenses())/Math.abs(maxExpenses - minExpenses) + Math.abs(percentFinancialAid-university.getPercentFinancialAid())/Math.abs(maxPercentFinancialAid - minPercentFinancialAid) + Math.abs(numApplicants-university.getNumApplicants())/Math.abs(maxNumApplicants - minNumApplicants) + Math.abs(percentAdmitted-university.getPercentAdmitted())/Math.abs(maxPercentAdmitted - minPercentAdmitted) + Math.abs(percentEnrolled-university.getPercentEnrolled())/Math.abs(maxPercentEnrolled - minPercentEnrolled) + Math.abs(academicsScale-university.getAcademicsScale())/Math.abs(maxAcademicsScale - minAcademicsScale) + Math.abs(socialScale-university.getSocialScale())/Math.abs(maxSocialScale - minSocialScale) + Math.abs(qualityOfLife-university.getQualityOfLife())/Math.abs(maxQualityOfLife - minQualityOfLife);
      distance[j][1] = Double.toString(schoolDistance);
      
    }
    
    for(int j = 0; j < distance[0].length; j++) {
      if(Double.parseDouble(distance[j+1][1]) < Double.parseDouble(distance[j][1])) {
        double tempDist = Double.parseDouble(distance[j][1]);
        distance[j][1] = distance[j+1][1];
        distance[j+1][1] = distance[j][1];
        String tempName = distance[j][0];
        distance[j][0] = distance[j+1][0];
        distance[j+1][0] = tempName;
      }
    }
    ArrayList<University> recommendedSchools = new ArrayList<University>();
    
    for(int i = 0; i<5; i++) {
      for(int j = 0; j < universities[0].length; j++) {
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
          University recommendedUniv = new University(school, state, location, control, numStudents, percentFemale, SATVerbal, SATMath, expenses, percentFinancialAid, numApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLife);
          recommendedSchools.add(recommendedUniv);
        }
      }
    }
    return recommendedSchools;
  }
  
  /**
   * 
   */
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
  public ArrayList<University> compare(String u1, String u2) {
    ArrayList<University> list = new ArrayList<University>();
    University univ1 = this.viewExistingUniversity(u1);
    University univ2 = this.viewExistingUniversity(u2);
    list.add(univ1);
    list.add(univ2);
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
   * @return ArrayList<University> an array list of university objects that matched search criteria
   */
  public ArrayList<University> searchUniversities(String mySchool, String myState, String myLocation,String myControl,int minNumStudents, int maxNumStudents,double minPercentFemale, double maxPercentFemale,double minSATVerbal, double maxSATVerbal,double minSATMath, double maxSATMath,double minExpenses, double maxExpenses,double minPercentFinancialAid, double maxPercentFinancialAid,int minNumApplicants, int maxNumApplicants,double minPercentAdmitted, double maxPercentAdmitted,double minPercentEnrolled, double maxPercentEnrolled,int minAcademicsScale, int maxAcademicsScale,int minSocialScale, int maxSocialScale,int minQualityOfLife, int maxQualityOfLife) 
  {
    String[][] universities = db.university_getUniversities();
    int rowLength = universities[0].length;
    //int colLength = universities[1].length; 
    ArrayList<University> matchUni = new ArrayList<University>();
    //int k = 0;
    for(int i = 0; i < rowLength; i++) {
      if(universities[i][0].contains(mySchool) 
           || mySchool.equals("0") 
           && universities[i][1].contains(myState) 
           || myState.equals("0") 
           && universities[i][2].equals(myLocation) 
           || myLocation.equals("0") 
           && universities[i][3].contains(myControl) 
           || myControl.equals("0") 
           && minNumStudents <= Integer.parseInt(universities[i][4]) 
           && Integer.parseInt(universities[i][4]) <= maxNumStudents 
           || minNumStudents <= Integer.parseInt(universities[i][4]) 
           && maxNumStudents == 0 
           && minPercentFemale <= Double.parseDouble(universities[i][5]) 
           && Double.parseDouble(universities[i][5]) <= maxPercentFemale 
           || minPercentFemale <= Double.parseDouble(universities[i][5]) 
           && maxPercentFemale == 0 
           && minSATVerbal <= Double.parseDouble(universities[i][6]) 
           && Double.parseDouble(universities[i][6]) <= maxSATVerbal 
           || minSATVerbal <= Double.parseDouble(universities[i][6]) 
           && maxSATVerbal == 0 
           && minSATMath <= Double.parseDouble(universities[i][7]) 
           && Double.parseDouble(universities[i][7]) <= maxSATMath 
           || minSATMath <= Double.parseDouble(universities[i][7]) 
           && maxSATMath == 0 
           && minExpenses <= Double.parseDouble(universities[i][8]) 
           && Double.parseDouble(universities[i][8]) <= maxExpenses 
           || minExpenses <= Double.parseDouble(universities[i][8]) 
           && maxExpenses == 0 
           && minPercentFinancialAid <= Double.parseDouble(universities[i][9]) 
           && Double.parseDouble(universities[i][9]) <= maxPercentFinancialAid 
           || minPercentFinancialAid <= Double.parseDouble(universities[i][9]) 
           && maxPercentFinancialAid == 0 
           && minNumApplicants <= Integer.parseInt(universities[i][10]) 
           && Integer.parseInt(universities[i][10]) <= maxNumApplicants 
           || minNumApplicants <= Integer.parseInt(universities[i][10]) 
           && maxNumApplicants == 0 
           && minPercentAdmitted <= Double.parseDouble(universities[i][11]) 
           && Double.parseDouble(universities[i][11]) <= maxPercentAdmitted 
           || minPercentAdmitted <= Double.parseDouble(universities[i][11]) 
           && maxPercentAdmitted == 0 
           && minPercentEnrolled <= Double.parseDouble(universities[i][12]) 
           && Double.parseDouble(universities[i][12]) <= maxPercentEnrolled 
           || minPercentEnrolled <= Double.parseDouble(universities[i][12]) 
           && maxPercentEnrolled == 0 
           && minAcademicsScale <= Integer.parseInt(universities[i][13]) 
           && Integer.parseInt(universities[i][13]) <= maxAcademicsScale 
           || minAcademicsScale <= Integer.parseInt(universities[i][13]) 
           && maxAcademicsScale == 0 
           && minSocialScale <= Integer.parseInt(universities[i][14]) 
           && Integer.parseInt(universities[i][14]) <= maxSocialScale 
           || minSocialScale <= Integer.parseInt(universities[i][14]) 
           && maxSocialScale == 0 
           && minQualityOfLife <= Integer.parseInt(universities[i][15]) 
           && Integer.parseInt(universities[i][15]) <= maxQualityOfLife 
           || minQualityOfLife <= Integer.parseInt(universities[i][15]) 
           && maxQualityOfLife == 0) {
        University univ = new University(universities[i][0],universities[i][1],universities[i][2],universities[i][3],Integer.parseInt(universities[i][4]),Double.parseDouble(universities[i][5]),Double.parseDouble(universities[i][6]),Double.parseDouble(universities[i][7]),Double.parseDouble(universities[i][8]),Double.parseDouble(universities[i][9]),Integer.parseInt(universities[i][10]),Double.parseDouble(universities[i][11]),Double.parseDouble(universities[i][12]),Integer.parseInt(universities[i][13]),Integer.parseInt(universities[i][14]),Integer.parseInt(universities[i][15]));
        matchUni.add(univ);
      }
    }
    return matchUni;
  }
  
  /**
   * A method to view a List of all universities in the DB
   * 
   * @return ArrayList of all the universities
   */
  public ArrayList<University> getAllUniversities()
  {
	  String [][] univs = db.university_getUniversities();
	  ArrayList<University> result = new ArrayList<University>();
	  for(int i = 0; i < univs.length; i++) 
	  {
		University uni = new University(univs[i][0], univs[i][1], univs[i][2], univs[i][3], Integer.parseInt(univs[i][4]), Double.parseDouble(univs[i][5]), Double.parseDouble(univs[i][6]), Double.parseDouble(univs[i][7]), Double.parseDouble(univs[i][8]), Double.parseDouble(univs[i][9]), Integer.parseInt(univs[i][10]), Double.parseDouble(univs[i][11]), Double.parseDouble(univs[i][12]), Integer.parseInt(univs[i][13]), Integer.parseInt(univs[i][14]), Integer.parseInt(univs[i][15]) ) ;
		result.add(uni);
	  }
		 return result;
  }
  
  /**
   * A method that Lists all of the users in the DB
   * @return List<User> a list of all the users 
   */
  public List<User> getAllUsers() {
    ArrayList<User> userList = new ArrayList<User>();
    String[][]usersInfo = db.user_getUsers();
    for(int j=0; j<usersInfo.length; j++) {
      User user = new User(usersInfo[j][0],usersInfo[j][1],usersInfo[j][2],usersInfo[j][3],usersInfo[j][4].charAt(0), usersInfo[j][5].charAt(0));
      userList.add(user);
    }
    return userList;  
  }
  
  /**
   * method to view retrieve a users info from the database and display it. 
   * @param username the active users username 
   */
  public User viewUser(String username)
  {
    String[] userInfo = new String[6];
    String[][] users = db.user_getUsers();
    for (int i = 0; i < users.length; i++)
    {
      if (users[i][2].equals(username))
      {
        for(int s = 0; s < 6; s++)
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
    char status = userInfo[5].charAt(0);
    
    User user1 = new User(first, last, user, password, userType, status);
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
  public ArrayList<University> viewSavedSchools(String username) 
  {
    String[][] universities = db.university_getUniversities();
    ArrayList<University> savedSchools = new ArrayList<University>();
    String[][] users = db.user_getUsernamesWithSavedSchools();
    String[][] userSavedSchools = new String[users.length][];
    int k = 0;
    if(!(users == null)) {
    for(int i = 0; i < users.length; i++) {
    	if(users[i][0].equals(username)) {
    		userSavedSchools[k] = users[i][1];
    		k++;
    	}
    }
    
    
    for(int i = 0; i < userSavedSchools.length; i++) {
    	for(int j = 0; j < universities.length; j++) {
        	if(userSavedSchools[i].equals(universities[j][0])) {
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
                University savedUniv = new University(school, state, location, control, numStudents, percentFemale, SATVerbal, SATMath, expenses, percentFinancialAid, numApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLife);
                savedSchools.add(savedUniv);
        	}
        }
    }
    }
    return savedSchools;
    }
  
  
  public int removeUniversity(String name)
  {
   String[][] howMany = db.university_getNamesWithEmphases();
   for(int i = 0; i < howMany.length; i++) {
    if(howMany[i][0].equals(name)) {
     String emphasis = howMany[i][1];
     db.university_removeUniversityEmphasis(name, emphasis);
    }
   }
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
  public University viewExistingUniversity(String university) {
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
      if (universities[i][0].equals(university)) {
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
   * @return integer 1 if school successfully added, -1 otherwise
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
   * @return integer representation of the deactivation, 1 means successful, -1 means unsuccessful
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
   String[][] howMany = db.user_getUsernamesWithSavedSchools();
   if(!(howMany == null)) {
   for(int x = 0; x < howMany.length; x++) {
    String school = howMany[x][1];
    db.user_removeSchool(username, school);
   }
   }
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
    int result = db.user_addUser(first, last, user, pass, 't');
    this.deactivateUser(user);
    return result;
  }
  
  /** @Description a swap method to assist in sorting universities 
   * 
   * @param U1 the first university to be swapped
   * @param U2 the second university to be swapped
   * 
   */
 public void swap(University U1, University U2) 
 {
   University temp = U1;
   U1 = U2;
   U2 = temp;
 }

 /** @Description sort a users saved schools by percent of students admitted
   * 
   * @param username   the username supplied for retrieving a list of saved schools
   * 
   * @return byAcceptance
   */
 public ArrayList<University> sortByAcceptance(String username) 
  {
    //make an ArrayList of the users saved schools and assign them a position
    ArrayList<University> byAcceptance = viewSavedSchools(username); 
    //University[] byAcceptance = acceptance.toArray();
    
    //sort the list in descending order
    for(int i = 0; i < byAcceptance.size(); i++) {
      if(byAcceptance.get(i).getPercentAdmitted() > byAcceptance.get(i+1).getPercentAdmitted()) {
        swap(byAcceptance.get(i), byAcceptance.get(i+1));
      }
    return byAcceptance;
  }
 }
    
    

 /** @Description sort a users saved schools by price
   * 
   * @param username   the username supplied for retrieving a list of saved schools
   * 
   * @return byExpenses
   */
 public ArrayList<University> sortByExpenses(String username) 
 {
    //make an ArrayList of the users saved schools and assign them a position
    ArrayList<University> byExpenses = new ArrayList<University>();
    byExpenses = viewSavedSchools(username);
    
    //sort the list in descending order
    for(int i = 0; i < byExpenses.size(); i++) {
      if(byExpenses.get(i).getExpenses() > byExpenses.get(i+1).getExpenses()) {
        swap(byExpenses.get(i), byExpenses.get(i+1));
      }
    return byExpenses;
    }
  }
    

 /** @Description sort a users saved schools by number of students 
   *              attending the school
   * 
   * @param username  the username supplied for retrieving a list of saved schools
   * 
   * @return      byNumStudents
   */
 public ArrayList<University> sortByNumStudents(String username)
 {
    //make an ArrayList of the users saved schools and assign them a position
    ArrayList<University> byNumStudents = new ArrayList<University>();
    byNumStudents = viewSavedSchools(username);
    
    //sort the list in descending order
    for(int i = 0; i < byNumStudents.size(); i++) {
      if(byNumStudents.get(i).getNumStudents() > byNumStudents.get(i+1).getNumStudents()) {
        swap(byNumStudents.get(i), byNumStudents.get(i+1);
      }
    return byNumStudents;
    }
  }

