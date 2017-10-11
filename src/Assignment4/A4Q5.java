/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 * calculate marks of tests and output it (5 tests)
 * @author Hunter Oswald
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners and ask for input
        System.out.println("Please enter your name:");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        
        // input the max score for the first test
        System.out.println("What was the first test out of?");
        Scanner firstTest = new Scanner(System.in);
        double firstTotal = firstTest.nextDouble();
        
        // input your mark
        System.out.println("What mark did you get?");
        Scanner firstTestMark = new Scanner(System.in);
        double totalFirstMark = firstTestMark.nextDouble();
        
        // input max score of second test
        System.out.println("What was the second test out of?");
        Scanner secondTest = new Scanner(System.in);
        double secondTotal = secondTest.nextDouble();
        
        // input the mark you got
        System.out.println("What mark did you get?");
        Scanner secondTestMark = new Scanner(System.in);
        double totalSecondMark = secondTestMark.nextDouble();
        
        // input max score of third test
        System.out.println("What was the third test out of?");
        Scanner thirdTest = new Scanner(System.in);
        double thirdTotal = thirdTest.nextDouble();
        
        // input mark you got
        System.out.println("What mark did you get?");
        Scanner thirdTestMark = new Scanner(System.in);
        double totalThirdMark = thirdTestMark.nextDouble();
        
        // input max score of fourth test
        System.out.println("What was the fourth test out of?");
        Scanner fourthTest = new Scanner(System.in);
        double fourthTotal = fourthTest.nextDouble();
        
        // input your mark
        System.out.println("What mark did you get?");
        Scanner fourthTestMark = new Scanner(System.in);
        double totalFourthMark = fourthTestMark.nextDouble();
        
        // input max score of fifth test
        System.out.println("What was the fifth test out of?");
        Scanner fifthTest = new Scanner(System.in);
        double fifthTotal = fifthTest.nextInt();
        
        // input your mark
        System.out.println("What mark did you get?");
        Scanner fifthTestMark = new Scanner(System.in);
        double totalFifthMark = fifthTestMark.nextInt();
        
        
        // output test scores
        System.out.println("Total Test Scores For " + name);
        
        // test 1
        double firstPerc = totalFirstMark / firstTotal * 100;
        System.out.println("Test 1: " + firstPerc + "%");
        
        // test 2
        double secondPerc = totalSecondMark / secondTotal * 100;
        System.out.println("Test 2: " + secondPerc + "%");
        
        // test 3
        double thirdPerc = totalThirdMark / thirdTotal * 100;
        System.out.println("Test 3: " + thirdPerc + "%");
        
        // test 4
        double fourthPerc = totalFourthMark / fourthTotal * 100;
        System.out.println("Test 4: " + fourthPerc + "%");
        
        // test 5
        double fifthPerc = totalFifthMark / fifthTotal * 100;
        System.out.println("Test 5: " + fifthPerc + "%");
        
        
        
        
    }
}
