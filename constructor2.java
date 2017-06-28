/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */

   class Demo{
    public Demo(String a,int b){
        
        System.out.println("NAME: "+ a + "" +"ROLL: "+ b);
    }
    public Demo(){
        System.out.println("Hello");
    }
    public Demo(String c){
        System.out.println(c);
    }
}
public class constructor2 {
    public static void main(String[] ar){ 
        
    Demo d1= new Demo("Rahul",012456);
    Demo d2= new Demo();
    Demo d3= new Demo("This is a cloud courseware system!!!");
    }
  }
 
