/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.speed.fines.are.not.fine;

/**
 * Nana Abekah
 * 803356
 * ICS3U0-C
 * Monday, March 27, 2017
 * Title: Chapter 5(Test 1)
 * Mr. Veera
 * @author nanabaahabekah
 */
import java.util.Scanner;                                                       //import the Scanner utility for user prompts
public class Test1SpeedFinesAreNotFine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);                                 //set a Scanner method called "input"
        
        /******************************************\
        *Prompt,receive and store user inputs here *
        *******************************************/
        System.out.print("Enter the speed limit: ");                            //Prompt user for a speed limit
        int speed_limit = input.nextInt();                                      //Store user's speed limit as an integer
        System.out.print("Enter the recorded speed of the car: ");              //Prompt user for the car's recorded speed;
        int recorded_speed = input.nextInt();                                   //Store car's recorded speed as an int
        
        int cost=0, over_limit;                                                 //Set int. values for cost and over_limit speed;
        boolean is_speeding = false;                                            //A boolean to check whether if you are speeding or not
        
        over_limit = recorded_speed - speed_limit;                              //Subtract recorded_speed from speed_limit to get over_limit speed.
        
        
        /******************************************************************\
        *Set speeding cost and boolean(is_speeding) to to true if speeding *
        *******************************************************************/
        if(over_limit >= 31){
            is_speeding = true;
            cost = 500;
        }else if(over_limit >= 21 && over_limit<=30){
            is_speeding = true;
            cost = 270;
        }else if(over_limit >= 1 && over_limit<= 20){
            is_speeding = true;
            cost = 100;
        }
        
        /**********************************\
        *Output whether if speeding or not *
        *As well as cost, if speeding      *
        ***********************************/
        if(is_speeding){
            System.out.println("You are speeding and your fine is $"+ cost);
        }else{
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
    
}
