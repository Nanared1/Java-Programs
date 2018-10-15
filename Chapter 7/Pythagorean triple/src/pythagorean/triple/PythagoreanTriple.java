/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorean.triple;

/**
 *
 * @author nanabaahabekah
 */
public class PythagoreanTriple {    
    public static boolean PerfectSquare(int num) {
        int square_num = (int)Math.sqrt(num);
        int pow_num = (int)Math.pow(square_num,2);
        boolean perfect_square = false;
            if(pow_num == num){ perfect_square= true;   }
            else{ perfect_square = false; };
        return(perfect_square);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i < 100; i++){
            for(int j = 1; j< 100; j++){
                int pow_add = (int)(Math.pow(i,2) + Math.pow(j,2));
                if(PerfectSquare(pow_add) && PerfectSquare((int)Math.pow(i,2)) && PerfectSquare((int)Math.pow(j,2))){ 
                    System.out.println(i+ " + " +j +" = " + pow_add); }
            }
        }
    }
    
}
