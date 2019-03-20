package CMC;
import java.util.*;

/**
 * @author javajunkies
 */
public class UserController {
 
 DBController dbcontroller = new DBController();
 LoginController logInController = new LoginController();
 
 /**
  *Logs the user onto their account
  *@param username the users unique username
  *@param password the users password
  */
 public int login(String username, String password) {
  return logInController.login(username, password);
 }
 
 /**
  * method to log the user off the CMC system
  *
  */
 public int logoff() {
  return logInController.logoff();
 }
 
 public void viewExistingUniversity(University university) {
   dbcontroller.viewExistingUniversity(University university);
 }
 
 /**
  * finds a users saved schools
  * @param username the users username
  */
 public void viewSavedSchools(String username) {
  dbcontroller.viewSavedSchools(username);
 }
 
 /**
  * finds recommended schools based a certain school
  * @param list a university that will be used as a basis for recomendations
  */
 public void getRecommendedList(University university) {
  dbcontroller.getRecommendations(university);
 }

 /**
  * This method calls the DBController to complete the search algorithm
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
 public void search(String mySchool,String myState,String myLocation,String myControl,int minNumStudents, int maxNumStudents,double minPercentFemale, double maxPercentFemale,double minSATVerbal, double maxSATVerbal,double minSATMath, double maxSATMath,double minExpenses, double maxExpenses,double minPercentFinancialAid, double maxPercentFinancialAid,int minNumApplicants, int maxNumApplicants, double minPercentAdmitted, double maxPercentAdmitted,double minPercentEnrolled, double maxPercentEnrolled,int minAcademicsScale, int maxAcademicsScale,int minSocialScale, int maxSocialScale,int minQualityOfLife, int maxQualityOfLife)
 {
  dbcontroller.searchUniversities(mySchool, myState, myLocation, myControl, minNumStudents, maxNumStudents, minPercentFemale, maxPercentFemale, minSATVerbal, maxSATVerbal, minSATMath, maxSATMath, minExpenses, maxExpenses, minPercentFinancialAid, maxPercentFinancialAid, minNumApplicants, maxNumApplicants, minPercentAdmitted, maxPercentAdmitted, minPercentEnrolled, maxPercentEnrolled, minAcademicsScale, maxAcademicsScale, minSocialScale, maxSocialScale, minQualityOfLife, maxQualityOfLife);
 }
 
 /**
  * Saves a school to the users list of saved schools
  * @param username a username to save the school to
  * @param university a university object to be saved to the users saved schools list
  */
 public void saveSchool(String username, String university) {
   dbcontroller.addToSaved(username, university);
 }
 
 /**
  *finds information for two schools to be compared
  *@param univ1 A university to be compared to univ2
  *@param univ2 A university to be compared to univ1
  */
 public void compare(University univ1, University univ2) {
  dbcontroller.compare(univ1, univ2);
 }
 
 /**
  * updates the users information 
  *@param username the users username
  *@param firstname the users new first name 
  *@param lastname the users new last name
  *@param password the users new password
  */
 public void editUserInfo(String username, String firstname, String lastname, String password) {
  dbcontroller.userEditUser(username, firstname, lastname, password);
 }
 
 /**
  *checks if the users password matches the password on the account
  *@param p the users password 
  *@return boolean 
  */
 /**
  *public boolean getPassword(String p) {
  *dbcontroller.getPassword(p);
  *
  * }
  */
 
 /**
  * Removes a school from the users saved school list
  *@param user the users username
  *@param school the name of the school to be removed from the desired users saved school list
  */
 public int removeSavedSchool(String user, String school) {
  return dbcontroller.removeFromSaved(user, school);
 }
 
 /**
  *gets the users information
  *@param username the username to return information for
  */
 public User viewUserInfo(String username) {
  return dbcontroller.viewUser(username);
 }
 
}
