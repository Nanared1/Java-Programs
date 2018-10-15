/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review.exponential;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class ReviewExponential {


    public static double exponential(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double a = input.nextDouble();
        System.out.print("Enter exponent: ");
        double b = input.nextDouble();
        
        System.out.println(exponential(a,b));
    }
    
}
