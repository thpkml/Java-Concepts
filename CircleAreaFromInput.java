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
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException; 

public class CircleAreaFromInput {
   static double pi = Math.PI; 
   
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter radius: ");
       String s = br.readLine();
       
       try{
       double r = Double.parseDouble(s);
       double area = pi*r*r; 
       System.out.println("The area of a circle with radius " + r + " m is: \n" + area + " sq.m");
       } catch (NumberFormatException nfe){
           System.err.println("Invalid Format for Radius!" + nfe);
       }
       
   }
}
