/**@author javajunkies
 * @version 1.0
 */

package CMC;

public class University {
 public String school;
 private String state;
 private String location;
 private String control;
 private int numStudents;
 private double percentFemale;
 private double SATVerbal;
 private double SATMath;
 private double expenses;
 private double percentFinancialAid;
 private int numApplicants;
 private double percentAdmitted;
 private double percentEnrolled;
 private int academicsScale;
 private int socialScale;
 private int qualityOfLife;
 
 /**constructor method
  *@param String mySchool
  *@param String myState
  *@param String myLocation
  *@param String myControl
  *@param int myNumStudents
  *@param double myPercentFemale
  *@param double mySATVerbal
  *@param double mySATMath
  *@param double myExpenses
  *@param double myPercentFinancialAid
  *@param int myNumApplicants
  *@param double myPercentAdmitted
  *@param double myPercentEnrolled
  *@param int myAcademicsScale
  *@param int mySocialScale
  *@param int myQualityOfLife
  */
 public University(String mySchool,String myState,String myLocation,String myControl,int myNumStudents,double myPercentFemale,double mySATVerbal,double mySATMath,double myExpenses,double myPercentFinancialAid,int myNumApplicants,double myPercentAdmitted,double myPercentEnrolled,int myAcademicsScale,int mySocialScale,int myQualityOfLife) {

  this.school = mySchool;
  this.state = myState;
  this.location = myLocation;
  this.control = myControl;
  this.numStudents = myNumStudents;
  this.percentFemale = myPercentFemale;
  this.SATVerbal = mySATVerbal;
  this.SATMath = mySATMath;
  this.expenses = myExpenses;
  this.percentFinancialAid = myPercentFinancialAid;
  this.numApplicants = myNumApplicants;
  this.percentAdmitted = myPercentAdmitted;
  this.percentEnrolled = myPercentEnrolled;
  this.academicsScale = myAcademicsScale;
  this.socialScale = mySocialScale;
  this.qualityOfLife = myQualityOfLife;
 }
 
 /**get school name
  * 
  * @return String university name
  */
 public String getSchool() {
  return this.school;
 }

 /**@Description set school name
  * 
  * @param String school name
  */
 public void setSchool(String school) {
  this.school = school;
 }

 /**@Description get state
  * 
  * @return String state
  */
 public String getState() {
  return state;
 }

 /**@Description set state
  * 
  * @param state
  */
 public void setState(String state) {
  this.state = state;
 }

 /**@Description get location
  * 
  * @return location
  */
 public String getLocation() {
  return location;
 }

 /**
  * @Description set location
  * @param location
  * 
  */
 public void setLocation(String location) {
  this.location = location;
 }

 /**@Description get control
  * 
  * @return control
  */
 public String getControl() {
  return control;
 }


 /**@Description set control
  * 
  * @param control
  */
 public void setControl(String control) {
  this.control = control;
 }
 
 /**@Description get number of students
  * 
  * @return numStudents
  */
 public int getNumStudents() {
  return numStudents;
 }

 /**@Description set number of students
  * 
  * @param numStudents
  */
 public void setNumStudents(int numStudents) {
  this.numStudents = numStudents;
 }

 /**@Description get percent female
  * 
  * @return percentFemale
  */
 public double getPercentFemale() {
  return percentFemale;
 }

 /**@Description set percent female
  * 
  * @param percentFemale
  */
 public void setPercentFemale(double percentFemale) {
  this.percentFemale = percentFemale;
 }

 /**@Description get SAT Verbal average score
  * 
  * @return SATVerbal
  */
 public double getSATVerbal() {
  return this.SATVerbal;
 }

 /**@Description set SAT Verbal average score
  * 
  * @param SATVerbal
  */
 public void setSATVerbal(double SATVerbal) {
  this.SATVerbal = SATVerbal;
 }

 /**@Description get SAT Math average score
  * 
  * @return SATMath
  */
 public double getSATMath() {
  return this.SATMath;
 }

 /**@Description set SAT Math average score
  * 
  * @param SATMath
  */
 public void setSATMath(double SATMath) {
  this.SATMath = SATMath;
 }

 /**@Description get expenses
  * 
  * @return expenses
  */
 public double getExpenses() {
  return expenses;
 }

 /**@Description set expenses
  * 
  * @param expenses
  */
 public void setExpenses(double expenses) {
  this.expenses = expenses;
 }

 /**@Description get percent of students receiving financial aid 
  * 
  * @return percentFinancialAid
  */
 public double getPercentFinancialAid() {
  return percentFinancialAid;
 }

 /**@Description set percent of students receiving financial aid
  * 
  * @param percentFinancialAid
  */
 public void setPercentFinancialAid(double percentFinancialAid) {
  this.percentFinancialAid = percentFinancialAid;
 }

 /**@Description get number of applicants
  * 
  * @return numApplicants
  */
 public int getNumApplicants() {
  return numApplicants;
 }

 /**@Description set number of applicants
  * 
  * @param numApplicants
  */
 public void setNumApplicants(int numApplicants) {
  this.numApplicants = numApplicants;
 }

 /**@Description get percent of admitted students
  * 
  * @return percentAdmitted
  */
 public double getPercentAdmitted() {
  return percentAdmitted;
 }

 /**@Description set percent of admitted students
  * 
  * @param percentAdmitted
  */
 public void setPercentAdmitted(double percentAdmitted) {
  this.percentAdmitted = percentAdmitted;
 }

 /**@Description get percent enrolled
  * 
  * @return percentEnrolled
  */
 public double getPercentEnrolled() {
  return percentEnrolled;
 }

 /**@Description set percent enrolled
  * 
  * @param percentEnrolled
  */
 public void setPercentEnrolled(double percentEnrolled) {
  this.percentEnrolled = percentEnrolled;
 }

 /**@Description get academic scale
  * 
  * @return academicsScale
  */
 public int getAcademicsScale() {
  return academicsScale;
 }

 /**@Description set academic scale
  * 
  * @param academicsScale
  */
 public void setAcademicsScale(int academicsScale) {
  this.academicsScale = academicsScale;
 }

 /**@Description get social scale
  * 
  * @return socialScale
  */
 public int getSocialScale() {
  return socialScale;
 }

 /**@Description set social scale
  * 
  * @param socialScale
  */
 public void setSocialScale(int socialScale) {
  this.socialScale = socialScale;
 }

 /**@Description get quality of life
  * 
  * @return qualityOfLife
  */
 public int getQualityOfLife() {
  return qualityOfLife;
 }

 /**@Description set quality of life
  * 
  * @param qualityOfLife
  */
 public void setQualityOfLife(int qualityOfLife) {
  this.qualityOfLife = qualityOfLife;
 }
}
