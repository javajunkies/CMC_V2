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
 public void login(String username, String password) {
  dbcontroller.login(username, password);
 }
 
 /**
  * method to log the user off the CMC system
  *
  */
 public void logoff() {
  dbcontroller.logoff();
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
 public void getRecommendedList(List<University> list) {
  dbcontroller.getRecommendedList(list);
 }

 /**
  * Searches for schools matching the entered criteria
  * @param schools a list containing desired search criteria
  */
 public void search(List<String> schools) {
  dbcontroller.searchUniversities(schools);
 }
 
 /**
  * Saves a school to the users list of saved schools
  * @param username a username to save the school to
  * @param university a university object to be saved to the users saved schools list
  */
 public void saveSchool(String username, String university) {
  //dbcontroller.user_saveSchool(username, university);
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
 public void editUserInfo(String username, String fistname, String lastname, String password) {
  dbcontroller.user_editUser(username, firstname, lastname, password);
 }
 
 /**
  *checks if the users matches the password on the account
  *@param p the users password 
  *@return boboolean if the users entered password  
  */
 public boolean getPassword(String p) {
  dbcontroller.getPassword(p);
 }
 
 /**
  * Removes a school from the users saved school list
  *@param user the users username
  *@param school the name of the school to be removed from the desired users saved school list
  */
 public void removeSavedSchool(String user, String school) {
  dbcontroller.removeFromSaved(user, school);
 }
 
 /**
  *gets the users information
  *@param username the username to return information for
  */
 public void viewUserInfo(String username) {
  dbcontroller.viewUser(username);
 }
 
 /**
  *   
  */
 public UserController() {
  // TODO Auto-generated constructor stub
 }

}
