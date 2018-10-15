/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3.prime.number;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise3PrimeNumber {

    public static boolean check_Prime(int num) {
        boolean notPrime = true;
        int counter = 2;
        int remainder = 0;
        while(counter < num && notPrime){
            remainder = num%counter;
            if(remainder == 0){
                notPrime = false;
            }
            counter+=1;
        }
        return(notPrime);  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to check if prime: ");
        int num = input.nextInt();
        System.out.println(check_Prime(num));
    }
}
