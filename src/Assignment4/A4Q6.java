/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 * tell someone if they are speeding and tell them their fine
 * @author Hunter Oswald
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanners for speed limit and car's speed
        Scanner limit = new Scanner(System.in);
        Scanner carSpeed = new Scanner(System.in);
        
        // ask for speed limit and current speed
        System.out.println("What is the speed limit?");
        int speedLimit = limit.nextInt();
        
        System.out.println("What is your speed?");
        int speed = carSpeed.nextInt();
        
        
        // output if they have a fine
        if (speed > speedLimit && speed <= speedLimit + 20) {
            System.out.println("You are speeding and your fine is $100");
        }
        if (speed >= speedLimit + 21 && speed <= speedLimit + 30) {
            System.out.println("You are speeding and your fine is $270");
        }
        if (speed >= speedLimit + 31) {
            System.out.println("You are speeding and your fine is $500");
        }
        
        
        
        
        
        
        
        
    }
}
