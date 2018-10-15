/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.even.odds;

/**
 *
 * @author nanabaahabekah
 */

public class Ex1EvenOdds {
    public static int random_num(int max, int min) {
        return((int)(Math.random()* (max-min) + min));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] all_nums = new int[25];
        for(int i = 0; i < all_nums.length; i++){
            all_nums[i] = random_num(99, 0);
        }
        
        
        System.out.println("ODD: ");
        for(int i = 0; i < all_nums.length; i++){
            if(all_nums[i] % 2 != 0){
                System.out.print(all_nums[i]+ " ");
            }
        }
        
        System.out.println("\nEVEN: ");
        for(int i = 0; i < all_nums.length; i++){
            if(all_nums[i] % 2 == 0){
                System.out.print(all_nums[i] + " ");
            }
        }
    }   
}
