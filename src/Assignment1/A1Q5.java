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
 * have two robots pick up items karel dropped and meet in specified place
 * @author Hunter Oswald
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city and robots
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 3, 3, Direction.EAST);
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
        
        
        // set labels
        karel.setLabel("K");
        maria.setLabel("M");
        
        // make walls
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.WEST);
        
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        
        //make things
        new Thing(kitchener, 0, 0);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 1);
        
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 1, 2);
        
        // make movements of karel and maria
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.pickThing();
        maria.move();
        maria.pickThing();
        
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.move();
        karel.pickThing();
        
        maria.turnLeft();
        karel.turnLeft();
        maria.move();
        maria.pickThing();
        
        
    }
}
