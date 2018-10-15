/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect_square;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Perfect_Square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input an Integer: ");
        int num = input.nextInt();
        if(square_check(num)){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not a perfect Square");
        }
    }
    public static boolean square_check(int num){
        int square_root = (int)(Math.sqrt(num));
        int squared = square_root*square_root; 
        if(squared == num){
            return true;
        }else{
            return false;
        }
    }
    
}
