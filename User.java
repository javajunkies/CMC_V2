//@Description
//@author dkuhr001
//@version1.0


public class User{
 
 UserInteraction userInteraction=new UserInteraction;
 
 //@Description retrieves all saved schools associated with the current user
 //@params
 public List<String> savedSchools() {
	 userInteraction.viewSavedSchools();
 }
 
}