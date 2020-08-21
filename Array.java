/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class Array {
    public static void main(String[] args){
        int[] nums = new int[5]; //length of the array
        nums[0] = 10; // initialization
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
//        traversing array
        int[] nums2 = {1, 2, 3, 4, 5, 6}; // initializing on declare
        String[] fruits = {"apple", "banana", "orange", "mango"};
    for(int i = 0; i < nums.length; i++){
        System.out.println(nums[i]);
    }
    for(int i = 0; i < nums2.length; i++){
        System.out.println(nums2[i]);
    }
    for(int i = 0; i < fruits.length; i++){
        System.out.println(fruits[i]);
    }
    }
}
