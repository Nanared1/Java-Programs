/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceapplication.test_2;

/*
 * Nana Abekah
 * 803356
 * ICS3U0C
 * Thursday, March 2, 2017
 * Title: Invoice Application
 * Mr. Veera
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class InvoiceApplicationTest_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Receive user's input here
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the purchase price: $");
        double purchase_price = input.nextDouble();                             //Price in decimal form
        System.out.print("\nEnter the discount rate%: ");
        int discount_rate = input.nextInt();                                    //Discount rate should be an integer
        
        /*
        Do logic here
        */
        double discount_percent = ((double)(discount_rate)/100);                //convert discount rate to decimal
        double discount = discount_percent*purchase_price;                      //Find the discount
        double discount_price = purchase_price-discount;                        //purchase price - discount = discount price
        
        /*
        Output discount price
        */
        System.out.println("\nDiscounted price is: $" +String.format("%.2f",discount_price)); //round discount price to 2 decimal places
        
        
    }
    
}
