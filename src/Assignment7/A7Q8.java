/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 * return true or false depending on if the integer has all odd numbers
 * @author Hunter Oswald
 */
public class A7Q8 {

    // method to return true of number is all odd numbers and false if not all odd
    public boolean allOdd(int number) {
        boolean allOdd = true;
        
        if (number < 0) {
            number = number - (number * 2);
        }
        // store the value of number, create a length integer and divide the number stored by 10 till it is greater than 10 
        // adding one to length each time
        int tempNum = number;
        int length = 1;
        while (tempNum >= 10) {
            tempNum = tempNum / 10;
            length++;
        }
        // for loop, get the last digit of the number, and see if it's odd by finding the remainder of it divided by 2.
        // if it's 0, then it's an even number and it is not all odd numbers
        // if not, divides the number by 10 to get the last digit again
        for (int i = 0; i < length; i++) {
            int remainder = number % 10;
            if (remainder % 2 == 0) {
                allOdd = false;
                break;
            } else {
                number = number / 10;
            }
        }
        // return
        return allOdd;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run the methods
        A7Q8 run = new A7Q8();
        
        // create a scanner, ask for input and store the input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer:");
        
        int num = input.nextInt();
        
        // store the return of the method
        boolean allOdd = run.allOdd(num);
        
        //output
        if (allOdd == true) {
        System.out.println("The number you inputted has all odd numbers");
        } else {
            System.out.println("The number you inputted does not have all odd numbers");
        }
    }
}
