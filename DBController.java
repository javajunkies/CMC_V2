import dblibrary.project.csci230.*;
package cmc;
//package edu.csbsju.cs;

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
   
   public String findUserPassword(String username) 
   {
   
   }
   
   public List<University> getReccomendations(University university)
   {
   
   }
   
   public editUnivInfo(University university, List<String> info) 
   {
   
   }
   */
  
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
   
   
   *
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
   */
  //5
  public String[] getAllUniversities()
  {
    String[][] s = new String[10][];
    s = DB.university_getUniversities();
    String[] b = new String[s.length];
    for (int i = 0; i < s.length; i++)
    {
      b[i] = s[i][0];
      //System.out.println(s[i]);
    }
    return b;
  }
  /*
   //6
   public void getAllUsers() 
   {
   users = DB.users_getUsers();
   for (int i = 0; i < users[0].length; i++)
   {
   System.out.println(users[i]);
   }
   */

}

