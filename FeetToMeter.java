/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class FeetToMeter {
    static double factor = 0.3048; 
    
    public static void main(String[] args) {
        double feet = 5.5; 
        double meter = feet*factor; 
        System.out.println("The length of " + feet + " feet is: \n===> " + meter + " meter.");
    }
}
