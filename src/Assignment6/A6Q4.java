/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 * sorts 10 numbers in order from lowest to highest using bubble sort
 *
 * @author Hunter Oswald
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner
        Scanner marksInput = new Scanner(System.in);

        // array
        double[] marks = new double[10];

        // ask for input
        System.out.println("Enter 10 marks:");

        for (int i = 0; i < marks.length; i++) {
            // input
            marks[i] = marksInput.nextDouble();

        }
        // storing a number when swapping places
        double store = 0;
        // sorting
        for(int z = 0; z < marks.length; z++) {
            // execute this second for loop the same amount of times as the length - 1 because don't want to compare position 9 to 10 (10 doesn't exist)
            for (int y = 0; y < marks.length - 1; y++) {
                if (marks[y] > marks[y+1]) {
                    store = marks[y];
                    marks[y] = marks[y+1];
                    marks[y+1] = store;
                }
                
                
                
            }
            
        }
        
        // output the marks in ascending order
        System.out.println("The marks in ascending order are: ");
        for (int x = 0; x < marks.length; x++) {
            if (marks[x] != marks.length) {
            System.out.print(marks[x] + ", ");
            } else {
                System.out.println(marks[x]);
            }
            
            
            
        }
        
        
    
        
        
    

 
        
    
        
        
        
        
        
        


    }
}
