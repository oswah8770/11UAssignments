/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 * input two numbers into an array and output them in ascending order
 * @author Hunter
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners
        Scanner input = new Scanner(System.in);
        
        // array for nums
        int[] nums = new int[2];
        
        // input
        System.out.println("Enter two integers:");
        
        for(int i = 0; i < nums.length; i++) {
            // get number input
            nums[i] = input.nextInt();
            
        }
        int stored = 0;
        
        if(nums[0] > nums[1]) {
            stored = nums[1];
            nums[1] = nums[0];
            nums[0] = stored;
            
        }
        System.out.println("The integers in ascending order are: " + nums[0] + ", " + nums[1]);
        
        
        
        
    }
}
