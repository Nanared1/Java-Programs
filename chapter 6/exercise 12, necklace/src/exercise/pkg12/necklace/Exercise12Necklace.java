/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg12.necklace;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise12Necklace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first_num = input.nextInt();
        System.out.print("Input second number: ");
        int second_num = input.nextInt();
        
        int ans1 = 0;
        
        int save1 = first_num, save2 = second_num;
        System.out.print(first_num+" ");
        System.out.print(second_num+" ");
        do{
            ans1 = first_num+second_num;
            if(ans1 > 10){
                ans1 -= 10;
            }
            System.out.print(ans1+" ");
            first_num = second_num;
            second_num = ans1;
        }while(first_num != save1 || second_num!=save2);
    }
    
}
