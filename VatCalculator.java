/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class VatCalculator {
    static double vat = 0.2; 
    
    public static void main(String[] args) {
        double price = 450.5; 
        double pay = price + vat * price; 
        System.out.println("The initial price of the item is: " + price + "\nThe total price including "
                + "the VAT at 20% is: " + pay);
    }
}
