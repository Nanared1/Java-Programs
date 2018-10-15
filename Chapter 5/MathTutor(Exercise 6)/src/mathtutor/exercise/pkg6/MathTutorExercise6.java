/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtutor.exercise.pkg6;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class MathTutorExercise6 {

    /**
     */
    public static String sign = "";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int first_num = random_number(10.0, 0.0);
        int second_num = random_number(10.0, 0.0);
        int answer = operation(first_num, second_num);
        System.out.print("What is "+first_num+""+sign+""+second_num+"? ");
        int user_answer = input.nextInt();
        
        if(user_answer == answer){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect!");
            System.out.println("The correct answer is: "+ answer);
        }
    }
    public static int random_number(double high, double low){
       return((int)(((high-low)+low)*Math.random()+1.0));
    }
    public static int operation(int num1, int num2){
        int random_num = random_number(4.0,1.0);
        if(random_num == 1){
            sign = "+";
            return(num1+num2);
        }else if(random_num == 2){
            sign = "-";
            return(num1-num2);
        }else if(random_num == 3){
            sign = "/";
            return(num1/num2);
        }else{
            sign = "*";
            return(num1*num2);
        }
    }
}
