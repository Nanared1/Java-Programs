/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12.project;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise12Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of times spent on each of the following project task: \n");
        System.out.print("Designing: ");
        int designing = input.nextInt();
        System.out.print("Coding: ");
        int coding = input.nextInt();
        System.out.print("Debugging: ");
        int debugging = input.nextInt();
        System.out.print("Testing: ");
        int testing = input.nextInt();
        
        int add_tasks = designing+coding+debugging+testing;
        
        double per_designing = ((double)designing/add_tasks)*100;
        double per_coding = ((double)coding/add_tasks)*100;
        double per_debugging = ((double)debugging/add_tasks)*100;
        double per_testing = ((double)testing/add_tasks)*100;
        
        System.out.println("\nTask \t\t % Time");
        System.out.println("Designing \t "+String.format("%.2f",per_designing)+"%");
        System.out.println("Coding \t\t "+String.format("%.2f",per_coding)+"%");
        System.out.println("Debugging \t "+String.format("%.2f",per_debugging)+"%");
        System.out.println("Testing \t "+String.format("%.2f",per_testing)+"%");
    }
    
}
