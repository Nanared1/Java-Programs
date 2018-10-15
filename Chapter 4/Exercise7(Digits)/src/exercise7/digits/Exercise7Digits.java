/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7.digits;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise7Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int in_number = input.nextInt();
        int hundreds, tens, ones;
        int left_over;
        hundreds = in_number/100;
        left_over = in_number%100;
        tens = left_over/10;
        ones = left_over%10;
        System.out.println("\nThe hundreds-place digit is: "+hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The ones-place digit is: " + ones);
    }
    
}
