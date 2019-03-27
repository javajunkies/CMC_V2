package CMC;
/**File:LoginController.java
 * 
 */

/**
 * Controller class for login functionalities.
 * 
 * @author Java Junkies
 * @version March 17. 2019
 */
public class LoginController {

 DBController db = new DBController();
 
 /**
  * Logs user into system.
  * @param username username associated with this user
  * @param pass password user uses to log in
  * @return int representation of login attempt. 0 if succesful, 1 if invalid username,
  *         2 if invalid password, and 3 if status is inactive.
  */
 public int login(String username, String pass) {
  int u, p = 0;
  if(this.findUser(username)){
   u = 1;
  }
  else {
   return 1;
  }
  if(u == 1) {
   String correctPassword = this.findPassword(username);
   if(correctPassword.equals(pass)) {
    p = 1;
   }
  }
   else {
    return 2;
   }
  if(p == 1) {
   if(this.checkStatus(username)) {
    return 0;
   }
   else { 
    return 3;
   }
  }
  return 4;
 }
 
 /**
  
  * Checks username.
  * @param username
  * @return boolean if there is a user in the Database with that username
  */
 public boolean findUser(String username) {
  if(db.isUser(username)) {
   return true;
  }
  else {
   return false;
  }
 }
 
 /**
  * Checks password.
  * @param password
  * @return String the users password?
  */
 public String findPassword(String username){
  return db.findUserPassword(username);
 }
 
 /**
  * Checks status of this user.
  * @param account
  * 
  * @return boolean if the status of the account was active
  */
 public boolean checkStatus(String username) {
  Account user = db.findByUsername(username);
  if(user.getStatus() == 'Y') {
  return true;
 }
  else {
   return false;
  }
 }
 
 /**
  * Logs this user off of CMC system.
  * @return int the status of the log off
  */
 public int logoff() {
  return 1;
 }
}
