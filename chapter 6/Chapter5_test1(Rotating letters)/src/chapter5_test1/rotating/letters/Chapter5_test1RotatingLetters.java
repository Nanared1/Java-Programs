/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5_test1.rotating.letters;

import java.util.Scanner;

/**
 *
 * @author nanabaahabekah
 */
public class Chapter5_test1RotatingLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Prompt user for a word.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Give a word: ");
        String user_input = input.nextLine();                                   //store the word in user_input
        int count = 0;
        String letter;
        user_input = user_input.toLowerCase();                                  //set all letter of the word to lower case
        
        /**
         * Run a for - loop between 0 and a number less than the length of the word.
         */
        for(int i = 0; i < user_input.length(); i++){
            
            /*
                Check if the loop has gotten to the last letter.
            */
            if(i != (user_input.length()-1)){
                letter = user_input.substring(i, i+1);                          
            }else{                                                              
                letter = user_input.substring(i);                               //if it is at the last letter, get the substring of only the last letter
            }
            
            /*
                Check if the letter corresponds to i,o,s,h,z,x and n.
            */
            if(letter.equals("i") || letter.equals("o") || letter.equals("s")
                    || letter.equals("h") || letter.equals("z") 
                    || letter.equals("x") || letter.equals("n")){
            }else{
                count++;                                                        //if any letter does not correspond to the last letter, increment count
                System.out.println("NO the word cannot be used.");              //and print out - "NO the word cannot be used."
                break;
            }
        }
        
        if(count == 0){
            System.out.println("YES the word can be used.");                    //If count is equal to 0, then all the letter are rotating letter. Output yes.
        }
    }
    
}
