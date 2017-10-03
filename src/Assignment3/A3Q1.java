/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 * make a robot go around a square twice
 * @author Hunter Oswald
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create robot and city
        City kw = new City();
        Robot karel = new Robot(kw, 0, 2, Direction.WEST);
        
        // walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        
        // for loop to go around twice
        for (int moveCounter = 0; moveCounter < 8; moveCounter = moveCounter + 1) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
        }
        
        
        
        
        
    }
}
