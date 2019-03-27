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
  *@return int the status of the login
  */
 public int login(String username, String password) {
  return logInController.login(username, password);
 }
 
 /**
  * method to log the user off the CMC system
  *@return int the status of the users log off
  */
 public int logoff() {
  return logInController.logoff();
 }
 
 /**
  * views a university in the database
  * @param university the university to find information for
  * @return University A university from the database
  */
 public University viewExistingUniversity(String university) {
   return dbcontroller.viewExistingUniversity(university);
 }
 
 /**
  * call the DBController to find a users saved schools
  * @param username the users username
  * @return ArrayList a list of the users saved schools
  */
 public ArrayList<University> viewSavedSchools(String username) {
  return dbcontroller.viewSavedSchools(username);
 }
 
 /**
  * finds recommended schools based a certain school
  * @param list a university that will be used as a basis for recomendations
  * @return ArrayList<University> a list of recommended universities
  */
 /*public ArrayList<University> getRecommendedList(University university) {
  return dbcontroller.getRecommendations(university);
 }*/

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
  * 
  * @return ArrayList a list of universities that met search criteria
  */
/* public ArrayList<University> search(String mySchool,String myState,String myLocation,String myControl,int minNumStudents, int maxNumStudents,double minPercentFemale, double maxPercentFemale,double minSATVerbal, double maxSATVerbal,double minSATMath, double maxSATMath,double minExpenses, double maxExpenses,double minPercentFinancialAid, double maxPercentFinancialAid,int minNumApplicants, int maxNumApplicants, double minPercentAdmitted, double maxPercentAdmitted,double minPercentEnrolled, double maxPercentEnrolled,int minAcademicsScale, int maxAcademicsScale,int minSocialScale, int maxSocialScale,int minQualityOfLife, int maxQualityOfLife)
 {
  return dbcontroller.searchUniversities(mySchool, myState, myLocation, myControl, minNumStudents, maxNumStudents, minPercentFemale, maxPercentFemale, minSATVerbal, maxSATVerbal, minSATMath, maxSATMath, minExpenses, maxExpenses, minPercentFinancialAid, maxPercentFinancialAid, minNumApplicants, maxNumApplicants, minPercentAdmitted, maxPercentAdmitted, minPercentEnrolled, maxPercentEnrolled, minAcademicsScale, maxAcademicsScale, minSocialScale, maxSocialScale, minQualityOfLife, maxQualityOfLife);
 }*/
 
 /**
  * Saves a school to the users list of saved schools
  * 
  * @param username a username to save the school to
  * @param university a university object to be saved to the users saved schools list
  * @return int the status of saving the school
  */
 public int saveSchool(String username, String university) {
   return dbcontroller.addToSaved(username, university);
 }
 
 /**
  *finds information for two schools to be compared
  *
  *@param univ1 A university to be compared to univ2
  *@param univ2 A university to be compared to univ1
  *@return ArrayList list of two universities to compare
  */
 public ArrayList<University> compare(String univ1, String univ2) {
  return dbcontroller.compare(univ1, univ2);
 }
 
 /**
  * calls the DBController to update the users information
  *  
  *@param username the users username
  *@param firstname the users new first name 
  *@param lastname the users new last name
  *@param password the users new password
  *
  *@return int the status of the editing user info
  */
 public int editUserInfo(String username, String firstname, String lastname, String password) {
  return dbcontroller.userEditUser(username, firstname, lastname, password);
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
  *@return int the status of removing the saved school
  */
 public int removeSavedSchool(String user, String school) {
  return dbcontroller.removeFromSaved(user, school);
 }
 
 /**
  *gets the users information
  *@param username the username to return information for
  *@return User a user object with their information
  */
 public User viewUserInfo(String username) {
  return dbcontroller.viewUser(username);
 }
 
}
