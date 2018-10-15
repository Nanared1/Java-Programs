/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation.exercise11;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class QuadraticEquationExercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int standard_a, standard_b, standard_c;
        System.out.print("Enter Value for a: ");
        standard_a = input.nextInt();
        System.out.print("Enter Value for b: ");
        standard_b = input.nextInt();
        System.out.print("Enter Value for c: ");
        standard_c = input.nextInt();
        
        double discriminant = Math.pow(standard_b, 2) - (double)(4*standard_a*
                standard_c);
        double plus = (-(double)(standard_b)+Math.sqrt(discriminant))/
                (2*(double)standard_a);
        double minus = (-(double)(standard_b)-Math.sqrt(discriminant))/
                (2*(double)standard_a);
        
        System.out.println("The roots are " + plus + " and " + minus);
    }
    
}