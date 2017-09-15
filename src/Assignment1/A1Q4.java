/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 * have two robots end up in the same spot looking opposite ways at approx same time
 * @author Hunter Oswald
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city and robots
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 0, 0, Direction.SOUTH);
        Robot farzam = new Robot(kitchener, 0, 1, Direction.SOUTH);
        
        
        // changing color of robots
        karel.setColor(Color.BLUE);
        farzam.setColor(Color.ORANGE);
        farzam.setLabel("F");
        karel.setLabel("K");
        
        
        // create walls
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        //make robots move and reach destination at approx same time
        karel.move();
        farzam.move();
        karel.move();
        farzam.turnLeft();
        karel.turnLeft();
        farzam.move();
        farzam.turnLeft();
        farzam.turnLeft();
        farzam.turnLeft();
        farzam.move();
        farzam.turnLeft();
        farzam.turnLeft();
        farzam.turnLeft();
        karel.move();
        farzam.move();
    }
}
