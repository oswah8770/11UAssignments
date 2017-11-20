/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 * Read lists of marks and calculate class average to nearest 2 decimal places
 *
 * @author Hunter Oswald
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to get input
        Scanner marksInput = new Scanner(System.in);

        Scanner studentsInput = new Scanner(System.in);

        // Asks for input and stores the amount of students. creates an array for marks at the size of students

        System.out.println("How many students are in the class?");

        int students = studentsInput.nextInt();

        double[] marks = new double[students];

        System.out.println("Please enter the marks:");

        // double for average mark
        double calc = 0;

        // for loop to gather marks based on how many students there are
        for (int i = 0; i < students; i++) {
            // gets marks at each space
            marks[i] = marksInput.nextDouble();

            // calc average
            calc = calc + marks[i];

        }
        // calculations in for loop divided by number of students gives the average
        double average = (calc / students);
        double averageR = Math.round(average * 100.00);
        double averageR2 = averageR / 100.00;

        // output
        System.out.println("The class average is " + averageR2 + "%.");






    }
}
