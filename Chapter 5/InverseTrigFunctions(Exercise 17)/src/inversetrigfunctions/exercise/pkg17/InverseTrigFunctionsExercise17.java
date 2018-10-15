/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversetrigfunctions.exercise.pkg17;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
import static java.lang.Math.acos;
import static java.lang.Math.asin;
import static java.lang.Math.atan;
import static java.lang.Math.toRadians;
public class InverseTrigFunctionsExercise17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an angle in degrees: ");
        double degrees = (double)input.nextInt();
        degrees = toRadians(degrees);
        
        double trig_sin, trig_cos, trig_tan;
        
        trig_sin = asin(degrees);
        trig_cos = acos(degrees);
        trig_tan = atan(degrees);
        
        System.out.println("Arcsin: "+ String.format("%.2f",trig_sin));
        System.out.println("Arccos: "+ String.format("%.2f",trig_cos));
        System.out.println("Arctan: "+ String.format("%.2f",trig_tan));
    }
    
}
