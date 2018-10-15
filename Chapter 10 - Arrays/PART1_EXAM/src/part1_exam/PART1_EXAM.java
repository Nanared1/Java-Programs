/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1_exam;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class PART1_EXAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt(), d2 = input.nextInt(), d3 = input.nextInt(), d4 = input.nextInt();
        
        /*
        In this if statement block we compare all the inputs to check for 
        sequences. 
        */
        if((d1<d2) && (d2 < d3) && (d3 < d4)){
            System.out.println("Fish Rising");
        }else if((d1>d2) && (d2 > d3) && (d3 > d4)){
            System.out.println("Fish Diving");
        }else if((d1 == d2) && (d2 == d3) && (d3 == d4)){
            System.out.println("Fish at constant depth");
        }else{
            System.out.println("No fish");
        }
    }
}
