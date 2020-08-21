/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
import java.util.Scanner;

public class CircumferenceTest {
    public static void main(String[] args){
        Circumference obj = new Circumference();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = s.nextDouble();
        double circum = obj.circumference(r); // use the method circumference() defined in the class Circumference
        System.out.println("The Circumference of the circle with radius " + r + "is: "+ circum);
    }
}
