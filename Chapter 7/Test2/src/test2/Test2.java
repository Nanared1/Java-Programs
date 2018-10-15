/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author nanabaahabekah
 */
import java.util.Scanner;
public class Test2 {

    public static int newHour(int currentHour, int timezone) {
        int newTime = currentHour + timezone;
        if(currentHour == 00){ 
            currentHour = 24;
            newTime = currentHour + timezone;
            if(newTime >= 24){
                newTime -= 24;
            }
        }
        return newTime;
    }
    public static int minute(int currentMinute, int timezone) {
        int newTime = currentMinute + timezone;
        if(currentMinute == 60){ 
            currentMinute = 00;
            newTime = currentMinute + timezone;
        }
        return newTime;
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Hour   : ");
        int hour = input.nextInt();
        System.out.print("Minute : ");
        int minute = input.nextInt();
        System.out.print("Day: ");
        String day = input.nextLine();
        input.next();
        
        int victoria = newHour(hour, -3);
        int edmonton = newHour(hour, -2);
        int winnipeg = newHour(hour, -1);
        int toronto = newHour(hour, 0);
        int halifax = newHour(hour, +1);
        int newfoundland = newHour(hour, 1);
        
        if(minute >= 60){
            minute -= 60;
            hour+=1;
        }
        int newfoundland_minute = minute(minute, 30);
        if(newfoundland_minute >= 60){
            newfoundland_minute -= 60;
            newfoundland+=1;
        }
        
        System.out.println("Same day "+ hour + "" + minute +" in Ottawa");
        System.out.println("Same day "+ victoria + "" + minute +" in Victoria");
        System.out.println("Same day "+ winnipeg + "" + minute +" in Winnipeg");
        System.out.println("Same day "+ toronto + "" + minute +" in Toronto");
        System.out.println("Same day "+ halifax + "" + minute +" in Halifax");
        System.out.println("Same day "+ newfoundland + "" + newfoundland_minute +" in St.Johns");
    }
    
}
