/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *  make a robot move 10 things to 1 intersection over
 * @author Hunter Oswald
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city and robots
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        // show # of things
        kw.showThingCounts(true);
        
        // 10 things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        
        // move things from one intersection to the next
        for (int thingCounter = 0; thingCounter < 10; thingCounter = thingCounter + 1) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            
        }
        
       karel.move();
        
        
        
    }
}
