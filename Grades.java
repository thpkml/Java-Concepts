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

public class Grades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String msg1, msg2, msg3;
        msg1 = "Congratulations! You've achieved Grade ";
        msg2 = "You've achieved Grade ";
        msg3 = "Sorry, you have failed the exams.";
        System.out.println("Enter your Marks: ");
        int marks = sc.nextInt();
        System.out.println("You have scored: " + marks);
        if(marks >= 80){
            System.out.println(msg1 + "A.");
        } else if(marks >= 70){
            System.out.println(msg1 + "B.");
        } else if(marks >= 60){
            System.out.println(msg2 + "C.");
        } else if(marks >= 50){
            System.out.println(msg2 + "Pass");
        } else {
            System.out.println(msg3);
        }
    }
}
