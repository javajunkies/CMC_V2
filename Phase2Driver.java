//@author dkuhr001
//@Description Driver class to demonstrate functionalities for Phase 2

public class Phase2Driver
{
  public void main(String[] args)
  {
   DBController db=new DBController();
   
   String[] schools=db.getAllUniversities();
   System.out.println(schools);
   
   
   
   /*
public class Phase2Driver{
  public void main(){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter username: ");
   String username=sc.nextLine();
   System.out.println("Enter password: ");
   String password=sc.nextLine();
   /**help here Imad login(username,password)  ---------------
   String username= User.getUsername();
   String first=
   (username,first,last,password,type,status);
*/
  
  }  
}