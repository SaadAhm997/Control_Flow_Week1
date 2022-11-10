import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {

        // Create User Input and store it:
        System.out.println("Please input the weather and temperature today :)");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
        int temp = reader.nextInt();

        // Control flow for the weather and temp response

        if (weather == "rainy" || temp > 0 && temp < 10) {
            System.out.println("Please wear a warm waterproof jacket");
        } else if (weather == "cloudy" || temp >= 10 && temp < 20) {
            System.out.println("Please wear a warm jacket");
        } else if (weather == "sunny" || temp >= 20 && temp <= 30 ) {
            System.out.println("T shirt and shorts! 8)");
        } else if (weather == "snow" || temp < 0) {
            System.out.println("Stay inside, it's too cold!");
        }
        System.out.println("Have a great day :)");

    }
}
