/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_timeconverter;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Review_TimeConverter {
    public static void hours_minutes() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many hours to convert to minutes");
        int hrs = input.nextInt();
        int minutes = (60*hrs)/1;
        System.out.println("\nThere are " + minutes +" mins in " + hrs + " hours.");
    }
    public static void days_hours() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many days to convert ot hours");
        int days = input.nextInt();
        int hours = (24*days)/1;
        System.out.println("\nThere are " + hours +" hours in " + days + " days");
    }
    public static void minutes_hours() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many minutes to convert to hours: ");
        int minutes = input.nextInt();
        double hours = (1.0*(double)minutes)/60.0;
        System.out.println("\nThere are " + hours +" hours in " + minutes + " minutes");
    }
    public static void hours_days() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many hours to convert to days: ");
        int hours = input.nextInt();
        double days = (1.0*(double)hours)/24.0;
        System.out.println("\nThere are " + days +" days in " + hours + " hours");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("1 = hours to minutes");
        System.out.println("2 = days to hours");
        System.out.println("3 = minutes to hours");
        System.out.println("4 = hours to days");
        
        System.out.print("\nMake a conversion choice: ");
        int user_choice = input.nextInt();
        
        if(user_choice == 1){
            hours_minutes();
        }else if(user_choice == 2){
            days_hours();
        }else if(user_choice == 3){
            minutes_hours();
        }else if(user_choice == 4){
            hours_days();
        }
    }
    
}
