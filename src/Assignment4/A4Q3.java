/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 * output 4 numbers separated by commas that the user input
 * @author Hunter Oswald
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create scanners
        Scanner first = new Scanner(System.in);
        
        Scanner second = new Scanner(System.in);
        
        Scanner third = new Scanner(System.in);
        
        Scanner fourth = new Scanner(System.in);
        
        // ask for input
        System.out.println("Please enter for numbers on separate lines:");
        
        // create variables to store input
        double firstNum = first.nextDouble();
        
        double secondNum = second.nextDouble();
        
        double thirdNum = third.nextDouble();
        
        double fourthNum = fourth.nextDouble();
        
        
        // output numbers
        System.out.println("Your numbers were " + firstNum + ", " + secondNum + ", " + thirdNum + ", and " + fourthNum + ".");
        
        
        
        
        
        
        
    }
}
