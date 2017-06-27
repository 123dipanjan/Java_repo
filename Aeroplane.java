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
public class Aeroplane extends Automobile implements Flyer {

    @Override
    void type() {
       System.out.println("It is an aeroplane..");
    }

    @Override
    public void fly() {
       System.out.println("Aeroplane is flying");
    }

    @Override
    public void takeoff() {
       System.out.println("Aeroplane was takeoff"); 
    }

    @Override
    public void landin() {
       System.out.println("Aeroplane will be landin"); 
    }
    
}
