/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg5.test.pkg2.aliens;

/**
 * Nana Abekah
 * 803356
 * ICS3U0-C
 * Monday, March 27, 2017
 * Title: Chapter 5(Test 2)
 * Mr. Veera
 * @author nanabaahabekah
 */
import java.util.Scanner;                                                       //import the Scanner utility for user prompts
public class Chapter5Test2Aliens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /******************************************\
        *Prompt,receive and store user inputs here *
        *******************************************/
        Scanner input = new Scanner(System.in);                                 //set a Scanner method called "input"
        System.out.print("How many antennas? ");                                //Prompt user for no. of antennas
        int antennas =input.nextInt();                                          //Store user's no. of antennas as an int.
        System.out.print("\nHow many eyes? ");                                  //Prompt user for no. of eyes
        int eyes = input.nextInt();                                             //Store user's no. of eyes as an int.
        
        
        boolean match_found = false;                                            //Checks if an aliean match has been found
        
        /*****************************************************************\
        *Compute and out the kind of alien species found. If there is any*
        *alien found, set match_found to true.                           *
        ******************************************************************/
        if(antennas >=0 && antennas <=6
                && eyes >= 2){
            System.out.println("VladSaturnian");
            match_found = true;
        }
        
        if(antennas >=0 && antennas <=2
                && eyes >= 0 && eyes <= 3){
            System.out.println("GraemeMercurian");
            match_found = true;
        }
        
        if(antennas >=3
                && eyes >= 0 && eyes <= 4){
            System.out.println("TroyMartian");
            match_found = true;
        }
        
        /*************************************************\
        *Output "No match found if match found is false" *
        **************************************************/
        if(!match_found){
            System.out.println("No match found");
        }
    }
    
}
