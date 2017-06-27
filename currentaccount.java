/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacepkt;

/**
 *
 * @author MRuser
 */
public class currentaccount implements Accounts {

    @Override
    public void withdraw() {
        System.out.println("You are withdrawn rs.50 in current account");
    }

    @Override
    public void dipposit() {
    System.out.println("You are dipposited rs.150 in current account");
    }
    
}
