/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author oswah8770
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int currentSquare = 1;
        
        while (currentSquare != 100) {
            System.out.println("Enter sum of the dice:");
            Scanner diceSum = new Scanner(System.in);
            int totalDice = diceSum.nextInt();
            
            if (totalDice == 0) {
                System.out.println("You Quit!");
                break;
            }
            // calculating their place on the board
            currentSquare = currentSquare + totalDice;
            
            // snakes
            if (currentSquare == 54) {
                currentSquare = 19;
            }
            if (currentSquare == 90) {
                currentSquare = 48;
            }
            if (currentSquare == 99) {
                currentSquare = 77;
            }
            
            // ladders
            if (currentSquare == 9) {
                currentSquare = 34;
            }
            if (currentSquare == 40) {
                currentSquare = 64;
            }
            if (currentSquare == 67) {
                currentSquare = 86;
            }
            
            System.out.println("You are on square " + currentSquare);
            
            if (currentSquare == 100) {
                System.out.println("You Win!");
            }
            
        
        }
        
        
        
        
        
        
        
                
    }
}
