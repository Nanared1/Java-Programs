/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9.time.conversion;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise9TimeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        int get_minutes= input.nextInt();
        int hours = get_minutes/60;
        int minutes = get_minutes%60;
        System.out.println("The time is: "+hours+":"+minutes);
    }
    
}
