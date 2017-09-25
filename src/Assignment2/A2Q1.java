/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 * have a robot pick up 7 things out of 10 and keep going to the end
 * @author Hunter
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city and robot
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 1, 1, Direction.EAST);
        
        // creating things
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        new Thing(kitchener, 1, 8);
        new Thing(kitchener, 1, 9);
        new Thing(kitchener, 1, 10);
        new Thing(kitchener, 1, 11);
        
        // movement of karel
        while(karel.getAvenue() != 12) {
            karel.move();
            if (karel.getAvenue() != 9 && karel.getAvenue() != 10 && karel.getAvenue() != 11) {
                if (karel.canPickThing() == true) {
                    karel.pickThing();
                }
            }
        }
        
        
        
        
        
        
        
        
    }
}
