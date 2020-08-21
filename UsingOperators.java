/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class UsingOperators {
    public static void main(String[] args){
        int a, b, c, d, e, f; //declaring variables
        double h, i, j, k;
        // assigning variable values - Initializing
     
        d = 0;
        e = 20;
        f = 30;
        h = 25.5;
        i = 35.5;
        j = 45.5;
        k = 55.5;
        
//        use of math operators
        int sum = d + e;
        int diff = f - e; 
        double product = h * i; 
        double div = k/d; 
        double remainder = f%7;
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + diff);
        System.out.println("Product is: " + product);
        System.out.println("Division is: " + div);
        System.out.println("Remainder is: " + remainder);

//        use of assignment operators
        
        int w = 0; 
        int x = 0;
        int y = w++; 
        System.out.println("w: " + w);
        System.out.println("y: " + y);
        int z = ++x; 
        System.out.println("x: " + x);
        System.out.println("z: " + z);
    }
}
