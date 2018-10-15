/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6_test2.cs.city;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;                                                       //import Scanner library.
public class Chapter6_test2CSCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);                                 //set a scanner called input.
        
        int start_year = 0, changes = 0, future_year = 0;                       //set interger values for start_year, changes and future year.
        
        /**
         * Prompt user for the current and future year.
         */
        System.out.print("Enter the current year: ");
        start_year = input.nextInt();
        System.out.print("Enter the future year: ");
        future_year = input.nextInt();
        
        for(int i = start_year; i <= future_year; i++){
            changes = i-start_year;                                             //get the number of years between i and the start year
            
            /*
                Check to see if 2,3,4,5 are all multiples of changes;
            */
            if((changes % 2 ==0) && (changes % 3 ==0) && (changes % 4 ==0)
                    && (changes % 5 ==0)){
                System.out.println("All positions change in year " + i);        //Output the year if 2,3,4,5 are all multiples of the year
            }
        }
    }
    
}
