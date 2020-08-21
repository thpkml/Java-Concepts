 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
import java.lang.Math;
import java.util.Scanner;

public class CircleArea {
   static double pi = Math.PI;
   
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);  // Scanner is 
       System.out.println("Enter radius: ");
       double r = s.nextDouble();
       
       double area = pi * r*r;
       System.out.println("Area of the circle of radius " + r + " is: " + area);
   }
}
