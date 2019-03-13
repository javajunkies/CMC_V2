/**
 * 
 */
package cmc;
import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;
/**
 * @author trobinson001
 *
 */
public class DBDriver {
	private UniversityDBLibrary univDBLib;	
	
	 public  DBDriver(String username, String password){
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

}
