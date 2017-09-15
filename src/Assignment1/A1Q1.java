/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 * have a robot move around a square
 * @author Hunter Oswald
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // establish city and robot named kitchener and karel respectively
        City kitchener = new City();
        
        Robot karel = new Robot(kitchener, 0, 2, Direction.WEST);
        
        
        
        
        // add 8 walls
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        
        //move karel around the wall to starting point
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
    }
}
