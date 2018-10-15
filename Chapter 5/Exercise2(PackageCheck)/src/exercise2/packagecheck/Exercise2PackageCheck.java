/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.packagecheck;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Exercise2PackageCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int kilograms, length, width, heigth;
        
        System.out.print("Enter the package weight in Kilograms: ");
        kilograms = input.nextInt();
        System.out.print("Enter the package length in Centimeters: ");
        length = input.nextInt();
        System.out.print("Enter the package width in Centimeters: ");
        width = input.nextInt();
        System.out.print("Enter the package height in Centimeters: ");
        heigth = input.nextInt();
        
        double volume = (double)(length*width*heigth);
        
        if(kilograms > 27){
            if(volume > 100000){
                System.out.println("Too heavy and too large");
            }else{
                System.out.println("Too Heavy");
            }
        }else{
            System.out.println("Too Large");
        }
        
    }
    
}
