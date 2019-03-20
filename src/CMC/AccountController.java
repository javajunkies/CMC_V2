import UniversityDBController;
import System.out.*;

public class AccountController implements DBController {
  
  public void editUser(String username) {
    Account user = DBController.findByUsername(username);
    String firstName = user.getFirst();
    String lastName = user.getLast();
    String password = user.getPassword();
    char Type = user.getUserType();
    char Status = user.getStatus();
    UniversityDBController.user_editUser(username, firstName, lastName, password, Type, Status);
  }
  
  public void register(String first, String last, String username, String password, char Type) {
    UniversityDBController.user_addUser(first, last, username, password, Type);
  }
  
  public void checkPasswordCriteria(String password) {
    Boolean hasLetter = False;
    Boolean hasNumber = False;
    if (password.length() < 8) {
      System.out.println("Password must be at least 8 characters.");
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
      System.out.println("Password must have at least 1 letter.");
    }
    if (!hasNumber) {
      System.out.println("Password must have at least 1 number.");
    }
  }
  
  public void checkPasswordMatch(String username, String password) {
    Account user = DBController.findByUsername(username);
    String myPassword = DBController.findUserPassword(user);
    if (password != myPassword) {
      System.out.println("Passwords do not match.");
    }
  }
  
}