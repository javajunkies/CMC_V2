/**
 * 
 */
package CMC;

/**
 * @author javajunkies
 *
 */
public class UserController {
	
	/**
	 *Logs the user onto their account
	 *@param username the users unique username
	 *@param password the users password
	 */
	public void login(String username, String password) {
		
	}
	
	/**
	 * method to log the user off the CMC system
	 *
	 */
	public void logoff() {
		
	}
	
	/**
	 * finds a users saved schools
	 * @param user the users username
	 */
	public void viewSavedSchool(String user) {
		
	}
	
	/**
	 * finds recommended schools based a certain school
	 * @param list	a university that will be used as a basis for recomendations
	 */
	public void getRecommendedList(List<University> list) {
		
	}

	/**
	 * Searches for schools matching the entered criteria
	 * @param schools	a list containing desired search criteria
	 */
	public void search(List<String> schools) {
		
	}
	
	/**
	 * Saves a school to the users list of saved schools
	 * @param username	a username to save the school to
	 * @param university	a university object to be saved to the users saved schools list
	 */
	public void saveSchool(String username, String university) {
		
	}
	
	/**
	 *finds information for two schools to be compared
	 *@param univ1	A university to be compared to univ2
	 *@param univ2	A university to be compared to univ1
	 */
	public void compare(University univ1, University univ2) {
		
	}
	
	/**
	 * updates the users information 
	 *@param username	the users username
	 *@param firstname	the users new first name 
	 *@param lastname	the users new last name
	 *@param password	the users new password
	 */
	public void editUserInfo(String username, String fistname, String lastname, String password) {
		
	}
	
	/**
	 * checks if the users matches the password on the account
	 *@param p	the users password 
	 *@return boboolean	if the users entered password  
	 */
	public boolean getPassword(String p) {
		
	}
	
	/**
	 * Removes a school from the users saved school list
	 *@param user	the users username
	 *@param school	the name of the school to be removed from the desired users saved school list
	 */
	public void removeSavedSchool(String user, String school) {
		
	}
	
	/**
	 * gets the users information
	 *@param username	the username to return information for
	 */
	public void viewUserInfo(String username) {
		
	}
	
	/**
	 *   
	 */
	public UserController() {
		// TODO Auto-generated constructor stub
	}

}
