/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayassignment;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class ArrayAssignment {
    public static char alphabet(int position, char letter, int K){
        int shift = ((3*position)+K);
        char s = (char)(letter-shift);
        if(s < 'A'){
            s = (char)('Z' - ('A'-(s+1)));
        }/*else if(s > 'Z'){
            s = (char)('A' + ((s - 'Z')/'Z'));
        }*/
        else{
            s = (char)(letter-shift);
        }
        return(s);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        String userInput= input.next();
        char[] inputArray = userInput.toCharArray();
        char[] encoded = new char[inputArray.length];
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] != ' ')
                encoded[i] = alphabet((i+1),inputArray[i],K);
            else
                System.out.print(' ');
        }
        System.out.println(encoded);
    }  
}
