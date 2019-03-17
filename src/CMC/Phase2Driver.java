package CMC;

import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;
/**
 * @author Java Junkies
 *
 */
public class Phase2Driver {	
	
	 public  Phase2Driver(String username, String password){
		    univDBLib = new UniversityDBLibrary(username,password);
		  }


  private UniversityDBLibrary univDBLib; 
  
  public DBController DBController(String username, String password)
  {
    univDBLib = new UniversityDBLibrary(username,password);
  }
  public UniversityDBLibrary getUnivDBLib() {
    return univDBLib;
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    DBDriver dbld = new DBDriver(args[0], args[1]);
    
  }
  public void printSchools();
  {
    String[][] s = new String [178][];
    s = schoolArray;
    System.out.println("---Universities:");
    for (int i = 0; i != 178; i++)
    {
      System.out.println(s[i][0]);
    }
  }
}
