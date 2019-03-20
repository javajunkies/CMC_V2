package CMC;
/**
 * @author Java Junkies
 *
 *User interactions class
 */
public class UserInteraction 
{

 /**
  * Constructor
  */
 public UserInteraction() {
  
 }
 
 //objects
 UserController UserController = new UserController();
 AccountController AccountController = new AccountController();
 UniversityController UniversityController = new UniversityController();
 
 /**
  * login method
  * 
  * @param username - user's username
  * @param password - user's password
  */
 public void login(String username, String password)
 {
  UserController.login(username, password);
 }
 
 /**
  * logs the user off from CMC
  */
 public void logoff()
 {
  UserController.logoff();
 }
 
 public void viewExistingUniversity(University university) {
   UserController.viewExistingUniversity(University university);
 }
 
 /**
  * calls the UserController to view a users saved schools
  * 
  * @param user - username of user
  */
 public void viewSavedSchools(String username)
 {
  UserController.viewSavedSchools(username);
 }
 
 
 /**
  * This method calls the UserController to complete the search algorithm
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
  */
 public void searchForSchools(String mySchool,String myState,String myLocation,String myControl,int minNumStudents, int maxNumStudents,double minPercentFemale, double maxPercentFemale,double minSATVerbal, double maxSATVerbal,double minSATMath, double maxSATMath,double minExpenses, double maxExpenses,double minPercentFinancialAid, double maxPercentFinancialAid,int minNumApplicants, int maxNumApplicants,double minPercentAdmitted, double maxPercentAdmitted,double minPercentEnrolled, double maxPercentEnrolled,int minAcademicsScale, int maxAcademicsScale,int minSocialScale, int maxSocialScale,int minQualityOfLife, int maxQualityOfLife)
 {
  UserController.search(mySchool, myState, myLocation, myControl, minNumStudents, maxNumStudents, minPercentFemale, maxPercentFemale, minSATVerbal, maxSATVerbal, minSATMath, maxSATMath, minExpenses, maxExpenses, minPercentFinancialAid, maxPercentFinancialAid, minNumApplicants, maxNumApplicants, minPercentAdmitted, maxPercentAdmitted, minPercentEnrolled, maxPercentEnrolled, minAcademicsScale, maxAcademicsScale, minSocialScale, maxSocialScale, minQualityOfLife, maxQualityOfLife);
 }
 
 /**
  * registers the user if password is 8 characters long 
  * and contains a letter and number
  * 
  * @param first - first name
  * @param last - last name
  * @param password - desired password
  */
 public void register(String first, String last, String password)
 {
  if (password.length == 8 && password.contains("[a-zA-Z]*") && password.contains("[0-9]*"))
  {
   AccountController.register(first, last, password);
  }
 }
 
 /**
  * Sorts saved schools by criteria
  * 
  * @param price - price of schools
  * @param numOfStudents - number of students at school
  * @param percentAdmitted - acceptance rate
  * @param user - username to get saved schools
  */
 public void sortSavedSchools(int price, int numOfStudents, int percentAdmitted, String user)
 {
  UniversityController.sortSavedSchools(price, numOfStudents, percentAdmitted, user);
 }
 
 /**
  * gets list of recommended universities 
  * 
  * @param university - school
  */
 public void getRecommendedList(University university)
 {
  UserController.getRecommendedList(university);
 }
 
 /**
  * Removes school from list of saved school
  * 
  * @param user - current user
  * @param school - school to remove
  */
 public void removeSavedSchool(String user, String school)
 {
  UserController.removeSavedSchool(user, school);
 }
 
 /**
  * Saves the school to user's list
  * 
  * @param university
  */
 public void saveSchool(University university)
 {
  UserController.saveSchool(university);
 }
 
 /**
  * calls the UserController to compare two schools
  * 
  * @param u1
  * @param u2
  */
 public void compare(University u1, University u2)
 {
  UserController.compare(u1,u2);
 }

 /**
  * gets users information
  * 
  * @param user - username
  */
 public void viewUserInfo(String user)
 {
  UserController.viewUserInfo(user);
 }
 
 /**
  * edit a user's information
  * 
  * @param userName - username
  * @param firstName - first name
  * @param lastName - last name
  * @param password - password
  */
 public void editUserInfo(String userName, String firstName, String lastName, String password)
 {
  UserController.editUserInfo(userName, firstName, lastName, password);
 }
 
}