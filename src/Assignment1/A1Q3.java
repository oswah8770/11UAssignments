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
 * have a robot climb a mountain, place flag at top, then descend
 * @author Hunter Oswald
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // establish city and robot
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 3, 0, Direction.EAST);
        
        // make thing
        new Thing(kitchener, 3, 1);
        
        // make the mountain out of walls
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        
        new Wall(kitchener, 2, 3, Direction.WEST);
        
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.EAST);
        
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.EAST);
        
        new Wall(kitchener, 3, 4, Direction.EAST);
        
        //all movements, picking things, dropping things
        karel.move();
        
        // picking up flag
        karel.pickThing();
        
        // going up the mountain
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        
        
        // placing flag
        karel.putThing();
        
        // going down the mountain
        karel.move();
        
        karel.turnLeft();
        karel.turnLeft();
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
        
        
    }
}
