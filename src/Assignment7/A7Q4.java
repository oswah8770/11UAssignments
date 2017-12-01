/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 * calculates interest of an account at a specific interest rate, balance, and amount of time
 * @author Hunter Oswald
 */
public class A7Q4 {

    // creates a method to calculate the account balance for a certain rate of interest and amount of time
    public double compoundInterest(double balance, double interest, int time) {
        double amountRemaining = balance * Math.pow((1+interest), time);
        return amountRemaining;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run the methods
        A7Q4 run = new A7Q4();
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // store account balance, interest, and amount of time
        System.out.println("Please enter your account balance in dollars");
        double balance = input.nextDouble();
        
        System.out.println("Please enter the rate of interest in percentage");
        double interest = input.nextDouble() / 100;
        
        System.out.println("Please enter the amount of time your account will gather interest in years");
        int time = input.nextInt();
        
        
        double remainingBalance = run.compoundInterest(balance, interest, time);
        System.out.println("Your balance after " + time + " years will be: " + remainingBalance);
        
    }
}
