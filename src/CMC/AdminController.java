package CMC;

/**
 * @ author bwest001
 */
public class AdminController {

  DBcontroller dbcontroller = new DBController();
  LoginController logInController = new LogonController();


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
    dbcontroller.removeUniversity(String name); 
  }

  public void addUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentFinancialAid, 
                               int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                               int academicsScale, int socialScale, int qualityOfLifeScale) {
    dbcontroller.addUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentFinancialAid, 
                               int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                               int academicsScale, int socialScale, int qualityOfLifeScale) ;
  }


  public void editUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentFinancialAid, 
                               int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                               int academicsScale, int socialScale, int qualityOfLifeScale) {
    dbcontroller.editUniversity(String school, String state, String location, String control, int numberOfStudents,
                               double percentFemales, double SATVerbal, double SATMath, double expenses, 
                               double percentFinancialAid, int numberOfApplicants, double percentFinancialAid, 
                               int numberOfApplicants, double percentAdmitted, double percentEnrolled, 
                               int academicsScale, int socialScale, int qualityOfLifeScale);
  }

  public void editUser(String username, String firstName, String lastName, String password, char type, char status) {
    dbcontroller.adminEditUser(String username, String firstName, String lastName, String password, char type, 
                               char status);

  } 

  public List<User> viewUsers() {
    dbcontroller.getUsers();
  } 

  public boolean searchUsers(String username) {
    dbcontroller.searchUsers(String username);
  }

  public void addNewUser(String firstname, String lastName, String username, String password, String type) {
    dbcontroller.createUser(String firstName, String lastName, String username, String password, char type);
  } 
} 