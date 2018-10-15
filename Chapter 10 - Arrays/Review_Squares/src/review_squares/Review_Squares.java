/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_squares;

/**
 *
 * @author nanabaahabekah
 */
public class Review_Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] squares = new int[5];
        for(int i = 0; i < squares.length; i++){
            squares[i] = (i*i);
            System.out.println(squares[i]);
        }
    }   
}
