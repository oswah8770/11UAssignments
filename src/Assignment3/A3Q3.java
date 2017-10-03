/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 * have karel plant his crops
 * @author Hunter Oswald
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city and robot
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);
        
        // counter
        kw.showThingCounts(true);
        
        // have karel plant his crops in 4 rows of 5
        
        for (int thingCounter = 0; thingCounter < 16; thingCounter = thingCounter + 1) {
            karel.putThing();
            karel.move();
            if (thingCounter == 3 || thingCounter == 7 || thingCounter == 11 || thingCounter == 15){
            karel.putThing();
            }
            if (thingCounter == 3 || thingCounter == 7 || thingCounter == 11 || thingCounter == 15) {
            
            // turn around
            karel.turnLeft();
            karel.turnLeft();
            // move
            karel.move();
            karel.move();
            karel.move();
            karel.move();
            // turn down
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            
            }
        }
        
        
        
        
        
    }
}
