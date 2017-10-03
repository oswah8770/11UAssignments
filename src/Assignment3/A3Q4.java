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
 * make karel go around 4 squares and end up in the same spot
 *
 * @author Hunter Oswald
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city and robot
        City kw = new City();
        Robot karel = new Robot(kw, 3, 3, Direction.SOUTH);

        // creating walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);

        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);

        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);


        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);

        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);

        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.WEST);

        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);



        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);

        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.EAST);

        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.WEST);


        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);

        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);

        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.WEST);

        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);





        // for loops to go around the squares
        for (int firstSquare = 0; firstSquare < 3; firstSquare = firstSquare + 1) {
            // move forward around first square

            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            // once the firstsquare for loop has executed 2 times, execute the if statement below
            if (firstSquare == 2) {
                for (int otherSquares = 0; otherSquares < 3; otherSquares = otherSquares + 1) {
                   // goes forward and then around the square, ending three spaces away from the start
                    // executes 3 times for the 3 squares
                    karel.move();
                    karel.move();
                    karel.move();
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
                }
            }
        }
// moves three spaces after all loops to reach the starting point
karel.move();
karel.move();
karel.move();



    }
}
