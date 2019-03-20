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
 
 /**
  * finds a users saved schools
  * @param username the users username
  */
 public void viewSavedSchools(String username) {
  dbcontroller.getUserSavedSchools(username);
 }
 
 /**
  * finds recommended schools based a certain school
  * @param list a university that will be used as a basis for recomendations
  */
 public void getRecommendedList(University university) {
  dbcontroller.getRecommendations(university);
 }

 /**
  * Searches for schools matching the entered criteria
  * @param schools a list containing desired search criteria
  */
 public void search(List<String> schools) {
  dbcontroller.searchUniversities(schools);
  ////???????????
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
