/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8.divandmod;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise8DIvandMod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int first_num = input.nextInt();
        System.out.print("\nEnter a second integer: ");
        int second_num = input.nextInt();
        System.out.println(first_num+" / "+second_num+" = " + first_num/second_num);
        System.out.println(first_num+" % "+second_num+" = " + first_num%second_num);
        System.out.println(second_num+" / "+first_num+" = " + second_num/first_num);
        System.out.println(second_num+" % "+first_num+" = " + second_num%first_num);
    }
    
}
