/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 * convert inches to cm
 * @author Hunter Oswald
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask for input
        System.out.println("Please enter the measurement in inches you wish to convert:");
        
        // create variable
        double inches = input.nextDouble();
        
        double centi = inches * 2.54;
        
        // output conversion
        System.out.println(inches + " inches" + " is the same as " + centi + " cm");
        
        
    }
}
