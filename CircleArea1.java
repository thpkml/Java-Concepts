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

public class CircleArea1 {
//    declare all variables
    private static Scanner sc; 
    
    public static void main(String[] args){
        double radius, area, circumference;
        sc = new Scanner(System.in);
        
        System.out.println("Enter the Radius (cm): ");
        radius = sc.nextDouble();
        
//        define the method area
        area = Math.PI*radius*radius;
        circumference = Math.PI*2*radius;
        
        System.out.println("The area of circle of radius " + radius + " is: " + area + " cm squared.");
        System.out.println("The circumference of circle of radius " + radius + " is: " + circumference + " cm.");
    }
}
