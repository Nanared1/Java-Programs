/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1.prime.number;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise1PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean notPrime = true;
        int counter = 2;
        int remainder = 0;
        while(counter < num && notPrime){
            remainder = num%counter;
            if(remainder == 0){
                notPrime = false;
                System.out.println("Not Prime");
            }
            counter+=1;
        }
        if(notPrime){   System.out.println("Prime");   }
    }
    
}
