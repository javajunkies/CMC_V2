/**File:LoginController.java
 * 
 */
import java.lang.*;
package cmc;

/**
 * @author trobinson001
 *
 */
public class LoginController {

	DBController db = new DBController();
	/**
	 * Logs user into system.
	 * 
	 */
	public int login(String username, String pass) {
		int u, p, s;
		if(this.checkUsername(username)){
			u = 1;
			}
		else {
			return 1;
		}
		if(u == 1) {
			String correctPassword = this.getPassword(username);
			if(correctPassword.equals(pass)) {
				p = 1;
			}
			else {
				return 2;
			}
		}
		if(p == 1) {
			if(this.checkStatus(user)) {
				return 0;
			}
		}
		else { 
			return 3;
		}
	}
	
	/**
	 * Checks username.
	 * @param username
	 */
	public boolean checkUsername(String username) {
		if(DBController.findByUsername(username)) {
			return true;
		}
			return false;
	}
	
	/**
	 * Checks password.
	 * @param password
	 */
	public boolean checkPassword(String password){
		return false;
	}
	
	/**
	 * Gets password
	 * @param account
	 */
	public String getPassword(String user) {
		return DBController.findUserPassword(user);
	}
	
	/**
	 * Checks status of this user.
	 * @param account
	 */
	public boolean checkStatus(String username) {
		Account user = DBController.findByUsername(username);
		if(user.getStatus().equals('Y')) {
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
