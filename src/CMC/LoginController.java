package CMC;
/**File:LoginController.java
 * 
 */
import java.lang.*;

/**
 * @author trobinson001
 *
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
			String correctPassword = db.findUserPassword(username);
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
		}
		else { 
			return 3;
		}
		return 1;
	}
	
	/**
	 * Checks username.
	 * @param username
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
	 */
	public boolean checkPassword(String password){
		return false;
	}
	
	/**
	 * Checks status of this user.
	 * @param account
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
	 */
	public void logoff() {
		
	}
}
