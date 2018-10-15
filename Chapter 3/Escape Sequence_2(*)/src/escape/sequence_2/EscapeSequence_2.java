/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.sequence_2;

/**
 * Nana Abekah
 * 803356
 * ICS3U0C
 * Friday, February 10, 2017
 * Title: Hello World
 * Mr. Veera
 * @author nanabaahabekah
 */
public class EscapeSequence_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i<=7; i++){                                              // A loop that runs from 1 - 7
            if(i == 1 || i == 7){                                               // If cursor is on line 1 or line 7,
                System.out.print("***************\n");                          // Display a line with 15 asterisks
            }else{                                                              // otherwise
                System.out.print("*\t      *\n");                               // Display 2 "*" with 13 spaces in between 
            };
        };
    };
    
}
