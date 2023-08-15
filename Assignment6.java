/*********************************************************************************************
 * Programmer: Liu, Tiancheng
 * Date: 8/28/2023
 * Title: Introduction to Java 24I.IJA.CDE, Unit 5, Assignment 5
 * 
 * Overview: A calendar used to confirm a customer’s preferred product delivery date
 **********************************************************************************************/
package unit6;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String [] args){

        //initiate the scanner object
        Scanner input = new Scanner(System.in);


        //welcome and options
        System.out.println("***NatureSense Technologies***");
        System.out.println("Welcome!");
        System.out.println("Menu of products: ");
        System.out.println("1. Water depth Calculator");
        System.out.println("2. Radar");
        System.out.println("3. Nighttime vision goggles");


        // getting the product name
        System.out.println("Please make your product name from the options provided in the product menu:");
        String prompt1 = input.nextLine();

        // identify the first prompt
        String product = "";

        if (prompt1.equalsIgnoreCase("Water Depth Calculator")) {
            product = "water depth calculatior";
        } else if (prompt1.equalsIgnoreCase("Radar")) {
            product = "radar";
        } else if (prompt1.equalsIgnoreCase("Nighttime vision goggles")) {
            product = "nighttime vision goggles";
        } else {
            System.out.println("invalid choice, restart and try again.");
        }


        int month;
        int day;
        do{
            //For the second(or more) time this code is running, to inform the user's error
            boolean alternateDateNum = false;
            if(alternateDateNum == true){
                System.out.println("The date you entered was a block-out date. Please chose a alternate date.");
            }

            //ask for prompt to enter the delivery month
            //check if the month is valid, if not, repeat
            do{
                System.out.println("Please enter a valid delivery month:");
                month = input.nextInt();
            }
             while(month<=0 || month >= 13);

            //ask for prompt to enter the delivery day
            //check if the day is valid, if not, repeat
            do{
                System.out.println("Please enter a valid delivery day:");
                day = input.nextInt();
            }   
            // check if the day is negative, or out outside of the month
            //the second statement are all the 31 day months, third are the 30s and fourth is Febuary
            while(day <=0
            || (month == 1 || month ==3 || month == 5 || month == 7 || month == 8 || month ==10 || month == 12 && day > 31)
            ||(month == 4 || month == 6 || month == 9 || month == 11 && day > 30)
            || (month == 2 && day > 28));
        
            //the delivery year
            int year;
            do{
                System.out.println("Please enter a valid delivery year:");
                year = input.nextInt();
            }
            // can't order the past
                while(year < 2023);

            alternateDateNum =true;
        }
        //no holidays, check if the date are block out dates
        while((month == 1 && day == 1)|| (month == 3 && day == 20)||(month == 4 && day == 22)||(month == 5 && day == 1)
        ||(month == 6 && day == 5)||(month == 8 && day == 2)||(month == 12 && day == 31));
    
        
    }
}