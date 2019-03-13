import dblibrary.project.csci230.*;
package cmc;

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
  UniversityDBLibrary DB = new UniversityDBLibrary(javajunk, csci230);
  //UniversityDBLibrary DB = new UniversityDBLibrary("javajunk", "javajunk", "csci230");
  
  /*
   *  
   *
   public Account findByUsername (String username) 
   { 
   
   }
   
   */
  
   public String findUserPassword(String username) 
   {
   	String[][] users = DB.user_getUsers();
   	for(int i = 0; i < users.length; i++){
   		if(users[i].equals(username)) {
   			return users[i][3];
   		}
   	}
   	return "Could not find " + username;
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
   *
   public removeUniversity(String university)
   {
   DB.university_deleteUniversity(university);
   }
   
   public addUniversity(String school, String state)
   {
   
   }
   
   
   */
   public boolean createUser(String firstName, String lastName, String username, String password, char type)
   {
   DB.user_addUser(firstName, lastName, username, password, type);
   Account username = new Account(firstName, lastName, username, password, type);
   }
   
   public adminEditUser(String firstName, String lastName, String username, String password, char type, status)
   {
   DB.user_editUser(firstName, lastName, username, password, type, status);
   }
   
   public getRecommendations()
   {
   
   }
  
  //search
  public String[] searchUniversities(String state, int numberOfStudents) 
  {
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
    String[][] s = new String[10][];
    s = DB.university_getUniversities();
    String[] b = new String[s.length];
    for (int i = 0; i < s.length; i++)
    {
      b[i] = s[i][0];
      System.out.println(s[i]);
    }
  }
  
   //6
   public void getAllUsers() 
   {
   String [][] users = DB.user_getUsers();
   for (int i = 0; i < users[0].length; i++)
   {
   System.out.println(users[i]);
   }
   
  
  }
}
