/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg5.energy;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise5Energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mass in kilograms: ");
        int mass = input.nextInt();
        double c = (3.0 * (Math.pow(10,8)));
        double energy = Math.pow((mass*c), 2);
        
        double light_bulbs = (energy/360000);
        System.out.print("The energy produced in Joules is = " + energy);
        System.out.println("\nThe number of 100-watt light bulbs powered = " + light_bulbs);
    }
    
}
