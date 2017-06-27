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
public class Birds extends Animal implements Flyer{

    @Override
    void FoodHabbit() {
        System.out.println("It's a bird,it's hungry");
    }

    @Override
    public void fly() {
        System.out.println("1");
    }

    @Override
    public void takeoff() {
        System.out.println("2");
    }

    @Override
    public void landin() {
        System.out.println("3");
    }
    
}
