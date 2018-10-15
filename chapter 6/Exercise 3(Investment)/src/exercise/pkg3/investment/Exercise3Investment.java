/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg3.investment;

/**
 *
 * @author nanabaahabekah
 */

public class Exercise3Investment {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int investment = 2500;
        double compound = 0.075;
        double worth = 0.0;
        int years = 0;
        for(int i = 1; worth < 5000; i++){
            worth = Math.pow(((1.0+compound)),i)*(double)investment;
            years = i;
        }
        System.out.println("It will take " +years+ " years to reach $5000");
    }
    
}
