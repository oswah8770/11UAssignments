/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author oswah8770
 */
public class VariableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating robot and city
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 1, 1, Direction.EAST);
        
        // move counting variable
        int moveCounter = 0;
        
        // move until have moved 10
        while (moveCounter < 10) {
            // move forward
            karel.move();
            // add 1 to moveCounter
            moveCounter = moveCounter + 1;
        }
        karel.turnLeft();
        karel.turnLeft();
        
        // counted for loop
        for (int count = 0; count < 10; count = count + 1) {
            // move forward
            karel.move();
        }
        
        
        
        
        
    }
}
