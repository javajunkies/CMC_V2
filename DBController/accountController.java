import UniversityDBLibrary.java;
import System.out.*;

public class accountController implements DBController {
  
  public void editUser(String firstName, String lastName, String password, String username, char type, char status) {
    UniversityDBLibrary.user_editUser(firstName, lastName, username, password, type, status);
  }
  
  public void register(String first, String last, String username, String password, char type) {
    UniversityDBLibrary.user_addUser(first, last, username, password, type);
  }
  
  public void checkPasswordCriteria(String password) {
    bool hasLetter = False;
    bool hasNumber = False;
    if (password.length() < 8) {
      System.out.println("The password must be at least 8 characters");
    }
    for (int i = 0; i < password.length(); i++) {
      if (Character.isLetter(password.charAt(i))) {
        hasLetter = True;
      }
      else if (Character.isDigit(password.charAt(i))) {
        hasNumber = True;
      }
    }
    if (!hasLetter) {
      System.out.println("The password must have at least one letter");
    }
    if (!hasNumber) {
      System.out.println("The password must have at least one number");
  }
  } 
  
  public void checkPasswordMatch(String username, String password) {
    String account = findByUsername(username);
    String myPassword = findUsersPassword(account);
    if (myPassword != password) {
      System.out.println("Password is incorrect");
    }
  }
}