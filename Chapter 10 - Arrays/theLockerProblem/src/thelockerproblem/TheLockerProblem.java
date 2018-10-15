/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thelockerproblem;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class TheLockerProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("How many lockers? ");
        Scanner input = new Scanner(System.in);
        int num_lockers = input.nextInt();
        boolean[] locker = new boolean[num_lockers];
        
        for(int i = 0; i < locker.length; i++){
            locker[i] = true;
        }
        
        int divide;
        for(int i = 1; i <= locker.length; i++){
            for(int j = 1; j <= locker.length; j++){
                divide = j%i;     
                if(divide == 0){
                    locker[j-1] = !locker[j-1];
                }
            }
        }
        
        for(int i = 1; i < locker.length; i++){
            if(locker[i]){  System.out.println("Locker " + i + " is open");     }
        }
    }
}
