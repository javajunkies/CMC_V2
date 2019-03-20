/**
 * File: AdminController.java
 */

package CMC;
import java.util.*;

/**
 * Controller class that handles all of Admin functionalities
 * 
 * @ author Java Junkies
 * @version March 19, 2019
 */

public class AdminController {

  // Creating instances of the other classes being used.
  DBController dbcontroller = new DBController();
  LoginController logInController = new LoginController();

/**
 * Calls the login method, passing the specified parameters.
 *   
 * @param username is the username used to login with
 * @param password is the password used to login with
 */
  
  public int login(String username, String password) {
    return logInController.login(username, password);
  }

  /**
   * Calls the logoff method from DBController.
   */
  
  public void logoff(){
    logInController.logoff();
  }

  /**
   * Calls the getAllUniversities method from DBController.
   */
  
  public void viewUniversities() {
    dbcontroller.getAllUniversities();
  }

  /**
   * Calls the removeUniversity method from DBController.
   * 
   * @param name is the name of the university being romved
   */
  
  public int removeUniversity(String name) {
    return dbcontroller.removeUniversity(name); 
  }

  /**
   * Calls the addUniversity method from DBController.
   * 
   * @param school is the name of the school
   * @param state is the state that the school is located
   * @param location is the type of area in which the school is located (i.e. Suburban, Small-city, ...)
   * @param control specifies who controls the university (i.e. Public, Private, ...)
   * @param numberOfStudents is the number of students at this university
   * @param percentFemales is the percentage of females at this university
   * @param SATVerbal is the average SAT Verbal score, out of 800, for the students at this university
   * @param SATMath is the average SAT Math score, out of 800, for the students at this university
   * @param expenses is the annual tuition for this university
   * @param percentFinancialAid is the percentage of students who received some sort of financial aid from this university
   * @param numberOfApplicants is the number of students who typically apply to this university
   * @param percentAdmitted is the percentage of students who are admitted annually to this university
   * @param percentEnrolled is the percentage of students who are currently enrolled at this university
   * @param academicsScale is an integer between 1 and 5 (5 being the best) indicating the quality of academics at this university 
   * @param socialScale is an integer between 1 and 5 (5 being the best) indicating the quality of the social life at this university
   * @param qualityOfLifeScale is an integer between 1 and 5 (5 being the best) indicating the overall quality of life at this university
   */
  
  public int addUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
                               double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
    return dbcontroller.addUniversity(school, state, location, control, numberOfStudents,
                               percentFemales, SATVerbal, SATMath, expenses, 
                               percentFinancialAid, numberOfApplicants, percentAdmitted, 
                               percentEnrolled, academicsScale, socialScale, qualityOfLifeScale) ;
  }

  /**
   * Calls the editUniversity method from DBController
   * 
   * @param school is the name of the school
   * @param state is the state that the school is located
   * @param location is the type of area in which the school is located (i.e. Suburban, Small-city, ...)
   * @param control specifies who controls the university (i.e. Public, Private, ...)
   * @param numberOfStudents is the number of students at this university
   * @param percentFemales is the percentage of females at this university
   * @param SATVerbal is the average SAT Verbal score, out of 800, for the students at this university
   * @param SATMath is the average SAT Math score, out of 800, for the students at this university
   * @param expenses is the annual tuition for this university
   * @param percentFinancialAid is the percentage of students who received some sort of financial aid from this university
   * @param numberOfApplicants is the number of students who typically apply to this university
   * @param percentAdmitted is the percentage of students who are admitted annually to this university
   * @param percentEnrolled is the percentage of students who are currently enrolled at this university
   * @param academicsScale is an integer between 1 and 5 (5 being the best) indicating the quality of academics at this university 
   * @param socialScale is an integer between 1 and 5 (5 being the best) indicating the quality of the social life at this university
   * @param qualityOfLifeScale is an integer between 1 and 5 (5 being the best) indicating the overall quality of life at this university
   */
  
  public int editUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                               int academicsScale, int socialScale, int qualityOfLifeScale) {
    return dbcontroller.editUniversity(school, state, location, control, numberOfStudents,
                               percentFemales, SATVerbal, SATMath, expenses, 
                               percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, 
                               academicsScale, socialScale, qualityOfLifeScale);
  }

  /**
   * Calls the edit user for admin from DBControler
   * 
   * @param username is the username associated with this account
   * @param firstName is the first name associated with this account
   * @param lastName is the last name associated with this account
   * @param password is the password associated with this account
   * @param type is the type of this account
   * @param status is the status of this account
   */
  
  public int editUser(String username, String firstName, String lastName, String password, char type, char status) {
    return dbcontroller.adminEditUser(username, firstName, lastName, password, type, 
                               status);
  } 

  /**
   * Calls the getAllUsers method from DBController
   * 
   * @return A list of user objects
   */
  
  public List<User> viewUsers() {
    return dbcontroller.getAllUsers();
  } 

  /**
   * Checks to see if a certain username is unique
   * 
   * @param username is the username that is being checked for uniqueness
   * @return a boolean representation of if the specified username is unique
   */
  
  public boolean isUniqueUsername(String username) {
	  if(dbcontroller.isUniqueUsername(username)) {
		  return true;
	  }
    return false;
  }

  /**
   * Calls the createUser method from DBController and passing it the required parameters
   * 
   * @param firstName is the first name of the new user
   * @param lastName is the last name of the new user
   * @param username is the username of the new user
   * @param password is the password of the new user
   * @param type is the type of new user
   */
  
  public int addNewUser(String firstName, String lastName, String username, String password, char type) {
    return dbcontroller.createUser(firstName, lastName, username, password, type);
  } 
  
  /**
   * Calls the viewUser method from DBController
   * 
   * @param username is the user being viewed
   * @return User object of the specified user
   */
  
  public User viewUserInfo(String username)
  {
    return dbcontroller.viewUser(username);
  }
  
  /**
   * Deactivates an user
   * 
   * @param username is the user being deactivated
   */
  
  public int deactivateUser(String username)
  {
    return dbcontroller.deactivateUser(username);
  }
} 