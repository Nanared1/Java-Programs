/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elapsedtimecalculator.exercise.pkg11;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class ElapsedTimeCalculatorExercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting hour: ");
        int starting_hour = input.nextInt();
        System.out.print("Enter am or pm: ");
        String am_pm = input.nextLine();
        input.next();
        
        
        if(am_pm.equals("pm")){
            starting_hour+=12;
        }
        
        System.out.print("Enter the number of elapsed hours: ");
        int elapsed_hours = input.nextInt();
        int added_hours = starting_hour+elapsed_hours;
        int divide;
        int final_time = 0;
        if(added_hours > 24){
            divide = added_hours/24;
            final_time = added_hours - (24*divide);
        }else if(added_hours > 12){
            final_time = added_hours - 12;
        }else{
            final_time = added_hours;
        }
        
        System.out.println(final_time + ":00");
    }
    
}
