/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 * Get heights and display all heights that were above average
 *
 * @author Hunter Oswald
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners
        Scanner peopleInput = new Scanner(System.in);

        Scanner heightInput = new Scanner(System.in);

        // ask for input and get input
        System.out.println("How many people's heights will I need to use in my calculations?");

        int people = peopleInput.nextInt();

        System.out.println("Please enter the heights in cm:");

        // array of heights at the length of the amount of people
        double[] heights = new double[people];

        double calc = 0;

        // for loop to calculate average height and get input for said heights
        for (int i = 0; i < people; i++) {

            heights[i] = heightInput.nextDouble();

            // calculate average height
            calc = calc + heights[i];


        }
        // average height
        double average = calc / people;
        System.out.println("The average height was " + average + "cm.");

        // for loop to output heights above average
        System.out.println("Heights that were above average include:");

        for (int z = 0; z < people; z++) {
            // outputs persons name and height if they are above average
            if (heights[z] > average) {
                System.out.println("Person " + (z + 1) + ": " + heights[z]);
            }


        }





    }
}
