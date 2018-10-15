/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6.change;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise6Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the change in cents: ");
        int cents = input.nextInt();
        System.out.println("The minimum number of coins is:");
        int quarters, dimes, nickels, pennies;
        int leftover_1, leftover_2;
        quarters = cents/25;
        leftover_1 = cents%25;
        dimes = leftover_1/10;
        leftover_2 = leftover_1%10;
        nickels = leftover_2/5;
        pennies = leftover_2%5;
        System.out.println("\tQuarters:" + quarters);
        System.out.println("\tDimes:" + dimes);
        System.out.println("\tNickels:" + nickels);
        System.out.println("\tPennies:" + pennies);
    }
    
}
