package CMC;
//@author dkuhr001
//@version 1.1 added methods
//Class to handle admin interactions in the system and pass further commands to controller classes



public class AdminInteraction{
 
 AdminController adminController=new AdminController();
 LoginController loginController=new LoginController();
 
 //@Description login, call method in AdminController
 //@params String username, String password
 public void login(String username, String password){
   loginController.login(username,password);
 }
 //@Description logoff current admin
 //@params
 public void logoff(){
   loginController.logoff();
 }
 //@Description remove a 
 //@params
 public void removeUniversity(String school){
   adminController.removeUniversity(school);
 }
 //@Description
 //@params
 public void addUniversity(String school,String state,String location,String control,int numStudents,double percentFemale,double SATVerbal,double SATMath,double expenses,double percentFinancialAid,int numApplicants,double percentAdmitted,double percentEnrolled,int academicsScale,int socialScale,int qualityOfLife){
   adminController.addUniversity(school,state,location,control,numStudents,percentFemale,SATVerbal,SATMath,expenses,percentFinancialAid,numApplicants,percentAdmitted,percentEnrolled,academicsScale,socialScale,qualityOfLife);
 }
 //@Description
 //@params
 public void editUniversity(String school,String state,String location,String control,int numStudents,double percentFemale,double SATVerbal,double SATMath,double expenses,double percentFinancialAid,int numApplicants,double percentAdmitted,double percentEnrolled,int academicsScale,int socialScale,int qualityOfLife){
   adminController.addUniversity(school,state,location,control,numStudents,percentFemale,SATVerbal,SATMath,expenses,percentFinancialAid,numApplicants,percentAdmitted,percentEnrolled,academicsScale,socialScale,qualityOfLife);
 }
 //@Description
 //@params
 public void viewUserInfo(String username){
   adminController.viewUserInfo(username);
 }
 //@Description
 //@params
 public void editAdmin(String userName, String firstName, String lastName, String password, char type, char status){
   adminController.editAdmin(username,firstName,lastName,password,type,status);
 }
 //@Description
 //@params
 public void viewUsers(){
   adminController.viewUsers();
 }
 //@Description
 //@params
 public void deactivateUser(String username){
   adminController.deactivateUser(username);
 }
 //@Description
 //@params
 public boolean searchUsers(String username){
   adminController.searchUsers(username);
 }
 //@Description add new user, passes user info to admin controller
 //@params
 public void addNewUser(String firstName,String lastName,String username,String password,char type){
   adminController.addNewUser(firstName,lastName,username,password,type);
 }
 
}