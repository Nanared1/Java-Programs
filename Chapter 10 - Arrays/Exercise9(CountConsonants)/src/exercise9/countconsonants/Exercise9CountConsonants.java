/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9.countconsonants;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise9CountConsonants {

    public static boolean is_vowel(char letter) {
        if(letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u'){
            return(false);
        }
        return(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String user_input = input.nextLine();
        char[] dereferenced_letters = user_input.toLowerCase().toCharArray();
        char[] letters = user_input.toCharArray();
        System.out.print("The consonant(s) in this are: ");
        for(int i = 0; i < letters.length; i++){
            if(is_vowel(dereferenced_letters[i])){
                System.out.print(letters[i]);
            }
        }
    }
}
