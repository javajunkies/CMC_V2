package CMC;

/**
 * @author bwest001
 *
 * University controller class
 */
public class UniversityController {
 
 DBController dbcontroller = new DBController();
 
 /**
     * @param price price of the school 
     * @param numStudents number of students attending the university 
     * @param acceptanceRate acceptance rate of the university
     * @param username username 
  * 
  * method to sortSavedSchools
  */
 public void sortSavedSchools(int price, int numStudents, int acceptanceRate, String username) 
 {
  dbcontroller.sortSavedSchools(price, numStudents, acceptanceRate, username);
 }
}
