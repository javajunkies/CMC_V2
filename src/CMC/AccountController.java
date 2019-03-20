/**
 * File: AccountController.java
 */

package CMC;

/**
 * Controller class for Account functionalities
 * 
 * @author Java Junkies
 * @version March 19, 2019
 */
public class AccountController{
  
	DBController db = new DBController();
  
  public int register(String first, String last, String username, String password) {
    return db.registerNewUser(first, last, username, password);
  }
  
  /**
   * 
   * @param password
   * @return boolean representation of checking the password, 0 if meets all criteria
   * 		1 if less than 8 characters, 2 if it does not contain a letter or 3 if it does not contain a number
   */
  public int checkPasswordCriteria(String password) {
    boolean hasLetter = false;
    boolean hasNumber = false;
    if (password.length() < 8) {
    	return 1;
    }
    else {
    for (int i = 0; i < password.length(); i++) {
      if (Character.isLetter(password.charAt(i))) {
        hasLetter = true;
      }
      else if (Character.isDigit(password.charAt(i))) {
        hasNumber = true;
      }
    }
    }
    if (!hasLetter) {
    	return 2;
    }
    if (!hasNumber) {
    	return 3;
    }
    if (hasLetter == true && hasNumber == true) {
    	return 0;
    }
    return 1;
  }
  
  public boolean checkPasswordMatch(String password, String password1) {
	  if(password.equals(password1)) {
		  return true;
	  }
	  return false;
  }
  
}