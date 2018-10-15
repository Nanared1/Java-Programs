/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1.prime.number.part2;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise1PrimeNumberPart2 {

    /**
     * @param args the command line arguments
     */
    static boolean single_Prime = true;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter max num: ");
        int max_num = input.nextInt();
        System.out.print("Enter min num: ");
        int min_num = input.nextInt();
        while(max_num >= min_num){
            single_Prime = singlePrime(max_num);
            if(single_Prime){   System.out.println(max_num);   }
            max_num-=1;
        }
    }
    public static boolean singlePrime(int num){
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
        return notPrime;
    }
    
}
