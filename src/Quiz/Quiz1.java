/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * have karel clear out the mine
 *
 * @author Hunter Oswald
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city and robot
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);


        // create the mine
        // starting position wall (to determine where things are dropped)
        new Wall(kw, 1, 1, Direction.WEST);

        // wall surrounding debris
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.SOUTH);

        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.SOUTH);

        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.SOUTH);

        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.SOUTH);

        // debris
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);

        // code karel to clear mine of debris 1 at a time
        while (karel.frontIsClear() == true) {
            karel.move();
            // pick thing and turn around if he can
            if (karel.canPickThing() == true) {
                karel.pickThing();
                // break the loop if this is the end of the tunnel
                if (karel.frontIsClear() != true) {
                    break;
                }
                karel.turnLeft();
                karel.turnLeft();
                // returns back to starting position after turning around
                while (karel.frontIsClear() == true) {
                    karel.move();
                }

                // drop things at starting position
                karel.putThing();
                karel.turnLeft();
                karel.turnLeft();
            }
        }
        // make karel return to the starting position after reaching the end of the tunnel, place final debris
        karel.turnLeft();
        karel.turnLeft();
        while (karel.frontIsClear() == true) {
            karel.move();
        }
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();



    }
}
