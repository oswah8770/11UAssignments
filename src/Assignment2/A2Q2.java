/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * have karel participate in a hurdle race
 * @author Hunter Oswald
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city and robot
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 3, 1, Direction.EAST);
        
        // esablishing hurdles
        new Wall(kitchener, 3, 1, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 4, Direction.SOUTH);
        new Wall(kitchener, 3, 5, Direction.SOUTH);
        new Wall(kitchener, 3, 6, Direction.SOUTH);
        new Wall(kitchener, 3, 7, Direction.SOUTH);
        new Wall(kitchener, 3, 8, Direction.SOUTH);
        new Wall(kitchener, 3, 9, Direction.SOUTH);
        
        // finish line
        new Thing(kitchener, 3, 10);
        
        // hurdles
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 6, Direction.EAST);
        new Wall(kitchener, 3, 5, Direction.EAST);
        
        // make algorithms so he jumps the hurdles and keeps moving no matter how long the hurdles are.
                
                while (karel.frontIsClear() == true) {
                    
                    if (karel.canPickThing() != true) {
                        karel.move();
                    
                        while(karel.frontIsClear() != true) {
                        karel.turnLeft();
                        karel.move();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.move();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.move();
                        karel.turnLeft();
                        
                }
            }
        
        

            
            
            
            
            
            
            
            
            
            
    }
}}