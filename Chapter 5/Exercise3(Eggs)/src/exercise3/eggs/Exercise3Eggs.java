/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3.eggs;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise3Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs purchased: ");
        int number_eggs = input.nextInt();
        double cost = prices(number_eggs);
        double dozen_cost = (number_eggs/12)*cost;
        double remainder = number_eggs%12;
        double extra_cost = remainder*cost*(1.0/12.0);
        //number_eggs-=remainder;
        double total_cost = dozen_cost+extra_cost;
        System.out.println("The bill is equal to : $" + total_cost);
    }
    public static double prices(int num){
        int dozens;
        dozens = num / 12;
        if(dozens >= 11){
            return 0.35;
        }else if(dozens >= 6){
            return 0.40;
        }else if(dozens >= 4){
            return 0.45;
        }else{
            return 0.50;
        }
    }
    
}
