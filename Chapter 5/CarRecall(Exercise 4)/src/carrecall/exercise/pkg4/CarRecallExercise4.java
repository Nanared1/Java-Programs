/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrecall.exercise.pkg4;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class CarRecallExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the car's model number: ");
        int model_number = input.nextInt();
        String defect = "Your car is defective. It must be repaired.";
        String not_defect = "Your car is not defective.";
        String ans = "";
        
        if(model_number >= 189 && model_number <= 195){
            ans = defect;
        }else if(model_number == 119 || model_number == 179
                || model_number == 221 || model_number == 780){
            ans = defect;
        }else{
            ans = not_defect;
        }
        System.out.println(ans);
    }
    
}
