/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 * user inputs name and it outputs a greeting
 * @author oswah8770
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ask for their name
        System.out.println("Please enter your name:");
        
        // create a scanner
        Scanner name = new Scanner(System.in);
        
        // variable
        String firstName = name.nextLine();
        
        // output greeting
        System.out.println("Hello " + firstName + ", How are you today?");
        
    }
}
