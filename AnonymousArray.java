/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class AnonymousArray {
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        printArray(new int[]{1,2,3,4,5,6,7}); //Passing anonymous array to the method
    }
    
}
