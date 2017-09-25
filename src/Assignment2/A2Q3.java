/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 * get karel to always return to 0, 0
 * @author Hunter Oswald
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city and robots
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 10, 11, Direction.SOUTH);
        
        
        // algorithm so he always returns to 0 0
        while (karel.getAvenue() != 0 && karel.getStreet() != 0) {
            while (karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
            }
            
            
            while (karel.getAvenue() != 0) {
                    karel.move();
            }
                    
            
            while (karel.getDirection() != Direction.NORTH) {
                        karel.turnLeft();
            }
                        
            while (karel.getStreet() != 0) {
                            karel.move();
            }
                    
                
            
        
        
    

    
    
    
    
    
    
    
    
    
    
    
    
    }
}
}