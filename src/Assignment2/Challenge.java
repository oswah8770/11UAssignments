/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * create an algorithm that allows karel and tina to shovel driveways no matter where they are placed or their height and width
 * @author Hunter Oswald
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city and robot
        City kitchener = new City();
        Robot karel = new Robot(kitchener, 1, 3, Direction.SOUTH);
        Robot tina = new Robot(kitchener, 1, 3, Direction.SOUTH);
        
       // labels
       tina.setLabel("T");
       karel.setLabel("K");
        
       karel.setColor(Color.ORANGE); 
        
        
        
        
        // creating walls and driveways
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 3, 2, Direction.EAST);
        new Wall(kitchener, 4, 2, Direction.EAST);
        new Wall(kitchener, 5, 2, Direction.EAST);
        
        new Wall(kitchener, 1, 3, Direction.EAST);
        
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 5, Direction.NORTH);
        new Wall(kitchener, 2, 6, Direction.NORTH);
        
        new Wall(kitchener, 2, 6, Direction.EAST);
        new Wall(kitchener, 3, 6, Direction.EAST);
        
        new Wall(kitchener, 3, 6, Direction.SOUTH);
        new Wall(kitchener, 3, 5, Direction.SOUTH);
        new Wall(kitchener, 3, 4, Direction.SOUTH);
        
        new Wall(kitchener, 4, 3, Direction.EAST);
        
        new Wall(kitchener, 5, 5, Direction.NORTH);
        new Wall(kitchener, 5, 5, Direction.EAST);
        new Wall(kitchener, 5, 5, Direction.SOUTH);
        new Wall(kitchener, 5, 4, Direction.SOUTH);
        new Wall(kitchener, 6, 3, Direction.SOUTH);
        new Wall(kitchener, 5, 4, Direction.NORTH);
        new Wall(kitchener, 6, 3, Direction.WEST);
        new Wall(kitchener, 6, 3, Direction.EAST);
        
        
        
        // snow
        new Thing(kitchener, 2, 4);
        new Thing(kitchener, 2, 5);
        new Thing(kitchener, 3, 6);
        
        // second driveway
        new Thing(kitchener, 5, 4);
        new Thing(kitchener, 5, 5);
        
        // sidewalk
        new Thing(kitchener, 2, 3);
        new Thing(kitchener, 3, 3);
        new Thing(kitchener, 4, 3);
        
        
        // shoveling algorithm
        // first, find driveway
        // clear driveway
        // return to sidewalk and carry on
       karel.move();
       karel.turnLeft();
       
       while (karel.getStreet() != 6) { 
      
       if (karel.frontIsClear() == true) {
           if (karel.canPickThing() == true) {
               karel.pickThing();
           if (karel.frontIsClear() == true) {
               karel.move();
           
           
      }
   }
}else{
           karel.turnLeft();
           karel.turnLeft();
           while (karel.getStreet() != 6) {
               if (karel.canPickThing() == true) {
                   karel.pickThing();
               
               if (karel.frontIsClear() == true) {
                   karel.move();
                   
               }
           }
       }
       }
       }       
      
      
      
      
      
      
      
      
      
      
    } 
      
}
    
    
    

        
    
    
    
    
    
    
    
   
    

