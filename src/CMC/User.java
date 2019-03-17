package CMC;

//@Description
//@author dkuhr001
//@version1.0


public class User extends Account{
 
 /**
  * User constructor 
  * @param first this is the first name on the account
  * @param last this is the last name on the account
  * @param username this is the username assoociated with the account
  * @param password this is the password associated with the account
  * @param usertype this is the type of the account
  */

 public User(String first, String last, String username, String password, char usertype) {
  this.first = first;
  this.last = last;
  this.username = username;
  this.password = passsword;
  this.usertype = usertype;
  this.status = 'Y';
 }
 
 //instance variables
 String first;
 String last;
 String username;
 String password;
 char usertype;
 char status;
 
 
 /**
  * @return the first name on the account
  */
 public String getFirst() {
  return this.first;
 }


 /**
  * @param first the first name to set
  */
 public void setFirst(String first) {
  this.first = first;
 }


 /**
  * @return the last name on the account
  */
 public String getLast() {
  return this.last;
 }


 /**
  * @param last the last name to set 
  */
 public void setLast(String last) {
  this.last = last;
 }


 /**
  * @return the username associated on the account
  */
 public String getUsername() {
  return this.username;
 }

 /**
  * @return the status associated with the account
  */
 public String getStatus() {
  return this.status;
 }


 /**
  * @param status the users status to set
  */
 public void setStatus(Char status) {
  this.status = status;
 }


 /**
  * @param username the username to set
  */
 public void setUsername(String username) {
  this.username = username;
 }


 /**
  * @return the password associated with the account
  */
 public String getPassword() {
  return this.password;
 }


 /**
  * @param password the password to set
  */
 public void setPassword(String password) {
  this.password = password;
 }


 /**
  * @return the type of user
  */
 public char getUsertype() {
  return this.usertype;
 }


 /**
  * @param usertype the users type to set
  */
 public void setUsertype(char usertype) {
  this.usertype = usertype;
 }



 UserInteraction userInteraction=new UserInteraction();
 
 //@Description retrieves all saved schools associated with the current user
 //@params
 public List<String> savedSchools() {
  userInteraction.viewSavedSchools();
 }
 
}