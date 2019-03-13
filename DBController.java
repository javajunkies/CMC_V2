import dblibrary.project.csci230.*;
package edu.csbsju.cs;
.
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
	
	public getRecommendations()
	{
		
	}
	
	/**
	 * Searches for universities that match the user input
	 */ 
	  public String[] searchUniversities(String state, int numberOfStudents) {
	    
	    universities[][] = DB.universities_getUniversities();
	    int rowLength = universities[0].length;
	    int colLength = universities[1].length; 
	    String[] matchUni;
	    int k = 0;
	    
	    for(int i = 0; i < rowLength; i++) {
	      for(int j = 0; l < colLength; j++) {
	        if(universities[i][1]) == state  && universities[i][4] < numberOfStudents) { 
	          matchUni[k] = universities[i][0];
	          k++;
	        }
	      }
	    }
	    return matchUni;
	 }
	
	//5
	public void getAllUniversities()
	{
		universities[][] = DB.universities_getUniversities();
		for (int i = 0; i < universities[0].length; i++)
		{
			System.out.println(universities[i]);
		}
	}
	
	//6
	public void getAllUsers() 
	{
		users[][] = DB.users_getUsers();
		for (int i = 0; i < users[0].length; i++)
		{
			System.out.println(users[i]);
		}
	}
}
