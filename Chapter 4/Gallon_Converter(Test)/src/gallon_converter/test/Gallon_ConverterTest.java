/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallon_converter.test;

/*
 * Nana Abekah
 * 803356
 * ICS3U0C
 * Thursday, March 2, 2017
 * Title: Gallon COnverter
 * Mr. Veera
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Gallon_ConverterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                                     
        /*
        *Receive Input and declare variables
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of gallons: ");                      //Prompt the user for # of gallons
        int gallons = input.nextInt();                                          //Store user's input in an integer
        int quarts = 4;                                                         //4 quarts in a gallon
        int pints = 2;                                                          //2 pints in a  quart
        int cups = 2;                                                           //2 cups in a pint
        int table_spoons = 16;                                                  //16 table spoons in a cup
        /*
        *Start Conversions here. 
        *Declare new variables to store conversions.
        */
        int con_quarts = gallons*quarts;                                        //Converted quarts
        int con_pints = con_quarts*pints;                                       //Converted pints
        int con_cups = con_pints*cups;                                          //Converted cups
        int con_tableSpoons = con_cups*table_spoons;                            //Converted table spoons
        
        /*
        Output the results/products.
        */
        System.out.println("\nIn "+(double)gallons+" gallons there are: ");     //output amount of gallons in decimal
        System.out.println("\n" +" "+(double)con_quarts +" quarts");            //Output amount of quarts in decimal
        System.out.println("\n" +" "+con_pints +" pints");                      //Output amount of pints as an integer
        System.out.println("\n" +" "+con_cups +" cups");                        //Output amount of cups as an integer
        System.out.println("\n" +(double)con_tableSpoons +" tablespoons");      //Output amount of tablespoons in decimal
    }
    
}
