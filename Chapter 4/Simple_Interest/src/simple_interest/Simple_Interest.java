/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_interest;

/**
 * Nana Abekah
 * February 22, 2017
 * Mr. Veera 
 * ICS 3U0
 * Simple Interest
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Simple_Interest {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        int principal = input.nextInt();
        System.out.println("Enter the number of years: ");
        int no_years = input.nextInt();
        System.out.println("Enter the interest rate: ");
        double interest_rate = input.nextDouble();
        
        double amount = principal*(1+no_years*interest_rate);
        
        System.out.print("The value after the term is: "+ amount +"\n");
    }
    
}
