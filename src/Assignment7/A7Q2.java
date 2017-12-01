/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 * Create a procedure type method that returns the letter grade to the corresponding number grade
 * @author Hunter Oswald
 */
public class A7Q2 {

    // create a procedure method that says what grade they got
    public void examGrade(int grade) {
        if (grade >= 80) {
            System.out.println("Your grade is a 'A'");
        } else if (grade <= 79 && grade >= 70) {
            System.out.println("Your grade is a 'B'");
        } else if (grade <= 69 && grade >= 60) {
            System.out.println("Your grade is a 'C'");
        } else if (grade <= 59 && grade >= 50) {
            System.out.println("Your grade is a 'D'");
        } else if (grade <= 50) {
            System.out.println("Your grade is an 'F'");
        } else {
            System.out.println("I think you input the wrong number, Sorry!");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run the methods
        A7Q2 run = new A7Q2();
        
        // create a scanner and ask for the grade (percentage)
        Scanner input = new Scanner(System.in);
        System.out.println("What percentage do you have?");
        
        // store the exam grade (percentage)
        int grade = input.nextInt();
        
        // output the letter grade
        run.examGrade(grade);
        
    }
}
