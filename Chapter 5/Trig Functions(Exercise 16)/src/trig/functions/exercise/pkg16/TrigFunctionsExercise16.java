/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trig.functions.exercise.pkg16;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;
public class TrigFunctionsExercise16 {

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
        
        trig_sin = sin(degrees);
        trig_cos = cos(degrees);
        trig_tan = tan(degrees);
        
        System.out.print("Sine: "+ String.format("%.2g%n",trig_sin));
        System.out.print("Cosine: "+ String.format("%.2g%n",trig_cos));
        System.out.print("Tanent: "+ String.format("%.2g%n",trig_tan));
    }
    
}
