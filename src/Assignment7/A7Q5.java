/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 * get an int as input and output that many lines of random amounts of astericks
 * @author Hunter Oswald
 */
public class A7Q5 {
    // create a procedure method type to display a random number of astericks
    public void chaotic(int numOfLines) {
        // gets a random number from 1-5 then outputs astericks based on that number
        for (int x = 1; x < numOfLines + 1; x++) {    
            for (int i = 0; i < (int)(Math.random() * (5 - 1 + 1)) + 1; i++) {
                System.out.print("*");
            }
            // next asterick after this (next line) will be spaced out so they don't all go in one line
            System.out.println(" ");
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create on object to run the method
        A7Q5 run = new A7Q5();
        
        // create a scanner, ask for the number of lines to print, store number of lines to print, use method with the number of lines inputted
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the amount of randomized lines you would like to be printed");
        
        int numberOfLines = input.nextInt();
        
        System.out.println("Randomized lines:");
        
        run.chaotic(numberOfLines);
        
    }
}
