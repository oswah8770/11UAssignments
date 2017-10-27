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

        int vowel = 0;


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                // when finds a vowel inserts ub before it. skip the next letter by adding 3. 1 for the next char, 2 for the ub added
                String front = word.substring(0, i);
                String ending = word.substring(i);

                word = front + "ub" + ending;

                vowel = 0;
                
                
                for (int z = 0; z + i + 4 < word.length(); z++) {
                    System.out.println("in loop");
                    if (word.charAt(z + i + 4) == 'a' || word.charAt(z + i + 4) == 'e' || word.charAt(z + i + 4) == 'i' || word.charAt(z + i + 4) == 'o' || word.charAt(z + i + 4) == 'u') {
                        vowel++;
                        System.out.println(vowel);
                    } else {
                        break;
                    }
                }

                i = i + vowel;
                
                
            }

        }


        // output translated word
        System.out.println("In Ubbi Dubbi is: " + word);

    }
}