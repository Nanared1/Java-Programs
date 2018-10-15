/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2_exam;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;                                                       //Import Scanner library;
public class PART2_EXAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);                                 
        int currentIndex = 0;                                                   //an integer to store the curren index of the second loop
        int counter = 0;
        int k =  input.nextInt();
        int num[] = new int[k];
        
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }
        /*
        In this loop, we will find any number that is equal to 0
        once we get that num, we will check if it's index is not 0. We don't need
        to do anything at index 0 because there is nothing to take out behind it;
        After this we start a second loop which starts at 1 less than the first loop;
        this is because we already know the number is 0; The second loop runs backwards
        to check if any num is > 0; If it is set it to 0 and then break out of the loop.
        We use currentIndex to get the num in the array which has to be set to 0;
        */
        for(int i = 0; i < num.length; i++){
            if(num[i] == 0 && i != 0){
                for(int j = i-1; j > 0; j--){
                    if(num[j] > 0){
                        //num[j] = 0;
                        currentIndex = j;
                        break;
                    }
                }
             num[currentIndex] = 0;   
            }
        }
        /*
        In this loop we add up all the numbers in the array and store it in a 
        variable called counter which is the accumulator;
        */
        for(int i = 0; i < num.length; i++){
            counter+=num[i];
        }
        
        /*
        In this if statement we check if the counter is < 0; If it is then counter
        equals 0;
        */
        if(counter < 0){
            counter = 0;
        }
        
        System.out.println(counter);                                            //Print out the results;
    }
}
