/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Q2 {
    public static String Canadian_translate(String a, String b) {
        a = a.substring(0, a.length()-3);
        return(a+b);
    }
    public static String American_translate(String a, String b) {
        a = a.substring(0, a.length()-2);
        return(a+b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean canadian = true, american = true;
        String userInput;
        do{
            System.out.print("Enter the string: ");
            userInput = input.next();
            input.nextLine();
            String Our_Or = userInput.substring(userInput.length()-3);
            if(userInput.equalsIgnoreCase("quit")){   break;  }
            if(Our_Or.equals("our")){   canadian = true; american = false;  }
            else{   canadian = false; american = true;  }

            if(canadian){  Our_Or = "or";   }
            if(american){   Our_Or = "our";  }
            
            if(canadian && userInput.length()>= 4){   System.out.println(Canadian_translate(userInput, Our_Or));  }
            else if(american && userInput.length()>= 4){System.out.println(American_translate(userInput, Our_Or));}
            else{System.out.println(userInput);}
        }while(!userInput.equalsIgnoreCase("quit"));
    }
    
}
