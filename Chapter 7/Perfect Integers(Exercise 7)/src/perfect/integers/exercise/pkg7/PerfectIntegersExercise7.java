/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.integers.exercise.pkg7;

/**
 *
 * @author nanabaahabekah
 */
public class PerfectIntegersExercise7 {
    public static boolean isPerfect(int num) {
        int add = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0){  add+=i;   }
        }
        if(add == num){return true;}
        else{return(false);}
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(isPerfect(i)){   System.out.println(i);     }
        }
    }
}
