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
    // TODO Auto-generated constructor stub
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
  
  public boolean createUser(String firstName, String lastName, String username, String password, char type)
  {
    db.user_addUser(firstName, lastName, username, password, type);
    if(type == 'a') {
      User user = new User(firstName, lastName, username, password, type);
      return true;
    }
    else
    {
      User admin = new User(firstName, lastName, username, password, type);
      return true;
    }
  }
  
  /**
   * method to search for a university 
   * @param state the search criteria
   * @param numberOfStudents the search criteria
   */
  public String[] searchUniversities(String state, int numberOfStudents) 
  {
    String[][] universities = db.university_getUniversities();
    int rowLength = universities[0].length;
    int colLength = universities[1].length; 
    String[] matchUni;
    int k = 0;
    
    for(int i = 0; i < rowLength; i++) {
      for(int j = 0; j < colLength; j++) {
        if(universities[i][1].equals(state)  && Integer.parseInt(universities[i][4]) < numberOfStudents) {     //  <--- fix this boy
          matchUni[k] = universities[i][0];
          k++;
        }
      }
    }
    return matchUni;
  }
  
  
  /**
   * method to view a list of all universities
   * 
   */
  public String[][] getAllUniversities()
  {
    return db.university_getUniversities();
  }
  
  /**
   * view all users in database
   */
  public List<User> getAllUsers() {
    //User user=new User();
    ArrayList<User> userList = new ArrayList<User>();
    String[][]usersInfo = db.user_getUsers();
    for(int j=0; j<usersInfo[1].length; j++) {
      //String first = usersInfo[j][0];
      //String last = usersInfo[j][1];
      //String username = usersInfo[j][2];
      //String password = usersInfo[j][3];
      //char type = usersInfo[j][4];
      User user = new User(usersInfo[j][0],usersInfo[j][1],usersInfo[j][2],usersInfo[j][3],usersInfo[j][4].charAt(0));
      userList.add(user);
    }
    return userList;  
  }
  
  /**
   * @param username the active users username 
   * method to view retrieve a users info from the database and display it. 
   */
  public User viewUser(String username)
  {
    
    String[][] users = db.user_getUsers();
    for (int i = 0; i < users[1].length; i++)
    {
      if (users[i][2] == username)
      {
        String [] userInfo;
        for(String s : userInfo)
        {
          userInfo[s] = users[i][s];
        }
      }
    }
    String first = userInfo[0];
    String last = userInfo[1];
    String username = userInfo[2];
    String password = userInfo[3];
    String userType = userInfo[4];
    char uT = userType.charAt(0);
    
    User user = new User(first, last, username, password, uT);
    return user;  
  }
  
  
  
  /**
   * @param firstName the new username to be updated
   * @param lastName the new lastname to be updated
   * @param password the new password to be updated
   * 
   * method to edit the current users information that is stored in the database
   */
  public int adminEditUser(String firstName, String lastName, String username, String password, char type, char status)
  {
    return db.user_editUser(username, firstName, lastName, password, type, status);
  }
  
  public int userEditUser(String username, String first, String last, String password) {
	  return db.user_editUser(username, first, last, password, 'u', 'Y');
  }
  /**
   * @param price price of the school 
   * @param numStudents number of students attending the university 
   * @param acceptanceRate acceptance rate of the university
   * @param username username 
   * 
   * a method to sort a users Saved schools
   */
  public void sortSavedSchools(int price, int numStudents, int acceptanceRate, String username) 
  {
    
  }
  
  public void login(String username, String password)
  {
    
  }
  
  public void logoff()
  {
    
  }
  
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
  
  public int editUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                               int academicsScale, int socialScale, int qualityOfLifeScale) 
  {
   return db.university_editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale); 
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
  
  public void viewSavedSchools(String username)
  {

  }

public void searchUniversities(List<String> schools)
{

}

public int addToSaved(String username, String university)
{
	return db.user_saveSchool(username, university);
}

public int removeFromSaved(String username, String university)
{
	return db.user_removeSchool(username, university);
}
  
  
}