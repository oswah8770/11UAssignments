package Assignment5;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * translate word inputted into ubbi dubbi
 *
 * @author Hunter Oswald
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask for a word and get input for it
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = input.nextLine();

        // convert to lowercase
        word = word.toLowerCase();
        // make a blank string to create the translated word.
        boolean foundV = false;

        String translated = "";

        StringBuilder sb = new StringBuilder(translated);


// for loop to build the translated word in the 'translated' string (blank)
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundV == false) {
                // inserts ub and the vowel after it after finding a vowel, makes found vowel true so it knows not to add ub until a consonant is found
                sb.append("ub");
                sb.append(word.charAt(i));
                foundV = true;

            } else if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundV == true) {
                // inserts just the vowel no ub (this comes after a vowel has already been found)
                sb.append(word.charAt(i));
            } else {
                // inserts the letter and just that. makes found vowel false so it knows that it has found a consonant and can now add ub before the next vowel found
                sb.append(word.charAt(i));
                foundV = false;
            }




        }


        // output translated word
        System.out.println("In Ubbi Dubbi is: " + sb);

    }
}