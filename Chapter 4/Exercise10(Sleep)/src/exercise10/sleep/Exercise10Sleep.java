/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10.sleep;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise10Sleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter you birthdate:");
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Day: ");
        int day = input.nextInt();
        
        System.out.println("Enter you today's date:");
        System.out.print("Year: ");
        int today_year = input.nextInt();
        System.out.print("Month: ");
        int today_month = input.nextInt();
        System.out.print("Day: ");
        int today_day = input.nextInt();
        
        int total_days = ((today_year-year)*365)+((today_month-month)*30)+((today_day-day));
        System.out.println("You have been alive for " + total_days+" days.");
        int sleep = (total_days*8);
        System.out.println("You have slept for "+sleep+" hours");
    }
    
}
