/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * have a robot get a newspaper then come back to bed
 * @author Hunter Oswald
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city and robot
        City kitchener = new City();
        
        Robot karel = new Robot(kitchener, 1, 2, Direction.SOUTH);
        
        
        // add walls
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction. SOUTH);
        
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        
        // add newspaper, or thing
        new Thing(kitchener, 2, 2);
        
        //move karel to get the newspaper
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        karel.move();
        
        karel.pickThing();
        
        // bring karel back with the thing
        karel.turnLeft();
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
        karel.turnLeft();
        karel.turnLeft();
        
        
        
          
    }
}
