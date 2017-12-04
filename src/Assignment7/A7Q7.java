/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 * when an integer is inputted, it outputs the first digit
 * @author Hunter Oswald
 */
public class A7Q7 {

    // create a method that returns the first digit of the integer
    public int firstDigit(int number) {
        if (number < 0) {
            number = number - (number * 2);
        }
        while (number >= 10) {
            number = number / 10;
            
        }
        return number;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run the methods created
        A7Q7 run = new A7Q7();
        
        // create a scanner, ask for input, store input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer:");
        
        int num = input.nextInt();
        
        // store the return of the method
        int firstDigit = run.firstDigit(num);
        
        // output
        System.out.println("The first digit is " + firstDigit);
        
        
    }
}
