package CMC;
import dblibrary.project.csci230.*;
import java.util.*;


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
  UniversityDBLibrary DB = new UniversityDBLibrary("javajunk", "CSCI230");
  
  /**
   * Searchs for a specified user in the database.
   * @param username username being searched for
   * @return boolean representation of outcome, true if user is found, false if not.
   */
  public boolean findByUsername (String username) 
  { 
    String[][] users = DB.user_getUsers();
    for(int i = 0; i < users.length; i++) {
      if(users[i].equals(username)) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Searchs for a specified users password in database.
   * @param username user whos password is being searched for.
   * @return String String representation of the users password.
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
  
  public void editUnivInfo(University university, List<String> info) 
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
    if(type == 'a') {
      User user = new User(firstName, lastName, username, password, type);
    }
    else{
      Admin admin = new Admin(firstName, lastName, username, password, type);
    }
  }
  
  public void adminEditUser(String firstName, String lastName, String username, String password, char type, char status)
  {
    DB.user_editUser(firstName, lastName, username, password, type, status);
  }
  
  public void getRecommendations()
  {
    
  }
  
  /**
   * method to search for a university 
   * @param state the search criteria
   * @param numberOfStudents the search criteria
   */
  public String[] searchUniversities(String state, int numberOfStudents) 
  {
    String[][] universities = DB.universities_getUniversities();
    int rowLength = universities[0].length;
    int colLength = universities[1].length; 
    String[] matchUni;
    int k = 0;
    
    for(int i = 0; i < rowLength; i++) {
      for(int j = 0; l < colLength; j++) {
        if(universities[i][1]).equals(state)  && universities[i][4] < numberOfStudents) {     //  <--- fix this boy
          matchUni[k] = universities[i][0];
        k++;
        }
        }
     }
     return matchUni;
     }
   
   
  /**
   * method to view a list of all universities
   * 
   */
  public String[][] getAllUniversities()
  {
    return DB.university_getUniversities();
  }
  
  /**
   * view all users in database
   * 
   */
  public String[][] getAllUsers() 
  {
    return DB.user_getUsers();
  }
  
  
  /**
   * @param username the active users username 
   * method to view retreive a users info from the database and display it. 
   */
  public void viewuser(String username)
  {
    String[][] users = DB.user_getUsers();
    for (int i = 0; i < users[1].length(); i++)
    {
      if (users[i][2] == username)
      {
        String [] userInfo;
        for(String s : userInfo)
        {
          userInfo[s] = users[i][s];
        }
      }
    }
    for(int j = 0; j < userInfo.length; j++) {
      System.out.println(userInfo[j]);
    }
  }
  
  
  /**
   * @param firstName the new username to be updated
   * @param lastName the new lastname to be updated
   * @param password the new password to be updated
   * 
   * method to edit the current users information that is stored in the database
   */
  public void editUser(String firstName, String lastName, String password)
  {
    String[][] users = DB.user_getUsers();  
  }
  }
}