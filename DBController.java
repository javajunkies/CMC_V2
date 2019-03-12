/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author Java Junkies
 *
 * Database controller class
 */
public class DBController {

	/**
	 * database controller
	 */
	public DBController() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	//constructor
	UniversityDBLibrary DB = new UniversityDBLibrary(javajunk, javajunk, csci230);
	
	
	
	public Account findByUsername (String username) 
	{ 
		
	}
	
	public String findUserPassword(String username) 
	{
	
	}
	
	public List<University> getReccomendations(University university)
	{
		
	}
	
	public editUnivInfo(University university, List<String> info) 
	{
		
	}
	
	/**
	 * Deletes a university
	 * 
	 * @param university - university to be deleted
	 */
	public removeUniversity(String university)
	{
		DB.university_deleteUniversity(university);
	}
	
	/**
	 * adds a university
	 */
	public addUniversity(String school, String state)
	{
		
	}
	
	/**
	 * 
	 */
	public createUser(String firstName, String lastName, String username, String password, char type)
	{
		DB.user_addUser(firstName, lastName, username, password, type)
	}
	
	public adminEditUser(String firstName, String lastName, String username, String password, char type, status)
	{
		DB.user_editUser(firstName, lastName, username, password, type, status);
	}
}
