package CMC;
import java.util.*;

/**
 * @ author bwest001
 */
public class AdminController {

  // Creating instances of the other classes being used.
  DBController dbcontroller = new DBController();
  LoginController logInController = new LoginController();
  AccountController accountController = new AccountController();

/**
 * Calls the login method, passing the specified parameters.
 *   
 * @param username is the username used to login with
 * @param password is the password used to login with
 */
  
  public void login(String username, String password) {
    dbcontroller.login(username, password);
  }

  /**
   * Calls the logoff method from DBController.
   */
  
  public void logoff(){
    dbcontroller.logoff();
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
  
  public void removeUniversity(String name) {
    dbcontroller.removeUniversity(name); 
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
  
  public void addUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
                               double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
    dbcontroller.addUniversity(school, state, location, control, numberOfStudents,
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
  
  public void editUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                               int academicsScale, int socialScale, int qualityOfLifeScale) {
    dbcontroller.editUniversity(school, state, location, control, numberOfStudents,
                               percentFemales, SATVerbal, SATMath, expenses, 
                               percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, 
                               academicsScale, socialScale, qualityOfLifeScale);
  }

  public void editUser(String username, String firstName, String lastName, String password, char type, char status) {
    dbcontroller.adminEditUser(username, firstName, lastName, password, type, 
                               status);

  } 

  public List<User> viewUsers() {
    return dbcontroller.getAllUsers();
  } 
  
/**
 * 
 * @param username
 * @return boolean if username is unique, returns true
 */
  public boolean isUniqueUsername(String username) {
	  if(dbcontroller.isUniqueUsername(username)) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }

  /**
   * 
   * @param firstName
   * @param lastName
   * @param username
   * @param password
   * @param type
   * 
   * @return boolean if password is valid and type is either u or a
   */
  public boolean addNewUser(String firstName, String lastName, String username, String password, char type) {
	  if(accountController.checkPasswordCriteria(password) == true) {
		  if(type =='u' || type == 'a'){
			  dbcontroller.createUser(firstName, lastName, username, password, type);
			  return true.
		  }
		  else {
			  return false;
		  }
	  }
	  else {
		  return false;
	  }
	  
  } 
  
  
  //to implement:
  
  public void viewUserInfo(String username)
  {
    
  }
  
  public void editAdmin(String userName, String firstName, String lastName, String password, char type, char status)
  {
    
  }
  
  /**
   * 
   * @param username
   * 
   * @return 
   */
  public void deactivateUser(String username)
  {
    
  }
  
} 