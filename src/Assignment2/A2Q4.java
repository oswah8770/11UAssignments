/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 * create a guard patrol for king java's castle
 * @author Hunter Oswald
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // city and robots
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 0, 0, Direction.EAST);
        
        // creating the castle
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        new Wall(kitchener, 1, 1, Direction.EAST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.WEST);
        new Wall(kitchener, 1, 4, Direction.EAST);
        
        new Wall(kitchener, 4, 1, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.SOUTH);
        new Wall(kitchener, 4, 1, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.WEST);
        
        new Wall(kitchener, 4, 4, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.WEST);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.EAST);
        
        new Wall(kitchener, 2, 2, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.WEST);
        
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.WEST);
        
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.EAST);
        
        
        // move around the castle
        while (true) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        
        
    }
}
