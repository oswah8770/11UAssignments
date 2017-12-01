/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 * when given a number, outputs the factors of the number
 * @author Hunter Oswald
 */
public class A7Q3 {

    // create a procedure type method to output the factors of the inputted number
    public void factors(int a) {
        System.out.println("The factors of " + a + " are:");
        // divide the num by i. If remainder of the division is 0, prints out i. Prints out 'a', because 'a' always has a factor of 'a'.
        for (int i = 1; i < a; i++) {
           if (a % i == 0) {
               System.out.print(i + ", ");
           } 
        }
        System.out.println(a);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run the methods
        A7Q3 run = new A7Q3();
        
        // asks for input and stores the input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        
        int num = input.nextInt();
        
        // use method to output all factors of the inputted number
        run.factors(num);
        
    }
}
