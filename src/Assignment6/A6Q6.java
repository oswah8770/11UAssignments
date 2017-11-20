/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 * ask for size of class, get marks and output lowest, highest, and average mark
 * @author Hunter Oswald
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanners for students and marks
        Scanner studentInput = new Scanner(System.in);
        Scanner marksInput = new Scanner(System.in);
        
        // get input for students
        System.out.println("Please enter the number of students:");
        int students = studentInput.nextInt();
        
        // array of marks
        double[] marks = new double[students];
        
        // get input for marks, create variable to store numbers when switching places (sorting)
        double storing = 0;
        
        // ask for marks input
        System.out.println("Please enter the marks:");
        
        //input for marks
        for (int z = 0; z < students; z++) {
            // get input at the position z
            marks[z] = marksInput.nextDouble();
        }
        
        // sort lowest to highest to be able to output lowest and highest mark with accuracy
        for (int i = 0; i < students; i++) {
            for (int x = 0; x < students - 1; x++) {
                // sort the numbers using bubble sort (
                if (marks[x] > marks[x+1]) {
                    storing = marks[x];
                    marks[x] = marks[x + 1];
                    marks[x+1] = storing;
                }
            }
        }
        
        // output lowest and highest marks
        System.out.println("The lowest mark was " + marks[0] + ". You'll do better next time!");
        System.out.println("The highest mark was " + marks[students - 1] + ". You did very well!");
        
        // variable used to calculate average
        double averageCalc = 0;
        
        // for loop to calculate average
        for (int y = 0; y < students; y++) {
            // add the height at y to the current number in the variable caluculations later used to find average
            averageCalc = averageCalc + marks[y];
        }
        
        // calculate average using the total of all the marks
        double average = averageCalc / students;
        double average2 = Math.round(average * 100.00);
        double average3 = average2 / 100.00;
        
        // output the average mark. If less than 75 (level 3) explain they need to improve and if higher tell them to keep going!
        if (average3 < 75) {
            System.out.println("The average mark was " + average3 + ". Work harder as a class to improve!");
        } else {
            System.out.println("The average mark was " + average3 + ". Good job, now keep going!");
        }
        
        
        
        
        
        
        
        
    }
}
