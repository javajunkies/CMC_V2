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
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter username: ");
   String username=sc.nextLine();
   System.out.println("Enter password: ");
   String password=sc.nextLine();
   String username= User.getUsername();
   String first=
   (username,first,last,password,type,status);
   */
  
  }  
}