package CMC;
import java.util.*;

/**
 * @ author bwest001
 */
public class AdminController {

  DBController dbcontroller = new DBController();
  LoginController logInController = new LoginController();


  public void login(String username, String password) {
    dbcontroller.login(username, password);
  }

  public void logoff(){
    dbcontroller.logoff();
  }

  public void viewUniversities() {
    dbcontroller.getAllUniversities();
  }

  public void removeUniversity(String name) {
    dbcontroller.removeUniversity(name); 
  }

  public void addUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
                               double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) {
    dbcontroller.addUniversity(school, state, location, control, numberOfStudents,
                               percentFemales, SATVerbal, SATMath, expenses, 
                               percentFinancialAid, numberOfApplicants, percentEnrolled, 
                               academicsScale, socialScale, qualityOfLifeScale) ;
  }


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
    dbcontroller.getUsers();
  } 

  public boolean searchUsers(String username) {
    dbcontroller.searchUsers(username);
  }

  public void addNewUser(String firstName, String lastName, String username, String password, String type) {
    dbcontroller.createUser(firstName, lastName, username, password, type);
  } 
} 