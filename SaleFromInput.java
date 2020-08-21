/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
import java.io.BufferedReader; // Better to use Scanner 
import java.io.InputStreamReader; 
import java.io.IOException; 

public class SaleFromInput {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); // Better use Scanner for input
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("What is the original price of the item?");
        String a = br1.readLine();
        System.out.println("What is the sale percent?");
        String b = br2.readLine();
        
        try{
            double price = Double.parseDouble(a);
            double sale = Double.parseDouble(b);
            double rate = sale/100;
            if (sale > 100){
                System.out.println("The discount cannot be higher than the price of the item !");
            } else {
               double discount = price*rate; 
               double pay = price - discount; 
               System.out.println("The disount you get on this item is: £" + discount);
               System.out.println("The final price of the item is: £" + pay);
            }
        } catch(NumberFormatException nfe){
            System.out.println("Invalid format for sale/price ! \n" + nfe);
        }
    }
}
