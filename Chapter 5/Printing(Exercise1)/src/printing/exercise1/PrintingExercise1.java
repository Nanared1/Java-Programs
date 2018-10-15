/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing.exercise1;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class PrintingExercise1 {

    /**
     * @param price
     * @return 
     */
    public double price_copy(double price){
        System.out.println("Price Per Copy is: " + price);
        return price;
    }
    public PrintingExercise1(String sentence){
        System.out.print(sentence);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        PrintingExercise1 Sentence;
        Sentence = new PrintingExercise1("Enter the nnumber of copies to be printed: ");
        int copies = input.nextInt();
        double cost;
        
        if(copies > 1000)
            cost = 0.25;
        else if(copies >= 750)
            cost = 0.26;
        else if(copies >= 500)
            cost = 0.27;
        else if(copies >= 100)
            cost = 0.28;
        else
            cost = 0.30;
        
        double total_cost = cost*(double)copies;
        System.out.println("Price per copy is: $"+ cost);
        System.out.println("Total cost is $"+ total_cost);
    }
    
}
