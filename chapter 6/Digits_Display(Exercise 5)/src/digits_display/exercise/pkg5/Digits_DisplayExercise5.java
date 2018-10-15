/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digits_display.exercise.pkg5;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Digits_DisplayExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int leftover;
        int hundreds = num/100;
        leftover = num%100;
        int tens = leftover/10;
        int ones = num%10;
        
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
    }
    
}
