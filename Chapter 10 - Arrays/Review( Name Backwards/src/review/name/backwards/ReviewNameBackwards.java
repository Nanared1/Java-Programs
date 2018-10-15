/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review.name.backwards;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class ReviewNameBackwards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        char[] letter = name.toCharArray();
        System.out.print("Name backwards: ");
        for(int i = letter.length-1; i >= 0; i--){
            System.out.print(letter[i]);
        }
        System.out.println("");
    }
}
