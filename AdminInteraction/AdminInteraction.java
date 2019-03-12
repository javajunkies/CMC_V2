//@author dkuhr001
//@version 1.1 added methods
//Class to handle admin interactions in the system and pass further commands to controller classes
package edu.csbsju.cs


public class AdminInteraction{
 
 AdminController adminController=new AdminController;
 LoginController loginController=newLoginController;
 
 //@Description
 //@params
 public void login(String username, String password){
   loginController.login(username,password);
 }
 //@Description
 //@params
 public void logoff(){
   loginController.logoff();
 }
 //@Description
 //@params
 public void removeUniversity(University school){
   adminController.removeUniversity(school);
 }
 //@Description
 //@params
 public void addUniversity(University school){
   adminController.addUniversity(school);
 }
 //@Description
 //@params
 public void editUniversity(University school,List<String> info){
   adminController.editUniversity(school,info);
 }
 //@Description
 //@params
 public void viewUserInfo(String username){
   adminController.viewUserInfo(username);
 }
 //@Description
 //@params
 public void editAdmin(String firstName, String lastName, String password, char type, char status){
   adminController.editAdmin(firstName,lastName,password,type,status);
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
 public void addNewUser(String firstName, String lastName, String password, char type, char status){
   
 }
 //@Description
 //@params
 public boolean searchUsers(String username){
   adminController.searchUsers(username);
 }
 //@Description
 //@params
 public void addNewUser(String firstName,String lastName,String username,String password,char type){
   adminInteraction.addNewUser(firstName,lastName,username,password,type);
 }
 
}