/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 * same as question 4 but output median mark and let people choose how many marks there are
 * @author Hunter Oswald
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // scanners
        Scanner marksInput = new Scanner(System.in);
        Scanner studentsInput = new Scanner(System.in);
        
        // students integer from input
        System.out.println("Please enter the numnber of students there are:");
        
        int students = studentsInput.nextInt();
        
        // array of marks
        double[] marks = new double[students];

        // ask for input
        System.out.println("Enter " + students + " marks:");

        for (int i = 0; i < marks.length; i++) {
            // input
            marks[i] = marksInput.nextDouble();

        }
        // storing a number when swapping places
        double store = 0;
        // sorting
        for(int z = 0; z < marks.length; z++) {
            // execute this second for loop the same amount of times as the length - 1 because don't want to compare position 10 to 11 (11 doesn't exist)
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
            System.out.print(marks[x] + ", ");
            
        }
        // output median, if two numbers are median then average them and output it
        double median = students % 2;
        if (median == 0) {
            double median2 = (marks[(students / 2) - 1] + marks[(students/2)]) / 2;
            System.out.println("The median mark was: " + median2 + "%.");
            
        } else {
            System.out.println("The median mark was: " + marks[(Math.round(students/2))] + "%.");
            
        }
        
        
        
    }
}
