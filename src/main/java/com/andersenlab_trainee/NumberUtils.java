package com.andersenlab_trainee;

import java.util.Scanner;

public class NumberUtils {
    private static final String OUTPUT_MESSAGE = "Привет";
    private static final int NUMBER_TO_COMPARE_WITH = 7;

    public static void checkEnteredNumber() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while (!userInput.matches("-?\\d+")) {
            System.out.println("An incorrect number was entered. Enter your number again:");
            userInput = scanner.nextLine();
        }
        if (Integer.parseInt(userInput) > NUMBER_TO_COMPARE_WITH) {
            System.out.println(OUTPUT_MESSAGE);
        }
    }
}