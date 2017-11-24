/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 * Make a program that finds all the prime numbers between 2 - 1000 using the
 * sieve of Eratosthenes
 *
 * @author Hunter Oswald
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create array of numbers
        int[] numArray = new int[1001];

        // array of true and false corresponding to a number in the array
        boolean[] primeOrNah = new boolean[1001];

        // integer to know what prime number we're counting up by
        int t = 2;
        
        // for loop to make put the number into the array (making the list) (fills in array)
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
        }

        // for loop to mark everything as true
        for (int u = 0; u < numArray.length; u++) {
            primeOrNah[u] = true;
        }
        
        primeOrNah[2] = true;
        // for loop to mark things as not prime or prime
        for (int i = 2; i < numArray.length; i++) {
            // for loop define all non prime
            for (int z = t * 2; z < numArray.length; z = z + t) {
                primeOrNah[z] = false;
                }
            // find next non marked number (true in this case is not marked, until the entire process is finished where it is then prime. t is then this prime number)
            for (int x = t; x < numArray.length; x = x + 1) {
                if (t < primeOrNah.length - 1) {    
                t++;
                }
                    if (primeOrNah[t] == true) {
                        break;
                    }
                }
                
                
            }
        
        // output. If the value of the boolean that represents whether the number is prime or not is true, it outputs that it is a prime and vise versa
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int numInput = input.nextInt();
        
        if (primeOrNah[numInput] == true) {
        
        System.out.println(numArray[numInput] + " is a prime number");
        } else {
            System.out.println(numArray[numInput] + " is NOT a prime number");
        }
        
    
    
    }
    }

