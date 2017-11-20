/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

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
        int[] numArray = new int[1000];

        // array of true and false corresponding to a number in the array
        boolean[] primeOrNah = new boolean[1000];

        // integer to know what prime number we're counting up by
        int t = 2;
        
        // for loop to make put the number into the array (making the list) (fills in array)
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
        }

        // for loop to mark everything as 2, undefined. 1 is prime 0 is not prime.
        for (int u = 0; u < numArray.length; u++) {
            primeOrNah[u] = true;
        }
        
        primeOrNah[2] = true;
        // for loop to mark things as not prime
        for (int i = 2; i < numArray.length; i++) {
            // for loop define all non prime
            for (int z = t * 2; z < numArray.length; z = z + t) {
                primeOrNah[z] = false;
                }
            // find next non marked number (true in this case is not marked, until the entire process is finished where it is then prime)
            int store = t;
            for (int x = t; x < numArray.length; x = x + 1) {
                if (t < primeOrNah.length - 1) {    
                t++;
                }
                    if (primeOrNah[t] == true) {
                        break;
                    }
                }
                
                
            }
        
        // output
        int yo = 2;
        System.out.println(numArray[yo] + ", " + primeOrNah[yo]);
        
        
    
    
    }
    }
