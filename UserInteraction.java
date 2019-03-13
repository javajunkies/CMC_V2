/**
 * @author Justin Brakob
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
 //User User = new User();
 AccountController AccountController = new AccountController();
 UniversityController UniversityController = new UniversityController();
 
 /**
  * login method
  * 
  * @param username - user's username
  * @param password - user's password
  */
 public void login(String username, String password);
 {
  UserController.login(username, password);
 }
 
 /**
  * logs the user off from CMC
  */
 public void logoff()
 {
  UserController.logoff()
 }
 
 /**
  * gets list of saved schools
  * 
  * @param user - username of user
  */
 public void viewSavedSchools(String user)
 {
  UserController.viewSavedSchools(user);
  //User.savedSchools(Universities);
 }
 
 /**
  * searches for schools        ?????
  * 
  * @param I - information
  */
 public void searchForSchools(List<String> I)
 {
  SearchController(I);
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
  if (password.length = 8 && password.contains("[a-zA-Z]*") && password.contains("[0-9]*"))
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
 public sortSavedSchools(int price, int numOfStudents, int percentAdmitted, String user)
 {
  UniversityController.sortSavedSchools(price, numOfStudents, percentAdmitted, user);
 }
 
 /**
  * gets list of recommended universities 
  * 
  * @param university - school
  */
 public getRecommendedList(String university)   //List<University>)
 {
  UserController.getRecommendedList(university)
 }
 
 /**
  * Removes school from list of saved school
  * 
  * @param user - current user
  * @param school - school to remove
  */
 public void removeSavedSchool(String user, University school)
 {
  UserController.removeSavedSchool(user, school)
 }
 
 /**
  * Searches database of schools
  * 
  * @param search - search criteria
  */
 public void search(List<string> search) 
 {
  UserController.search(search);
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
  * 
  * 
  * @param u1
  * @param u2
  */
 public void compare(University u1, University u2)
 {
  UserController.compare(u1,u2)
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