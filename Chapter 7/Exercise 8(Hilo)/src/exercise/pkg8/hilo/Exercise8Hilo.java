/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg8.hilo;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise8Hilo {
    public static int random_num(int min, int max) {
        int average = 0;
        for(int i = 0; i <= 10; i++){
            int random = (int )Math.floor((Math.random() * max + min));
            average+=random;
        }
        return((average/10)+1);
    }
    public static boolean risk_factor(int a, int high_low) {
        if(a >= 1 && a <= 6 && high_low == 0){
            return(true);
        }else if(a >= 8 && a <= 13 && high_low == 1){
            return(true);
        }else{  return(false);  }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("High Low Game");
        System.out.println("\nRULES");
        System.out.println("Numbers 1 through 6 are low \n"
                + "Numbers 8 through 13 are low \n"
                + "Number 7 is neither high or low");
        int begin_num = 1000;
        System.out.println("\nYou have a 1000 points.");
        int yes_no;
        
        do{
            System.out.print("Enter points to risk: ");
            int risk_num = input.nextInt();

            System.out.print("Predict <1=HIGH, 0=LOW>: ");
            int high_low = input.nextInt();
            int random_num = random_num(1,13);
            System.out.println("The number is " + random_num);
            if(risk_factor(random_num, high_low)){  System.out.println("You win"); begin_num+= risk_num*2; }
            else{   System.out.println("Wrong!!!!!!!"); begin_num-=risk_num; }
            System.out.println("You have: " + begin_num + " points left");
            System.out.println("Play again?(1 for 'yes' 0 for 'no'): ");
            yes_no = input.nextInt();
        }while(yes_no != 0);
    }
}
