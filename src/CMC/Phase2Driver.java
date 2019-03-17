package CMC;

import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;
/**
 * @author trobinson001
 *
 */
public class Phase2Driver {
	private UniversityDBLibrary univDBLib;	
	
	 public  Phase2Driver(String username, String password){
		    univDBLib = new UniversityDBLibrary(username,password);
		  }
	public UniversityDBLibrary getUnivDBLib() {
		return univDBLib;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phase2Driver dbld = new Phase2Driver(args[0], args[1]);

	}

}
