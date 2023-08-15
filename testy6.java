package unit6;

import java.util.Scanner;

public class testy6 {
    public static void main(String[] args) {

        // Initiate the scanner object
        Scanner input = new Scanner(System.in);

        // Welcome and options
        System.out.println("***NatureSense Technologies***");
        System.out.println("Welcome!");
        System.out.println("Menu of products: ");
        System.out.println("1. Water depth Calculator");
        System.out.println("2. Radar");
        System.out.println("3. Nighttime vision goggles");

        // Getting the product name
        System.out.println("Please select a product from the options provided in the product menu:");
        String prompt1 = input.nextLine();

        String product = "";

        if (prompt1.equalsIgnoreCase("Water Depth Calculator")) {
            product = "water depth calculator";
        } else if (prompt1.equalsIgnoreCase("Radar")) {
            product = "radar";
        } else if (prompt1.equalsIgnoreCase("Nighttime vision goggles")) {
            product = "nighttime vision goggles";
        } else {
            System.out.println("Invalid choice, restart and try again.");
            input.close();
            return;
        }

        boolean alternateDate = false;
        int month;
        int day;

        do {
            if (alternateDate) {
                System.out.println("The date you entered was a block-out date. Please choose an alternate date.");
            }

            
            do {
                System.out.println("Please enter a valid delivery month:");
                month = input.nextInt();
            } while (month <= 0 || month >= 13);

            do {
                System.out.println("Please enter a valid delivery day:");
                day = input.nextInt();
            } while (day <= 0 ||
                    (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31 ||
                    (month == 4 || month == 6 || month == 9 || month == 11) && day > 30 ||
                    (month == 2 && day > 28));

            int year;

            do {
                System.out.println("Please enter a valid delivery year:");
                year = input.nextInt();
            } while (year < 2023);

            alternateDate = true;

        } while ((month == 1 && day == 1) || (month == 3 && day == 20) || (month == 4 && day == 22) || (month == 5 && day == 1)
                || (month == 6 && day == 5) || (month == 8 && day == 2) || (month == 12 && day == 31));

        input.close();
    }
}
