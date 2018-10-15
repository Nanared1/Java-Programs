/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_exercise.display.box;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Review_ExerciseDisplayBox {
    public static void draw_box(int height, int width) {
        for(int i = 0; i < height; i++){
            if(i > 0){System.out.println("|");}
            if(i == 0 || i == height-1){
                for(int j = 1; j <= width; j++){
                    System.out.print("-");
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = input.nextInt();
        System.out.print("Input width: ");
        int width = input.nextInt();
        
        draw_box(height, width);
    }
    
}
