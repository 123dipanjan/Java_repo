import java.util.*;
class accounts{
  public void show()
  {
    System.out.println("This is Your account data");
    System.out.println("Enter details:");
  }
}
class current extends accounts{
  public void show()
   {
    System.out.println("This is a current account");
  } 
}
class savings extends accounts{
  public void show()
   {
    System.out.println("This is a savings account");
  } 
} 
public class display{
 public static void main(String args[])
 {
  int a;
  Scanner sc = new Scanner(System.in);
  accounts a1;
  a1=new accounts();
  a1.show();
  System.out.println("Enter 1 for current account: ");
  System.out.println("Enter 2 for savings account: ");
  a=sc.nextInt();
  switch(a)
  {
    case 1:
      a1=new current();
      a1.show();
      
      break;
    case 2:
      a1=new savings();
      a1.show();
      
      break;
  }
}
} 