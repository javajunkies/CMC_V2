public class UniversityController {
  
  DBController dbcontroller = new DBController();
  
  public void sortSavedSchools(int price, int numOfStudents, int acceptanceRate, String username) {
    dbcontroller.sortSchools(price, numOfStudents, acceptanceRate, username);
  }
  
}