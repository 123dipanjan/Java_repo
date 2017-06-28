/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class home
{
    String name;
    public home(String j){
        name=j;
        System.out.println(j);
        
    }
}
class room extends home
{
    int roomno;
    public room(String j,int i)
    {
        super(j);
          roomno=i;
        System.out.println("Room name:"+j+" "+"Room no."+i);
    }
}
public class constructor3 {
   public static void main(String[] p)
   {
       home h1=new home("This is my Home");
       home h2=new home("I am at-");
       room r1=new room("Avani",92);
   } 
}
