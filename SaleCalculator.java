/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class SaleCalculator {
    static double sale = 0.2; 
    
    public static void main(String[] args) {
        double price = 640.25; 
        double pay = price - sale * price; 
        System.out.println("The initial price of the item is: " + price + "\nThe total price with "
                + "the 20% discount is: " + pay);
    }
}

