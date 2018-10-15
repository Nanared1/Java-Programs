/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowels.exercise.pkg20;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class CountVowelsExercise20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String user_input = input.nextLine();
        int count = 0;
        String letter;
        user_input = user_input.toLowerCase();
        for(int i = 0; i < user_input.length(); i++){
            if(i != (user_input.length()-1)){
                letter = user_input.substring(i, i+1);
            }else{
                letter = user_input.substring(i);
            }
            
            if(letter.equals("a") || letter.equals("e") || letter.equals("i")
                    || letter.equals("o") || letter.equals("u")){
                count++;
            }
        }
        
        System.out.println("The number of vowels in " + user_input + " is "
        + count);
    }
    
}
