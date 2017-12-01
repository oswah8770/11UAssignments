/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 * create a method that shows the last digit of the integer inputted
 * @author Hunter Oswald
 */
public class A7Q6 {

    // create a method to get the last digit of the integer inputted
    public int lastDigit(int number) {
        // gets the remainder of division by 10
        int lastDigit = number % 10;
        // if that number turns out to be negative, it adds the positive version of itself twice to become positive
        if (lastDigit < 0) {
            lastDigit = lastDigit - (lastDigit*2);
        }
        return lastDigit;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run the methods
        A7Q6 run = new A7Q6();
        
        // create a scanner ask for an int and store it
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer:");
        
        int num = input.nextInt();
        
        // store the return of the method
        int lastDigit = run.lastDigit(num);
        
        // output
        System.out.println("The last digit of your number is: " + lastDigit);
        
    }
}
