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
        boolean foundV = false;

        String translated = "";

        StringBuilder sb = new StringBuilder(translated);



        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundV == false) {
                // when finds a vowel inserts ub before it, keeps adding the string
                // inserts ub and the vowel after it
                sb.append("ub");
                sb.append(word.charAt(i));
                foundV = true;

            } else if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundV == true) {
                // inserts just the vowel no ub (this comes after a vowel has already been found
                sb.append(word.charAt(i));
            } else {
                // inserts the letter and just that
                sb.append(word.charAt(i));
                foundV = false;
            }




        }


        // output translated word
        System.out.println("In Ubbi Dubbi is: " + sb);

    }
}