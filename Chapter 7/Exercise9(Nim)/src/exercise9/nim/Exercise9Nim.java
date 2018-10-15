/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9.nim;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise9Nim {

    public static int generateAutoNum(int max, int min) {
        return((int)(Math.random()* (max-min) + min));
    }
    
    public static boolean isValidEntry(int num) {
        if(num >= 1 && num <= 3){   return(true);   }
        return(false);
    }
    
    public static boolean isValidEntry(int num, int randomNum) {
        if(num > randomNum || !isValidEntry(num)){   return(false);   }
        return(true);
    }
    
    public static int drawStones() {
        return(generateAutoNum(3,0)+1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int randomNum = generateAutoNum(30, 15);
        boolean users_turn = true;
        
        do{
            System.out.print("There are " + randomNum + " stones. "
                    + "How many would you like? ");
            int userInput = input.nextInt();
            if(isValidEntry(userInput) && isValidEntry(userInput,randomNum))
            {    randomNum-=userInput; users_turn = true;  }
            else{
                while(!isValidEntry(userInput) || !isValidEntry(userInput,randomNum) ){
                    System.out.print("Not a valid(1 >= input <= 3) input, "
                            + "try again: ");
                    userInput = input.nextInt();
                } if(isValidEntry(userInput) && isValidEntry(userInput,randomNum))
                {    randomNum-=userInput; users_turn = true;  }
            }
            int get_Stones = drawStones();
            while(!isValidEntry(get_Stones, randomNum) && randomNum > 0){get_Stones = drawStones();}
            if(randomNum>0){
                users_turn = false;
                System.out.println("There are " + randomNum + " stones."
                        + " The computer takes " + get_Stones + " stones");
                randomNum -= get_Stones;
            }
        }while(randomNum > 0);
        
        if(!users_turn){  System.out.println("User won");   }
        else{   System.out.println("Computer won.");   }
    }
    
}
