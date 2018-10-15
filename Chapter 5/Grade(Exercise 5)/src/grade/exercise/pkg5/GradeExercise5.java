/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.exercise.pkg5;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class GradeExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Percentage: ");
        int grade = input.nextInt();
        String grade_letter = "";
        if(grade <= 100 && grade >= 90){
            grade_letter = "A";
        }else if(grade <= 89 && grade >= 80){
            grade_letter = "B";
        }else if(grade <= 79 && grade >= 70){
            grade_letter = "C";
        }else if(grade <= 69 && grade >= 60){
            grade_letter = "D";
        }else{
            grade_letter = "F";
        }
        
        System.out.println("The corresponding letter grade is: "+grade_letter);
    }
    
}
