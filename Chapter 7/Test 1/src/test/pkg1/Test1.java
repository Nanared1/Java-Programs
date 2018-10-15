/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg1;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Test1 {
    
    public static int generateAutoNum(int max, int min) {
        return((int)(Math.random()* (max-min) + min));
    }
    
    public static void Simple() {
        Scanner input =  new Scanner(System.in);
        int a = generateAutoNum(20,1);
        int b = generateAutoNum(20,1);
        System.out.print("What is " + a + " + " + b + " equal to = ");
        int answer  = input.nextInt();
        if(answer == (a+b)){
            System.out.println("You are correct");
        }
        else{  
            answer = a+b;
            System.out.println("You are wrong. The answer is " + answer);
        }
    }
    
    public static void Difficult() {
        Scanner input =  new Scanner(System.in);
        int a = generateAutoNum(20,1);
        int b = generateAutoNum(20,1);
        System.out.print("What is " + a + " * " + b + " equal to = ");
        int answer  = input.nextInt();
        if(answer == (a*b)){
            System.out.println("You are correct");
        }
        else{  
            answer = a*b;
            System.out.println("You are wrong. The answer is " + answer);
        }
    }
    
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Do you want a simple(1) or difficult(0) question "
                + "(Simple = 1, difficult = 0): ");
        int SimplyDifficult = input.nextInt();
        System.out.print("How many question do you want to answer: ");
        int numOfQuestions = input.nextInt();
        
        while(numOfQuestions != 0){
            if(SimplyDifficult == 1){
                Simple();
                numOfQuestions--;
            }else{
                Difficult();
                numOfQuestions--;
            }
        }
    }
}
