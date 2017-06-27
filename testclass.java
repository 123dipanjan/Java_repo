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
public class testclass {
    public static void main(String[] r){
        Accounts a = new savingaccount();
       
        a.withdraw();
        a.dipposit();
        a= new currentaccount();
        a.withdraw();
        a.dipposit();
    }
}
