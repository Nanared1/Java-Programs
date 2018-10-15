/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11.order;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise11Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double burgers, fries, sodas;
        burgers = 1.69;
        fries = 1.09;
        sodas = 0.99;
        
        System.out.print("Enter the number of burgers: ");
        int burgers_amount = input.nextInt();
        System.out.print("Enter the number of fries: ");
        int fries_amount = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        int sodas_amount = input.nextInt();
        
        double total_noTax = (double)((burgers_amount*burgers)+(fries_amount*fries)+(sodas_amount*sodas));
        System.out.println("Total before tax: $" +String.format("%.2f",total_noTax));
        
        double tax = ((6.5/100)*total_noTax);
        
        System.out.println("Tax: $"+String.format("%.2f",tax));
        double final_total = (tax+total_noTax);
        System.out.println("Final Total: $"+String.format("%.2f", final_total));
        
        System.out.print("Enter amount tendered: $");
        double amount_tendered = input.nextDouble();
        double change = amount_tendered - final_total;
        System.out.println("Change: $"+String.format("%.2f",change));
    }
    
}
