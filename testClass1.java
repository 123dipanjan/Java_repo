/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacepkt2;

/**
 *
 * @author MRuser
 */
public class testClass {
    public static void main(String[] a){
        Flyer f;
        f= new Birds();
        Birds B=new Birds();
        B.FoodHabbit();
        f.fly();
        f.takeoff();
        f.takeoff();
        f= new Aeroplane();
        Aeroplane A=new Aeroplane();
        A.type();
        f.fly();
        f.takeoff();
        f.takeoff();
          
    }
}
