/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abst;


class B extends A{
    void add(){
        int a=7,b=2,c;
        c=a+b;
        System.out.println("Sum is: "+c);
    }
    public static void main(String[] ar){
       A obj=new B();
        obj.add();
    }
       
}
